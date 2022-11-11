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



class CreateCommentSteps {

	//	========================== @TS.CreateComment.013.001
	//	Create Comment For Product with Valid HTTP Method, API URL, and data (Body)
	@Given("Set valid method CCO1")
	def setValidCCO1() {
		println("Set method POST")
	}
	@When("Set valid API URL CCO1")
	def setValidURLCCO1() {
		println("Call to https://alta-shop.herokuapp.com/api/products/3/comments")
		response = WS.sendRequest(findTestObject('Products/013_Object_Pro_CreateComment/CreateComment_001'))
	}
	@And("Input Bearer Token in tab Authorization CCO1")
	def inputBearerTokenCCO1() {
		println("Input Bearer Token")
	}
	@And("Input valid data (Body) CCO1")
	def inputValidDataCCO1() {
		println("Input valid content")
	}
	@Then("I receive valid HTTP response 200 CCO1")
	def verifystatusCodeCCO1(){
		println("I receive valid valid HTTP response 200")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}
	@And("Verify property content is 'the games are great including Gran Turismo 7 but sadly GT4 is much better' CCO1")
	def verifyPropertyIDCCO1() {
		println("Verify property content is 'the games are great including Gran Turismo 7 but sadly GT4 is much better' CCO1")
		WS.verifyElementPropertyValue(response, 'data.Content', 'the games are great including Gran Turismo 7 but sadly GT4 is much better')
	}


	//	========================== @TS.CreateComment.013.002
	//	 Create Comment For Product with Invalid HTTP Method, valid API URL, and valid data (Body)
	@Given("Set invalid method CCO2")
	def setInvalidCCO2() {
		println("Set method PUT")
	}
	@When("Set valid API URL CCO2")
	def setValidURLCCO2() {
		println("Call to https://alta-shop.herokuapp.com/api/products/3/comments")
		response = WS.sendRequest(findTestObject('Products/013_Object_Pro_CreateComment/CreateComment_002'))
	}
	@And("Input Bearer Token in tab Authorization CCO2")
	def inputBearerTokenCCO2() {
		println("Input Bearer Token")
	}
	@And("Input valid data (Body) CCO2")
	def inputValidDataCCO2() {
		println("Input valid count")
	}
	@Then("I receive valid HTTP response 405 CCO2")
	def verifystatusCodeCCO2(){
		println("I receive valid valid HTTP response 405")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}


	//	========================== @TS.CreateComment.013.003
	//	 Create Comment For Product with valid HTTP Method, Invalid API URL, and valid data (Body)
	@Given("Set valid method CCO3")
	def setValidCCO3() {
		println("Set method POST")
	}
	@When("Set invalid API URL CCO3")
	def setValidURLCCO3() {
		println("Call to https://alta-shop.herokuapp.com/api/products/3/commentku")
		response = WS.sendRequest(findTestObject('Products/013_Object_Pro_CreateComment/CreateComment_003'))
	}
	@And("Input Bearer Token in tab Authorization CCO3")
	def inputBearerTokenCCO3() {
		println("Input Bearer Token")
	}
	@And("Input valid data (Body) CCO3")
	def inputValidDataCCO3() {
		println("Input valid count")
	}
	@Then("I receive valid HTTP response 404 CCO3")
	def verifystatusCodeCCO3(){
		println("I receive valid valid HTTP response 404")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode404)
	}


	//	========================== @TS.CreateComment.013.007
	//	Create Comment For Product with Valid HTTP Method, Valid API URL, Valid data (body) and Blank bearer token in Authorization
	@Given("Set valid method CCO7")
	def setValidCCO7() {
		println("Set method POST")
	}
	@When("Set valid API URL CCO7")
	def setValidURLCCO7() {
		println("Call to https://alta-shop.herokuapp.com/api/products/3/comments")
		response = WS.sendRequest(findTestObject('Products/013_Object_Pro_CreateComment/CreateComment_007'))
	}
	@And("Input Bearer Token in tab Authorization CCO7")
	def inputBearerTokenCCO7() {
		println("Input Bearer Token")
	}
	@And("Blank data (Body) CCO7")
	def BlankDataCCO7() {
		println("Blank Data")
	}
	@Then("I receive valid HTTP response 401 CCO7")
	def verifystatusCodeCCO7(){
		println("I receive valid valid HTTP response 401")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode401)
	}
	@And("Verify error is unauthorized CCO7")
	def verifyErrorCCO7() {
		println("Verify error is unauthorized")
		WS.verifyElementPropertyValue(response, 'error', 'unauthorized')
	}


}