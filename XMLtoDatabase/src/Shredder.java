
public class Shredder {

	public static void main(String args[]) {
		PolicyPeriod pp = new PolicyPeriod();
		Parser parser = new Parser("<PolicyPeriod xmlns=\"eis/pc/policyperiod\"><AllCosts><Entry><ActualAdjRate>469.6920</ActualAdjRate><ActualTermAmount>469.69</ActualTermAmount><ChargePattern><Code>Premium</Code></ChargePattern><CoverageIDExt>2303720</CoverageIDExt><CreateTime>2013-11-21T14:12:00.703-05:00</CreateTime><FixedId><Value>6609752</Value></FixedId><ID><Value>6609752</Value></ID><Prorated>false</Prorated><Proration>1.0</Proration><PublicID>prod:6609752</PublicID><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime></Entry><Entry><ActualAdjRate>24.7618</ActualAdjRate><ActualTermAmount>24.76</ActualTermAmount><ChargePattern><Code>Premium</Code></ChargePattern><CoverageIDExt>2303728</CoverageIDExt><CreateTime>2013-11-21T14:12:00.703-05:00</CreateTime><FixedId><Value>6609758</Value></FixedId><ID><Value>6609758</Value></ID><Prorated>false</Prorated><Proration>1.0</Proration><PublicID>prod:6609758</PublicID><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime></Entry><Entry><ActualAdjRate>376.9342</ActualAdjRate><ActualTermAmount>376.93</ActualTermAmount><ChargePattern><Code>Premium</Code></ChargePattern><CoverageIDExt>2303721</CoverageIDExt><CreateTime>2013-11-21T14:12:00.703-05:00</CreateTime><FixedId><Value>6609753</Value></FixedId><ID><Value>6609753</Value></ID><Prorated>false</Prorated><Proration>1.0</Proration><PublicID>prod:6609753</PublicID><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime></Entry><Entry><ActualAdjRate>44.7303</ActualAdjRate><ActualTermAmount>44.73</ActualTermAmount><ChargePattern><Code>Premium</Code></ChargePattern><CoverageIDExt>2303727</CoverageIDExt><CreateTime>2013-11-21T14:12:00.703-05:00</CreateTime><FixedId><Value>6609755</Value></FixedId><ID><Value>6609755</Value></ID><Prorated>false</Prorated><Proration>1.0</Proration><PublicID>prod:6609755</PublicID><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime></Entry><Entry><ActualAdjRate>34.3274</ActualAdjRate><ActualTermAmount>34.33</ActualTermAmount><ChargePattern><Code>Premium</Code></ChargePattern><CoverageIDExt>2303724</CoverageIDExt><CreateTime>2013-11-21T14:12:00.703-05:00</CreateTime><FixedId><Value>6609756</Value></FixedId><ID><Value>6609756</Value></ID><Prorated>false</Prorated><Proration>1.0</Proration><PublicID>prod:6609756</PublicID><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime></Entry><Entry><ActualAdjRate>206.3666</ActualAdjRate><ActualTermAmount>206.37</ActualTermAmount><ChargePattern><Code>Premium</Code></ChargePattern><CoverageIDExt>2303720</CoverageIDExt><CreateTime>2013-11-21T14:12:00.703-05:00</CreateTime><FixedId><Value>6609757</Value></FixedId><ID><Value>6609757</Value></ID><Prorated>false</Prorated><Proration>1.0</Proration><PublicID>prod:6609757</PublicID><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime></Entry><Entry><ActualAdjRate>698.3258</ActualAdjRate><ActualTermAmount>698.33</ActualTermAmount><ChargePattern><Code>Premium</Code></ChargePattern><CoverageIDExt>2772340</CoverageIDExt><CreateTime>2013-11-21T14:12:00.703-05:00</CreateTime><FixedId><Value>6609754</Value></FixedId><ID><Value>6609754</Value></ID><Prorated>false</Prorated><Proration>1.0</Proration><PublicID>prod:6609754</PublicID><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime></Entry><Entry><ActualAdjRate>182.7659</ActualAdjRate><ActualTermAmount>182.77</ActualTermAmount><ChargePattern><Code>Premium</Code></ChargePattern><CoverageIDExt>2772339</CoverageIDExt><CreateTime>2013-11-21T14:12:00.703-05:00</CreateTime><FixedId><Value>6609751</Value></FixedId><ID><Value>6609751</Value></ID><Prorated>false</Prorated><Proration>1.0</Proration><PublicID>prod:6609751</PublicID><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime></Entry></AllCosts><CreateTime>2013-10-15T20:25:43.617-04:00</CreateTime><CreateUser><Contact><CreateTime>2013-04-08T10:09:28.316-04:00</CreateTime><FirstName>Allison</FirstName><ID><Value>57382</Value></ID><LastName>Embrey</LastName><PublicID>prod:57382</PublicID><UpdateTime>2013-10-07T09:29:11.61-04:00</UpdateTime></Contact><CreateTime>2013-04-08T10:09:28.316-04:00</CreateTime><ID><Value>3403</Value></ID><PublicID>prod:3403</PublicID><Roles><Entry><ID><Value>3401</Value></ID><Role><CreateTime>2012-09-07T16:41:54.273-04:00</CreateTime><ID><Value>30</Value></ID><Name>Sales Rep</Name><PublicID>sales_rep</PublicID><UpdateTime>2013-11-05T14:05:22.921-05:00</UpdateTime></Role></Entry></Roles><UpdateTime>2013-04-08T10:09:28.316-04:00</UpdateTime></CreateUser><CreditScore>checkScore</CreditScore><EISEditEffectiveDateExt>2013-11-22T00:01:00-05:00</EISEditEffectiveDateExt><EISPolicyTermNumber>1</EISPolicyTermNumber><FcraNotice>true</FcraNotice><ID><Value>271095</Value></ID><Job><CreateTime>2013-10-15T20:21:03.002-04:00</CreateTime><ID><Value>199687</Value></ID><OOSJob>false</OOSJob><PublicID>prod:199687</PublicID><UpdateTime>2013-10-15T20:48:41.153-04:00</UpdateTime><UpdateUser><Contact><FirstName>Allison</FirstName><LastName>Embrey</LastName></Contact><CreateTime>2013-04-08T10:09:28.316-04:00</CreateTime><ID><Value>3403</Value></ID><PublicID>prod:3403</PublicID><UpdateTime>2013-04-08T10:09:28.316-04:00</UpdateTime></UpdateUser></Job><MostRecentModel>false</MostRecentModel><PATransactions><Entry><Amount>34.33</Amount><Charged>true</Charged><CreateTime>2013-11-21T14:12:00.703-05:00</CreateTime><EffDate>2013-11-22T00:00:00-05:00</EffDate><ExpDate>2014-11-22T00:00:00-05:00</ExpDate><FixedId><Value>5328928</Value></FixedId><ID><Value>5328928</Value></ID><PACost><ActualAdjRate>34.3274</ActualAdjRate><ActualTermAmount>34.33</ActualTermAmount><ChargePattern><Code>Premium</Code></ChargePattern><Coverage><CovTerms><Entry><DisplayValue>$2,500</DisplayValue><PatternCode>PAPIPMD_LIMIT</PatternCode><ValueTypeName>Option</ValueTypeName></Entry><Entry><DisplayValue>Yes</DisplayValue><PatternCode>PAPIPMD_GUEST</PatternCode><ValueTypeName>bit</ValueTypeName></Entry></CovTerms><CreateTime>2013-10-15T20:25:43.617-04:00</CreateTime><ID><Value>2303724</Value></ID><PatternCode>PAPIP_MD</PatternCode><PublicID>prod:2303724</PublicID><UpdateTime>2013-10-15T20:25:43.617-04:00</UpdateTime></Coverage><CreateTime>2013-11-21T14:12:00.703-05:00</CreateTime><FixedId><Value>6609756</Value></FixedId><ID><Value>6609756</Value></ID><Prorated>false</Prorated><Proration>1.0</Proration><PublicID>prod:6609756</PublicID><Subtype><Code>PersonalAutoCovCost</Code></Subtype><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime><Vehicle><CreateTime>2013-11-21T14:10:30.563-05:00</CreateTime><FixedId><Value>1062257</Value></FixedId><ID><Value>1062257</Value></ID><PublicID>prod:1062257</PublicID><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime></Vehicle></PACost><PublicID>prod:5328928</PublicID><ToBeAccrued>true</ToBeAccrued><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime><UpdateUser><Contact><CreateTime>2013-06-02T15:21:23.643-04:00</CreateTime><FirstName>Julianna</FirstName><ID><Value>112784</Value></ID><LastName>Cookus</LastName><PublicID>prod:112784</PublicID><UpdateTime>2013-06-02T15:21:23.643-04:00</UpdateTime></Contact><CreateTime>2013-06-02T15:21:23.643-04:00</CreateTime><ID><Value>3708</Value></ID><PublicID>prod:3708</PublicID><Roles><Entry><ID><Value>4106</Value></ID><PublicID>prod:4106</PublicID><Role><CreateTime>2012-09-07T16:41:54.273-04:00</CreateTime><ID><Value>30</Value></ID><Name>Sales Rep</Name><PublicID>sales_rep</PublicID><UpdateTime>2013-11-05T14:05:22.921-05:00</UpdateTime></Role></Entry></Roles><UpdateTime>2013-06-02T15:21:23.643-04:00</UpdateTime></UpdateUser></Entry><Entry><Amount>44.73</Amount><Charged>true</Charged><CreateTime>2013-11-21T14:12:00.703-05:00</CreateTime><EffDate>2013-11-22T00:00:00-05:00</EffDate><ExpDate>2014-11-22T00:00:00-05:00</ExpDate><FixedId><Value>5328929</Value></FixedId><ID><Value>5328929</Value></ID><PACost><ActualAdjRate>44.7303</ActualAdjRate><ActualTermAmount>44.73</ActualTermAmount><ChargePattern><Code>Premium</Code></ChargePattern><Coverage><CovTerms><Entry><DisplayValue>$30,000/$60,000</DisplayValue><PatternCode>PAUMBI</PatternCode><ValueTypeName>Package</ValueTypeName></Entry></CovTerms><CreateTime>2013-10-15T20:25:44.148-04:00</CreateTime><ID><Value>2303727</Value></ID><PatternCode>PAUMBICov</PatternCode><PublicID>prod:2303727</PublicID><UpdateTime>2013-10-15T20:25:44.148-04:00</UpdateTime></Coverage><CreateTime>2013-11-21T14:12:00.703-05:00</CreateTime><FixedId><Value>6609755</Value></FixedId><ID><Value>6609755</Value></ID><Prorated>false</Prorated><Proration>1.0</Proration><PublicID>prod:6609755</PublicID><Subtype><Code>PersonalAutoCovCost</Code></Subtype><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime><Vehicle><CreateTime>2013-11-21T14:10:30.563-05:00</CreateTime><FixedId><Value>1062257</Value></FixedId><ID><Value>1062257</Value></ID><PublicID>prod:1062257</PublicID><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime></Vehicle></PACost><PublicID>prod:5328929</PublicID><ToBeAccrued>true</ToBeAccrued><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime><UpdateUser><Contact><CreateTime>2013-06-02T15:21:23.643-04:00</CreateTime><FirstName>Julianna</FirstName><ID><Value>112784</Value></ID><LastName>Cookus</LastName><PublicID>prod:112784</PublicID><UpdateTime>2013-06-02T15:21:23.643-04:00</UpdateTime></Contact><CreateTime>2013-06-02T15:21:23.643-04:00</CreateTime><ID><Value>3708</Value></ID><PublicID>prod:3708</PublicID><Roles><Entry><ID><Value>4106</Value></ID><PublicID>prod:4106</PublicID><Role><CreateTime>2012-09-07T16:41:54.273-04:00</CreateTime><ID><Value>30</Value></ID><Name>Sales Rep</Name><PublicID>sales_rep</PublicID><UpdateTime>2013-11-05T14:05:22.921-05:00</UpdateTime></Role></Entry></Roles><UpdateTime>2013-06-02T15:21:23.643-04:00</UpdateTime></UpdateUser></Entry><Entry><Amount>206.37</Amount><Charged>true</Charged><CreateTime>2013-11-21T14:12:00.703-05:00</CreateTime><EffDate>2013-11-22T00:00:00-05:00</EffDate><ExpDate>2014-11-22T00:00:00-05:00</ExpDate><FixedId><Value>5328930</Value></FixedId><ID><Value>5328930</Value></ID><PACost><ActualAdjRate>206.3666</ActualAdjRate><ActualTermAmount>206.37</ActualTermAmount><ChargePattern><Code>Premium</Code></ChargePattern><Coverage><CovTerms><Entry><DisplayValue>$30,000/$60,000</DisplayValue><PatternCode>PABodilyInjury</PatternCode><ValueTypeName>Package</ValueTypeName></Entry></CovTerms><CreateTime>2013-10-15T20:25:43.617-04:00</CreateTime><ID><Value>2303720</Value></ID><PatternCode>EISPABodilyInjuryCov</PatternCode><PublicID>prod:2303720</PublicID><UpdateTime>2013-10-15T20:25:43.617-04:00</UpdateTime></Coverage><CreateTime>2013-11-21T14:12:00.703-05:00</CreateTime><FixedId><Value>6609757</Value></FixedId><ID><Value>6609757</Value></ID><Prorated>false</Prorated><Proration>1.0</Proration><PublicID>prod:6609757</PublicID><Subtype><Code>PersonalAutoExpenseFeeCostExt</Code></Subtype><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime><Vehicle><CreateTime>2013-11-21T14:10:30.563-05:00</CreateTime><FixedId><Value>1062257</Value></FixedId><ID><Value>1062257</Value></ID><PublicID>prod:1062257</PublicID><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime></Vehicle></PACost><PublicID>prod:5328930</PublicID><ToBeAccrued>true</ToBeAccrued><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime><UpdateUser><Contact><CreateTime>2013-06-02T15:21:23.643-04:00</CreateTime><FirstName>Julianna</FirstName><ID><Value>112784</Value></ID><LastName>Cookus</LastName><PublicID>prod:112784</PublicID><UpdateTime>2013-06-02T15:21:23.643-04:00</UpdateTime></Contact><CreateTime>2013-06-02T15:21:23.643-04:00</CreateTime><ID><Value>3708</Value></ID><PublicID>prod:3708</PublicID><Roles><Entry><ID><Value>4106</Value></ID><PublicID>prod:4106</PublicID><Role><CreateTime>2012-09-07T16:41:54.273-04:00</CreateTime><ID><Value>30</Value></ID><Name>Sales Rep</Name><PublicID>sales_rep</PublicID><UpdateTime>2013-11-05T14:05:22.921-05:00</UpdateTime></Role></Entry></Roles><UpdateTime>2013-06-02T15:21:23.643-04:00</UpdateTime></UpdateUser></Entry><Entry><Amount>376.93</Amount><Charged>true</Charged><CreateTime>2013-11-21T14:12:00.703-05:00</CreateTime><EffDate>2013-11-22T00:00:00-05:00</EffDate><ExpDate>2014-11-22T00:00:00-05:00</ExpDate><FixedId><Value>5328931</Value></FixedId><ID><Value>5328931</Value></ID><PACost><ActualAdjRate>376.9342</ActualAdjRate><ActualTermAmount>376.93</ActualTermAmount><ChargePattern><Code>Premium</Code></ChargePattern><Coverage><CovTerms><Entry><DisplayValue>$15,000</DisplayValue><PatternCode>PAPropertyDamage</PatternCode><ValueTypeName>Option</ValueTypeName></Entry></CovTerms><CreateTime>2013-10-15T20:25:43.617-04:00</CreateTime><ID><Value>2303721</Value></ID><PatternCode>EISPAPropertyDamageCov</PatternCode><PublicID>prod:2303721</PublicID><UpdateTime>2013-10-15T20:25:43.617-04:00</UpdateTime></Coverage><CreateTime>2013-11-21T14:12:00.703-05:00</CreateTime><FixedId><Value>6609753</Value></FixedId><ID><Value>6609753</Value></ID><Prorated>false</Prorated><Proration>1.0</Proration><PublicID>prod:6609753</PublicID><Subtype><Code>PersonalAutoCovCost</Code></Subtype><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime><Vehicle><CreateTime>2013-11-21T14:10:30.563-05:00</CreateTime><FixedId><Value>1062257</Value></FixedId><ID><Value>1062257</Value></ID><PublicID>prod:1062257</PublicID><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime></Vehicle></PACost><PublicID>prod:5328931</PublicID><ToBeAccrued>true</ToBeAccrued><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime><UpdateUser><Contact><CreateTime>2013-06-02T15:21:23.643-04:00</CreateTime><FirstName>Julianna</FirstName><ID><Value>112784</Value></ID><LastName>Cookus</LastName><PublicID>prod:112784</PublicID><UpdateTime>2013-06-02T15:21:23.643-04:00</UpdateTime></Contact><CreateTime>2013-06-02T15:21:23.643-04:00</CreateTime><ID><Value>3708</Value></ID><PublicID>prod:3708</PublicID><Roles><Entry><ID><Value>4106</Value></ID><PublicID>prod:4106</PublicID><Role><CreateTime>2012-09-07T16:41:54.273-04:00</CreateTime><ID><Value>30</Value></ID><Name>Sales Rep</Name><PublicID>sales_rep</PublicID><UpdateTime>2013-11-05T14:05:22.921-05:00</UpdateTime></Role></Entry></Roles><UpdateTime>2013-06-02T15:21:23.643-04:00</UpdateTime></UpdateUser></Entry><Entry><Amount>469.69</Amount><Charged>true</Charged><CreateTime>2013-11-21T14:12:00.703-05:00</CreateTime><EffDate>2013-11-22T00:00:00-05:00</EffDate><ExpDate>2014-11-22T00:00:00-05:00</ExpDate><FixedId><Value>5328932</Value></FixedId><ID><Value>5328932</Value></ID><PACost><ActualAdjRate>469.6920</ActualAdjRate><ActualTermAmount>469.69</ActualTermAmount><ChargePattern><Code>Premium</Code></ChargePattern><Coverage><CovTerms><Entry><DisplayValue>$30,000/$60,000</DisplayValue><PatternCode>PABodilyInjury</PatternCode><ValueTypeName>Package</ValueTypeName></Entry></CovTerms><CreateTime>2013-10-15T20:25:43.617-04:00</CreateTime><ID><Value>2303720</Value></ID><PatternCode>EISPABodilyInjuryCov</PatternCode><PublicID>prod:2303720</PublicID><UpdateTime>2013-10-15T20:25:43.617-04:00</UpdateTime></Coverage><CreateTime>2013-11-21T14:12:00.703-05:00</CreateTime><FixedId><Value>6609752</Value></FixedId><ID><Value>6609752</Value></ID><Prorated>false</Prorated><Proration>1.0</Proration><PublicID>prod:6609752</PublicID><Subtype><Code>PersonalAutoCovCost</Code></Subtype><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime><Vehicle><CreateTime>2013-11-21T14:10:30.563-05:00</CreateTime><FixedId><Value>1062257</Value></FixedId><ID><Value>1062257</Value></ID><PublicID>prod:1062257</PublicID><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime></Vehicle></PACost><PublicID>prod:5328932</PublicID><ToBeAccrued>true</ToBeAccrued><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime><UpdateUser><Contact><CreateTime>2013-06-02T15:21:23.643-04:00</CreateTime><FirstName>Julianna</FirstName><ID><Value>112784</Value></ID><LastName>Cookus</LastName><PublicID>prod:112784</PublicID><UpdateTime>2013-06-02T15:21:23.643-04:00</UpdateTime></Contact><CreateTime>2013-06-02T15:21:23.643-04:00</CreateTime><ID><Value>3708</Value></ID><PublicID>prod:3708</PublicID><Roles><Entry><ID><Value>4106</Value></ID><PublicID>prod:4106</PublicID><Role><CreateTime>2012-09-07T16:41:54.273-04:00</CreateTime><ID><Value>30</Value></ID><Name>Sales Rep</Name><PublicID>sales_rep</PublicID><UpdateTime>2013-11-05T14:05:22.921-05:00</UpdateTime></Role></Entry></Roles><UpdateTime>2013-06-02T15:21:23.643-04:00</UpdateTime></UpdateUser></Entry><Entry><Amount>698.33</Amount><Charged>true</Charged><CreateTime>2013-11-21T14:12:00.703-05:00</CreateTime><EffDate>2013-11-22T00:00:00-05:00</EffDate><ExpDate>2014-11-22T00:00:00-05:00</ExpDate><FixedId><Value>5328933</Value></FixedId><ID><Value>5328933</Value></ID><PACost><ActualAdjRate>698.3258</ActualAdjRate><ActualTermAmount>698.33</ActualTermAmount><ChargePattern><Code>Premium</Code></ChargePattern><Coverage><CovTerms><Entry><DisplayValue>$500</DisplayValue><PatternCode>PACollDeductible</PatternCode><ValueTypeName>Option</ValueTypeName></Entry></CovTerms><CreateTime>2013-11-21T14:11:58-05:00</CreateTime><ID><Value>2772340</Value></ID><PatternCode>PACollisionCov</PatternCode><PublicID>prod:2772340</PublicID><UpdateTime>2013-11-21T14:11:58-05:00</UpdateTime></Coverage><CreateTime>2013-11-21T14:12:00.703-05:00</CreateTime><FixedId><Value>6609754</Value></FixedId><ID><Value>6609754</Value></ID><Prorated>false</Prorated><Proration>1.0</Proration><PublicID>prod:6609754</PublicID><Subtype><Code>PersonalVehicleCovCost</Code></Subtype><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime><Vehicle><CreateTime>2013-11-21T14:10:30.563-05:00</CreateTime><FixedId><Value>1062257</Value></FixedId><ID><Value>1062257</Value></ID><PublicID>prod:1062257</PublicID><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime></Vehicle></PACost><PublicID>prod:5328933</PublicID><ToBeAccrued>true</ToBeAccrued><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime><UpdateUser><Contact><CreateTime>2013-06-02T15:21:23.643-04:00</CreateTime><FirstName>Julianna</FirstName><ID><Value>112784</Value></ID><LastName>Cookus</LastName><PublicID>prod:112784</PublicID><UpdateTime>2013-06-02T15:21:23.643-04:00</UpdateTime></Contact><CreateTime>2013-06-02T15:21:23.643-04:00</CreateTime><ID><Value>3708</Value></ID><PublicID>prod:3708</PublicID><Roles><Entry><ID><Value>4106</Value></ID><PublicID>prod:4106</PublicID><Role><CreateTime>2012-09-07T16:41:54.273-04:00</CreateTime><ID><Value>30</Value></ID><Name>Sales Rep</Name><PublicID>sales_rep</PublicID><UpdateTime>2013-11-05T14:05:22.921-05:00</UpdateTime></Role></Entry></Roles><UpdateTime>2013-06-02T15:21:23.643-04:00</UpdateTime></UpdateUser></Entry><Entry><Amount>24.76</Amount><Charged>true</Charged><CreateTime>2013-11-21T14:12:00.703-05:00</CreateTime><EffDate>2013-11-22T00:00:00-05:00</EffDate><ExpDate>2014-11-22T00:00:00-05:00</ExpDate><FixedId><Value>5328934</Value></FixedId><ID><Value>5328934</Value></ID><PACost><ActualAdjRate>24.7618</ActualAdjRate><ActualTermAmount>24.76</ActualTermAmount><ChargePattern><Code>Premium</Code></ChargePattern><Coverage><CovTerms><Entry><DisplayValue>15,000</DisplayValue><PatternCode>PAUMPDLimit</PatternCode><ValueTypeName>Option</ValueTypeName></Entry></CovTerms><CreateTime>2013-10-15T20:25:44.148-04:00</CreateTime><ID><Value>2303728</Value></ID><PatternCode>PAUMPDCov</PatternCode><PublicID>prod:2303728</PublicID><UpdateTime>2013-10-15T20:25:44.148-04:00</UpdateTime></Coverage><CreateTime>2013-11-21T14:12:00.703-05:00</CreateTime><FixedId><Value>6609758</Value></FixedId><ID><Value>6609758</Value></ID><Prorated>false</Prorated><Proration>1.0</Proration><PublicID>prod:6609758</PublicID><Subtype><Code>PersonalAutoCovCost</Code></Subtype><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime><Vehicle><CreateTime>2013-11-21T14:10:30.563-05:00</CreateTime><FixedId><Value>1062257</Value></FixedId><ID><Value>1062257</Value></ID><PublicID>prod:1062257</PublicID><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime></Vehicle></PACost><PublicID>prod:5328934</PublicID><ToBeAccrued>true</ToBeAccrued><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime><UpdateUser><Contact><CreateTime>2013-06-02T15:21:23.643-04:00</CreateTime><FirstName>Julianna</FirstName><ID><Value>112784</Value></ID><LastName>Cookus</LastName><PublicID>prod:112784</PublicID><UpdateTime>2013-06-02T15:21:23.643-04:00</UpdateTime></Contact><CreateTime>2013-06-02T15:21:23.643-04:00</CreateTime><ID><Value>3708</Value></ID><PublicID>prod:3708</PublicID><Roles><Entry><ID><Value>4106</Value></ID><PublicID>prod:4106</PublicID><Role><CreateTime>2012-09-07T16:41:54.273-04:00</CreateTime><ID><Value>30</Value></ID><Name>Sales Rep</Name><PublicID>sales_rep</PublicID><UpdateTime>2013-11-05T14:05:22.921-05:00</UpdateTime></Role></Entry></Roles><UpdateTime>2013-06-02T15:21:23.643-04:00</UpdateTime></UpdateUser></Entry><Entry><Amount>182.77</Amount><Charged>true</Charged><CreateTime>2013-11-21T14:12:00.703-05:00</CreateTime><EffDate>2013-11-22T00:00:00-05:00</EffDate><ExpDate>2014-11-22T00:00:00-05:00</ExpDate><FixedId><Value>5328935</Value></FixedId><ID><Value>5328935</Value></ID><PACost><ActualAdjRate>182.7659</ActualAdjRate><ActualTermAmount>182.77</ActualTermAmount><ChargePattern><Code>Premium</Code></ChargePattern><Coverage><CovTerms><Entry><DisplayValue>$500</DisplayValue><PatternCode>PACompDeductible</PatternCode><ValueTypeName>Option</ValueTypeName></Entry></CovTerms><CreateTime>2013-11-21T14:11:58-05:00</CreateTime><ID><Value>2772339</Value></ID><PatternCode>PAComprehensiveCov</PatternCode><PublicID>prod:2772339</PublicID><UpdateTime>2013-11-21T14:11:58-05:00</UpdateTime></Coverage><CreateTime>2013-11-21T14:12:00.703-05:00</CreateTime><FixedId><Value>6609751</Value></FixedId><ID><Value>6609751</Value></ID><Prorated>false</Prorated><Proration>1.0</Proration><PublicID>prod:6609751</PublicID><Subtype><Code>PersonalVehicleCovCost</Code></Subtype><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime><Vehicle><CreateTime>2013-11-21T14:10:30.563-05:00</CreateTime><FixedId><Value>1062257</Value></FixedId><ID><Value>1062257</Value></ID><PublicID>prod:1062257</PublicID><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime></Vehicle></PACost><PublicID>prod:5328935</PublicID><ToBeAccrued>true</ToBeAccrued><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime><UpdateUser><Contact><CreateTime>2013-06-02T15:21:23.643-04:00</CreateTime><FirstName>Julianna</FirstName><ID><Value>112784</Value></ID><LastName>Cookus</LastName><PublicID>prod:112784</PublicID><UpdateTime>2013-06-02T15:21:23.643-04:00</UpdateTime></Contact><CreateTime>2013-06-02T15:21:23.643-04:00</CreateTime><ID><Value>3708</Value></ID><PublicID>prod:3708</PublicID><Roles><Entry><ID><Value>4106</Value></ID><PublicID>prod:4106</PublicID><Role><CreateTime>2012-09-07T16:41:54.273-04:00</CreateTime><ID><Value>30</Value></ID><Name>Sales Rep</Name><PublicID>sales_rep</PublicID><UpdateTime>2013-11-05T14:05:22.921-05:00</UpdateTime></Role></Entry></Roles><UpdateTime>2013-06-02T15:21:23.643-04:00</UpdateTime></UpdateUser></Entry></PATransactions><PeriodDisplayStatus>Quoted</PeriodDisplayStatus><PeriodEnd>2014-11-22T00:01:00-05:00</PeriodEnd><PeriodStart>2013-11-22T00:01:00-05:00</PeriodStart><PersonalAutoLine><AffinityGroupExt /><AllCoverages><Entry><CovTerms><Entry><DisplayValue>$30,000/$60,000</DisplayValue><PatternCode>PABodilyInjury</PatternCode><ValueTypeName>Package</ValueTypeName></Entry></CovTerms><CreateTime>2013-10-15T20:25:43.617-04:00</CreateTime><ID><Value>2303720</Value></ID><PatternCode>EISPABodilyInjuryCov</PatternCode><PublicID>prod:2303720</PublicID><UpdateTime>2013-10-15T20:25:43.617-04:00</UpdateTime></Entry><Entry><CovTerms><Entry><DisplayValue>$15,000</DisplayValue><PatternCode>PAPropertyDamage</PatternCode><ValueTypeName>Option</ValueTypeName></Entry></CovTerms><CreateTime>2013-10-15T20:25:43.617-04:00</CreateTime><ID><Value>2303721</Value></ID><PatternCode>EISPAPropertyDamageCov</PatternCode><PublicID>prod:2303721</PublicID><UpdateTime>2013-10-15T20:25:43.617-04:00</UpdateTime></Entry><Entry><CovTerms><Entry><DisplayValue>$30,000/$60,000</DisplayValue><PatternCode>PAUMBI</PatternCode><ValueTypeName>Package</ValueTypeName></Entry></CovTerms><CreateTime>2013-10-15T20:25:44.148-04:00</CreateTime><ID><Value>2303727</Value></ID><PatternCode>PAUMBICov</PatternCode><PublicID>prod:2303727</PublicID><UpdateTime>2013-10-15T20:25:44.148-04:00</UpdateTime></Entry><Entry><CovTerms><Entry><DisplayValue>$2,500</DisplayValue><PatternCode>PAPIPMD_LIMIT</PatternCode><ValueTypeName>Option</ValueTypeName></Entry><Entry><DisplayValue>Yes</DisplayValue><PatternCode>PAPIPMD_GUEST</PatternCode><ValueTypeName>bit</ValueTypeName></Entry></CovTerms><CreateTime>2013-10-15T20:25:43.617-04:00</CreateTime><ID><Value>2303724</Value></ID><PatternCode>PAPIP_MD</PatternCode><PublicID>prod:2303724</PublicID><UpdateTime>2013-10-15T20:25:43.617-04:00</UpdateTime></Entry><Entry><CovTerms><Entry><DisplayValue>15,000</DisplayValue><PatternCode>PAUMPDLimit</PatternCode><ValueTypeName>Option</ValueTypeName></Entry></CovTerms><CreateTime>2013-10-15T20:25:44.148-04:00</CreateTime><ID><Value>2303728</Value></ID><PatternCode>PAUMPDCov</PatternCode><PublicID>prod:2303728</PublicID><UpdateTime>2013-10-15T20:25:44.148-04:00</UpdateTime></Entry><Entry><CovTerms><Entry><DisplayValue>$500</DisplayValue><PatternCode>PACollDeductible</PatternCode><ValueTypeName>Option</ValueTypeName></Entry></CovTerms><CreateTime>2013-11-21T14:11:58-05:00</CreateTime><ID><Value>2772340</Value></ID><PatternCode>PACollisionCov</PatternCode><PublicID>prod:2772340</PublicID><UpdateTime>2013-11-21T14:11:58-05:00</UpdateTime></Entry><Entry><CovTerms><Entry><DisplayValue>$500</DisplayValue><PatternCode>PACompDeductible</PatternCode><ValueTypeName>Option</ValueTypeName></Entry></CovTerms><CreateTime>2013-11-21T14:11:58-05:00</CreateTime><ID><Value>2772339</Value></ID><PatternCode>PAComprehensiveCov</PatternCode><PublicID>prod:2772339</PublicID><UpdateTime>2013-11-21T14:11:58-05:00</UpdateTime></Entry></AllCoverages><AllowTextExt>false</AllowTextExt><ApplicantExt><CreateTime>2013-10-15T20:25:43.617-04:00</CreateTime><CreditScoreExt>505</CreditScoreExt><FixedId><Value>1681251</Value></FixedId><ID><Value>1681292</Value></ID><PublicID>prod:1681292</PublicID><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime></ApplicantExt><AtFaultExt>0</AtFaultExt><BaseState>MD</BaseState><ChannelEXT>webToPhone</ChannelEXT><ChildOnPolicyExt>false</ChildOnPolicyExt><CreateTime>2013-10-15T20:25:43.617-04:00</CreateTime><CurrentCarrier_Ext>Geico</CurrentCarrier_Ext><CurrentCoverageFlagExt>false</CurrentCoverageFlagExt><EmailAddress1>joemoma365@gmail.com</EmailAddress1><ESignatureExt>true</ESignatureExt><FixedId><Value>569166</Value></FixedId><GarageLocations><Entry><PostalCode>21703</PostalCode></Entry></GarageLocations><HasAutoInsuranceExt>policy_expired_over_30days</HasAutoInsuranceExt><hasThreeYearCleanRenewalExt>false</hasThreeYearCleanRenewalExt><homeownerExt>false</homeownerExt><ID><Value>569177</Value></ID><LapseInCoverageExt>lapse_more_than_30days</LapseInCoverageExt><MinorChildExt>false</MinorChildExt><MultiCarExt>false</MultiCarExt><nCIncidents>0</nCIncidents><NumDriversExt>1</NumDriversExt><OnlineDiscountExt>true</OnlineDiscountExt><PaidInFullExt>false</PaidInFullExt><PaperlessDiscountExt>true</PaperlessDiscountExt><PAPIP_MD><CovTerms><Entry><DisplayValue>$2,500</DisplayValue></Entry><Entry><DisplayValue>Yes</DisplayValue></Entry></CovTerms><CreateTime>2013-10-15T20:25:43.617-04:00</CreateTime><FixedId><Value>2303681</Value></FixedId><ID><Value>2303724</Value></ID><PublicID>prod:2303724</PublicID><UpdateTime>2013-10-15T20:25:43.617-04:00</UpdateTime></PAPIP_MD><PolicyDrivers><Entry><AccountContactRole><CreateTime>2013-10-15T20:21:03.002-04:00</CreateTime><ID><Value>469167</Value></ID><PublicID>prod:469167</PublicID><UpdateTime>2013-10-15T20:21:03.002-04:00</UpdateTime></AccountContactRole><Age>24</Age><AgeFirstLicensedExt>18</AgeFirstLicensedExt><AssociatedPrimaryVehicleExt><CreateTime>2013-11-21T14:10:30.563-05:00</CreateTime><ID><Value>1062257</Value></ID><PublicID>prod:1062257</PublicID><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime></AssociatedPrimaryVehicleExt><BIPointsExt>0</BIPointsExt><CMPPointsExt>0</CMPPointsExt><ColPointsExt>0</ColPointsExt><CreateTime>2013-10-15T20:25:43.617-04:00</CreateTime><CreditTierExt>P1</CreditTierExt><CustPointsExt /><DateOfBirth>1989-01-12T00:00:00-05:00</DateOfBirth><DriverClassFactorExt>1.2232000</DriverClassFactorExt><Excluded>false</Excluded><FirstName>Joseph</FirstName><FixedId><Value>1681251</Value></FixedId><Fr19Ext>false</Fr19Ext><Fr44Ext>false</Fr44Ext><Gender>M</Gender><GoodStudentDiscountExt>true</GoodStudentDiscountExt><HighestLevelOfEducationExt>associatevocational</HighestLevelOfEducationExt><ID><Value>1681292</Value></ID><LastName>Carrafa</LastName><LicenseState>MD</LicenseState><LicenseStatusExt>valid</LicenseStatusExt><LoanPointsExt /><MaritalExt>single</MaritalExt><MaritalStatus>S</MaritalStatus><MedPointsExt /><MVROrderStatus>Not Ordered</MVROrderStatus><occupationGroupExt>O06</occupationGroupExt><OccupationStatusListExt>EmployedPrivately</OccupationStatusListExt><OccupationTitleExt>Nurse - CNA (Certified Nursing Assistant)</OccupationTitleExt><Operator>Occasional</Operator><PDPointsExt>0</PDPointsExt><PIPMDPointsExt>0</PIPMDPointsExt><PIPTXPointsExt /><PublicID>prod:1681292</PublicID><RatedCreditTierExt>P1</RatedCreditTierExt><RatingStatusExt>rated</RatingStatusExt><RelationshipToInsuredExt>applicant</RelationshipToInsuredExt><RentPointsExt /><Sr22Ext>false</Sr22Ext><UMBIPointsExt>0</UMBIPointsExt><UMPDPointsExt>0</UMPDPointsExt><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime><YearsLicensedExt>6</YearsLicensedExt></Entry></PolicyDrivers><PublicID>prod:569177</PublicID><ReapplicationDiscountExt>false</ReapplicationDiscountExt><ResidencyExt>rent</ResidencyExt><responsibleDriverExt>true</responsibleDriverExt><SourceOfBusinessExt>tv</SourceOfBusinessExt><TierExt /><TierScoreExt /><UpdateTime>2013-11-13T21:17:22.304-05:00</UpdateTime><Vehicles><Entry><AccountLocation><AddressLine1>621 himes ave</AddressLine1><AddressLine2>107</AddressLine2><City>Frederick</City><Country>US</Country><County>Frederick</County><CreateTime>2013-10-15T20:21:02.377-04:00</CreateTime><ID><Value>501955</Value></ID><Phone>609-402-9712</Phone><PostalCode>21703</PostalCode><PublicID>prod:501955</PublicID><State>MD</State><UpdateTime>2013-10-15T20:21:02.377-04:00</UpdateTime></AccountLocation><Age>7</Age><AssociatedPrimaryDriverExt><AccountContactRole><CreateTime>2013-10-15T20:21:03.002-04:00</CreateTime><ID><Value>469167</Value></ID><PublicID>prod:469167</PublicID><UpdateTime>2013-10-15T20:21:03.002-04:00</UpdateTime></AccountContactRole><CreateTime>2013-10-15T20:25:43.617-04:00</CreateTime><ID><Value>1681292</Value></ID><PublicID>prod:1681292</PublicID><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime></AssociatedPrimaryDriverExt><CoverableReferenceDate>2013-10-15T00:00:00-04:00</CoverableReferenceDate><CreateTime>2013-11-21T14:10:30.563-05:00</CreateTime><DMAExt>410</DMAExt><ExistingDamageExt>false</ExistingDamageExt><ExoticVehicleExt>false</ExoticVehicleExt><ExpirationDate>2014-11-22T00:01:00-05:00</ExpirationDate><FixedId><Value>1062257</Value></FixedId><GarageLocation><County>Frederick</County><PostalCode>21703</PostalCode></GarageLocation><ID><Value>1062257</Value></ID><IgnoreVINExt>false</IgnoreVINExt><LeaseOrRent>true</LeaseOrRent><LicenseState>MD</LicenseState><Make>FORD</Make><Model>FREESTYLE</Model><PrimaryUse>commuting</PrimaryUse><PublicID>prod:1062257</PublicID><TerritoryExt>904</TerritoryExt><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime><VehicleNumber>1</VehicleNumber><VehicleType>auto</VehicleType><Year>2006</Year></Entry></Vehicles><WebCustomerNubmerExt>7I4CH7</WebCustomerNubmerExt><WebToPhoneDiscountExt>true</WebToPhoneDiscountExt><YearsWithProviderExt>less_1year</YearsWithProviderExt><YouthfulEXT>false</YouthfulEXT><YouthfulPNIExt>false</YouthfulPNIExt></PersonalAutoLine><Policy><Account><AccountNumber>10114611</AccountNumber><CreateTime>2013-10-15T20:21:02.377-04:00</CreateTime><CreateUser><Contact><CreateTime>2012-12-28T16:49:04.702-05:00</CreateTime><FirstName>ConsumerQuote</FirstName><ID><Value>14795</Value></ID><LastName>Integration</LastName><PublicID>prod:14795</PublicID><UpdateTime>2012-12-28T16:49:04.702-05:00</UpdateTime></Contact><CreateTime>2012-12-28T16:49:04.702-05:00</CreateTime><ID><Value>1403</Value></ID><PublicID>prod:1403</PublicID><Roles><Entry><ID><Value>1401</Value></ID><PublicID>prod:1401</PublicID><Role><CreateTime>2012-09-07T11:32:11.907-04:00</CreateTime><ID><Value>1</Value></ID><Name>Superuser</Name><PublicID>superuser</PublicID><UpdateTime>2013-10-02T12:08:23.384-04:00</UpdateTime></Role></Entry></Roles><UpdateTime>2012-12-28T16:49:04.702-05:00</UpdateTime></CreateUser><ID><Value>119485</Value></ID><PublicID>prod:119485</PublicID><UpdateTime>2013-10-15T20:21:03.002-04:00</UpdateTime></Account><CreateTime>2013-10-15T20:21:03.002-04:00</CreateTime><ID><Value>122492</Value></ID><Periods><Entry><CreateTime>2013-10-15T20:25:43.617-04:00</CreateTime><ID><Value>271095</Value></ID><Preempted>false</Preempted><PublicID>prod:271095</PublicID><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime></Entry><Entry><CreateTime>2013-10-15T20:21:03.002-04:00</CreateTime><ID><Value>271092</Value></ID><Preempted>false</Preempted><PublicID>prod:271092</PublicID><UpdateTime>2013-11-21T14:11:59.906-05:00</UpdateTime></Entry></Periods><PublicID>prod:122492</PublicID><UpdateTime>2013-10-15T20:48:41.153-04:00</UpdateTime></Policy><PolicyAddress><Address><AddressLine1>621 Himes Ave Apt 107</AddressLine1><City>Frederick</City><County>Frederick</County><CreateTime>2013-10-15T20:21:02.377-04:00</CreateTime><ID><Value>501954</Value></ID><PostalCode>21703</PostalCode><PublicID>prod:501954</PublicID><State>MD</State><UpdateTime>2013-10-15T20:23:45.302-04:00</UpdateTime></Address><AddressLine1>621 Himes Ave Apt 107</AddressLine1><City>Frederick</City><County>Frederick</County><CreateTime>2013-10-15T20:25:43.617-04:00</CreateTime><ID><Value>565193</Value></ID><PostalCode>21703</PostalCode><PublicID>prod:565193</PublicID><State>MD</State><UpdateTime>2013-10-15T20:25:43.617-04:00</UpdateTime></PolicyAddress><PolicyContactRoles><Entry><AccountContactRole><AccountContact><Contact><entity-Person><CellPhone>609-402-9126</CellPhone><DateOfBirth>1989-01-12T00:00:00-05:00</DateOfBirth><FirstName>Joseph</FirstName><Gender>M</Gender><LastName>Carrafa</LastName><MiddleName>J</MiddleName><Suffix>jr</Suffix></entity-Person><CreateTime>2013-10-15T20:21:02.377-04:00</CreateTime><ID><Value>287448</Value></ID><PrimaryAddress><AddressLine1>621 Himes Ave Apt 107</AddressLine1><AddressType>home</AddressType><City>Frederick</City><Country>US</Country><County>Frederick</County><CreateTime>2013-10-15T20:21:02.377-04:00</CreateTime><ID><Value>501954</Value></ID><PostalCode>21703</PostalCode><PublicID>prod:501954</PublicID><State>MD</State><UpdateTime>2013-10-15T20:23:45.302-04:00</UpdateTime></PrimaryAddress><PrimaryPhone>home</PrimaryPhone><PublicID>prod:287448</PublicID><UpdateTime>2013-10-15T20:23:45.302-04:00</UpdateTime></Contact><CreateTime>2013-10-15T20:21:02.377-04:00</CreateTime><ID><Value>286745</Value></ID><PublicID>prod:286745</PublicID><UpdateTime>2013-10-15T20:21:03.002-04:00</UpdateTime></AccountContact><CreateTime>2013-10-15T20:21:03.002-04:00</CreateTime><ID><Value>469166</Value></ID><PublicID>prod:469166</PublicID><UpdateTime>2013-10-15T20:21:03.002-04:00</UpdateTime></AccountContactRole><CreateTime>2013-10-15T20:25:43.617-04:00</CreateTime><ID><Value>1681291</Value></ID><PublicID>prod:1681291</PublicID><UpdateTime>2013-10-15T20:25:43.617-04:00</UpdateTime></Entry><Entry><AccountContactRole><AccountContact><Contact><entity-Person><CellPhone>609-402-9712</CellPhone><DateOfBirth>1989-01-12T00:00:00-05:00</DateOfBirth><FirstName>Joseph</FirstName><Gender>M</Gender><LastName>Carrafa</LastName><MaritalStatus>S</MaritalStatus><MiddleName>J</MiddleName><Suffix>jr</Suffix></entity-Person><CreateTime>2013-10-15T20:21:03.002-04:00</CreateTime><HomePhone>609-402-9712</HomePhone><ID><Value>287449</Value></ID><PrimaryAddress><AddressLine1>621 Himes Ave Apt 107</AddressLine1><AddressType>home</AddressType><City>Frederick</City><Country>US</Country><County>Frederick</County><CreateTime>2013-10-15T20:21:02.377-04:00</CreateTime><ID><Value>501954</Value></ID><PostalCode>21703</PostalCode><PublicID>prod:501954</PublicID><State>MD</State><UpdateTime>2013-10-15T20:23:45.302-04:00</UpdateTime></PrimaryAddress><PrimaryPhone>mobile</PrimaryPhone><PublicID>prod:287449</PublicID><UpdateTime>2013-11-13T21:12:10.976-05:00</UpdateTime><WorkPhone>609-402-9712</WorkPhone></Contact><CreateTime>2013-10-15T20:21:03.002-04:00</CreateTime><ID><Value>286746</Value></ID><PublicID>prod:286746</PublicID><UpdateTime>2013-11-13T21:14:11.398-05:00</UpdateTime></AccountContact><CreateTime>2013-10-15T20:21:03.002-04:00</CreateTime><ID><Value>469167</Value></ID><PublicID>prod:469167</PublicID><UpdateTime>2013-10-15T20:21:03.002-04:00</UpdateTime></AccountContactRole><CreateTime>2013-10-15T20:25:43.617-04:00</CreateTime><ID><Value>1681292</Value></ID><PublicID>prod:1681292</PublicID><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime></Entry></PolicyContactRoles><PolicyNumber>Unassigned</PolicyNumber><PublicID>prod:271095</PublicID><QuoteTierGroupExt>10</QuoteTierGroupExt><QuoteTierScoreExt>462</QuoteTierScoreExt><RateAsOfDate>2013-11-21T14:11:58.109-05:00</RateAsOfDate><Status>Quoted</Status><TermPremiumAmountExt>2037.91</TermPremiumAmountExt><TotalPremiumRPT>2037.91</TotalPremiumRPT><TransactionCostRPT>2037.91</TransactionCostRPT><TransactionFeeAmountExt>0.00</TransactionFeeAmountExt><TransactionPremiumRPT>2037.91</TransactionPremiumRPT><UpdateTime>2013-11-21T14:12:00.703-05:00</UpdateTime><UpdateUser><Contact><CreateTime>2013-06-02T15:21:23.643-04:00</CreateTime><FirstName>Julianna</FirstName><ID><Value>112784</Value></ID><LastName>Cookus</LastName><PublicID>prod:112784</PublicID><UpdateTime>2013-06-02T15:21:23.643-04:00</UpdateTime></Contact><CreateTime>2013-06-02T15:21:23.643-04:00</CreateTime><ID><Value>3708</Value></ID><PublicID>prod:3708</PublicID><Roles><Entry><Role><CreateTime>2012-09-07T16:41:54.273-04:00</CreateTime><ID><Value>30</Value></ID><Name>Sales Rep</Name><PublicID>sales_rep</PublicID><UpdateTime>2013-11-05T14:05:22.921-05:00</UpdateTime></Role></Entry></Roles><UpdateTime>2013-06-02T15:21:23.643-04:00</UpdateTime></UpdateUser><ValidQuote>true</ValidQuote><WrittenDate>2013-10-15T00:00:00-04:00</WrittenDate></PolicyPeriod>");
		pp.PPID = parser.getValue("(ID/Value)[1]");
		pp.BasedOnID = parser.getValue("(BasedOn/ID/Value)[1]");
		System.out.println(pp.PPID + pp.BasedOnID);
	}
}
