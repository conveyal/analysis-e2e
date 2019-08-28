import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.waitForElementNotPresent(findTestObject('Misc/Spinner'), 20)

for (point in coordinates){
	'TODO avoid absolute coordinates'
	WebUI.waitForElementNotPresent(findTestObject('Misc/Spinner'), 20)
//	 Note that in Katalon 6, these clicks appear to be offset from the center of the element.
	WebUI.clickOffset(findTestObject('Misc/Map Pane'), point[0], point[1])
	WebUI.delay(1)
}