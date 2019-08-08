import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

def driver = DriverFactory.getWebDriver()

WebUI.waitForElementNotPresent(findTestObject('Misc/Spinner'), 20)

n = driver.findElements(By.cssSelector("svg[data-icon='calendar']")).size()

while(true){
	WebUI.click(findTestObject('Modification/Add Timetable'))
	if (driver.findElements(By.cssSelector("svg[data-icon='calendar']")).size() > n) {
		break
	}
	WebUI.waitForElementNotPresent(findTestObject('Misc/Spinner'), 20)
}

// TODO open nth timetable

WebUI.click(findTestObject('Modification/Timetables/Timetable Icon'))