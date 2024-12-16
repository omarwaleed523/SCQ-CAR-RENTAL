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
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

// Set up the first browser session
ChromeOptions options1 = new ChromeOptions()
options1.addArguments("--new-window")
WebDriver driver1 = new ChromeDriver(options1)
DriverFactory.changeWebDriver(driver1) // Set Katalon to use driver1
driver1.get('http://localhost:3000')

// Log in as the first user
WebUI.click(findTestObject('Object Repository/Page_React App/p_LoginSignup'))
WebUI.setText(findTestObject('Object Repository/Page_React App/input_Login_login_email'), 'mohammedmsg@hotmail.com')
WebUI.setEncryptedText(findTestObject('Object Repository/Page_React App/input_Login_login_password'), 'bWwU7ycMudFLTyo9VBDQQg==')
WebUI.click(findTestObject('Object Repository/Page_React App/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_React App/a_Messages'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Page_React App/div_khaledmsgkhaledmsghotmail.com'))
WebUI.delay(2)

// Set up the second browser session
ChromeOptions options2 = new ChromeOptions()
options2.addArguments("--new-window")
WebDriver driver2 = new ChromeDriver(options2)
DriverFactory.changeWebDriver(driver2) // Set Katalon to use driver2
driver2.get('http://localhost:3000')

// Log in as the second user
WebUI.click(findTestObject('Object Repository/Page_React App/p_LoginSignup'))
WebUI.setText(findTestObject('Object Repository/Page_React App/input_Login_login_email'), 'khaledmsg@hotmail.com')
WebUI.setEncryptedText(findTestObject('Object Repository/Page_React App/input_Login_login_password'), 'bWwU7ycMudFLTyo9VBDQQg==')
WebUI.click(findTestObject('Object Repository/Page_React App/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_React App/a_Messages'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Page_React App/div_mohammedmsgmohammedmsghotmail.com'))
WebUI.delay(2)

//first user sending
DriverFactory.changeWebDriver(driver1)
WebUI.click(findTestObject('Object Repository/Page_React App/input_hello from testing_inputsendmessage'))
WebUI.setText(findTestObject('Object Repository/Page_React App/input_hello from testing_inputsendmessage'), 'hello from test')
WebUI.click(findTestObject('Page_React App/button_hello from testing_buttonsendmessage'))
WebUI.delay(3)

// Clean up by closing both browsers
driver1.quit()
driver2.quit()