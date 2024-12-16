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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.click(findTestObject('Object Repository/Page_React App/p_LoginSignup'))

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Login_login_email'), 'mohammed@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_React App/input_Login_login_password'), 'bWwU7ycMudFLTyo9VBDQQg==')

WebUI.sendKeys(findTestObject('Object Repository/Page_React App/input_Login_login_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_React App/a_Rent'))

WebUI.click(findTestObject('Object Repository/Page_React App/img'))

WebUI.click(findTestObject('Object Repository/Page_React App/li_Profile'))

WebUI.click(findTestObject('Object Repository/Page_React App/p_Edit'))

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Car Name_carName'), 'porsche ')

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Number of Doors_numberDoors'), '4')

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Price_price'), '800')

WebUI.click(findTestObject('Object Repository/Page_React App/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_React App/p_Close'))

WebUI.closeBrowser()

