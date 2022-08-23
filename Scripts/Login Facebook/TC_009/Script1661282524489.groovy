import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://web.facebook.com/?_rdc=1&_rdr')

WebUI.click(findTestObject('Object Repository/Login Object/Page_Facebook  log in or sign up/a_Forgotten password'))

WebUI.setText(findTestObject('Object Repository/Login Object/Page_Forgotten Password  Cant Log In  Facebook/input_Please enter your email address or mo_025e92'), 
    'irasen0@gmail.com')

WebUI.sendKeys(findTestObject('Object Repository/Login Object/Page_Forgotten Password  Cant Log In  Facebook/input_Please enter your email address or mo_025e92'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Login Object/Page_Forgotten Password  Cant Log In  Facebook/button_Continue'))

WebUI.click(findTestObject('Object Repository/Login Object/Page_Facebook/input_Please check your emails for a messag_6d8c97'))

WebUI.setText(findTestObject('Object Repository/Login Object/Page_Facebook/input_Please check your emails for a messag_6d8c97'), 
    '765293')

WebUI.click(findTestObject('Object Repository/Login Object/Page_Facebook/button_Continue'))

WebUI.closeBrowser()

