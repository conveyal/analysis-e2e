import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.waitForElementNotPresent(findTestObject('Misc/Spinner'), 20)

for (point in coordinates){
	'TODO avoid absolute coordinates'
	WebUI.clickOffset(findTestObject('Misc/Map Pane'), point[0], point[1])
}