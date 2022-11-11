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



class UserInformationSteps {

	//	========================== @TS.UserInformation.001.001
	//	Get User Information with Valid HTTP Method and API URL
	@Given("Set valid method U1")
	def setValidU1() {
		println("Set method GET")
	}
	@When("Set valid API URL U1")
	def setValidURLU1() {
		println("Call to https://alta-shop.herokuapp.com/api/auth/info")
		response = WS.sendRequest(findTestObject('Authentication/003_Object_Aut_UserInformation/UserInformation_001'))
	}
	@And("Input Bearer Token in tab Authorization U1")
	def inputBearerTokenU1() {
		println("Input Bearer Token")
	}
	@Then("I receive valid HTTP response 200 U1")
	def verifystatusCodeU1(){
		println("I receive valid valid HTTP response 200")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}

	//	========================== @TS.UserInformation.001.002
	//	Get User Information with Invalid HTTP Method and valid API URL
	@Given("Set invalid method U2")
	def setValidU2() {
		println("Set method PUT")
	}
	@When("Set valid API URL U2")
	def setValidURLU2() {
		println("Call to https://alta-shop.herokuapp.com/api/auth/info")
		response = WS.sendRequest(findTestObject('Authentication/003_Object_Aut_UserInformation/UserInformation_002'))
	}
	@And("Input Bearer Token in tab Authorization U2")
	def inputBearerTokenU2() {
		println("Input Bearer Token")
	}
	@Then("I receive valid HTTP response 200 U2")
	def verifystatusCodeU2(){
		println("I receive valid valid HTTP response 405")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}

	//	========================== @TS.UserInformation.001.003
	//	Get User Information with Valid HTTP Method and Invalid API URL
	@Given("Set valid method U3")
	def setValidU3() {
		println("Set method GET")
	}
	@When("Set invalid API URL U3")
	def setValidURLU3() {
		println("Call to https://alta-shop.herokuapp.com/api/auth/information")
		response = WS.sendRequest(findTestObject('Authentication/003_Object_Aut_UserInformation/UserInformation_003'))
	}
	@And("Input Bearer Token in tab Authorization U3")
	def inputBearerTokenU3() {
		println("Input Bearer Token")
	}
	@Then("I receive valid HTTP response 200 U3")
	def verifystatusCodeU3(){
		println("I receive valid valid HTTP response 404")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode404)
	}



}