import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.click(findTestObject('Modification/Select new segment'))

'Draw box to select a portion of the route. TODO make consistency not dependent on initial viewport.'
WebUI.clickOffset(findTestObject('Misc/Map Pane'), x1, y1)

WebUI.clickOffset(findTestObject('Misc/Map Pane'), x1, y2)

WebUI.clickOffset(findTestObject('Misc/Map Pane'), x2, y2)

WebUI.clickOffset(findTestObject('Misc/Map Pane'), x2, y1)

WebUI.clickOffset(findTestObject('Misc/Map Pane'), x1, y1)