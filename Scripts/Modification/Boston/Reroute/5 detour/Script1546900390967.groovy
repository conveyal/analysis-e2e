import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Modification/Shared/Create Modification'), [('modName') : '5 detour', ('modType') : 'Reroute'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Modification/Shared/Set Feed'), [('feedName') : 'MBTA'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Modification/Shared/Set Route after Feed'), [('routeName') : '5 City'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Modification/Shared/Clear Pattern'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Modification/Shared/Set Pattern'), [('patternName') : 'from City'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Modification/Select from stop'))

// TODO use coordinates
WebUI.callTestCase(findTestCase('Modification/Shared/Click Around Point'), [('point') : [797, 143], ('buttonToEnable') : findTestObject(
	'Modification/Clear from stop'), ('requestedRadius') : 10], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Modification/Edit route geometry'))

WebUI.clickOffset(findTestObject('Misc/Root'), 825, 600)

WebUI.click(findTestObject('Modification/Select to stop'))

WebUI.callTestCase(findTestCase('Modification/Shared/Click Around Point'), [('point') : [627, 336], ('buttonToEnable') : findTestObject(
	'Modification/Clear to stop'), ('requestedRadius') : 10], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Modification/Speed along segment'), '60')

WebUI.click(findTestObject('Modification/Back to Modifications'))
