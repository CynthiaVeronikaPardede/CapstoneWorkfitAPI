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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://fe-react-o3tcnp4lu-capstone-6.vercel.app/')

WebUI.click(findTestObject('Object Repository/Page_WorkFit/a_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page - WorkFit/input_Email_email'), 'qe1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page - WorkFit/input_Password_password'), '76cbhrYOBskouz+4pezT5w==')

WebUI.click(findTestObject('Object Repository/Page_Login Page - WorkFit/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_Login Page - WorkFit/div_Sorryinvalid email or passwordOKNoCancel'))

WebUI.click(findTestObject('Object Repository/Page_Login Page - WorkFit/i_Password_fi fi-rr-eye absolute right-0.5 _96921a'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page - WorkFit/input_Password_password_1'), '12344321')

WebUI.click(findTestObject('Object Repository/Page_Login Page - WorkFit/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - WorkFit/span_Classes'))

WebUI.click(findTestObject('Object Repository/Page_Manage Offline Classes - WorkFit/span_Online'))

WebUI.click(findTestObject('Object Repository/Page_Manage Online Classes - WorkFit/button_Yoga_absolute right-0 top-0 cursor-p_8e06ce'))

WebUI.click(findTestObject('Object Repository/Page_Manage Online Classes - WorkFit/button_Edit'))

WebUI.click(findTestObject('Object Repository/Page_Manage Online Classes - WorkFit/div_Editss_css-ackcql'))

WebUI.click(findTestObject('Object Repository/Page_Manage Online Classes - WorkFit/div_Yoga'))

WebUI.click(findTestObject('Object Repository/Page_Manage Online Classes - WorkFit/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Manage Online Classes - WorkFit/h2_Updated'))

WebUI.closeBrowser()

