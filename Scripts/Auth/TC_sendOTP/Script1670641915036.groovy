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
import groovy.json.JsonSlurper as JsonSlurper

response = WS.sendRequest(findTestObject('AUTH/Send-OTP/Send-OTP with valid email'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

// send OTP with invalid email
response = WS.sendRequest(findTestObject('AUTH/Send-OTP/Send-OTP with invalid email'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode404)

//send OTP with null email
response = WS.sendRequest(findTestObject('AUTH/Send-OTP/Send-OTP with null email'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode404)

//GET method
response = WS.sendRequest(findTestObject('AUTH/Send-OTP/try with GET method'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode404)

//PATCH method
response = WS.sendRequest(findTestObject('AUTH/Send-OTP/try with PATCH method'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode404)

//PUT method
response = WS.sendRequest(findTestObject('AUTH/Send-OTP/try with PUT method'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode404)

