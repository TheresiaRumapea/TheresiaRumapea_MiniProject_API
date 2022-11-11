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


class CategoryByID {


	//	========================== @TS.CategoryByID.005.001
	//	Get Category By ID with Valid HTTP Method and API URL
	@Given("Set valid method CID1")
	def setValidCID1() {
		println("Set method GET")
	}
	@When("Set valid API URL CID1")
	def setValidURLCID1() {
		println("Call to https://alta-shop.herokuapp.com/api/categories/5")
		response = WS.sendRequest(findTestObject('ProductCategories/005_Object_Pct_CategoryByID/CategoryByID_005_001'))
	}
	@Then("I receive valid HTTP response 200 CID1")
	def verifystatusCodeCID1(){
		println("I receive valid valid HTTP response 200")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}

	@And("Verify Property ID 5 CID1")
	def VerifyPropertyIDCID1() {
		println("Verify Property ID 5")
		WS.verifyElementPropertyValue(response, 'data.ID', 5)
	}

	//	========================== @TS.CategoryByID.005.002
	//	Get Category By ID with Valid HTTP Method and Invalid API URL
	@Given("Set valid method CID2")
	def setValidCID2() {
		println("Set method GET")
	}
	@When("Set invalid API URL CID2")
	def setInvalidURLCID2() {
		println("Call to https://alta-shop.herokuapp.com/api/categories/5")
		response = WS.sendRequest(findTestObject('ProductCategories/005_Object_Pct_CategoryByID/CategoryByID_005_002'))
	}
	@Then("I receieve valid HTTP response 400 CID2")
	def verifystatusCodeCID2(){
		println("I receive valid valid HTTP response 400")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}


	//	========================== @TS.CategoryByID.005.003
	//	Get Category By ID with Invalid HTTP Method and valid API URL
	@Given("Set invalid method CID3")
	def setValidCID3() {
		println("Set method PUT")
	}
	@When("Set valid API URL CID3")
	def setValidURLCID3() {
		println("Call to https://alta-shop.herokuapp.com/api/categories/5")
		response = WS.sendRequest(findTestObject('ProductCategories/005_Object_Pct_CategoryByID/CategoryByID_005_003'))
	}
	@Then("I receieve valid HTTP response 405 CID3")
	def verifystatusCodeCID3(){
		println("I receive valid valid HTTP response 405")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}
}