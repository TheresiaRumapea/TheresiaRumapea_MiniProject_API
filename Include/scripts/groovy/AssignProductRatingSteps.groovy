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



class AssignProductRatingSteps {
	//	========================== @TS.AssignProductRating.011.001
	//	Assign Product Rating with Valid HTTP Method, API URL, and data (Body)
	@Given("Set valid method APR1")
	def setValidAPR1() {
		println("Set method POST")
	}
	@When("Set valid API URL APR1")
	def setValidURLAPR1() {
		println("Call to https://alta-shop.herokuapp.com/api/products/15/ratings")
		response = WS.sendRequest(findTestObject('Products/011_Object_Pro_AssignProductRating/AssignProductRating_001', [('endpoint') : GlobalVariable.Endpoint]))
	}
	@And("Input Bearer Token in tab Authorization APR1")
	def inputBearerTokenAPR1() {
		println("Input Bearer Token")
	}
	@And("Input valid data (Body) APR1")
	def inputValidDataAPR1() {
		println("Input valid count")
	}
	@Then("I receive valid HTTP response 200 APR1")
	def verifystatusCodeAPR1(){
		println("I receive valid valid HTTP response 200")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}
	@And("Verify property ID is 15 APR1")
	def verifyPropertyIDAPR1() {
		println("Verify property ID is 15")
		WS.verifyElementPropertyValue(response, 'data.ID', 15)
	}

	//	========================== @TS.AssignProductRating.011.002
	//	Assign Product Rating with Invalid HTTP Method, valid API URL, and valid data (Body)
	@Given("Set invalid method APR2")
	def setInvalidAPR2() {
		println("Set method PUT")
	}
	@When("Set valid API URL APR2")
	def setValidURLAPR2() {
		println("Call to https://alta-shop.herokuapp.com/api/products/15/ratings")
		response = WS.sendRequest(findTestObject('Products/011_Object_Pro_AssignProductRating/AssignProductRating_002', [('endpoint') : GlobalVariable.Endpoint]))
	}
	@And("Input Bearer Token in tab Authorization APR2")
	def inputBearerTokenAPR2() {
		println("Input Bearer Token")
	}
	@And("Input valid data (Body) APR2")
	def inputValidDataAPR2() {
		println("Input valid count")
	}
	@Then("I receive valid HTTP response 405 APR2")
	def verifystatusCodeAPR2(){
		println("I receive valid valid HTTP response 405")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}

	//	@TS.AssignProductRating.011.003
	//	Scenario Outline:
	//	  Given Set valid method APR3
	//	  When Set invalid API URL APR3
	//	  And Input Bearer Token in tab Authorization APR3
	//	  And Input valid data (Body) APR3
	//	  Then I receieve valid HTTP response 404 APR3

	//	========================== @TS.AssignProductRating.011.003
	//	Assign Product Rating with valid HTTP Method, Invalid API URL, and valid data (Body)
	@Given("Set valid method APR3")
	def setValidAPR3() {
		println("Set method POST")
	}
	@When("Set invalid API URL APR3")
	def setValidURLAPR3() {
		println("Call to https://alta-shop.herokuapp.com/api/products/15/ratingku")
		response = WS.sendRequest(findTestObject('Products/011_Object_Pro_AssignProductRating/AssignProductRating_003', [('endpoint') : GlobalVariable.Endpoint]))
	}
	@And("Input Bearer Token in tab Authorization APR3")
	def inputBearerTokenAPR3() {
		println("Input Bearer Token")
	}
	@And("Input valid data (Body) APR3")
	def inputValidDataAPR3() {
		println("Input valid count")
	}
	@Then("I receive valid HTTP response 404 APR3")
	def verifystatusCodeAPR3(){
		println("I receive valid valid HTTP response 404")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode404)
	}


	//	========================== @TS.AssignProductRating.011.004
	//	Assign Product Rating with Valid HTTP Method, Valid API URL, and Blank data (Body)
	@Given("Set valid method APR4")
	def setValidAPR4() {
		println("Set method POST")
	}
	@When("Set valid API URL APR4")
	def setValidURLAPR4() {
		println("Call to https://alta-shop.herokuapp.com/api/products/15/ratings")
		response = WS.sendRequest(findTestObject('Products/011_Object_Pro_AssignProductRating/AssignProductRating_004', [('endpoint') : GlobalVariable.Endpoint]))
	}
	@And("Input Bearer Token in tab Authorization APR4")
	def inputBearerTokenAPR4() {
		println("Input Bearer Token")
	}
	@And("Blank data (Body) APR4")
	def BlankDataAPR4() {
		println("Blank data")
	}
	@Then("I receive valid HTTP response 200 APR4")
	def verifystatusCodeAPR4(){
		println("I receive valid valid HTTP response 200")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}
	@And("Verify property ID is 15 APR4")
	def verifyPropertyIDAPR4() {
		println("Verify property ID is 15")
		WS.verifyElementPropertyValue(response, 'data.ID', 15)
	}

}