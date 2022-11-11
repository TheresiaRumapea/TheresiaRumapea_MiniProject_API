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



class AllProducts {
	//	========================== @TS.AllProducts.007.001
	//	Get All Products with Valid HTTP Method and API URL
	@Given("Set valid method AP1")
	def setValidAP1() {
		println("Set method GET")
	}
	@When("Set valid API URL AP1")
	def setValidURLAP1() {
		println("Call to https://alta-shop.herokuapp.com/api/products")
		response = WS.sendRequest(findTestObject('Products/007_Object_Pro_AllProducts/AllProducts_001'))
	}
	@Then("I receive valid HTTP response 200 AP1")
	def verifystatusCodeAP1(){
		println("I receive valid valid HTTP response 200")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}
	
	//	========================== @TS.AllProducts.007.002
	//	Get All Products with Valid HTTP Method and Invalid API URL	
	@Given("Set valid method AP2")
	def setValidAP2() {
		println("Set method GET")
	}
	@When("Set invalid API URL AP2")
	def setValidURLAP2() {
		println("Call to https://alta-shop.herokuapp.com/api/productku")
		response = WS.sendRequest(findTestObject('ProductCategories/005_Object_Pct_CategoryByID/CategoryByID_005_002'))
	}
	@Then("I receieve valid HTTP response 404 AP2")
	def verifystatusCodeAP2(){
		println("I receive valid valid HTTP response 404")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode404)
	}
	
	//	========================== @TS.AllProducts.007.003
	//	Get All Products with Invalid HTTP Method and valid API URL
	@Given("Set invalid method AP3")
	def setValidAP3() {
		println("Set method PUT")
	}
	@When("Set valid API URL AP3")
	def setValidURLAP3() {
		println("Call to https://alta-shop.herokuapp.com/api/products")
		response = WS.sendRequest(findTestObject('ProductCategories/005_Object_Pct_CategoryByID/CategoryByID_005_003'))
	}
	@Then("I receieve valid HTTP response 405 AP3")
	def verifystatusCodeAP3(){
		println("I receive valid valid HTTP response 405")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}
	

}