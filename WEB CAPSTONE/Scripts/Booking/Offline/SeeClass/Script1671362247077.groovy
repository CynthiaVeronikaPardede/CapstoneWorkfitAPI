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

WebUI.navigateToUrl('https://fe-react-o3tcnp4lu-capstone-6.vercel.app/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_WorkFit/a_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page - WorkFit/input_Email_email'), 'qe1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page - WorkFit/input_Password_password'), 'PzcU1FTwvrz2Y2eY7/dWBg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page - WorkFit/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - WorkFit/div_Booking'))

WebUI.click(findTestObject('Object Repository/Page_Manage Offline Booking - WorkFit/div_Online'))

WebUI.click(findTestObject('Object Repository/Page_Manage Online Booking - WorkFit/div_19 Des 2022 (12.26) - 19 Mar 2023 (12.2_35dbf8'))

WebUI.click(findTestObject('Object Repository/Page_Manage Online Booking - WorkFit/div_21 Des 2022 (04.07) - 21 Mar 2023 (04.0_357df4'))

WebUI.click(findTestObject('Object Repository/Page_Manage Online Booking - WorkFit/div_19 Des 2022 (22.28) - 17 Feb 2023 (22.2_3a0be8'))

WebUI.click(findTestObject('Object Repository/Page_Manage Online Booking - WorkFit/div_Push upPush UpRp 250.000Angeline Oneang_9cc935'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Manage Online Booking - WorkFit/div_20 Des 2022 (20.32) - 19 Jan 2023 (20.3_ba3455'), 
    0)

WebUI.closeBrowser()

