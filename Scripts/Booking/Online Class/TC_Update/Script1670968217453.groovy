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

response = WS.sendRequest(findTestObject('Booking/Offline Book/Update class/Update class with valid input'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(response, 200)

JsonSlurper slurper = new JsonSlurper()

Map parsedJson = slurper.parseText(response.getResponseText())

String Token = parsedJson.data.access_token

GlobalVariable.GlobalVar = Token

//invalid input
response = WS.sendRequest(findTestObject('Booking/Offline Book/Update class/Update with invalid input'))

WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode401)

//invalid token
response = WS.sendRequest(findTestObject('Booking/Offline Book/Update class/Update with invalid Token'))

WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode401)

//Patch Method
response = WS.sendRequest(findTestObject('Booking/Offline Book/Update class/With GET Method'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)

//POST method
response = WS.sendRequest(findTestObject('Booking/Offline Book/Update class/With POST Method'))

WS.verifyResponseStatusCode(response, GlobalVariable.StatusCode401)

response = WS.sendRequest(findTestObject('Booking/Offline Book/Update class/With PUT Method'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)

