import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('Modification/Shared/Create Modification'), [('modName') : '86 (partial) speed 2x', ('modType') : 'Adjust Speed'],
	FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Modification/Shared/Set Feed'), [('feedName') : 'MBTA'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Modification/Shared/Set Route after Feed'), [('routeName') : '86 Sullivan'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Modification/New segment'))

WebUI.callTestCase(findTestCase('Modification/Shared/Click Point on Map'), [('coordinates'): [[0, 200], [0, 600], [300, 600], [300,200], [0, 200]]],
	FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Modification/Shared/Set Speed'), [('speed') : '2'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Modification/Back to Modifications'))

