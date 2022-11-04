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


class Categories {
	@Given("Set POST HTTP method and Categories endpoint")
	def SetPOSTHTTPmethodandCategoriesendpoint(){

	}
	
	@Given("Set GET HTTP method and Categories endpoint")
	def SetGETHTTPmethodandCategoriesendpoint(){
		GlobalVariable.responseglob = WS.sendRequest(findTestObject('Categories/Positive/Get All Category'))
		
		WS.verifyResponseStatusCode(GlobalVariable.responseglob, 200)
		
		
	}
	
	@Given("Set GET HTTP method and invalid Categories endpoint")
	def SetPOSTHTTPmethodandinvalidCategoriesendpoint(){
		GlobalVariable.responseglob = WS.sendRequest(findTestObject('Categories/Negative/Get All Category with invalid endpoint'))
		
		WS.verifyResponseStatusCode(GlobalVariable.responseglob, 404)
		
	}
	
	@Given("Set GET HTTP method and Categories endpoint with ID")
	def SetPOSTHTTPmethodandCategoriesendpointID(){
		GlobalVariable.responseglob = WS.sendRequest(findTestObject('Categories/Positive/Get Category by ID'))
		
		WS.verifyResponseStatusCode(GlobalVariable.responseglob, 200)
		
	}
	
	@Given("Set GET HTTP method and Categories endpoint with invalid ID")
	def SetPOSTHTTPmethodandCategoriesendpointinvalidID(){
		GlobalVariable.responseglob = WS.sendRequest(findTestObject('Categories/Negative/Get Category with invalid ID'))
		
		WS.verifyResponseStatusCode(GlobalVariable.responseglob, 500)
	}
	
	@When("Set Categories payload with valid data")
	def SetCategoriespayloadwithvaliddata(){
		GlobalVariable.responseglob = WS.sendRequest(findTestObject('Categories/Positive/Create Category'))
		
		WS.verifyResponseStatusCode(GlobalVariable.responseglob, 200)
	}
	
	@When("Set Categories payload without name")
	def SetCategoriespayloadwithoutname(){
		GlobalVariable.responseglob = WS.sendRequest(findTestObject('Categories/Negative/Create category without name'))
		
		WS.verifyResponseStatusCode(GlobalVariable.responseglob, 500)
		
	}
	
	@Then("Receive HTTP response code 200")
	def ReceivevalidHTTPresponsecode200(){
	}
	
	@Then("Receive HTTP response code 500")
	def ReceivevalidHTTPresponsecode500(){
	}
	
	@Then("Receive HTTP response code 404")
	def ReceivevalidHTTPresponsecode404(){
	}
}