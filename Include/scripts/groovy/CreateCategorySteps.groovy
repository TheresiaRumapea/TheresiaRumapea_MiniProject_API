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



class CreateCategorySteps {
	//	========================== @TS.CreateCategory.004.001
	//	Create Category with Valid HTTP Method, API URL, and data (Body)
	@Given("Set valid method CC1")
	def setValidCC1() {
		println("Set method POST")
	}
	@When("Set valid API URL CC1")
	def setValidURLCC1() {
		println("Call to https://alta-shop.herokuapp.com/api/categories")
		response = WS.sendRequest(findTestObject('ProductCategories/004_Object_Pct_CreateCategory/CreateCategory_004_001'))
	}
	@And("Input valid data (Body) CC1")
	def inputValidDataCC1() {
		println("Input valid name and description")
	}
	@Then("I receive valid HTTP response 200 CC1")
	def verifystatusCodeCC1(){
		println("I receive valid valid HTTP response 200")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}
	@And("Verify Property Name 'gamingo' CC1")
	def VerifyPropertyNameCC1() {
		println("Verify Property Name 'gamingo'")
		WS.verifyElementPropertyValue(response, 'data.Name', 'gamingo')
	}
	@And("Verify Property Description 'foro gaming purposes'' CC1")
	def VerifyPropertyDescriptionCC1() {
		println("Verify Property Description 'foro gaming purposes'")
		WS.verifyElementPropertyValue(response, 'data.Description', 'foro gaming purposes')
	}


	//	========================== @TS.CreateCategory.004.002
	//	Create Category with Invalid HTTP Method, valid API URL, and valid data (Body)
	@Given("Set invalid method CC2")
	def setInvalidCC1() {
		println("Set method GET")
	}
	@When("Set valid API URL CC2")
	def setValidURLCC2() {
		println("Call to https://alta-shop.herokuapp.com/api/categories")
		response = WS.sendRequest(findTestObject('ProductCategories/004_Object_Pct_CreateCategory/CreateCategory_004_002'))
	}
	@And("Input valid data (Body) CC2")
	def inputValidDataCC2() {
		println("Input valid name and description")
	}
	@Then("I receieve valid HTTP response 405 CC2")
	def verifystatusCodeCC2(){
		println("I receive valid valid HTTP response 405")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}

	//	========================== @TS.CreateCategory.004.003
	//	Create Category with valid HTTP Method, Invalid API URL, and valid data (Body)
	@Given("Set valid method CC3")
	def setInvalidCC3() {
		println("Set method GET")
	}
	@When("Set invalid API URL CC3")
	def setValidURLCC3() {
		println("Call to https://alta-shop.herokuapp.com/api/categ")
		response = WS.sendRequest(findTestObject('ProductCategories/004_Object_Pct_CreateCategory/CreateCategory_004_003'))
	}
	@And("Input valid data (Body) CC3")
	def inputValidDataCC3() {
		println("Input valid name and description")
	}
	@Then("I receieve valid HTTP response 404 CC3")
	def verifystatusCodeCC3(){
		println("I receive valid valid HTTP response 405")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode404)
	}

	//	========================== @TS.CreateCategory.004.004
	//	Create Category with Valid HTTP Method, Valid API URL, and Blank data (Body)

	@Given("Set valid method CC4")
	def setValidCC4() {
		println("Set method POST")
	}
	@When("Set valid API URL CC4")
	def setValidURLCC4() {
		println("Call to https://alta-shop.herokuapp.com/api/categories")
		response = WS.sendRequest(findTestObject('ProductCategories/004_Object_Pct_CreateCategory/CreateCategory_004_004'))
	}
	@And("Blank data (Body)  CC4")
	def BlankDataCC4() {
		println("Blank Data")
	}
	@Then("I receive valid HTTP response 400 CC4")
	def verifystatusCodeCC4(){
		println("I receive valid valid HTTP response 400")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}
	@And("Verify Error 'EOF' CC4")
	def VerifyPropertyNameCC4() {
		println("Verify Error 'EOF'")
		WS.verifyElementPropertyValue(response, 'error', 'EOF')
	}


	//	========================== @TS.CreateCategory.004.005
	//	Create Category with Valid HTTP Method, Valid API URL, and Invalid name in data (Body)

	@Given("Set valid method CC5")
	def setInvalidCC5() {
		println("Set method GET")
	}
	@When("Set valid API URL CC5")
	def setValidURLCC5() {
		println("Call to https://alta-shop.herokuapp.com/api/categories")
		response = WS.sendRequest(findTestObject('ProductCategories/004_Object_Pct_CreateCategory/CreateCategory_004_005'))
	}
	@And("Input invalid name in data (Body)  CC5")
	def inputInvalidNameCC5() {
		println("Input invalid name")
	}
	@Then("I receieve valid HTTP response 400 CC5")
	def verifystatusCodeCC5(){
		println("I receive valid valid HTTP response 400")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}


	//	========================== @TS.CreateCategory.004.006
	//  Create Category with Valid HTTP Method, Valid API URL, and Invalid description in data (Body)

	@Given("Set valid method CC6")
	def setValidCC6() {
		println("Set method POST")
	}
	@When("Set valid API URL CC6")
	def setValidURLCC6() {
		println("Call to https://alta-shop.herokuapp.com/api/categories")
		response = WS.sendRequest(findTestObject('ProductCategories/004_Object_Pct_CreateCategory/CreateCategory_004_006'))
	}
	@And("Input invalid description in data (Body) CC6")
	def inputInvalidDescriptionCC6() {
		println("Input invalid description")
	}
	@Then("I receive valid HTTP response 400 CC6")
	def verifystatusCodeCC6(){
		println("I receive valid valid HTTP response 400")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}


	//	========================== @TS.CreateCategory.004.007
	// 	Create Category with Valid HTTP Method, Valid API URL, and Invalid name and description in data (Body)
	@Given("Set valid method CC7")
	def setValidCC7() {
		println("Set method POST")
	}
	@When("Set valid API URL CC7")
	def setValidURLCC7() {
		println("Call to https://alta-shop.herokuapp.com/api/categories")
		response = WS.sendRequest(findTestObject('ProductCategories/004_Object_Pct_CreateCategory/CreateCategory_004_007'))
	}
	@And("Input invalid name and description in data (Body) CC7")
	def inputInvalidDescriptionCC7() {
		println("Input invalid name and description")
	}
	@Then("I receive valid HTTP response 400 CC7")
	def verifystatusCodeCC7(){
		println("I receive valid valid HTTP response 400")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}


	//	========================== @TS.CreateCategory.004.009
	//	Create Category with Valid HTTP Method, Valid API URL, and Blank Description in data (Body)
	@Given("Set valid method CC9")
	def setValidCC9() {
		println("Set method POST")
	}
	@When("Set valid API URL CC9")
	def setValidURLCC9() {
		println("Call to https://alta-shop.herokuapp.com/api/categories")
		response = WS.sendRequest(findTestObject('ProductCategories/004_Object_Pct_CreateCategory/CreateCategory_004_009'))
	}
	@And("Blank Description in data (Body)  CC9")
	def inputValidDataCC9() {
		println("Blank Description")
	}
	@Then("I receive valid HTTP response 200 CC9")
	def verifystatusCodeCC9(){
		println("I receive valid valid HTTP response 200")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}
	@And("Verify Property Name 'gamingo' CC9")
	def VerifyPropertyNameCC9() {
		println("Verify Property Name 'gamingo'")
		WS.verifyElementPropertyValue(response, 'data.Name', 'gamingo')
	}


}