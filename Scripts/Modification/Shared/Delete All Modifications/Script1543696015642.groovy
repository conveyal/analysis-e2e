import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

def driver = DriverFactory.getWebDriver()

WebUI.navigateToUrl('https://analysis-staging.conveyal.com/regions/5a2e9df732b98e221fef89eb/projects/5c006fee32b98e3794a6f7b7')

while (true) {
	WebUI.waitForElementPresent(findTestObject('Misc/Dock Title'), 0)

	if (WebUI.verifyElementPresent(findTestObject('Modification/Closed Group'), 1, FailureHandling.OPTIONAL)) {
		WebUI.click(findTestObject('Modification/Closed Group'))
	}
		
	if(driver.findElements(By.cssSelector('div.InnerDock.block div.form-group ~ div.panel a.list-group-item')).size() < 1) break

    WebUI.click(findTestObject('Project/Modification Title'))

    WebUI.click(findTestObject('Modification/Delete Modification'))

    WebUI.acceptAlert()
}

