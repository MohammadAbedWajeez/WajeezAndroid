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

//Mobile.tap(findTestObject('LogInScreen/LogInEmailField'), 0)

//Mobile.tap(findTestObject('LogInScreen/LogInPWField'), 0)
//
//InvalidEmail = Mobile.getText(findTestObject('LogInScreen/LogInEmailRequiredField'), 0)
//
//Mobile.verifyEqual(InvalidEmail, 'هذا الحقل مطلوب')

//Mobile.tap(findTestObject('LogInScreen/LogInLogInTab'), 0)
Mobile.tap(findTestObject('LogInScreen/LogInEmailField'), 0)
Mobile.setText(findTestObject('LogInScreen/LogInEmailField'), GlobalVariable.InvalidEmail, 0)
//Mobile.setText(findTestObject('LogInScreen/LogInEmailField'), " ", 0)
//Mobile.clearText(findTestObject('LogInScreen/LogInEmailField'), 0)
Mobile.tap(findTestObject('LogInScreen/LogInPWField'), 0)
Mobile.setText(findTestObject('LogInScreen/LogInPWField'), '12345678', 0)

InvalidEmail2 = Mobile.getText(findTestObject('LogInScreen/LogInScWrongEmailType'), 0)

Mobile.verifyEqual(InvalidEmail2, 'يرجى إدخال صيغة بريد إلكتروني صحيحة')

//Mobile.tap(findTestObject('LogInScreen/LogInLogInTab'), 0)
//Mobile.tap(findTestObject('WelcomeScreen/WlcScLogInButton'), 0)

//Mobile.setText(findTestObject('LogInScreen/LogInEmailField'), 'wajeeztest@gmail.com', 0)
//
//Mobile.clearText(findTestObject('LogInScreen/LogInPWField'), 0)
//Mobile.setText(findTestObject('LogInScreen/LogInPWField'), '12345678', 0)
//
//Mobile.tap(findTestObject('LogInScreen/LogInNextButton'), 0)

//NotExistEmail = Mobile.getText(findTestObject('LogInScreen/ErrorMsgEmailPwNotcorrect'), 0)
//
//Mobile.verifyEqual(NotExistEmail, 'عذراً، البريد الإلكتروني أو كلمة المرور غير صحيحة')



