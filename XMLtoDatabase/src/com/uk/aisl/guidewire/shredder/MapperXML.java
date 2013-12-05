package com.uk.aisl.guidewire.shredder;

import com.uk.aisl.guidewire.shredder.exception.CrashException;
import com.ximpleware.AutoPilot;
import com.ximpleware.NavException;
import com.ximpleware.VTDGen;
import com.ximpleware.VTDNav;
import com.ximpleware.XPathEvalException;
import com.ximpleware.XPathParseException;

public class MapperXML {

	public static Database parseMapperXML(String path) throws CrashException {
		Database database = new Database();
		VTDGen vg = new VTDGen();
		if (vg.parseFile(path, false)) {
			// parsing succeeded
			try {
				VTDNav vn = vg.getNav();
				
				database = MapperXML.fillInLookUps(database, vn);
				//needs some work
				AutoPilot ap = new AutoPilot();
				ap.selectXPath("//shredder/database/table");
				ap.bind(vn);

				while (ap.evalXPath() != -1) {
					database.addTable(MapperXML.fillInTable(vn));
				}
				ap.resetXPath();
			} catch (XPathEvalException e) {
				throw new CrashException("Failed xpath for MapperXML", e);
			} catch (NavException e) {
				throw new CrashException("VTD-XML navigation failure parsing MapperXML", e);
			} catch (XPathParseException e) {
				throw new CrashException("Failed to parse the table of MapperXML", e);
			}

		} else {
			throw new CrashException("VTD-XML failed to parse the MapperXML. Is the Path correct: " + path);
		}
		return database;
	}

	private static Database fillInLookUps(Database database, VTDNav vn) throws XPathParseException, XPathEvalException, NavException {
		
		
		AutoPilot ap = new AutoPilot();
		ap.selectXPath("//shredder/database/lookupfield");
		ap.bind(vn);
		
		while (ap.evalXPath() != -1) {
			AutoPilot apKey = new AutoPilot();
			apKey.selectXPath("key");
			apKey.bind(vn);
			String key = apKey.evalXPathToString();
			apKey.resetXPath();
			
			AutoPilot apValue = new AutoPilot();
			apValue.selectXPath("value");
			apValue.bind(vn);
			String value = apValue.evalXPathToString();
			apValue.resetXPath();
				
			AutoPilot apXpath = new AutoPilot();
			apXpath.selectXPath("xpath");
			apXpath.bind(vn);
			String xpath = apXpath.evalXPathToString();
			apXpath.resetXPath();
			
			AutoPilot apVariable = new AutoPilot();
			apVariable.selectXPath("variable");
			apVariable.bind(vn);
			String variable = apVariable.evalXPathToString();
			apVariable.resetXPath();
			//Stubbed TODO
			value = "Need to map database variables "+variable;
			
			database.addLookUpValue(key, new LookUp(xpath, value));
		}
		
		return database;
	}

	private static Table fillInTable(VTDNav vn) throws XPathParseException, XPathEvalException,
			NavException {
		Table table = new Table();

		AutoPilot apName = new AutoPilot();
		apName.selectXPath("name");
		apName.bind(vn);
		table.setTableName(apName.evalXPathToString());
		apName.resetXPath();
		
		AutoPilot apROOT = new AutoPilot();
		apROOT.selectXPath("rootxpath");
		apROOT.bind(vn);
		table.setXpathROOT(apROOT.evalXPathToString());
		apROOT.resetXPath();

		AutoPilot ap = new AutoPilot();
		ap.selectXPath("column");
		ap.bind(vn);
		
		while (ap.evalXPath() != -1) {
			Column column = new Column();
			
			AutoPilot name = new AutoPilot();
			name.selectXPath("name");
			name.bind(vn);
			column.setColumnName(name.evalXPathToString());
			name.resetXPath();
			
			AutoPilot xpath = new AutoPilot();
			xpath.selectXPath("xpath");
			xpath.bind(vn);
			column.setXpath(xpath.evalXPathToString());
			xpath.resetXPath();
			
			AutoPilot type = new AutoPilot();
			type.selectXPath("type");
			type.bind(vn);
			column.setType(type.evalXPathToString());
			type.resetXPath();
			
			AutoPilot lookUpKey = new AutoPilot();
			lookUpKey.selectXPath("lookup");
			lookUpKey.bind(vn);
			column.setLookUpKey(lookUpKey.evalXPathToString());
			lookUpKey.resetXPath();
			
			table.addColumn(column);
		}

		return table;
	}
}
