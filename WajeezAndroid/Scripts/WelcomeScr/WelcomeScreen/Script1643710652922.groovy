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
import static org.assertj.core.api.Assertions.*

Mobile.startApplication('C:\\Users\\DELL\\git\\WajeezAndroid\\WajeezAndroid\\app-gms-developmentDebug.apk', true)

Mobile.verifyElementExist(findTestObject('WelcomeScreen/محتوى غني في دقائق'), 0)

Mobile.verifyElementExist(findTestObject('WelcomeScreen/تسجيل الدخول'), 0)

//Mobile.verifyElementExist(findTestObject('WelcomeScreen/BackIcon'), 0)
Mobile.checkElement(findTestObject('WelcomeScreen/تخطى التسجيل'), 0)

def CreateAccount = Mobile.getText(findTestObject('WelcomeScreen/إنشاء حساب'), 0)


assertThat(CreateAccount).isEqualTo('إنشاء حساب')

Mobile.checkElement(findTestObject('WelcomeScreen/إنشاء حساب'), 0)

Mobile.verifyElementExist(findTestObject('WelcomeScreen/NavigationUnderImageHomePage'), 0)

Mobile.closeApplication()

