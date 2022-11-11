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



class DeleteProductSteps {
	//	========================== @TS.DeleteProduct.010.001
	//	Delete Product with Valid HTTP Method and API URL
	@Given("Set valid method DP1")
	def setValidDP1() {
		println("Set method DELETE")
	}
	@When("Set valid API URL DP1")
	def setValidURLDP1() {
		println("Call to https://alta-shop.herokuapp.com/api/products/54")
		response = WS.sendRequest(findTestObject('Products/010_Object_Pro_DeleteProduct/DeleteProduct_001'))
	}
	@Then("I receive valid HTTP response 200 DP1")
	def verifystatusCodeDP1(){
		println("I receive valid valid HTTP response 200")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}

	@And("Verify Data Response is null")
	def VerifyDataDP1() {
		println("Verify Data Response is null")
		WS.verifyElementPropertyValue(response, 'data', null)
	}
	
	//	========================== @TS.DeleteProduct.010.002
	//	Delete Product with Valid HTTP Method and Invalid API URL
	@Given("Set valid method DP2")
	def setValidDP2() {
		println("Set method DELETE")
	}
	@When("Set invalid API URL DP2")
	def setInvalidURLDP2() {
		println("Call to https://alta-shop.herokuapp.com/api/products/xx")
		response = WS.sendRequest(findTestObject('Products/010_Object_Pro_DeleteProduct/DeleteProduct_002'))
	}
	@Then("I receieve valid HTTP response 400 DP2")
	def verifystatusCodeDP2(){
		println("I receive valid valid HTTP response 400")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}
	
	//	========================== @TS.DeleteProduct.010.003
	//	Delete Product with Invalid HTTP Method and valid API URL
	@Given("Set invalid method DP3")
	def setInvalidDP3() {
		println("Set method PUT")
	}
	@When("Set valid API URL DP3")
	def setValidURLDP3() {
		println("Call to https://alta-shop.herokuapp.com/api/products/54")
		response = WS.sendRequest(findTestObject('Products/010_Object_Pro_DeleteProduct/DeleteProduct_003'))
	}
	@Then("I receive valid HTTP response 405 DP3")
	def verifystatusCodeDP3(){
		println("I receive valid valid HTTP response 405")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}
	
}