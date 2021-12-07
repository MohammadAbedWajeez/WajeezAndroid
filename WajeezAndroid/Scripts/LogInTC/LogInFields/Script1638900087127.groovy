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

Mobile.startApplication('C:\\Users\\DELL\\git\\WajeezAndroid\\WajeezAndroid\\260-1.apk', true)

Mobile.tap(findTestObject('Object Repository/LogInScreen/android.widget.Button -'), 0)

def LogInHeader = Mobile.getText(findTestObject('LogInScreen/تسجيل الدخول'), 0)

Mobile.verifyEqual(LogInHeader, 'تسجيل الدخول')

Mobile.verifyElementAttributeValue(findTestObject('LogInScreen/تسجيل الدخول'), 'class', 'android.widget.TextView', 0)

Mobile.getText(findTestObject('LogInScreen/البريد الإلكتروني'), 0)

Mobile.getText(findTestObject('LogInScreen/كلمة المرور'), 0)

Mobile.getText(findTestObject('LogInScreen/ShowPassword'), 0)

Mobile.getText(findTestObject('LogInScreen/الدخول إلى حسابي'), 0)

Mobile.getText(findTestObject('LogInScreen/هل نسيت كلمة المرور'), 0)

Mobile.getText(findTestObject('LogInScreen/الدخول من خلال جوجل'), 0)

Mobile.getText(findTestObject('LogInScreen/الدخول من خلال فيسبوك'), 0)

Mobile.getText(findTestObject('LogInScreen/الدخول من خلال توتير'), 0)

Mobile.tap(findTestObject('Object Repository/LogInScreen/android.widget.ImageView'), 0)

Mobile.closeApplication()

