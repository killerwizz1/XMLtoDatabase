package com.uk.aisl.guidewire.shredder;

import java.util.ArrayList;

import com.uk.aisl.guidewire.shredder.database.Loader;
import com.uk.aisl.guidewire.shredder.designer.Printer;
import com.uk.aisl.guidewire.shredder.exception.CrashException;
import com.uk.aisl.guidewire.shredder.exception.Logger;
import com.uk.aisl.guidewire.shredder.model.Database;
import com.uk.aisl.guidewire.shredder.model.XMLReturn;
import com.uk.aisl.guidewire.shredder.xml.MapperXML;
import com.uk.aisl.guidewire.shredder.xml.Parser;

/**
 * Main class that holds only the main method to kick off the shreding of the
 * pay load XML
 * 
 * @author Karl Parry
 * @author Gareth Edwards
 * 
 */
public class Shredder {

	/**
	 * Main method that starts the shredder. The Shredder is designed to read
	 * the mapping.xml file (located at the same root directory as the jar) and
	 * parse the XML pay load defined in the mapping XML. <br/>
	 * <br/>
	 * It is designed to parse the XML from PolicyCenter's GX model to
	 * Elephant.com's DataWarehouse originally. It is mostly dynamic but could
	 * be further refined to be more dynamic using the mapping.xml
	 * 
	 * @param args
	 *            No parameters are read from this list at run time
	 */
	public static void main(String args[]) {
		Printer.printTheShredder();
		long start = System.currentTimeMillis();
		Database database = null;
		try {
			Logger.info("Beginning parsing mapping.xml");
			database = MapperXML.parseMapperXML("mapping.xml");
			Logger.info("Finished parsing mapping.xml");
			Logger.info("Beginning to get payload xml from Database");
			ArrayList<XMLReturn> list = Loader.getXML(database);
			Logger.info("Finished getting payload xml from Database");
			for (XMLReturn returnXML : list) {
				Logger.info("Beginning parsing payload xml for "+returnXML.getVariableMap().get("transid"));
				try{
					database.setXML(returnXML);
					Parser parser = new Parser(returnXML.getXmlPayload());
					database = parser.parseXML(database, returnXML.getVariableMap());
					Loader.insertToStaging(database);
				} catch (CrashException e) {
					Loader.logError(database, e);
				}
				database.cleanDown();
				Logger.info("Finished parsing payload xml for "+returnXML.getVariableMap().get("transid"));
			}
		} catch (CrashException e) {
			Logger.crash("Crash exception occured", e);
			System.exit(1);
		} catch (Exception e) {
			Logger.crash("Unknown Error occurred", e);
			System.exit(1);
		}
		long end = System.currentTimeMillis();
		Logger.info("Job ended in: " + (end - start) + " ms");
		System.exit(0);
	}
}
