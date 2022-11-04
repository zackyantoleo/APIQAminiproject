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

response = WS.sendRequest(findTestObject('Product/Positive/Create New Product'))

WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Product/Negative/Create New Product without name'))

WS.verifyResponseStatusCode(response, 500)

response = WS.sendRequest(findTestObject('Product/Positive/Give Product Rating'))

WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Product/Negative/Give Product Rating without Token'))

WS.verifyResponseStatusCode(response, 401)

response = WS.sendRequest(findTestObject('Product/Positive/Get All Product'))

WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Product/Negative/Get All Product with invalid Endpoint'))

WS.verifyResponseStatusCode(response, 404)

response = WS.sendRequest(findTestObject('Product/Positive/Get Product by ID'))

WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Product/Positive/Get Product Rating'))

WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Product/Negative/Get Product Rating with invalid ID'))

WS.verifyResponseStatusCode(response, 404)

response = WS.sendRequest(findTestObject('Product/Positive/Delete Product'))

WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Product/Negative/Delete Product invalid ID'))

WS.verifyResponseStatusCode(response, 400)

