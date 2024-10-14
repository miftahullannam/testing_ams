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

Random random = new Random()

int randomNumber = random.nextInt(10000 // Menghasilkan angka acak antara 0 dan 9999
    )

String randomString = 'edit program audit' + randomNumber

WebUI.click(findTestObject('manajement bukti/tambah manajement bukti/left_menu'))

TestObject editButton = findTestObject('Object Repository/EditButtonInFirstRow')

WebUI.click(findTestObject('manajement bukti/edit manajement bukti/icon_edit'))

WebUI.setText(findTestObject('manajement bukti/tambah manajement bukti/program_audit'), 'edit program audit ' + randomNumber)

WebUI.click(findTestObject('manajement bukti/tambah manajement bukti/button_simpan'))

WebUI.setText(findTestObject('manajement bukti/tambah manajement bukti/pencarian_bukti'), 'edit program audit ' + randomNumber)

WebUI.verifyElementVisible(findTestObject('manajement bukti/edit manajement bukti/verify_program_audit'))

WebUI.takeScreenshot()

WebUI.closeBrowser()

