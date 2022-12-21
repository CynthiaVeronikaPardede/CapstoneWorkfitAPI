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

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page - WorkFit/input_Password_password'), 'PzcU1FTwvrz2Y2eY7/dWBg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page - WorkFit/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - WorkFit/div_Membership'))

WebUI.click(findTestObject('Object Repository/Page_Manage Membership - WorkFit/span_Add New'))

WebUI.setText(findTestObject('Object Repository/Page_Manage Membership - WorkFit/input_Add New Membership_first_name'), 
    'New')

WebUI.setText(findTestObject('Object Repository/Page_Manage Membership - WorkFit/input_First Name_last_name'), 'Membership')

WebUI.setText(findTestObject('Object Repository/Page_Manage Membership - WorkFit/input_Last Name_email'), 'rivaldogabriel1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Manage Membership - WorkFit/input_Email_password'), 'J6IkJA1rD7n3Btce2FGBJg==')

WebUI.click(findTestObject('Object Repository/Page_Manage Membership - WorkFit/i_Password_fi fi-rr-eye absolute right-0.5 _96921a'))

WebUI.setText(findTestObject('Object Repository/Page_Manage Membership - WorkFit/input_Email_password_1'), 'ribadlo12A')

WebUI.click(findTestObject('Object Repository/Page_Manage Membership - WorkFit/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Manage Membership - WorkFit/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_Manage Membership - WorkFit/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Manage Membership - WorkFit/h2_Saved'))

WebUI.closeBrowser()

