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



class AllCategoriesSteps {
	//	========================== @TS.AllCategories.006.001
	//	Get All Categories with Valid HTTP Method and API URL
	@Given("Set valid method AC1")
	def setValidAC1() {
		println("Set method GET")
	}
	@When("Set valid API URL AC1")
	def setValidURLAC1() {
		println("Call to https://alta-shop.herokuapp.com/api/categories")
		response = WS.sendRequest(findTestObject('ProductCategories/006_Object_Pct_AllCategories/AllCategories_001'))
	}
	@Then("I receive valid HTTP response 200 AC1")
	def verifystatusCodeAC1(){
		println("I receive valid valid HTTP response 200")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}

	//	========================== @TS.AllCategories.006.002
	//	Get All Categories with Valid HTTP Method and Invalid API URL
	//	Given Set valid method AC2
	//	When Set invalid API URL AC2
	//	Then I receieve valid HTTP response 404 AC2
	@Given("Set valid method AC2")
	def setValidAC2() {
		println("Set method GET")
	}
	@When("Set invalid API URL AC2")
	def setValidURLAC2() {
		println("Call to https://alta-shop.herokuapp.com/api/categories")
		response = WS.sendRequest(findTestObject('ProductCategories/006_Object_Pct_AllCategories/AllCategories_002'))
	}
	@Then("I receive valid HTTP response 404 AC2")
	def verifystatusCodeAC2(){
		println("I receive valid valid HTTP response 404")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode404)
	}


	//	========================== @TS.AllCategories.006.003
	// Get All Categories with Invalid HTTP Method and valid API URL
	//	Given Set invalid method AC3
	//	When Set valid API URL AC3
	//	Then I receieve valid HTTP response 405 AC3
	@Given("Given Set invalid method AC3")
	def setValidAC3() {
		println("Set method PUT")
	}
	@When("Set valid API URL AC3")
	def setValidURLAC3() {
		println("Call to https://alta-shop.herokuapp.com/api/categories")
		response = WS.sendRequest(findTestObject('ProductCategories/006_Object_Pct_AllCategories/AllCategories_003'))
	}
	@Then("I receieve valid HTTP response 405 AC3")
	def verifystatusCodeAC3(){
		println("I receive valid valid HTTP response 405")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}

}