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



class ProductCommentsSteps {
	//	========================== @TS.ProductComments.014.001
	//	Get Product Comments with Valid HTTP Method and API URL
	@Given("Set valid method PC1")
	def setValidPC1() {
		println("Set method GET")
	}
	@When("Set valid API URL PC1")
	def setValidURLPC1() {
		println("https://alta-shop.herokuapp.com/api/products/2/comments")
		response = WS.sendRequest(findTestObject('Products/014_Object_Pro_ProductComments/ProductComments_001'))
	}
	@Then("I receive valid HTTP response 200 PC1")
	def verifystatusCodePC1(){
		println("I receive valid valid HTTP response 200")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}

	//	========================== @TS.ProductComments.014.002
	//	Get Product Comments with Valid HTTP Method and Invalid API URL
	@Given("Set valid method PC2")
	def setValidPC2() {
		println("Set method GET")
	}
	@When("Set invalid API URL PC2")
	def setInvalidURLPC2() {
		println("https://alta-shop.herokuapp.com/api/products/2/comments")
		response = WS.sendRequest(findTestObject('Products/014_Object_Pro_ProductComments/ProductComments_002'))
	}
	@Then("I receive valid HTTP response 404 PC2")
	def verifystatusCodePC2(){
		println("I receive valid valid HTTP response 404")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode404)
	}

	//	========================== @TS.ProductComments.014.003
	//	Get Product Comments with Invalid HTTP Method and valid API URL
	@Given("Set valid method PC3")
	def setValidPC3() {
		println("Set method PUT")
	}
	@When("Set valid API URL PC3")
	def setValidURLPC3() {
		println("https://alta-shop.herokuapp.com/api/products/2/comments")
		response = WS.sendRequest(findTestObject('Products/014_Object_Pro_ProductComments/ProductComments_003'))
	}
	@Then("I receive valid HTTP response 405 PC3")
	def verifystatusCodePC3(){
		println("I receive valid valid HTTP response 405")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}

}