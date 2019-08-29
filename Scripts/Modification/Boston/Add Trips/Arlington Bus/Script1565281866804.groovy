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

WebUI.callTestCase(findTestCase('Modification/Shared/Create Modification'), [('modName') : 'Arlington Bus', ('modType') : 'Add Trip Pattern'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Modification/Shared/Geocode'), [('location') : 'Arlington, Massachusetts'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Modification/Edit route geometry'))

WebUI.click(findTestObject('Modification/Follow Streets'))

WebUI.callTestCase(findTestCase('Modification/Shared/Click Point on Map'), [('coordinates') : [[-200, 250], [100, 250]]], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementNotPresent(findTestObject('Misc/Spinner'), 20)

WebUI.callTestCase(findTestCase('Modification/Shared/Click Point on Map'), [('coordinates') : [[400, 250]]], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Modification/Shared/Add and Open Timetable'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Modification/Timetables/Default Dwell'), '00:05:00')

WebUI.click(findTestObject('Modification/Timetables/Individual Dwells'))

WebUI.setText(findTestObject('Modification/Timetables/Dwell at Stop 1'), '00:10:00')

WebUI.click(findTestObject('Modification/Timetables/Individual Segment Speeds'))

WebUI.setText(findTestObject('Modification/Timetables/Time for Segment 1'), '00:01:00')

WebUI.setText(findTestObject('Modification/Timetables/Time for Segment 2'), '00:19:00')

WebUI.verifyElementText(findTestObject('Modification/Timetables/Total travel time'), '00:40:00')

WebUI.click(findTestObject('Modification/Back to Modifications'))

