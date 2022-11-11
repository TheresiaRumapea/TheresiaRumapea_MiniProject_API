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


class RegisterSteps {

	//	========================== @TS.Register.001.001
	//	Register with Valid HTTP Method, API URL, and data (Body)
	@Given("Set valid method R1")
	def setValidR1() {
		println("Set method POST")
	}
	@When("Set valid API URL R1")
	def setValidURLR1() {
		println("Call to https://alta-shop.herokuapp.com/api/auth/register")
		response = WS.sendRequest(findTestObject('Authentication/001_Object_Aut_Register/Register_001'))
	}
	@And("Input valid data (Body) R1")
	def inputValidDataR1() {
		println("Input valid email and password")
	}
	@Then("I receive valid HTTP response 200 R1")
	def verifystatusCodeR1(){
		println("I receive valid valid HTTP response 200")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}

	//	========================== @TS.Register.001.002
	//	Register with Invalid HTTP Method, valid API URL, and valid data (Body)
	@Given("Set invalid method R2")
	def setValidMethodR2() {
		println("Set method GET")
	}
	@When("Set valid API URL R2")
	def setValidURLR2() {
		println("Call to https://alta-shop.herokuapp.com/api/auth/register")
		response = WS.sendRequest(findTestObject('Authentication/001_Object_Aut_Register/Register_002'))
	}
	@And("Input valid data (Body) R2")
	def inputValidDataR2() {
		println("Input valid email and password")
	}
	@Then("I receive valid HTTP response 405 R2")
	def verifystatusCodeR2(){
		println("I receive valid valid HTTP response 405")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}


	//	========================== @TS.Register.001.003
	//	Register with valid HTTP Method, Invalid API URL, and valid data (Body)
	@Given("Set valid method R3")
	def setValidR3() {
		println("Set method POST")
	}
	@When("Set invalid API URL R3")
	def setValidURLR3() {
		println("Call to https://alta-shop.herokuapp.com/api/auth/register")
		response = WS.sendRequest(findTestObject('Authentication/001_Object_Aut_Register/Register_003'))
	}
	@And("Input valid data (Body) R3")
	def inputValidDataR3() {
		println("Input valid email and password")
	}
	@Then("I receieve valid HTTP response 404 R3")
	def verifystatusCodeR3(){
		println("I receive valid valid HTTP response 404")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode404)
	}


	//	========================== @TS.Register.001.004
	// Register with Valid HTTP Method, Valid API URL, and Blank data (Body)
	@Given("Set valid method R4")
	def setValidMethodR4() {
		println("Set method POST")
	}
	@When("Set valid API URL R4")
	def setValidURLR4() {
		println("Call to https://alta-shop.herokuapp.com/api/auth/register")
		response = WS.sendRequest(findTestObject('Authentication/001_Object_Aut_Register/Register_004'))
	}
	@And("Blank data (Body) R4")
	def BlankDataR4() {
		println("Blank data in Body")
	}
	@Then("I receive valid HTTP response 400 R4")
	def verifystatusCodeR4(){
		println("I receive valid valid HTTP response 400")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	//	========================== @TS.Register.001.006
	//	Register with Valid HTTP Method, Valid API URL, and Email have been registered in data (Body)
	@Given("Set valid method R6")
	def setValidMethodR6() {
		println("Set method POST")
	}
	@When("Set valid API URL R6")
	def setValidURLR6() {
		println("Call to https://alta-shop.herokuapp.com/api/auth/register")
		response = WS.sendRequest(findTestObject('Authentication/001_Object_Aut_Register/Register_006'))
	}
	@And("Input Email have been registered in data (Body) R6")
	def inputEmailHaveBeenRegisteredR6() {
		println("Input Email have been registered in data (Body)")
	}
	@Then("I receive valid HTTP response 400 R6")
	def verifystatusCodeR6(){
		println("I receive valid valid HTTP response 400")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	//	========================== @TS.Register.001.007
	//	Register with Valid HTTP Method, Valid API URL, and Invalid password in data (Body)

	@Given("Set valid method R7")
	def setValidMethodR7() {
		println("Set method POST")
	}
	@When("Set valid API URL R7")
	def setValidURLR7() {
		println("Call to https://alta-shop.herokuapp.com/api/auth/register")
		response = WS.sendRequest(findTestObject('Authentication/001_Object_Aut_Register/Register_007'))
	}
	@And("Invalid password in data (Body) R7")
	def inputInvalidPasswordR7() {
		println("Input valid email and password")
	}
	@Then("I receive valid HTTP response 400 R7")
	def verifystatusCodeR7(){
		println("I receive valid valid HTTP response 400")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	//	========================== @TS.Register.001.008
	//	Register with Valid HTTP Method, Valid API URL, and Invalid email and password in data (Body)

	@Given("Set valid method R8")
	def setValidMethodR8() {
		println("Set method POST")
	}
	@When("Set valid API URL R8")
	def setValidURLR8() {
		println("Call to https://alta-shop.herokuapp.com/api/auth/register")
		response = WS.sendRequest(findTestObject('Authentication/001_Object_Aut_Register/Register_008'))
	}
	@And("Input invalid email and password in data (Body) R8")
	def inputInvalidEmailPasswordR8() {
		println("Input valid email and password")
	}
	@Then("I receive valid HTTP response 400 R8")
	def verifystatusCodeR8(){
		println("I receive valid valid HTTP response 400")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	//	========================== @TS.Register.001.009
	//	Register with Valid HTTP Method, Valid API URL, and Blank Email in data (Body)

	@Given("Set valid method R9")
	def setValidMethodR9() {
		println("Set method POST")
	}
	@When("Set valid API URL R9")
	def setValidURLR9() {
		println("Call to https://alta-shop.herokuapp.com/api/auth/register")
		response = WS.sendRequest(findTestObject('Authentication/001_Object_Aut_Register/Register_009'))
	}
	@And("Blank Email in data (Body) R9")
	def BlankEmailR9() {
		println("Input valid email and password")
	}
	@Then("I receive valid HTTP response 400 R9")
	def verifystatusCodeR9(){
		println("I receive valid valid HTTP response 400")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}


	//	========================== @TS.Register.001.010
	//	Register with Valid HTTP Method, Valid API URL, and Blank Password in data (Body)
	@Given("Set valid method R10")
	def setValidMethodR10() {
		println("Set method POST")
	}
	@When("Set valid API URL R10")
	def setValidURLR10() {
		println("Call to https://alta-shop.herokuapp.com/api/auth/register")
		response = WS.sendRequest(findTestObject('Authentication/001_Object_Aut_Register/Register_010'))
	}
	@And("Blank Password in data (Body) R10")
	def BlankPasswordR10() {
		println("Input valid email and password")
	}
	@Then("I receive valid HTTP response 400 R10")
	def verifystatusCodeR10(){
		println("I receive valid valid HTTP response 400")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

}