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
import java.util.Random as Random

WebUI.click(findTestObject('manajement bukti/tambah manajement bukti/left_menu'))

WebUI.click(findTestObject('manajement bukti/tambah manajement bukti/button_tambah'))

WebUI.selectOptionByLabel(findTestObject('manajement bukti/tambah manajement bukti/tipe_audit'), 'Operasional', false)

WebUI.setText(findTestObject('manajement bukti/tambah manajement bukti/judul_kegiatan'), judul_kegiatan)

WebUI.setText(findTestObject('manajement bukti/tambah manajement bukti/judul_ewp'), judul_ewp)

WebUI.setText(findTestObject('manajement bukti/tambah manajement bukti/program_audit'), program_audit)

WebUI.setText(findTestObject('manajement bukti/tambah manajement bukti/tanggal_bukti'), tgl_bukti)

WebUI.setText(findTestObject('manajement bukti/tambah manajement bukti/deskripsi_bukti'), deskripsi_bukti)

WebUI.sendKeys(findTestObject(null), 'ENTER')

WebUI.uploadFile(findTestObject('manajement bukti/tambah manajement bukti/upload_bukti'), upload)

WebUI.delay(5)

WebUI.click(findTestObject('manajement bukti/tambah manajement bukti/button_simpan'))

WebUI.takeScreenshot()

