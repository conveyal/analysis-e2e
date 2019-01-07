import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('Modification/Create Modification'), [('modName') : '71 Eastbound speed 0.5x', ('modType') : 'Adjust Speed'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Modification/Set Feed'), [('feedName') : 'MBTA'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Modification/Set Route after Feed'), [('routeName') : '71 Watertown'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Modification/Clear Patterns'))

WebUI.callTestCase(findTestCase('Modification/Set Pattern'), [('patternName') : 'from Watertown'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Modification/Set Pattern'), [('patternName') : 'from Watertown'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Modification/Set Speed'), [('speed') : '0.5'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Modification/Back to Modifications'))