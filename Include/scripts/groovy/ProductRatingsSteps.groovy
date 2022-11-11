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


class ProductRatingsSteps {

	//	========================== @TS.ProductRatings.012.001
	//	Get Products Ratings with Valid HTTP Method and API URL
	@Given("Set valid method PR1")
	def setValidPR1() {
		println("Set method GET")
	}
	@When("Set valid API URL PR1")
	def setValidURLPR1() {
		println("Call to https://alta-shop.herokuapp.com/api/products/4/ratings")
		response = WS.sendRequest(findTestObject('Products/012_Object_Pro_ProductRatings/ProductRatings_001', [('endpoint') : GlobalVariable.Endpoint]))
	}
	@Then("I receive valid HTTP response 200 PR1")
	def verifystatusCodePR1(){
		println("I receive valid valid HTTP response 200")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}
	@And("Verify Property data is 4 PR1")
	def verifyPropertyPR1() {
		println("Verify Property data is 4")
		WS.verifyElementPropertyValue(response, 'data', 4)
	}


	//	========================== @TS.ProductRatings.012.002
	//	Get Products Ratings with Valid HTTP Method and Invalid API URL
	@Given("Set valid method PR2")
	def setValidPR2() {
		println("Set method GET")
	}
	@When("Set invalid API URL PR2")
	def setInvalidURLPR2() {
		println("Call to https://alta-shop.herokuapp.com/api/products/4/ratingku")
		response = WS.sendRequest(findTestObject('Products/012_Object_Pro_ProductRatings/ProductRatings_002', [('endpoint') : GlobalVariable.Endpoint]))
	}
	@Then("I receive valid HTTP response 404 PR2")
	def verifystatusCodePR2(){
		println("I receive valid valid HTTP response 404")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode404)
	}

	//	========================== @TS.ProductRatings.009.003
	//	Get Products Ratings with Invalid HTTP Method and valid API URL
	@Given("Set valid method PR3")
	def setValidPR3() {
		println("Set method PUT")
	}
	@When("Set valid API URL PR3")
	def setValidURLPR3() {
		println("Call to https://alta-shop.herokuapp.com/api/products/4/ratings")
		response = WS.sendRequest(findTestObject('Products/012_Object_Pro_ProductRatings/ProductRatings_003', [('endpoint') : GlobalVariable.Endpoint]))
	}
	@Then("I receive valid HTTP response 405 PR3")
	def verifystatusCodePR3(){
		println("I receive valid valid HTTP response 405")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}



}