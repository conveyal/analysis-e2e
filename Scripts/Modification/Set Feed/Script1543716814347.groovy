import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.click(findTestObject('Modification/Select Feed arrow'))

WebUI.setText(findTestObject('Modification/Select feed'), feedName)

WebUI.sendKeys(findTestObject('Modification/Select feed'), Keys.chord(Keys.ENTER))

