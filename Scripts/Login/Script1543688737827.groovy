import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.base_url)

WebUI.setViewPortSize(1440, 800)

WebUI.waitForElementVisible(findTestObject('Login/Email'), 20)

WebUI.waitForElementClickable(findTestObject('Login/Email'), 20)

WebUI.setText(findTestObject('Login/Email'), findTestData('Credentials - Copy').getValue(1, 1))

WebUI.setText(findTestObject('Login/Password'), findTestData('Credentials - Copy').getValue(2, 1))

WebUI.click(findTestObject('Login/Auth Send'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.waitForElementNotPresent(findTestObject('Misc/Spinner'), 20)

WebUI.click(findTestObject('Misc/Region Name'))

WebUI.click(findTestObject('Misc/Project Name'))

