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



class OrderByIDSteps {

	//	========================== @TS.OrderByID.017.001
	//	Get All Orders with Valid HTTP Method and API URL
	@Given("Set valid method OBI1")
	def setValidOBI1() {
		println("Set method GET")
	}
	@When("Set valid API URL OBI1")
	def setValidURLOBI1() {
		println("Call to https://alta-shop.herokuapp.com/api/orders/1")
		response = WS.sendRequest(findTestObject('Orders/017_Object_Ord_OrderByID/OrderByID_017_001'))
	}
	@And("Input Bearer Token in tab Authorization OBI1")
	def inputBearerTokenOBI1() {
		println("Input Bearer Token")
	}
	@Then("I receieve valid HTTP response 200 OBI1")
	def verifystatusCodeOBI1(){
		println("I receive valid valid HTTP response 200")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}
	@And("Verify Property ID is 1 OBI1")
	def verifyPropertyIDOBI1() {
		println("Verify Property ID is 1 OBI1")
		WS.verifyElementPropertyValue(response, 'data.ID', 1)
	}


	//	========================== @TS.OrderByID.017.002
	//	Get Order By ID with Valid HTTP Method and Invalid API URL
	@Given("Set valid method OBI2")
	def setValidOBI2() {
		println("Set method GET")
	}
	@When("Set invalid API URL OBI2")
	def setInvalidURLOBI2() {
		println("Call to https://alta-shop.herokuapp.com/api/orders/xx")
		response = WS.sendRequest(findTestObject('Orders/017_Object_Ord_OrderByID/OrderByID_017_002'))
	}
	@And("Input Bearer Token in tab Authorization OBI2")
	def inputBearerTokenOBI2() {
		println("Input Bearer Token")
	}
	@Then("I receieve valid HTTP response 404 OBI2")
	def verifystatusCodeOBI2(){
		println("I receive valid valid HTTP response 404")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode404)
	}

	//	========================== @TS.OrderByID.017.003
	//	Get Order By ID with Invalid HTTP Method and valid API URL
	@Given("Set invalid method OBI3")
	def setValidOBI3() {
		println("Set method PUT")
	}
	@When("Set valid API URL OBI3")
	def setValidURLOBI3() {
		println("Call to https://alta-shop.herokuapp.com/api/orders/1")
		response = WS.sendRequest(findTestObject('Orders/017_Object_Ord_OrderByID/OrderByID_017_003'))
	}
	@And("Input Bearer Token in tab Authorization OBI3")
	def inputBearerTokenOBI3() {
		println("Input Bearer Token")
	}
	@Then("I receive valid HTTP response 405 OBI3")
	def verifystatusCodeOBI3(){
		println("I receive valid valid HTTP response 405")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}


	//	========================== @TS.OrderByID.017.004
	//	Get All Orders with Valid HTTP Method and API URL and Blank bearer token in Authorization
	@Given("Set valid method OBI4")
	def setValidOBI4() {
		println("Set method GET")
	}
	@When("Set valid API URL OBI4")
	def setValidURLOBI4() {
		println("Call to https://alta-shop.herokuapp.com/api/orders")
		response = WS.sendRequest(findTestObject('Orders/016_Object_Ord_AllOrders/AllOrders_016_004'))
	}
	@And("Input Bearer Token in tab Authorization OBI4")
	def inputBearerTokenOBI4() {
		println("Input Bearer Token")
	}
	@Then("I receive valid HTTP response 401 OBI4")
	def verifystatusCodeOBI4(){
		println("I receive valid valid HTTP response 401")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode401)
	}
	@And("Verify error is unauthorized OBI4")
	def verifyErrorOBI4() {
		println("Verify error is unauthorized")
		WS.verifyElementPropertyValue(response, 'error', 'unauthorized')
	}




}