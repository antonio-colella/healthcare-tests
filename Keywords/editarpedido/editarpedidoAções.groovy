package editarpedido

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

public class editarpedidoAções {

	@Keyword
	def VerificarExibiçãoStatusOrcamento(){

		WebUI.verifyElementPresent(findTestObject('EditarPedido/editarPedidoStatusOrcamento'), GlobalVariable.G_ShortTimeOut)
	}

	@Keyword
	def CompararStatusOrcamento(text){

		def Status = WebUI.getText(findTestObject('EditarPedido/editarPedidoStatusOrcamento'))
		WebUI.verifyMatch(Status, text, false)
	}

	@Keyword
	def VerificarExibiçãoNumeroPedido(){

		WebUI.verifyElementPresent(findTestObject('EditarPedido/editarPedidoStatusOrcamento'), GlobalVariable.G_ShortTimeOut)
	}

	@Keyword
	def ClicarBotãoVoltar(){

		WebUI.click(findTestObject('EditarPedido/editarPedidobtnVoltar'))
	}

	@Keyword
	def ClicarBotãoConfirmar(){

		WebUI.click(findTestObject('EditarPedido/JanelaEditarPedido/janelaEditarPedidobtnConfirmar'))
	}
	
	
}
