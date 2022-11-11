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



class LoginSteps {
	//	========================== @TS.Login.001.001
	//	Login with Valid HTTP Method, API URL, and data (Body)
	@Given("Set valid method L1")
	def setValidL1() {
		println("Set method POST")
	}
	@When("Set valid API URL L1")
	def setValidURLL1() {
		println("Call to https://alta-shop.herokuapp.com/api/auth/login")
		response = WS.sendRequest(findTestObject('Authentication/002_Object_Aut_Login/Login_001'))
	}
	@And("Input valid data (Body) L1")
	def inputValidDataL1() {
		println("Input valid email and password")
	}
	@Then("I receive valid HTTP response 200 L1")
	def verifystatusCodeLoginL1(){
		println("I receive valid valid HTTP response 200")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}

	//	========================== @TS.Login.001.002
	//	Login with Invalid HTTP Method, valid API URL, and valid data (Body)
	@Given("Set invalid method L2")
	def setValidMethodL2() {
		println("Set method GET")
	}
	@When("Set valid API URL L2")
	def setValidURLL2() {
		println("Call to https://alta-shop.herokuapp.com/api/auth/login")
		response = WS.sendRequest(findTestObject('Authentication/002_Object_Aut_Login/Login_002'))
	}
	@And("Input valid data (Body) L2")
	def inputValidDataL2() {
		println("Input valid email and password")
	}
	@Then("I receive valid HTTP response 405 L2")
	def verifystatusCodeL2(){
		println("I receive valid valid HTTP response 405")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}

	//	========================== @TS.Login.001.003
	//	Login with valid HTTP Method, Invalid API URL, and valid data (Body)
	@Given("Set valid method L3")
	def setValidL3() {
		println("Set method POST")
	}
	@When("Set invalid API URL L3")
	def setValidURLL3() {
		println("Call to https://alta-shop.herokuapp.com/api/auth/login")
		response = WS.sendRequest(findTestObject('Authentication/002_Object_Aut_Login/Login_003'))
	}
	@And("Input valid data (Body) L3")
	def inputValidDataL3() {
		println("Input valid email and password")
	}
	@Then("I receieve valid HTTP response 404 L3")
	def verifystatusCodeLoginL3(){
		println("I receive valid valid HTTP response 404")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode404)
	}

	//	========================== @TS.Login.001.004
	// Login with Valid HTTP Method, Valid API URL, and Blank data (Body)
	@Given("Set valid method L4")
	def setValidMethodL4() {
		println("Set method POST")
	}
	@When("Set valid API URL L4")
	def setValidURLL4() {
		println("Call to https://alta-shop.herokuapp.com/api/auth/login")
		response = WS.sendRequest(findTestObject('Authentication/002_Object_Aut_Login/Login_004'))
	}
	@And("Blank data (Body) L4")
	def BlankDataL4() {
		println("Blank data in Body")
	}
	@Then("I receive valid HTTP response 400 L4")
	def verifystatusCodeL4(){
		println("I receive valid valid HTTP response 400")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	//	========================== @TS.Login.001.005
	//	Login with Valid HTTP Method, Valid API URL, and Invalid email in data (Body)
	@Given("Set valid method L5")
	def setValidL5() {
		println("Set method POST")
	}
	@When("Set valid API URL L5")
	def setValidURLL5() {
		println("Call to https://alta-shop.herokuapp.com/api/auth/login")
		response = WS.sendRequest(findTestObject('Authentication/002_Object_Aut_Login/Login_005'))
	}
	@And("Input Invalid email in data (Body) L5 ")
	def inputValidDataL5() {
		println("Input invalid email")
	}
	@Then("I receieve valid HTTP response 400 L5")
	def verifystatusCodeLoginL5(){
		println("I receive valid valid HTTP response 400")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	//	========================== @TS.Login.001.006
	//	Login with Valid HTTP Method, Valid API URL, and Invalid password in data (Body)
	@Given("Set valid method L6")
	def setValidL6() {
		println("Set method POST")
	}
	@When("Set valid API URL L6")
	def setValidURLL6() {
		println("Call to https://alta-shop.herokuapp.com/api/auth/login")
		response = WS.sendRequest(findTestObject('Authentication/002_Object_Aut_Login/Login_006'))
	}
	@And("Input Invalid email in data (Body) L6 ")
	def inputValidDataL6() {
		println("Input invalid password")
	}
	@Then("I receieve valid HTTP response 400 L6")
	def verifystatusCodeLoginL6(){
		println("I receive valid valid HTTP response 400")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	//	========================== @TS.Login.001.009
	//	Login with Valid HTTP Method, Valid API URL, and Blank Email in data (Body)
	@Given("Set valid method L8")
	def setValidMethodL8() {
		println("Set method POST")
	}
	@When("Set valid API URL L8")
	def setValidURLL8() {
		println("Call to https://alta-shop.herokuapp.com/api/auth/register")
		response = WS.sendRequest(findTestObject('Authentication/001_Object_Aut_Register/Register_009'))
	}
	@And("Blank Email in data (Body) L8")
	def BlankEmailL8() {
		println("Input valid email and password")
	}
	@Then("I receive valid HTTP response 400 L8")
	def verifystatusCodeLoginL8(){
		println("I receive valid valid HTTP response 400")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	//	========================== @TS.Login.001.010
	//	Login with Valid HTTP Method, Valid API URL, and Blank Password in data (Body)
	@Given("Set valid method L10")
	def setValidMethodL10() {
		println("Set method POST")
	}
	@When("Set valid API URL L10")
	def setValidURLL10() {
		println("Call to https://alta-shop.herokuapp.com/api/auth/register")
		response = WS.sendRequest(findTestObject('Authentication/001_Object_Aut_Register/Register_010'))
	}
	@And("Blank Password in data (Body) L10")
	def BlankPasswordL10() {
		println("Input valid email and password")
	}
	@Then("I receive valid HTTP response 400 L10")
	def verifystatusCodeLoginL10(){
		println("I receive valid valid HTTP response 400")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}


}