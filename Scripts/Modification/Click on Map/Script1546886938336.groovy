import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

for (point in coordinates){
	'TODO avoid absolute coordinates'
	WebUI.clickOffset(findTestObject('Misc/Map Pane'), point[0], point[1])
}