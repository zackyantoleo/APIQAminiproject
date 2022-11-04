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


class ordersteps {
	@Given("Set POST HTTP method and Order endpoint and token to authorization header")
	def SetPOSTHTTPmethodandOrderendpointsetoken(){
		GlobalVariable.responseglob = WS.sendRequest(findTestObject('Order/Positive/Create New Order'))

		WS.verifyResponseStatusCode (GlobalVariable.responseglob, 200)
	}

	@Given("Set POST HTTP method and Order endpoint")
	def SetPOSTHTTPmethodandOrderendpoint(){
		GlobalVariable.responseglob = WS.sendRequest(findTestObject('Order/Negative/Create New Order without token'))

		WS.verifyResponseStatusCode (GlobalVariable.responseglob, 401)
	}

	@Given("Set GET HTTP method and Order endpoint and token to authorization header")
	def SetGETHTTPmethodandOrderendpointsetoken(){
		GlobalVariable.responseglob = WS.sendRequest(findTestObject('Order/Positive/Get All Order'))

		WS.verifyResponseStatusCode(GlobalVariable.responseglob, 200)
	}

	@Given("Set GET HTTP method and Order endpoint")
	def SetGETHTTPmethodandOrderendpoint(){
		GlobalVariable.responseglob = WS.sendRequest(findTestObject('Order/Negative/Get All Order without token'))

		WS.verifyResponseStatusCode(GlobalVariable.responseglob, 401)
	}

	@Given("Set GET HTTP method and Order endpoint with ID")
	def SetGETHTTPmethodandOrderendpointwithID(){
		GlobalVariable.responseglob = WS.sendRequest(findTestObject('Order/Positive/Get Order by ID'))

		WS.verifyResponseStatusCode(GlobalVariable.responseglob, 200)
	}

	@Given("Set GET HTTP method and Order endpoint with invalid ID")
	def SetGETHTTPmethodandOrderendpointwithinvalidID(){
		GlobalVariable.responseglob = WS.sendRequest(findTestObject('Order/Negative/Get Order with invalid id'))

		WS.verifyResponseStatusCode(GlobalVariable.responseglob, 500)
	}

	@When("Set Order payload with valid data")
	def SetCategoriespayloadwithvaliddata(){
	}
}