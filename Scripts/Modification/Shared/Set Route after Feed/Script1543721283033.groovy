import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.waitForElementNotPresent(findTestObject('Misc/Spinner'), 20)

WebUI.setText(findTestObject('Modification/Select route'), routeName)

WebUI.sendKeys(findTestObject('Modification/Select route'), Keys.chord(Keys.ENTER))

WebUI.waitForElementNotPresent(findTestObject('Misc/Spinner'), 20)
