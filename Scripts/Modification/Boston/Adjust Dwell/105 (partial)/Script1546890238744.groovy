import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('Modification/Shared/Create Modification'), [('modName') : '105 (partial) dwell 5 min.', ('modType') : 'Adjust Dwell Time'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Modification/Shared/Set Feed'), [('feedName') : 'MBTA'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Modification/Shared/Set Route after Feed'), [('routeName') : '105 Malden'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Modification/Shared/Set Dwell'), [('dwell') : '300'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Modification/New selection'))

WebUI.callTestCase(findTestCase('Modification/Shared/Click Point on Map'), [('coordinates'): [[-200, -100], [200, -100], [200, 200], [-200, 200], [-200, -100]]], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Modification/Back to Modifications'))

