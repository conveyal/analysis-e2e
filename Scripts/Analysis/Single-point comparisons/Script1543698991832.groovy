import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

WebUI.navigateToUrl('https://analysis-staging.conveyal.com/regions/5a2e9df732b98e221fef89eb/analysis')

WebUI.setText(findTestObject('Analysis/Project'), 'Katalon')

WebUI.click(findTestObject('Misc/Top Menu Object'))

WebUI.setText(findTestObject('Analysis/Scenario'), 'Default')

WebUI.click(findTestObject('Misc/Top Menu Object'))

WebUI.setText(findTestObject('Analysis/Comparison Project'), 'Katalon')

WebUI.click(findTestObject('Misc/Top Menu Object'))

WebUI.setText(findTestObject('Analysis/Comparison Scenario'), 'Baseline')

WebUI.click(findTestObject('Misc/Top Menu Object'))

WebUI.setText(findTestObject('Analysis/Routing engine version'), GlobalVariable.r5Version)

WebUI.click(findTestObject('Misc/Top Menu Object'))

WebUI.click(findTestObject('Analysis/a_Fetch results'))

WebUI.waitForElementPresent(findTestObject('Analysis/a_Fetch results'), 300)

for (bookmark in GlobalVariable.bookmarks) {
	WebUI.setText(findTestObject('Analysis/Bookmark input'), bookmark)
	
	WebUI.click(findTestObject('Misc/Top Menu Object'))
		
	WebUI.setText(findTestObject('Analysis/Routing engine version'), GlobalVariable.r5Version)
	
	WebUI.click(findTestObject('Misc/Top Menu Object'))
	
	WebUI.click(findTestObject('Analysis/a_Fetch results'))
	
	'Manual inspection - waits until user advances isochrone slider to max'
	WebUI.waitForElementAttributeValue(findTestObject('Analysis/Travel Time Slider'), 'value', '120',
		60)
	
}

