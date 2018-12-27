import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('Modification/Create Modification'), [('modName') : '87 (partial) dwell 5 min.', ('modType') : 'Adjust Dwell Time'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Modification/Set Feed'), [('feedName') : 'MBTA'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Modification/Set Route after Feed'), [('routeName') : '87 Clarendon'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Modification/Set dwell'), [('dwell') : '300'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Modification/Draw Box on Map'), [('x1') : 600, ('y1') : 200, ('x2') : 800, ('y2') : 600], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Modification/Back to Modifications'))

