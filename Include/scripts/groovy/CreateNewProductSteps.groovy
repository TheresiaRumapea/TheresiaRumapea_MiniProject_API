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



class CreateNewProductSteps {
	//	========================== @TS.CreateProduct.008.001
	//	Create New Product with Valid HTTP Method, API URL, and data (Body)
	@Given("Set valid method CP1")
	def setValidCP1() {
		println("Set method POST")
	}
	@When("Set valid API URL CP1")
	def setValidURLCP1() {
		println("Call to https://alta-shop.herokuapp.com/api/products")
		response = WS.sendRequest(findTestObject('Products/008_Object_Pro_CreateANewProduct/CreateANewProduct_001'))
	}
	@And("Input valid data (Body) CP1")
	def inputValidDataCP1() {
		println("Input valid name and description")
	}
	@Then("I receive valid HTTP response 200 CP1")
	def verifystatusCodeCP1(){
		println("I receive valid valid HTTP response 200")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}
	@And("Verify Property Name 'Sony PS5' CP1")
	def VerifyPropertyNameCP1() {
		println("Verify Property Name 'Sony PS5'")
		WS.verifyElementPropertyValue(response, 'data.Name', 'Sony PS5')
	}
	@And("Verify Property Description 'play has no limits' CP1")
	def VerifyPropertyDescriptionCP1() {
		println("Verify Property Description 'play has no limits'")
		WS.verifyElementPropertyValue(response, 'data.Description', 'play has no limits')
	}

	//	========================== @TS.CreateProduct.008.002
	//	Create New Product with Invalid HTTP Method, valid API URL, and valid data (Body)
	@Given("Set invalid method CP2")
	def setInvalidCP2() {
		println("Set method GET")
	}
	@When("Set valid API URL CP2")
	def setValidURLCP2() {
		println("Call to https://alta-shop.herokuapp.com/api/products")
		response = WS.sendRequest(findTestObject('Products/008_Object_Pro_CreateANewProduct/CreateANewProduct_002'))
	}
	@And("Input valid data (Body) CP2")
	def inputValidDataCP2() {
		println("Input valid name and description")
	}
	@Then("I receieve valid HTTP response 405 CP2")
	def verifystatusCodeCP2(){
		println("I receive valid valid HTTP response 405")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}


