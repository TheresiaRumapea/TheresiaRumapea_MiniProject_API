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



class CreateOrderSteps {

	//	========================== @TS.CreateComment.013.001
	//	Create A New Order with Valid HTTP Method, API URL, and data (Body)
	@Given("Set valid method CO1")
	def setValidCO1() {
		println("Set method POST")
	}
	@When("Set valid API URL CO1")
	def setValidURLCO1() {
		println("Call to https://alta-shop.herokuapp.com/api/orders")
		response = WS.sendRequest(findTestObject('Orders/015_Object_Ord_CreateOrder/CreateOrder_001'))
	}
	@And("Input Bearer Token in tab Authorization CO1")
	def inputBearerTokenCO1() {
		println("Input Bearer Token")
	}
	@And("Input valid data (Body) CO1")
	def inputValidDataCO1() {
		println("Input valid product_id and quantity")
	}
	@Then("I receive valid HTTP response 200 CO1")
	def verifystatusCodeCO1(){
		println("I receive valid valid HTTP response 200")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}
	@And("Verify property quantity is 1 CO1")
	def verifyPropertyQuantityCO1() {
		println("Verify property quantity is 1")
		WS.verifyElementPropertyValue(response, 'data[0].Quantity', 1)
	}


	//	WS.verifyElementPropertyValue(response, 'error', 'EOF')
	
	//	========================== @TS.CreateComment.013.002
	//	Create A New Order with Invalid HTTP Method, valid API URL, and valid data (Body) 
	@Given("Set invalid method CO2")
	def setValidCO2() {
		println("Set method PUT")
	}
	@When("Set valid API URL CO2")
	def setValidURLCO2() {
		println("Call to https://alta-shop.herokuapp.com/api/orders")
		response = WS.sendRequest(findTestObject('Orders/015_Object_Ord_CreateOrder/CreateOrder_002'))
	}
	@And("Input Bearer Token in tab Authorization CO2")
	def inputBearerTokenCO2() {
		println("Input Bearer Token")
	}
	@And("Input valid data (Body) CO2")
	def inputValidDataCO2() {
		println("Input valid product_id and quantity")
	}
	@Then("I receive valid HTTP response 405 CO2")
	def verifystatusCodeCO2(){
		println("I receive valid valid HTTP response 405")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}
	

	//	========================== @TS.CreateOrder.015.003
	//	Create A New Order with valid HTTP Method, Invalid API URL, and valid data (Body)
	@Given("Set valid method CO3")
	def setValidCO3() {
		println("Set method POST")
	}
	@When("Set invalid API URL CO3")
	def setInvalidURLCO3(){
		println("Call to https://alta-shop.herokuapp.com/api/orderku")
		response = WS.sendRequest(findTestObject('Orders/015_Object_Ord_CreateOrder/CreateOrder_003'))
	}
	@And("Input Bearer Token in tab Authorization CO3")
	def inputBearerTokenCO3() {
		println("Input Bearer Token")
	}
	@And("Input valid data (Body) CO3")
	def inputValidDataCO3() {
		println("Input valid product_id and quantity")
	}
	@Then("I receive valid HTTP response 404 CO3")
	def verifystatusCodeCO3(){
		println("I receive valid valid HTTP response 404")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode404)
	}
	
	//	========================== @TS.CreateOrder.015.004
	//	Create A New Order with Valid HTTP Method, Valid API URL, and Blank data (Body) 
	@Given("Set valid method CO4")
	def setValidCO4() {
		println("Set method POST")
	}
	@When("Set valid API URL CO4")
	def setValidURLCO4() {
		println("Call to https://alta-shop.herokuapp.com/api/orders")
		response = WS.sendRequest(findTestObject('Orders/015_Object_Ord_CreateOrder/CreateOrder_004'))
	}
	@And("Input Bearer Token in tab Authorization CO4")
	def inputBearerTokenCO4() {
		println("Input Bearer Token")
	}
	@And("Blank data (Body) CO4")
	def blankDataCO4() {
		println("Blank data product_id and quantity")
	}
	@Then("I receive valid HTTP response 400 CO4")
	def verifystatusCodeCO4(){
		println("I receive valid valid HTTP response 400")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}
	@And("Verify error is EOF CO4")
	def VerifyPropertyNameCO4() {
		println("Verify Error 'EOF'")
		WS.verifyElementPropertyValue(response, 'error', 'EOF')
	}
	
	//	========================== @TS.CreateOrder.015.005
	//	Create A New Order with Valid HTTP Method, Valid API URL, and Invalid Product_id in data (Body) 
	@Given("Set valid method CO5")
	def setValidCO5() {
		println("Set method POST")
	}
	@When("Set valid API URL CO5")
	def setValidURLCO5() {
		println("Call to https://alta-shop.herokuapp.com/api/orders")
		response = WS.sendRequest(findTestObject('Orders/015_Object_Ord_CreateOrder/CreateOrder_005'))
	}
	@And("Input Bearer Token in tab Authorization CO5")
	def inputBearerTokenCO5() {
		println("Input Bearer Token")
	}
	@And("Input invalid product_id in data (Body) CO5")
	def inputInvalidProductIDCO5() {
		println("Input invalid product_id")
	}
	@Then("I receive valid HTTP response 400 CO5")
	def verifystatusCodeCO5(){
		println("I receive valid valid HTTP response 400")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}
	
	
	//	========================== @TS.CreateOrder.015.006
	//	Create A New Order with Valid HTTP Method, Valid API URL, and Invalid Quantity in data (Body)
	@Given("Set valid method CO6")
	def setValidCO6() {
		println("Set method POST")
	}
	@When("Set valid API URL CO6")
	def setValidURLCO6() {
		println("Call to https://alta-shop.herokuapp.com/api/orders")
		response = WS.sendRequest(findTestObject('Orders/015_Object_Ord_CreateOrder/CreateOrder_006'))
	}
	@And("Input Bearer Token in tab Authorization CO6")
	def inputBearerTokenCO6() {
		println("Input Bearer Token")
	}
	@And("Input invalid quantity in data (Body) CO6")
	def inputInvalidQuantityCO6() {
		println("Input invalid quantity")
	}
	@Then("I receive valid HTTP response 400 CO6")
	def verifystatusCodeCO6(){
		println("I receive valid valid HTTP response 400")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}
	
	
	//	========================== @TS.CreateOrder.015.007
	//	Create A New Order with Valid HTTP Method, Valid API URL, and Invalid Product_id and Quantity in data (Body)
	@Given("Set valid method CO7")
	def setValidCO7() {
		println("Set method POST")
	}
	@When("Set valid API URL CO7")
	def setValidURLCO7() {
		println("Call to https://alta-shop.herokuapp.com/api/orders")
		response = WS.sendRequest(findTestObject('Orders/015_Object_Ord_CreateOrder/CreateOrder_007'))
	}
	@And("Input Bearer Token in tab Authorization CO7")
	def inputBearerTokenCO7() {
		println("Input Bearer Token")
	}
	@And("Input invalid product_id and quantity in data (Body) CO7")
	def inputInvalidProductIdQuantityCO7() {
		println("Input invalid product_id and quantity")
	}
	@Then("I receive valid HTTP response 400 CO7")
	def verifystatusCodeCO7(){
		println("I receive valid valid HTTP response 400")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}
	
}