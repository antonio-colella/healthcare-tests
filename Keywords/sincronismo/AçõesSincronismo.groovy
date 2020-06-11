package sincronismo
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class AçõesSincronismo {
	
	@Keyword
	def VerificarExibiçãoBotãoSincronizarTodos(){
		
		WebUI.verifyElementPresent(findTestObject('Sincronismo/sincronismobtnSincronizarTodos'), GlobalVariable.G_ShortTimeOut)
			
	}
	
	@Keyword
	def ClicarBotãoSincronizarTodos(){
		
		WebUI.click(findTestObject('Sincronismo/sincronismobtnSincronizarTodos'))
		
 	}
	
	@Keyword
	def VerificarExibiçãoStatusModalidade(){
		
		WebUI.verifyElementPresent(findTestObject('Sincronismo/sincronismoCampoModalidadeStatus'), GlobalVariable.G_ShortTimeOut)
		
	}
	
	@Keyword
	def CompararStatusSincronizadoCampoModalidade(text) {
	
		def StatusModalidade = WebUI.getText(findTestObject('Sincronismo/sincronismoCampoModalidadeStatus'))
		WebUI.verifyMatch(StatusModalidade, text, false)
		
	}
	
	@Keyword
	def VerificarExibiçãoStatusCanaisDeVenda(){
		
		WebUI.verifyElementPresent(findTestObject('Sincronismo/sincronismoCampoCanaisDeVendaStatus'), GlobalVariable.G_ShortTimeOut)
				
	}
	
	@Keyword
	def CompararStatusSincronizadoCampoCanaisDeVenda(text) {
	
		def StatusCanaisVenda = WebUI.getText(findTestObject('Sincronismo/sincronismoCampoCanaisDeVendaStatus'))
		WebUI.verifyMatch(StatusCanaisVenda, text, false)
		
	}
	
	
	@Keyword
	def VerificarExibiçãoStatusParametros(){
		
		WebUI.verifyElementPresent(findTestObject('Sincronismo/sincronismoCampoParametrosStatus'), GlobalVariable.G_ShortTimeOut)
				
	}
	
	@Keyword
	def CompararStatusSincronizadoCampoParametros(text) {
	
		def StatusParametros = WebUI.getText(findTestObject('Sincronismo/sincronismoCampoParametrosStatus'))
		WebUI.verifyMatch(StatusParametros, text, false)
		
	}

	@Keyword
	def VerificarExibiçãoStatusClassificadores(){
		
		WebUI.verifyElementPresent(findTestObject('Sincronismo/sincronismoCampoClassificadoresStatus'), GlobalVariable.G_ShortTimeOut)
				
	}
	
	@Keyword
	def CompararStatusSincronizadoCampoClassificadores(text) {
	
		def StatusClassificadores = WebUI.getText(findTestObject('Sincronismo/sincronismoCampoClassificadoresStatus'))
		WebUI.verifyMatch(StatusClassificadores, text, false)
		
		
	}
	
	
	
	
}
