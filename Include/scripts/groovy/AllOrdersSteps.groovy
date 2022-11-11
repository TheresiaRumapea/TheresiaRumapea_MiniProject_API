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



class AllOrdersSteps {

	//	========================== @TS.AllOrders.016.001
	//	Get All Orders with Valid HTTP Method and API URL
	@Given("Set valid method AO1")
	def setValidAO1() {
		println("Set method GET")
	}
	@When("Set valid API URL AO1")
	def setValidURLAO1() {
		println("Call to https://alta-shop.herokuapp.com/api/orders")
		response = WS.sendRequest(findTestObject('Orders/016_Object_Ord_AllOrders/AllOrders_016_001'))
	}
	@And("Input Bearer Token in tab Authorization AO1")
	def inputBearerTokenAO1() {
		println("Input Bearer Token")
	}
	@Then("I receieve valid HTTP response 200 AO1")
	def verifystatusCodeAO1(){
		println("I receive valid valid HTTP response 200")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}


	//	========================== @TS.AllOrders.016.002
	//	Get All Orders with Valid HTTP Method and Invalid API URL
	@Given("Set valid method AO2")
	def setValidAO2() {
		println("Set method GET")
	}
	@When("Set invalid API URL AO2")
	def setInvalidURLAO2() {
		println("Call to https://alta-shop.herokuapp.com/api/orderku")
		response = WS.sendRequest(findTestObject('Orders/016_Object_Ord_AllOrders/AllOrders_016_002'))
	}
	@And("Input Bearer Token in tab Authorization AO2")
	def inputBearerTokenAO2() {
		println("Input Bearer Token")
	}
	@Then("I receieve valid HTTP response 404 AO2")
	def verifystatusCodeAO2(){
		println("I receive valid valid HTTP response 404")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode404)
	}


	//	========================== @TS.AllOrders.016.003
	//	Get All Orders with Invalid HTTP Method and valid API URL
	@Given("Set invalid method AO3")
	def setValidAO3() {
		println("Set method PUT")
	}
	@When("Set valid API URL AO3")
	def setValidURLAO3() {
		println("Call to https://alta-shop.herokuapp.com/api/orderku")
		response = WS.sendRequest(findTestObject('Orders/016_Object_Ord_AllOrders/AllOrders_016_003'))
	}
	@And("Input Bearer Token in tab Authorization AO3")
	def inputBearerTokenAO3() {
		println("Input Bearer Token")
	}
	@Then("I receive valid HTTP response 405 AO3")
	def verifystatusCodeAO3(){
		println("I receive valid valid HTTP response 405")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}


	//	========================== @TS.AllOrders.016.004
	//	Get All Orders with Valid HTTP Method and API URL and Blank bearer token in Authorization
	@Given("Set valid method A04")
	def setValidA04() {
		println("Set method GET")
	}
	@When("Set valid API URL AO4")
	def setValidURLAO4() {
		println("Call to https://alta-shop.herokuapp.com/api/orders")
		response = WS.sendRequest(findTestObject('Orders/016_Object_Ord_AllOrders/AllOrders_016_004'))
	}
	@And("Input Bearer Token in tab Authorization A04")
	def inputBearerTokenA04() {
		println("Input Bearer Token")
	}
	@Then("I receive valid HTTP response 401 A04")
	def verifystatusCodeA04(){
		println("I receive valid valid HTTP response 401")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode401)
	}
	@And("Verify error is unauthorized AO4")
	def verifyErrorA04() {
		println("Verify error is unauthorized")
		WS.verifyElementPropertyValue(response, 'error', 'unauthorized')
	}

}