package cartaConsentimento

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Ações {

	@Keyword
	def AguardarBotãoCancelar(){

		WebUI.waitForElementPresent(findTestObject('CartaConsentimento/btnCancelar'), GlobalVariable.G_Timeout)
	}

	@Keyword
	def ClicarBotãoCancelar(){

		WebUI.click(findTestObject('CartaConsentimento/btnCancelar'))
	}

	@Keyword
	def VerificarExibiçãoJanelaCartaConsentimento(){

		WebUI.verifyElementPresent(findTestObject('CartaConsentimento/janelaCartaConsentimento'), GlobalVariable.G_Timeout)
	}
	
	@Keyword
	def VerificarNaõExebiçãoJanelaCartaConsentimento(){
		
		WebUI.verifyElementNotPresent(findTestObject('CartaConsentimento/janelaCartaConsentimento'), GlobalVariable.G_Timeout)
		
	}
	
	
	
	@Keyword
	def VerificarExibiçãoTextoCartaConsentimento(){
		
		WebUI.verifyElementPresent(findTestObject('CartaConsentimento/cartaConsentimento'), GlobalVariable.G_Timeout)
				
	}
	
	@Keyword
	def AguardaExibiçãoTextoCartaConsentimento(){
		
		WebUI.waitForElementPresent(findTestObject('CartaConsentimento/cartaConsentimento'), GlobalVariable.G_Timeout)
		
	}
	
	

	@Keyword
	def ClicarBotãoSwitch(){

		WebUI.click(findTestObject('CartaConsentimento/btnSwitch'))
	}
	
	@Keyword
	def DuploCliqueBotãoSwitch(){

		WebUI.doubleClick(findTestObject('CartaConsentimento/btnSwitch'))
	}

	@Keyword
	def VerificarTextoAceito(text){

		def Aceito = WebUI.getText(findTestObject('CartaConsentimento/TextoNãoAceito'))
		if(Aceito == text){

			KeywordUtil.markPassed("Passou: Apresentou o texto " + Aceito + " correto.")
			KeywordLogger.PASSED
		} else{

			KeywordUtil.markFailed("Falhou: Não Apresentou o texto esperado " + text + ". Apresentou o texto atual como " + Aceito + ".")
			KeywordLogger.FAILED
		}
	}

	@Keyword
	def ClicarBotãoConfirmar(){

		WebUI.click(findTestObject('CartaConsentimento/btnConfirmar'))
	}
	
	@Keyword
	def VerificarBotãoConfirmarDesabilitado(){

		def teste = WebUI.getAttribute(findTestObject('CartaConsentimento/btnConfirmar'), 'ng-reflect-disabled')
		System.out.println(teste)
				
		if(teste != false){

			KeywordUtil.markPassed("Passou: Apresentou o botão confirmar desabilitado")
			KeywordLogger.PASSED
			
		} else{

			KeywordUtil.markFailed("Falhou: Não Apresentou o botão confirmar desabilitado")
			KeywordLogger.FAILED
		}
		
	}
	
	
}
