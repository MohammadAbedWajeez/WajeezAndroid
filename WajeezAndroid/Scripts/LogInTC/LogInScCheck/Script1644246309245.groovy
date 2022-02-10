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

Mobile.startApplication('C:\\Users\\DELL\\git\\WajeezAndroid\\WajeezAndroid\\app-gms-developmentDebug.apk', true)

Mobile.tap(findTestObject('WelcomeScreen/WlcScLogInButton'), 0)
Mobile.verifyElementExist(findTestObject('LogInScreen/LogInWajeezLogo'), 0)
Mobile.verifyElementExist(findTestObject('LogInScreen/LogInCreatAccountTab'), 0)
Mobile.verifyElementExist(findTestObject('LogInScreen/LogInLogInTab'), 0)
Mobile.verifyElementExist(findTestObject('LogInScreen/LogInEmailField'), 0)
Mobile.verifyElementExist(findTestObject('LogInScreen/LogInPWField'), 0)
Mobile.verifyElementExist(findTestObject('LogInScreen/LogInNextButton'), 0)
Mobile.verifyElementExist(findTestObject('LogInScreen/LogInForgetPwLink'), 0)
Mobile.verifyElementExist(findTestObject('LogInScreen/LoginNoAccountCreateAccountLink'), 0)
Mobile.verifyElementExist(findTestObject('LogInScreen/LogInFacebookLogIn'), 0)
Mobile.verifyElementExist(findTestObject('LogInScreen/LogInGoogleLogin'), 0)
Mobile.verifyElementExist(findTestObject('LogInScreen/LogInTwitterLogIn'), 0)
Mobile.verifyElementExist(findTestObject('LogInScreen/LogInPrivacyPolicyLink'), 0)
Mobile.verifyElementExist(findTestObject('LogInScreen/LogInPWField'), 0)


Mobile.closeApplication()
