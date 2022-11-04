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


class productsteps {
	@Given("Set POST HTTP method and Product endpoint and token to authorization header")
	def SetPOSTHTTPmethodandProductEndpointsetoken(){
		GlobalVariable.responseglob = WS.sendRequest(findTestObject('Product/Positive/Create New Product'))

		WS.verifyResponseStatusCode(GlobalVariable.responseglob, 200)
	}

	@Given("Set DELETE HTTP method and Product endpoint")
	def SetDELETEHTTPmethodandProductendpoint(){
		GlobalVariable.responseglob = WS.sendRequest(findTestObject('Product/Positive/Delete Product'))

		WS.verifyResponseStatusCode(GlobalVariable.responseglob, 200)
	}

	@Given("Set GET HTTP method and Product endpoint and token to authorization header")
	def SetGETHTTPmethodandProductendpointandtokentoauthorizationheader(){
		GlobalVariable.responseglob = WS.sendRequest(findTestObject('Product/Positive/Get All Product'))

		WS.verifyResponseStatusCode(GlobalVariable.responseglob, 200)
	}

	@Given("Set GET HTTP method and Product endpoint with ID")
	def SetGETHTTPmethodandProductendpointwithID(){
		GlobalVariable.responseglob = WS.sendRequest(findTestObject('Product/Positive/Get Product by ID'))

		WS.verifyResponseStatusCode(GlobalVariable.responseglob, 200)
	}

	@Given("Set GET HTTP method and Rating endpoint and token to authorization header")
	def SetGETHTTPmethodandRatingendpointandtokentoauthorizationheader(){
		GlobalVariable.responseglob = WS.sendRequest(findTestObject('Product/Positive/Get Product Rating'))

		WS.verifyResponseStatusCode(GlobalVariable.responseglob, 200)
	}

	@Given("Set POST HTTP method and Rating endpoint and token to authorization header")
	def SetPOSTHTTPmethodandRatingEndpointandTokentoAuthorizationheader(){
		GlobalVariable.responseglob = WS.sendRequest(findTestObject('Product/Positive/Give Product Rating'))

		WS.verifyResponseStatusCode(GlobalVariable.responseglob, 200)
	}

	@When("Set Product payload with valid data")
	def SetProductPayloadwithvaliddata(){
	}

	@When("Set Rating payload with valid data")
	def SetRatingPayloadwithvaliddata(){
	}

	@And("Send DELETE HTTP request")
	def SendDELETEHTTPrequest(){
	}
}