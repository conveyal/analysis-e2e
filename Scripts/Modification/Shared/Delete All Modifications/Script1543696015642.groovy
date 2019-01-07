import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By as By

import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.navigateToUrl('https://analysis-staging.conveyal.com/regions/5a2e9df732b98e221fef89eb/projects/5c006fee32b98e3794a6f7b7')

WebUI.waitForElementPresent(findTestObject('Misc/Dock Title'), 0)

def driver = DriverFactory.getWebDriver()

Number numMods = driver.findElements(By.cssSelector('div.ModificationTitle')).size()

while (numMods > 0) {
    WebUI.click(findTestObject('Project/Modification Title'))

    WebUI.click(findTestObject('Modification/Delete Modification'))

    WebUI.acceptAlert()

    numMods--
}

