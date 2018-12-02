import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.click(findTestObject('Modification/Select Pattern arrow'))

WebUI.setText(findTestObject('Modification/Select pattern'), patternName)

WebUI.sendKeys(findTestObject('Modification/Select pattern'), Keys.chord(Keys.ENTER))

