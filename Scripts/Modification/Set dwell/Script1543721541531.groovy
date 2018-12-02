import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.click(findTestObject('Modification/Scale dwell'))

WebUI.setText(findTestObject('Modification/Scale dwell'), dwell)