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

WebUI.setText(findTestObject('Object Repository/Login Object/Page_Facebook  log in or sign up/input_Facebook helps you connect and share _ccef60'), 
    '1231224asadkj')

WebUI.setEncryptedText(findTestObject('Object Repository/Login Object/Page_Facebook  log in or sign up/input_Facebook helps you connect and share _ab63fc'), 
    'tqGLFus/E7gsSyelcogqEQ==')

WebUI.click(findTestObject('Object Repository/Login Object/Page_Facebook  log in or sign up/button_Log In'))

WebUI.setText(findTestObject('Object Repository/Login Object/Page_Log in to Facebook/input_Log in to Facebook_email'), 'irasen0@gmail.com')

WebUI.click(findTestObject('Object Repository/Login Object/Page_Log in to Facebook/div_Find your account and log in__55r1 _1kbt'))

WebUI.setEncryptedText(findTestObject('Object Repository/Login Object/Page_Log in to Facebook/input_Find your account and log in_pass'), 
    'tlu/Y8C6HZw3cp9zKZ291A==')

WebUI.click(findTestObject('Object Repository/Login Object/Page_Log in to Facebook/button_Log In'))

WebUI.closeBrowser()

