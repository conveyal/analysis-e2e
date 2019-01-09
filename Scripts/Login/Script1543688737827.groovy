import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.base_url)

WebUI.setViewPortSize(1440, 800)

WebUI.waitForElementPresent(findTestObject('Misc/Welcome Title'), 60)

WebUI.click(findTestObject('Misc/Region Name'))

WebUI.click(findTestObject('Misc/Project Name'))

