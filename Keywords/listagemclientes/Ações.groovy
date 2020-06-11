package listagemclientes

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

public class Ações {
	
	@Keyword
	def ClicarBotãoEditarCliente(){
		
		WebUI.click(findTestObject('ListagemClientes/listagemClientesbtnEditar'))
		
	}

	@Keyword
	def VerificarExibiçãoBotãoAdicionarNovoCliente(){

		WebUI.verifyElementPresent(findTestObject('ListagemClientes/listagemclientesbtnAdicionarNovoCliente'), GlobalVariable.G_ShortTimeOut)
	}

	@Keyword
	def ClicarBotãoAdicionarNovoCliente(){

		WebUI.click(findTestObject('ListagemClientes/listagemclientesbtnAdicionarNovoCliente'))
	}

	@Keyword
	def VerificarExibiçãoBotãoPesquisar(){

		WebUI.verifyElementPresent(findTestObject('ListagemClientes/listagemclientesbtnPesquisar'), GlobalVariable.G_Timeout)
	}

	@Keyword
	def PreencherCampoIdentificação(text){

		WebUI.setText(findTestObject('ListagemClientes/listagemClientescmpIdentificacao'), text)
	}

	@Keyword
	def ClicarBotoãoPesquisar(){

		WebUI.click(findTestObject('ListagemClientes/listagemClientesbtnPesquisar'))
	}

	@Keyword
	def VerificarExibiçãoCPFResultadoPesquisa(){

		def ResultadoCPF = WebUI.getText(findTestObject('ListagemClientes/listagemClientesGridIdentificacaoCPF'))
		WebUI.verifyMatch(ResultadoCPF, GlobalVariable.CPF, false)
	}

	@Keyword
	def VerificarExibiçãoResultadoGridClientes(){

		WebUI.verifyElementPresent(findTestObject('ListagemClientes/listagemClientesGridClientes'), GlobalVariable.G_Timeout)
	}


	@Keyword
	def AguardaApresentaçãoCampoIdentificação(){

		WebUI.waitForElementPresent(findTestObject('ListagemClientes/listagemClientescmpIdentificacao'), GlobalVariable.G_Timeout)
	}

	@Keyword
	def VerificarCampoidentificaçãoClicável(){

		WebUI.waitForElementClickable(findTestObject('ListagemClientes/listagemClientescmpIdentificacao'), GlobalVariable.G_Timeout)
		
	}

	@Keyword
	def Clicar3pontosRegistro(){

		WebUI.click(findTestObject('ListagemClientes/listagemclientes3pontos'))
	}
	
	@Keyword
	def ClicarBotãoEditar(){
		
		WebUI.click(findTestObject('ListagemClientes/listagemclientesbtnEditar'))
				
	}
	
	@Keyword
	def ClicarBotãoIniciarPedido(){

		WebUI.click(findTestObject('ListagemClientes/linstagemclientesbtnIniciarPedido'))
	}

	@Keyword
	def AguardarExibiçãoBotãoIniciarPedido(){

		WebUI.waitForElementPresent(findTestObject('ListagemClientes/linstagemclientesbtnIniciarPedido'), GlobalVariable.G_Timeout)
	}
}
