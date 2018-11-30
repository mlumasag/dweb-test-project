import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://hqappqa08.external.decore.com/')

WebUI.click(findTestObject('Page_/a_LOGIN'))

WebUI.setText(findTestObject('Page_Login/input_Email Address_Email'), 'jpoon@decore.com')

WebUI.setEncryptedText(findTestObject('Page_Login/input_Password_Password'), 'qoj9ixPeOmWkDAUexxLN8A==')

WebUI.click(findTestObject('Page_Login/input_Remember me_button next'))

WebUI.mouseOver(findTestObject('Page_/a_Customer Service'))

WebUI.setText(findTestObject('Page_/input_Change Customer_customer'), 'coomo1')

WebUI.waitForElementClickable(findTestObject('Page_/a_COOMO1'), 5)

WebUI.click(findTestObject('Page_/ul_COOMO1'), FailureHandling.STOP_ON_FAILURE)

