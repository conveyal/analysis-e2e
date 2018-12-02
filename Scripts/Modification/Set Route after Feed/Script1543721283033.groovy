import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.setText(findTestObject('Modification/Select route'), routeName)

WebUI.sendKeys(findTestObject('Modification/Select route'), Keys.chord(Keys.ENTER))

