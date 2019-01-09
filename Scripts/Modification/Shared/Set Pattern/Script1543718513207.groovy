import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.waitForElementNotPresent(findTestObject('Misc/Spinner'), 20)

WebUI.click(findTestObject('Modification/Select Pattern arrow'))

WebUI.setText(findTestObject('Modification/Select pattern'), patternName)

WebUI.waitForElementNotPresent(findTestObject('Misc/Spinner'), 20)

WebUI.sendKeys(findTestObject('Modification/Select pattern'), Keys.chord(Keys.ENTER))

WebUI.waitForElementNotPresent(findTestObject('Misc/Spinner'), 20)