	//	========================== @TS.CreateProduct.008.003
	//	Create New Product with valid HTTP Method, Invalid API URL, and valid data (Body)
	@Given("Set valid method CP3")
	def setValidCP3() {
		println("Set method POST")
	}
	@When("Set invalid API URL CP3")
	def setInvalidURLCP3() {
		println("Call to https://alta-shop.herokuapp.com/api/productsku")
		response = WS.sendRequest(findTestObject('Products/008_Object_Pro_CreateANewProduct/CreateANewProduct_003'))
	}
	@And("Input valid data (Body) CP3")
	def inputValidDataCP3() {
		println("Input valid name and description")
	}
	@Then("I receive valid HTTP response 404 CP3")
	def verifystatusCodeCP3(){
		println("I receive valid valid HTTP response 404")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode404)
	}



	//	@TS.CreateProduct.008.004
	//	Scenario Outline: Create New Product with Valid HTTP Method, Valid API URL, and Blank data (Body)
	@Given("Set valid method CP4")
	def setValidCP4() {
		println("Set method POST")
	}
	@When("Set valid API URL CP4")
	def setValidURLCP4() {
		println("Call to https://alta-shop.herokuapp.com/api/products")
		response = WS.sendRequest(findTestObject('Products/008_Object_Pro_CreateANewProduct/CreateANewProduct_004'))
	}
	@And("Blank data (Body)  CP4")
	def BlankDataCP4() {
		println("Blank Data")
	}
	@Then("I receive valid HTTP response 400 CP4")
	def verifystatusCodeCP4(){
		println("I receive valid valid HTTP response 400")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}
	@And("Verify Error 'EOF' CP4")
	def VerifyPropertyNameCP4() {
		println("Verify Error 'EOF'")
		WS.verifyElementPropertyValue(response, 'error', 'EOF')
	}


	//	@TS.CreateCategory.008.005
	//	Scenario Outline: Create New Product with Valid HTTP Method, Valid API URL, and Invalid name in data (Body)
	@Given("Set valid method CP5")
	def setInvalidCP5() {
		println("Set method GET")
	}
	@When("Set valid API URL CP5")
	def setValidURLCP5() {
		println("Call to https://alta-shop.herokuapp.com/api/products")
		response = WS.sendRequest(findTestObject('Products/008_Object_Pro_CreateANewProduct/CreateANewProduct_005'))
	}
	@And("Input invalid name in data (Body)  CP5")
	def inputInvalidNameCP5() {
		println("Input invalid name")
	}
	@Then("I receieve valid HTTP response 400 CP5")
	def verifystatusCodeCP5(){
		println("I receive valid valid HTTP response 400")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	//
	//	@TS.CreateCategory.008.006
	//	Scenario Outline: Create New Product with Valid HTTP Method, Valid API URL, and Invalid description in data (Body)
	@Given("Set valid method CP6")
	def setValidCP6() {
		println("Set method POST")
	}
	@When("Set valid API URL CP6")
	def setValidURLCP6() {
		println("Call to https://alta-shop.herokuapp.com/api/products")
		response = WS.sendRequest(findTestObject('Products/008_Object_Pro_CreateANewProduct/CreateANewProduct_006'))
	}
	@And("Input invalid description in data (Body) CP6")
	def inputInvalidDescriptionCP6() {
		println("Input invalid description")
	}
	@Then("I receive valid HTTP response 400 CP6")
	def verifystatusCodeCP6(){
		println("I receive valid valid HTTP response 400")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}


	//	@TS.CreateCategory.004.007
	//	Scenario Outline: Create New Product with Valid HTTP Method, Valid API URL, and Invalid price in data (Body)
	//	  Given Set valid method CP7
	//	  When Set valid API URL CP7
	//	  And Input invalid price in data (Body) CP7
	//	  Then I receieve valid HTTP response 400 CP7
	@Given("Set valid method CP7")
	def setValidCP7() {
		println("Set method POST")
	}
	@When("Set valid API URL CP7")
	def setValidURLCP7() {
		println("Call to https://alta-shop.herokuapp.com/api/products")
		response = WS.sendRequest(findTestObject('Products/008_Object_Pro_CreateANewProduct/CreateANewProduct_007'))
	}
	@And("Input invalid price in data (Body) CP7")
	def inputInvalidPriceCP7() {
		println("Input invalid price")
	}
	@Then("I receive valid HTTP response 400 CP7")
	def verifystatusCodeCP7(){
		println("I receive valid valid HTTP response 400")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	//
	//	@TS.CreateCategory.004.008
	//	Scenario Outline: Create New Product with Valid HTTP Method, Valid API URL, and Invalid categories in data (Body)
	@Given("Set valid method CP8")
	def setValidCP8() {
		println("Set method POST")
	}
	@When("Set valid API URL CP8")
	def setValidURLCP8() {
		println("Call to https://alta-shop.herokuapp.com/api/products")
		response = WS.sendRequest(findTestObject('Products/008_Object_Pro_CreateANewProduct/CreateANewProduct_008'))
	}
	@And("Input invalid categories in data (Body) CP8")
	def inputInvalidCategoriesCP8() {
		println("Input invalid categories")
	}
	@Then("I receive valid HTTP response 400 CP8")
	def verifystatusCodeCP8(){
		println("I receive valid valid HTTP response 400")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}


	//	@TS.CreateCategory.004.010
	//	Scenario Outline: Create New Product with Valid HTTP Method, Valid API URL, and Blank Description in data (Body)
	@Given("Set valid method CP10")
	def setValidCP10() {
		println("Set method POST")
	}
	@When("Set valid API URL CP10")
	def setValidURLCP10() {
		println("Call to https://alta-shop.herokuapp.com/api/products")
		response = WS.sendRequest(findTestObject('Products/008_Object_Pro_CreateANewProduct/CreateANewProduct_010'))
	}
	@And("Blank Description in data (Body)  CP10")
	def inputValidDataCP10() {
		println("Blank Description")
	}
	@Then("I receive valid HTTP response 200 CP10")
	def verifystatusCodeCP10(){
		println("I receive valid valid HTTP response 200")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}
	@And("Verify Property Name 'Sony PS5' CP10")
	def VerifyPropertyNameCP10() {
		println("Verify Property Name 'Sony PS5'")
		WS.verifyElementPropertyValue(response, 'data.Name', 'Sony PS5')
	}
	@And("Verify Property Description is null CP10")
	def VerifyPropertySDescriptionCP10() {
		println("Verify Property Description is null")
		WS.verifyElementPropertyValue(response, 'data.Description', '')
	}


	//
	//	@TS.CreateCategory.004.012
	//	Scenario Outline: Create New Product with Valid HTTP Method, Valid API URL, and Blank Categories in data (Body)
	//	  Given Set valid method CP12
	//	  When Set valid API URL CP12
	//	  And  Blank Description in data (Body) C12
	//	  Then I receieve valid HTTP response 200 C12
	//	  And Verify Property Name 'Sony PS5' CP12
	//		  And Verify Property Categories is null CP12
	@Given("Set valid method CP12")
	def setValidCP12() {
		println("Set method POST")
	}
	@When("Set valid API URL CP12")
	def setValidURLCP12() {
		println("Call to https://alta-shop.herokuapp.com/api/products")
		response = WS.sendRequest(findTestObject('Products/008_Object_Pro_CreateANewProduct/CreateANewProduct_012'))
	}
	@And("Blank Description in data (Body) CP12")
	def inputValidDataCP12() {
		println("Blank Description")
	}
	@Then("I receive valid HTTP response 200 CP12")
	def verifystatusCodeCP12(){
		println("I receive valid valid HTTP response 200")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}
	@And("Verify Property Name 'Sony PS5' CP12")
	def VerifyPropertyNameCP12() {
		println("Verify Property Name 'Sony PS5'")
		WS.verifyElementPropertyValue(response, 'data.Name', 'Sony PS5')
	}
	@And("Verify Property Categories is null CP12")
	def VerifyPropertyCategoriesCP12() {
		println("Verify Property Categories is null")
		WS.verifyElementPropertyValue(response, 'data.Categories', [])
	}

}