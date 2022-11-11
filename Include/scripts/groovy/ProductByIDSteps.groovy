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



class ProductByIDSteps {
	//	========================== @TS.ProductByID.009.001
	//	Get Product By ID with Valid HTTP Method and API URL	
	@Given("Set valid method PID1")
	def setValidPID1() {
		println("Set method GET")
	}
	@When("Set valid API URL PID1")
	def setValidURLPID1() {
		println("Call to https://alta-shop.herokuapp.com/api/products/56")
		response = WS.sendRequest(findTestObject('Products/009_Object_Pro_ProductByID/ProductByID_001'))
	}
	@Then("I receive valid HTTP response 200 PID1")
	def verifystatusCodePID1(){
		println("I receive valid valid HTTP response 200")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}

	@And("Verify Property ID 56 PID1")
	def VerifyPropertyIDPID1() {
		println("Verify Property ID 56")
		WS.verifyElementPropertyValue(response, 'data.ID', 56)
	}

	//	========================== @TS.ProductByID.009.002
	//Get Product By ID with Valid HTTP Method and Invalid API URL
	@Given("Set invalid method PID2")
	def setValidPID2() {
		println("Set method GET")
	}
	@When("Set valid API URL PID2")
	def setValidURLPID2() {
		println("Call to https://alta-shop.herokuapp.com/api/products/xx")
		response = WS.sendRequest(findTestObject('Products/009_Object_Pro_ProductByID/ProductByID_002'))
	}
	@Then("I receieve valid HTTP response 400 PID2")
	def verifystatusCodePID2(){
		println("I receive valid valid HTTP response 400")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}
	
	
	//	========================== @TS.ProductByID.009.003
	//Get Product By ID with Invalid HTTP Method and valid API URL
	@Given("Set invalid method PID3")
	def setValidPID3() {
		println("Set method PUT")
	}
	@When("Set valid API URL PID3")
	def setValidURLPID3() {
		println("Call to https://alta-shop.herokuapp.com/api/products/56")
		response = WS.sendRequest(findTestObject('Products/009_Object_Pro_ProductByID/ProductByID_003'))
	}
	@Then("I receieve valid HTTP response 405 PID3")
	def verifystatusCodePID3(){
		println("I receive valid valid HTTP response 405")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}
	
	
	
}