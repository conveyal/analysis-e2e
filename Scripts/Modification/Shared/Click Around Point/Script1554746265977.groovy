import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

radius = 0

x = (point[0])

y = (point[1])

WebUI.clickOffset(findTestObject('Misc/Map Pane'), x, y)
WebUI.delay(1)

// For clicking on the screen when the exact pixel may be slightly off.  
// Marches in square around the estimated point until a desired element is no longer disabled
// Translation from screen pixels to offset in Katalon v6: (-890, -340)


while (radius < requestedRadius) {
	
	if (isEnabled()) break;
	
	while (x < ((point[0]) + radius)) {
		if (isEnabled()) break;
		WebUI.clickOffset(findTestObject('Misc/Map Pane'), x, y)
        x++
		WebUI.delay(1)
    }
    
    while (y < ((point[1]) + radius)) {
		if (isEnabled()) break;
		WebUI.clickOffset(findTestObject('Misc/Map Pane'), x, y)
        y++
		WebUI.delay(1)
    }
    
    while (x > ((point[0]) - radius)) {
		if (isEnabled()) break;
		WebUI.clickOffset(findTestObject('Misc/Map Pane'), x, y)
        x--
		WebUI.delay(1)
    }
    
    while (y > ((point[1]) - radius)) {
		if (isEnabled()) break;
		WebUI.clickOffset(findTestObject('Misc/Map Pane'), x, y)      
		y--
		WebUI.delay(1)
    }

    radius++
}

private boolean isEnabled() {
	return !WebUI.verifyElementHasAttribute(buttonToEnable, "disabled", 1, FailureHandling.OPTIONAL)
}

