import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('Modification/Create Modification'), [('modName') : '86 (partial) speed 2x', ('modType') : 'Adjust Speed'],
	FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Modification/Set Feed'), [('feedName') : 'MBTA'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Modification/Set Route after Feed'), [('routeName') : '86 Sullivan'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Modification/Select new segment'))

WebUI.callTestCase(findTestCase('Modification/Draw Box on Map'), [('x1') : 200, ('y1') : 200, ('x2') : 500, ('y2') : 600],
	FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Modification/Set Speed'), [('speed') : '2'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Modification/Back to Modifications'))

