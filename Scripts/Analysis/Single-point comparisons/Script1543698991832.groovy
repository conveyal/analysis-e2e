import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.navigateToUrl('https://analysis-staging.conveyal.com/regions/5a2e9df732b98e221fef89eb/analysis')

WebUI.setText(findTestObject('Analysis/Project'), 'Katalon')

WebUI.sendKeys(findTestObject('Analysis/Project'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Analysis/Scenario'), 'Default')

WebUI.sendKeys(findTestObject('Analysis/Scenario'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Analysis/Comparison Project'))

WebUI.click(findTestObject('Analysis/Select option Katalon'))

WebUI.click(findTestObject('Analysis/Comparison Scenario'))

WebUI.click(findTestObject('Analysis/Select option Baseline'))

WebUI.click(findTestObject('Analysis/a_Fetch results'))

WebUI.waitForElementPresent(findTestObject('Analysis/a_Fetch results'), 300)

WebUI.setText(findTestObject('Analysis/Bookmark input'), 'Watertown')

WebUI.sendKeys(findTestObject('Analysis/Bookmark input'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Analysis/a_Fetch results'))

'Manual inspection - waits until user advances isochrone slider to max'
WebUI.waitForElementAttributeValue(findTestObject('Analysis/Travel Time Slider'), 'value', '120', 
    60)

WebUI.setText(findTestObject('Analysis/Bookmark input'), 'Harvard Station')

WebUI.sendKeys(findTestObject('Analysis/Bookmark input'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Analysis/a_Fetch results'))

'Manual inspection - waits until user advances isochrone slider to max'
WebUI.waitForElementAttributeValue(findTestObject('Analysis/Travel Time Slider'), 'value', '120', 
    60)

WebUI.setText(findTestObject('Analysis/Bookmark input'), 'Lechmere')

WebUI.sendKeys(findTestObject('Analysis/Bookmark input'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Analysis/a_Fetch results'))

'Manual inspection - waits until user advances isochrone slider to max'
WebUI.waitForElementAttributeValue(findTestObject('Analysis/Travel Time Slider'), 'value', '120', 
    60)

