package listagempedidos

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.awt.KeyboardFocusManager
import java.awt.RenderingHints.Key

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardHomeHandler

import com.google.common.collect.FilteredEntryMultimap.Keys
import com.google.common.collect.Multimaps.Keys.KeysEntrySet
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.builtin.SendKeysKeyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.sun.jna.platform.KeyboardUtils
import com.thoughtworks.selenium.webdriven.commands.KeyPressNative

import internal.GlobalVariable

public class Ações {


	@Keyword
	def VerificarExibiçãoBotãoPesquisar(){

		WebUI.verifyElementPresent(findTestObject('ListagemPedidos/listagemPedidobtnPesquisar'), GlobalVariable.G_ShortTimeOut)
	}

	@Keyword
	def VerificarExibiçãoColunaID(){

		WebUI.verifyElementPresent(findTestObject('ListagemPedidos/listagemPedidoColunaID'), GlobalVariable.G_Timeout)
	}

	@Keyword
	def VerificarExibiçãoColunaCliente(){

		WebUI.verifyElementPresent(findTestObject('ListagemPedidos/listagemPedidoColunaCliente'), GlobalVariable.G_Timeout)
	}

	@Keyword
	def VerificarExibiçãoColunaDatadoPedido(){

		WebUI.verifyElementPresent(findTestObject('ListagemPedidos/listagemPedidoColunaDatadoPedido'), GlobalVariable.G_ShortTimeOut)
	}

	@Keyword
	def VerificarExibiçãoColunaStatusAtual(){

		WebUI.verifyElementPresent(findTestObject('ListagemPedidos/listagemPedidoColunaStatusAtual'), GlobalVariable.G_ShortTimeOut)
	}

	@Keyword
	def SelecionarStatusPedido(text){

		WebUI.selectOptionByLabel(findTestObject('ListagemPedidos/listagemPedidoStatusPedido'), text, false)
	}

	@Keyword
	def ClicarCampoPeriodoDE(){

		WebUI.click(findTestObject('ListagemPedidos/listagemPedidocmdPeriodoDe'))
	}

	@Keyword
	def LimparCampoPeriodoDE(){

		WebUI.clearText(findTestObject('ListagemPedidos/listagemPedidocmdPeriodoDe'))
	}


	@Keyword
	def DigitarCampoPeriodoDE(text){

		WebUI.setText(findTestObject('ListagemPedidos/listagemPedidocmdPeriodoDe'), text)
	}


	@Keyword
	def ClicarCampoNumeroPedido(){

		WebUI.click(findTestObject('ListagemPedidos/listagemPedidocmdNumeroPedido'))
	}

	@Keyword
	def DigitarCampoNumeroPedido(text){

		WebUI.setText(findTestObject('ListagemPedidos/listagemPedidocmdNumeroPedido'), text)
	}

	@Keyword
	def ClicarBotãoPesquisar(){

		WebUI.click(findTestObject('Object Repository/ListagemPedidos/listagemPedidobtnPesquisar'))
	}

	@Keyword
	def VerificarResultadoGeralPedidosConsultados(){

		WebUI.verifyElementPresent(findTestObject('ListagemPedidos/listagemPedidoResultadoGeral'), GlobalVariable.G_ShortTimeOut)
	}

	@Keyword
	def VerificarTítuloTOTVS(){


		WebUI.verifyElementPresent(findTestObject('ListagemPedidos/JanelaData/listagemPedidosJanelaTituloTOTVS'), GlobalVariable.G_ShortTimeOut)
	}

	@Keyword
	def VerificarExibiçãoMensagemRegraData(){

		def MensagemData = WebUI.getText(findTestObject('ListagemPedidos/JanelaData/listagemPedidosJanelaMensagemData'))
		WebUI.verifyMatch(MensagemData, 'A data Inicial deve ser superior a data final.', false)
	}

	@Keyword
	def ClicarBotãoOK(){

		WebUI.click(findTestObject('ListagemPedidos/JanelaData/listagemPedidosJanelabtnOK'))
	}

	@Keyword
	def VerificarExibiçãoJanelaData(){

		WebUI.verifyElementPresent(findTestObject('ListagemPedidos/JanelaData/listagemPedidosJanelaData'), GlobalVariable.G_ShortTimeOut)
	}

	@Keyword
	def VerificarExibiçãoNumeroPedido(){

		WebUI.verifyElementPresent(findTestObject('ListagemPedidos/listagemPedidoResultadoNumeroPedido'), GlobalVariable.G_ShortTimeOut)
	}
	
	@Keyword
	def VerificarExibiçãoGridNumeroPedido(){
		
		WebUI.verifyElementPresent(findTestObject('ListagemPedidos/listagemPedidoResultadoNumeroPedido'), GlobalVariable.G_ShortTimeOut)
				
	}


	@Keyword
	def CompararExibiçãoNumeroPedido(text){

		def NumPedido = WebUI.getText(findTestObject('ListagemPedidos/listagemPedidoResultadoNumeroPedido'))
		WebUI.verifyMatch(NumPedido, text, false)
	}


	@Keyword
	def LimparCampoCliente(){

		WebUI.clearText(findTestObject('ListagemPedidos/listagemPedidocmdCliente'))
	}


	@Keyword
	def DigitarlCampoCliente(text){

		WebUI.setText(findTestObject('ListagemPedidos/listagemPedidocmdCliente'), text)
	}

	@Keyword
	def ClicarlCampoCliente(){

		WebUI.click(findTestObject('ListagemPedidos/listagemPedidocmdCliente'))
	}

