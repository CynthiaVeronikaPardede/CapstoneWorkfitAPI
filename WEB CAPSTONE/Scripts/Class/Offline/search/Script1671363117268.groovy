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

WebUI.navigateToUrl('https://fe-react-git-dev-capstone-6.vercel.app/login')

WebUI.click(findTestObject('Object Repository/Page_Login Page - WorkFit/input_Email_email'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page - WorkFit/input_Email_email'), 'qe1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page - WorkFit/input_Password_password'), 'PzcU1FTwvrz2Y2eY7/dWBg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page - WorkFit/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - WorkFit/span_Classes'))

WebUI.click(findTestObject('Object Repository/Page_Manage Offline Classes - WorkFit/span_Offline'))

WebUI.setText(findTestObject('Object Repository/Page_Manage Offline Classes - WorkFit/input_Online_block w-full rounded-lg border_6968a0'), 
    'mane')

WebUI.click(findTestObject('Object Repository/Page_Manage Offline Classes - WorkFit/img_Yoga_absolute inset-0 h-full w-full rou_26285e'))

WebUI.closeBrowser()

