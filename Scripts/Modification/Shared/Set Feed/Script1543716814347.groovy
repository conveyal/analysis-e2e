import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.waitForElementNotPresent(findTestObject('Misc/Spinner'), 20)

WebUI.click(findTestObject('Modification/Select Feed arrow'))

WebUI.setText(findTestObject('Modification/Select feed'), feedName)

WebUI.click(findTestObject('Misc/Top Menu Object'))

WebUI.waitForElementNotPresent(findTestObject('Misc/Spinner'), 20)