	@Keyword
	def VerificarExibiçãoNomeCliente(){

		WebUI.verifyElementPresent(findTestObject('ListagemPedidos/listagemPedidoResultadoNomeCliente'), GlobalVariable.G_ShortTimeOut)
	}

	@Keyword
	def CompararExibiçãoNomeCliente(text){

		def NomeCliente = WebUI.getText(findTestObject('ListagemPedidos/listagemPedidoResultadoNomeCliente'))
		WebUI.verifyMatch(NomeCliente, text, false)
	}

	@Keyword
	def AguardarExibicaoClienteAdao(){

		WebUI.waitForElementPresent(findTestObject('ListagemPedidos/listagemPedidoRetornoNomeCliente'), GlobalVariable.G_Timeout)
	}

	@Keyword
	def SelecionarClienteAdao(){

		WebUI.click(findTestObject('ListagemPedidos/listagemPedidoRetornoNomeCliente'))
	}

	@Keyword
	def LimparCampoPedido(){

		WebUI.clearText(findTestObject('ListagemPedidos/listagemPedidocmdNumeroPedido'))
	}

	@Keyword
	def RolarAtéBtnCarregarMaisResultado(){

		WebUI.scrollToElement(findTestObject('ListagemPedidos/listagemPedidobtnCarregarMaisResultados'), GlobalVariable.G_ShortTimeOut)
	}

	@Keyword
	def VerificarHabilitadobtnCarregarMaisResultado(){

		WebUI.verifyElementClickable(findTestObject('ListagemPedidos/listagemPedidobtnCarregarMaisResultados'), GlobalVariable.G_ShortTimeOut)
	}

	@Keyword
	def ClicarbtnCarregarMaisResultado(){

		WebUI.click(findTestObject('ListagemPedidos/listagemPedidobtnCarregarMaisResultados'))
	}

	@Keyword
	def VerificarExibiçãobtnCarregarMaisResultado(){

		WebUI.verifyElementPresent(findTestObject('ListagemPedidos/listagemPedidobtnCarregarMaisResultados'), GlobalVariable.G_ShortTimeOut)
	}

	@Keyword
	def ClicarBotão3PontosOrçamento(){

		WebUI.click(findTestObject('ListagemPedidos/listagemPedidobtn3PontosOrcamento'))
	}

	@Keyword
	def ClicarBotãoEditarPedido(){

		WebUI.click(findTestObject('ListagemPedidos/listagemPedidobtnEditarPedido'))
	}

	@Keyword
	def VerificarBotãoEditarPedidoDesabilitado(){

		def Desabilitado = WebUI.getAttribute(findTestObject('ListagemPedidos/listagemPedidobtnEditarPedido'), 'class')
		WebUI.verifyMatch(Desabilitado, 'thf-popup-item-default thf-popup-item-disabled', false)
	}

	@Keyword
	def CompararMensagemDataInválida(text){

		def MensagemInvalida = WebUI.getText(findTestObject('ListagemPedidos/JanelaData/listagemPedidosJanelaMensagemDataInvalida'))
		WebUI.verifyMatch(MensagemInvalida, text, false)
	}

	@Keyword
	def DigitarCampoPeriodoATE(text){

		WebUI.setText(findTestObject('ListagemPedidos/listagemPedidocmdPeriodoAte'), text)
	}

	@Keyword
	def LimparCampoPeriodoATE(){

		WebUI.clearText(findTestObject('ListagemPedidos/listagemPedidocmdPeriodoAte'))
	}

	@Keyword
	def ClicarIconeCalendário(){

		WebUI.click(findTestObject('ListagemPedidos/listagemPedidobtnCalendario'))
	}

	@Keyword
	def ClicarMêsFevereiro(){

		WebUI.click(findTestObject('ListagemPedidos/listagempedidoMesFevereiro'))
	}

	@Keyword
	def ClicarSetaEsquerdaAno(){

		WebUI.click(findTestObject('ListagemPedidos/listagemPedidoCalendarioSetaEsquerdaAno'))
	}

	@Keyword
	def ClicarMêsJaneiro(){

		WebUI.click(findTestObject('ListagemPedidos/listagemPedidoMesJaneiro'))
	}

	@Keyword
	def ClicarDia1Janeiro(){

		WebUI.click(findTestObject('ListagemPedidos/listagemPedidoCalendarioDia1Janeiro'))
	}

	@Keyword
	def GravarNumeroPedido(){

		def NumeroPedido = WebUI.getText(findTestObject('ListagemPedidos/listagemPedidosRetornoNumeroPedido'))
		GlobalVariable.NumeroPedido = NumeroPedido
		System.out.println(GlobalVariable.NumeroPedido)
	}

	@Keyword
	def CompararStatusAbertoPedido(){

		def StatusPedido = WebUI.getText(findTestObject('ListagemPedidos/listagemPedidoResultadoStatusPedido'))
		GlobalVariable.StatusPedido = StatusPedido
		System.out.println(GlobalVariable.StatusPedido)
		WebUI.verifyMatch(StatusPedido, 'Aberto', false)
	}

	@Keyword
	def VerificarExibiçãoStatusPedido(){

		WebUI.waitForElementPresent(findTestObject('ListagemPedidos/listagemPedidoResultadoStatusPedido'), GlobalVariable.G_Timeout)
	}

	@Keyword
	def AguardaExibiçãoCliente(){

		WebUI.waitForElementPresent(findTestObject('ListagemPedidos/listagemPedidoRetornoNomeCliente'), GlobalVariable.G_Timeout)
	}

	@Keyword
	def SelecionarRetornoCliente(){

		WebUI.click(findTestObject('ListagemPedidos/listagemPedidoRetornoNomeCliente'))
	}
}
