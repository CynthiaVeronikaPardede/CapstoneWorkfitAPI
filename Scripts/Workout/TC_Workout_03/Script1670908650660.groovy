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

response = WS.sendRequest(findTestObject('AUTH/Login/Login with valid'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(response, 200)

JsonSlurper slurper = new JsonSlurper()

Map parsedJson = slurper.parseText(response.getResponseText())

String Token = parsedJson.data.access_token

GlobalVariable.globalVar = Token

// Create a workout
response = WS.sendRequest(findTestObject('Workout/Folder Update a Workout/Update a Workout'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('Workout/Folder Update a Workout/Update a Workout with POST'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)

response = WS.sendRequest(findTestObject('Workout/Folder Update a Workout/Update a Workout with PUT'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)

