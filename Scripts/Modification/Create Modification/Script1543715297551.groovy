import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

try {
    WebUI.verifyElementPresent(findTestObject('Misc/Dock Title'), 0)
}
catch (Exception e) {
    WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)
} 

WebUI.click(findTestObject('Project/a_Create a modification'))

WebUI.selectOptionByLabel(findTestObject('Project/Select Modification type'), modType, true)

WebUI.setText(findTestObject('Project/Input Modification name'), modName)

WebUI.click(findTestObject('Misc/Modal Confirm'))

