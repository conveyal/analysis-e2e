import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.waitForElementNotPresent(findTestObject('Misc/Spinner'), 20)

WebUI.click(findTestObject('Modification/Clear Patterns'))

WebUI.waitForElementNotPresent(findTestObject('Misc/Spinner'), 20)