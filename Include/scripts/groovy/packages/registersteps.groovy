package packages
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class registersteps {

	@Given("Set POST HTTP method and register endpoint")
	def Set POSTHTTPmethodandregisterendpoint() {
	}

	@When("Set new user payload with valid data")
	def Setnewuserpayloadwithvaliddata() {
		GlobalVariable.responseglob = WS.sendRequest(findTestObject('Auth/Positive/Register'))
		
		WS.verifyResponseStatusCode(GlobalVariable.responseglob , 200)
	}

	@When("Set new user payload with empty password")
	def Setnewuserpayloadwithemptypassword() {
		GlobalVariable.responseglob = WS.sendRequest(findTestObject('Auth/Negative/Register with invalid payload format'))

		WS.verifyResponseStatusCode(GlobalVariable.responseglob , 400)
	}

	@When("Set new user payload with invalid payload format")
	def Setnewuserpayloadwithinvalidpayloadformat() {
		GlobalVariable.responseglob = WS.sendRequest(findTestObject('Auth/Negative/Register with empty fullname'))

		WS.verifyResponseStatusCode(GlobalVariable.responseglob , 400)
	}

	@Then("Receive valid Register HTTP response code 200")
	def ReceivevalidRegisterHTTPresponsecode200() {

	}
	
	@Then("Receive invalid Register HTTP response code 400")
	def ReceiveinvalidRegisterHTTPresponsecode400() {

	}
}