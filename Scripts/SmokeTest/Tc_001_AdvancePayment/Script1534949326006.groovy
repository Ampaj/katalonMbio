import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dcp-int.mercedes-benz.com/de-de/collection/')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('HomePage/Page_Mercedes-Benz Shop - Mode Acce/AcceptCookiesButton'))

WebUI.delay(5)

WebUI.click(findTestObject('HomePage/Page_Mercedes-Benz Shop - Mode Acce/ClickonSearch'))

WebUI.delay(5)

WebUI.setText(findTestObject('HomePage/Page_Mercedes-Benz Shop - Mode Acce/input_searchTerm'), 'cap')

WebUI.click(findTestObject('HomePage/Page_Mercedes-Benz Shop - Mode Acce/a_Cap'))

WebUI.click(findTestObject('HomePage/Page_Cap/span_Zu Merkzettel hinzufgen'))

WebUI.click(findTestObject('HomePage/Page_Cap/a_.st0fill333333        Weiter'))

WebUI.scrollToPosition(195, 477)

WebUI.delay(7)

WebUI.click(findTestObject('HomePage/Page_Merkzettel/AddToCart'))

WebUI.delay(3)

WebUI.click(findTestObject('HomePage/Page_Merkzettel/GoToCard'))

WebUI.waitForPageLoad(3)

WebUI.setText(findTestObject('HomePage/Page_Merkzettel/EnterVoucherCode'), 'GUTSCHEIN1')

WebUI.click(findTestObject('HomePage/Page_Merkzettel/VoucherCodeSubmit'))

WebUI.delay(3)

WebUI.click(findTestObject('HomePage/Page_Merkzettel/NavigateTo Adress'))

WebUI.sendKeys(findTestObject('HomePage/Page_Merkzettel/EnterEmailAddress'), 'Test@gmail.com')

WebUI.verifyElementClickable(findTestObject('HomePage/Page_Merkzettel/ClickOnOrderAsGuest'))

WebUI.click(findTestObject('HomePage/Page_Merkzettel/ClickOnOrderAsGuest'))

WebUI.verifyTextPresent('Adresse und Lieferung', false)

WebUI.scrollToPosition(1312, 227)

WebUI.click(findTestObject('HomePage/AddressAndDelivery/Salutation(Mr)'))

WebUI.sendKeys(findTestObject('HomePage/AddressAndDelivery/FirstName'), 'Test')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('HomePage/AddressAndDelivery/LastName'), '123')

WebUI.sendKeys(findTestObject('HomePage/AddressAndDelivery/Street'), 'Karlstreet')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('HomePage/AddressAndDelivery/StreetNumber'), '10')

WebUI.setText(findTestObject('HomePage/AddressAndDelivery/PostalCode'), '60327')

WebUI.setText(findTestObject('HomePage/AddressAndDelivery/Town'), 'Frankfurt')

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('HomePage/AddressAndDelivery/ContinueToPaymentButton'))

WebUI.click(findTestObject('HomePage/AddressAndDelivery/ContinueToPaymentButton'))

WebUI.click(findTestObject('HomePage/PaymentMethodPage/AdvancePaymentRadioButton'))

WebUI.verifyElementClickable(findTestObject('HomePage/PaymentMethodPage/ContinueCheckOut'))

WebUI.delay(2)

WebUI.click(findTestObject('HomePage/PaymentMethodPage/ContinueCheckOut'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('HomePage/CheckAndExecuteOrderPage/AgreeTC'))

WebUI.delay(5)

not_run: WebUI.waitForElementClickable(findTestObject('HomePage/CheckAndExecuteOrderPage/FinalOrderConfirm'), 5)

WebUI.click(findTestObject('HomePage/CheckAndExecuteOrderPage/FinalOrderConfirm'))

WebUI.waitForPageLoad(4)

String path = WebUI.takeScreenshot()

WebUI.takeScreenshot('C:\\Users\\ampajaru\\Documents\\screenshot.png')

WebUI.closeBrowser()

