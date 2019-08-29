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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Modification/Shared/Create Modification'), [('modName') : 'Arlington Gondola', ('modType') : 'Add Trip Pattern'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Modification/Shared/Geocode'), [('location') : 'Arlington, Massachusetts'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Modification/Transit Mode'))

WebUI.sendKeys(findTestObject('Modification/Transit Mode'), 'Gondola')

WebUI.sendKeys(findTestObject('Modification/Transit Mode'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modification/Edit route geometry'))

WebUI.callTestCase(findTestCase('Modification/Shared/Click Point on Map'), [('coordinates') : [[-200, 250], [100, 250]]], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementNotPresent(findTestObject('Misc/Spinner'), 20)

WebUI.callTestCase(findTestCase('Modification/Shared/Click Point on Map'), [('coordinates') : [[400, 0]]], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Modification/Shared/Add and Open Timetable'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Modification/Timetables/Average Speed'), '80')

WebUI.click(findTestObject('Modification/Back to Modifications'))

