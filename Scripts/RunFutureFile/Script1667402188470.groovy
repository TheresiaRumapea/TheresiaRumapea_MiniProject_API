import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CucumberKW.runFeatureFile('Include/features/001_Register.feature')

CucumberKW.runFeatureFile('Include/features/003_UserInformation.feature')

CucumberKW.runFeatureFile('Include/features/002_Login.feature')

CucumberKW.runFeatureFile('Include/features/004_CreateCategory.feature')

CucumberKW.runFeatureFile('Include/features/005_CategoryByID.feature')

CucumberKW.runFeatureFile('Include/features/006_AllCategories.feature')

CucumberKW.runFeatureFile('Include/features/007_AllProducts.feature')

CucumberKW.runFeatureFile('Include/features/008_CreateNewProduct.feature')

CucumberKW.runFeatureFile('Include/features/009_ProductByID.feature')

CucumberKW.runFeatureFile('Include/features/010_DeleteProduct.feature')

CucumberKW.runFeatureFile('Include/features/011_AssignProductRating.feature')

CucumberKW.runFeatureFile('Include/features/012_ProductRatings.feature')

CucumberKW.runFeatureFile('Include/features/013_CreateComment.feature')

CucumberKW.runFeatureFile('Include/features/014_ProductComments.feature')

CucumberKW.runFeatureFile('Include/features/015_CreateOrder.feature')

CucumberKW.runFeatureFile('Include/features/016_AllOrders.feature')

CucumberKW.runFeatureFile('Include/features/017_OrderByID.feature')

