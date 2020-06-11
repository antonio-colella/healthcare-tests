package arealogada

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.keyword.internal.KeywordExecutor
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
	def VerificarTituloPrincipal(){

		if(WebUI.verifyElementPresent(findTestObject('AreaLogada/areaLogadaTituloPedidos'), GlobalVariable.G_Timeout)) {

			KeywordUtil.markPassed("Apresentou a tela Inicial da Pedido de Venda")
			KeywordLogger.PASSED
		} else {

			ClicarBotãoPedidos()
		}
	}

	@Keyword
	def VerificarExibiçãoBotãoAdicionarNovoPedido(){

		WebUI.verifyElementPresent(findTestObject('AreaLogada/areaLogadabtnAdicionarNovoPedido'), GlobalVariable.G_Timeout)
	}

	@Keyword
	def ClicarBotaoAdicionarNovoPedido(){

		WebUI.click(findTestObject('AreaLogada/areaLogadabtnAdicionarNovoPedido'))
	}


	@Keyword
	def ClicarIconeTOTVS(){

		WebUI.click(findTestObject('AreaLogada/areaLogadabtnTOTVS'))
	}

	@Keyword
	def VerificarExibiçãoIconeTOTVS(){

		WebUI.verifyElementPresent(findTestObject('AreaLogada/areaLogadabtnTOTVS'), GlobalVariable.G_Timeout)
	}

	@Keyword
	def AguardarExibiçãoIconeTOTVS(){

		WebUI.waitForElementPresent(findTestObject('AreaLogada/areaLogadabtnTOTVS'), GlobalVariable.G_Timeout)
	}

	@Keyword
	def VerificarExibiçãoUsuarioLogado(){

		WebUI.verifyElementPresent(findTestObject('AreaLogada/areaLogadaUsuarioLogado'), GlobalVariable.G_Timeout)
	}

	@Keyword
	def CompararUsuarioLogado(){

		def UsuarioLogado = WebUI.getText(findTestObject('AreaLogada/areaLogadaUsuarioLogado'))
		WebUI.verifyEqual(UsuarioLogado, '1')
	}


	@Keyword
	def VerificarExibiçãoLojaLogada(){

		WebUI.verifyElementPresent(findTestObject('AreaLogada/areaLogadaLojaLogada'), GlobalVariable.G_Timeout)
	}

	@Keyword
	def CompararLojaLogada(){

		def LojaLogada = WebUI.getText(findTestObject('AreaLogada/areaLogadaLojaLogada'))
		WebUI.verifyEqual(LojaLogada, 'Loja 01')
	}

	@Keyword
	def ClicarBotãoSair(){

		WebUI.click(findTestObject('AreaLogada/areaLogadabtnSair'))
	}

	@Keyword
	def VerificarExibiçãoBotãoSair(){

		WebUI.verifyElementPresent(findTestObject('AreaLogada/areaLogadabtnSair'), GlobalVariable.G_Timeout)
	}

	@Keyword
	def ClicarBotãoListagemPedido(){

		WebUI.click(findTestObject('AreaLogada/areaLogadabtnListagemPedidos'))
	}
	
	@Keyword
	def AguardaExibiçãoBotãoListagemPedido(){
		
		WebUI.waitForElementPresent(findTestObject('AreaLogada/areaLogadabtnListagemPedidos'), GlobalVariable.G_Timeout)
		
	}
	

	@Keyword
	def VerificarExibiçãoBotãoListagemPedido(){

		WebUI.verifyElementPresent(findTestObject('AreaLogada/areaLogadabtnListagemPedidos'), GlobalVariable.G_Timeout)
	}

	@Keyword
	def ClicarBotãoConfiguração(){

		if(WebUI.waitForElementAttributeValue(findTestObject('AreaLogada/areaLogadabtnConfiguracao'), 'class', 'thf-icon thf-menu-group-icon thf-icon-arrow-up', GlobalVariable.G_Timeout)) {

			WebUI.click(findTestObject('AreaLogada/areaLogadabtnConfiguracao'))
		} else {

			WebUI.click(findTestObject('AreaLogada/areaLogadabtnConfiguracao'))
		}
	}

	@Keyword
	def ClicarBotãoSincronismo(){

		WebUI.click(findTestObject('AreaLogada/areaLogadabtnSincronismo'))
	}

	@Keyword
	def AguardarExibiçãoBotãoSincronismo(){

		WebUI.waitForElementPresent(findTestObject('AreaLogada/areaLogadabtnSincronismo'), GlobalVariable.G_Timeout)
	}

	@Keyword
	def ClicarBotãoPedidos(){

		def Atributo = WebUI.waitForElementAttributeValue(findTestObject('AreaLogada/areaLogadaMenubtnPedidos'), 'class', 'thf-menu-item thf-menu-item-grouper-down', GlobalVariable.G_ShortTimeOut)

		if(Atributo == true){

			WebUI.click(findTestObject('AreaLogada/areaLogadaMenubtnPedidos'))
		} else {

			KeywordUtil.markWarning("Botão Pedido no estado normal")
		}
	}

	@Keyword
	def ClicarBotãoMenuCadastros(){

		def Atributo = WebUI.waitForElementAttributeValue(findTestObject('AreaLogada/arealogadaMenubtnCadastros'), 'class', 'thf-menu-item thf-menu-item-grouper-down', GlobalVariable.G_ShortTimeOut)
		
		  if(Atributo == true){
			  	
				WebUI.click(findTestObject('AreaLogada/arealogadaMenubtnCadastros'))
		
					} else {

						KeywordUtil.markWarning("Botão Cadastros no estado normal")
					}
	}

	@Keyword
	def AguardarExibiçãoBotãoMenuAdicionarClientes(){

		WebUI.waitForElementPresent(findTestObject('AreaLogada/arealogadaMenubtnAdicionarClientes'), GlobalVariable.G_Timeout)
	}

	@Keyword
	def ClicarBotãoMenuAdicionarClientes(){

		WebUI.click(findTestObject('AreaLogada/arealogadaMenubtnAdicionarClientes'))
	}

	@Keyword
	def CondiçãoMenuBotãoPedidos(){

		if(WebUI.verifyElementAttributeValue(findTestObject('AreaLogada/areaLogadaMenubtnPedidos'), 'class', 'thf-icon thf-menu-group-icon thf-icon-arrow-up', GlobalVariable.G_Timeout)) {

			WebUI.click(findTestObject('AreaLogada/areaLogadaMenubtnPedidos'))
		} else {

			WebUI.click(findTestObject('AreaLogada/areaLogadaMenubtnPedidos'))
		}
	}


	@Keyword
	def CondiçãoMenuCadastros(){

		if(WebUI.verifyElementAttributeValue(findTestObject('AreaLogada/arealogadaMenubtnCadastros'), 'class', 'thf-icon thf-menu-group-icon thf-icon-arrow-up', GlobalVariable.G_Timeout)) {

			WebUI.click(findTestObject('AreaLogada/arealogadaMenubtnCadastros'))
		} else {

			WebUI.click(findTestObject('AreaLogada/arealogadaMenubtnCadastros'))
		}
	}


	@Keyword
	def CondiçãoMenuConfiguração(){

		if(WebUI.verifyElementAttributeValue(findTestObject('AreaLogada/areaLogadabtnConfiguracao'), 'class', 'thf-icon thf-menu-group-icon thf-icon-arrow-up', GlobalVariable.G_Timeout)) {

			WebUI.click(findTestObject('AreaLogada/areaLogadabtnConfiguracao'))
		} else {

			WebUI.click(findTestObject('AreaLogada/areaLogadabtnConfiguracao'))
		}
	}

	@Keyword
	def ClicarBotãoListagemClientes(){

		WebUI.click(findTestObject('AreaLogada/areaLogadabtnListagemClientes'))
	}

	@Keyword
	def AguardaExibiçãoBotãoListagemClientes(){

		WebUI.waitForElementPresent(findTestObject('AreaLogada/areaLogadabtnListagemClientes'), GlobalVariable.G_Timeout)
	}
}
