package cadastrarpedidos


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
	def VerificarExibiçãoTituloPedidos(){

		WebUI.verifyElementPresent(findTestObject('CadastrarPedidos/pedidosTituloPedidos'), GlobalVariable.G_ShortTimeOut)
	}

	@Keyword
	def SelecionarCanaldeVenda(text){

		WebUI.selectOptionByLabel(findTestObject('CadastrarPedidos/pedidoscmpCanaldeVenda'), text, false)
	}

	@Keyword
	def SelecionarModalidade(text){

		WebUI.selectOptionByLabel(findTestObject('CadastrarPedidos/pedidoscmpModalidade'), text, false)
	}

	@Keyword
	def DigitarCampoVendedor(text){

		WebUI.setText(findTestObject('CadastrarPedidos/pedidoscmpVendedor'), text)
	}

	@Keyword
	def DigitarCampoCliente(text){

		WebUI.setText(findTestObject('CadastrarPedidos/pedidoscmpCliente'), text)
	}


	@Keyword
	def DigitarCampoProduto(text){

		WebUI.setText(findTestObject('CadastrarPedidos/pedidoscmpDescricaoProduto'), text)
	}


	@Keyword
	def AguardarExibicaoVendedorAlive(){

		WebUI.waitForElementPresent(findTestObject('CadastrarPedidos/pedidoValorVendedor_ALINE VILLAR DO AMARAL'), GlobalVariable.G_Timeout)
	}

	@Keyword
	def AguardarExibicaoClienteAdao(){

		WebUI.waitForElementPresent(findTestObject('CadastrarPedidos/pedidosValorCliente_ADAO GUEDES MULINANI'), GlobalVariable.G_Timeout)
	}

	@Keyword
	def AguardarExibicaoProdutoPREUROMIX167INC(){

		WebUI.waitForElementPresent(findTestObject('CadastrarPedidos/pedidosValorProduto_PR EUROMIX EXCELLENCE 167 INC AZURI SURF'), GlobalVariable.G_Timeout)
	}


	@Keyword
	def SelecionarVendedorAlive(){

		WebUI.click(findTestObject('CadastrarPedidos/pedidoValorVendedor_ALINE VILLAR DO AMARAL'))
	}


	@Keyword
	def SelecionarClienteAdao(){

		WebUI.click(findTestObject('CadastrarPedidos/pedidosValorCliente_ADAO GUEDES MULINANI'))
	}

	@Keyword
	def SelecionarProdutoPREUROMIX167INC(){

		WebUI.click(findTestObject('CadastrarPedidos/pedidosValorProduto_PR EUROMIX EXCELLENCE 167 INC AZURI SURF'))
	}


	@Keyword
	def ClicarCampoVendedor(){

		WebUI.click(findTestObject('CadastrarPedidos/pedidoscmpVendedor'))
	}

	@Keyword
	def ClicarCampoCliente(){

		WebUI.click(findTestObject('CadastrarPedidos/pedidoscmpCliente'))
	}

	@Keyword
	def ClicarCampoProduto(){

		WebUI.click(findTestObject('CadastrarPedidos/pedidoscmpDescricaoProduto'))
	}


	@Keyword
	def PegarValorPrecoProduto(){

		def PrecoUnitarioProduto = WebUI.getText(findTestObject('CadastrarPedidos/pedidosLabelValorTotalProduto'))
		System.out.println(PrecoUnitarioProduto);
	}

	@Keyword
	def ValidarValorTotalProduto(){

		def PrecoUnitarioProduto = WebUI.getText(findTestObject('CadastrarPedidos/pedidosLabelValorTotalProduto'))
		WebUI.verifyMatch(PrecoUnitarioProduto, 'TOTAL: 788.50', false)
	}


	@Keyword
	def ClicarBotãoAdicionar(){

		WebUI.click(findTestObject('CadastrarPedidos/pedidosbtnAdicionar'))
	}

	@Keyword
	def ValidarCodigoPadrao(){

		def CodigoPadrao = WebUI.getText(findTestObject('CadastrarPedidos/pedidosLabelCodigoPadrao'))
		WebUI.verifyMatch(CodigoPadrao, 'Código Padrão:', false)
	}

	@Keyword
	def ValidarValorCodigoProduto(){


		def ValorCodigoPadrao = WebUI.getText(findTestObject('CadastrarPedidos/pedidosValorCodigoPadrao_9901284'))
		WebUI.verifyMatch(ValorCodigoPadrao, '9901284', false)
	}



	@Keyword
	def ValidarDescricaoProduto(){

		def DescricaoProduto = WebUI.getText(findTestObject('CadastrarPedidos/pedidosLabelDescricaoProduto2'))
		WebUI.verifyMatch(DescricaoProduto, 'Descrição:', false)
	}

	@Keyword
	def ValidarValorDescricaoProduto(){

		def ValorDescricaoProduto = WebUI.getText(findTestObject('CadastrarPedidos/pedidosValorDescricaoProduto2_PR EUROMIX EXCELLENCE 1'))
		WebUI.verifyMatch(ValorDescricaoProduto, 'PR EUROMIX EXCELLENCE 1.67 INC AZURI SURF', false)
	}

	@Keyword
	def ValidarUnidadeMedida(){

		def UnidadeMedida = WebUI.getText(findTestObject('CadastrarPedidos/pedidosLabel_UnidadedeMedida'))
		WebUI.verifyMatch(UnidadeMedida, 'Unidade de Medida:', false)
	}

	@Keyword
	def ValidarValorUnidadeMedida(){

		def ValorUnidadeMedida = WebUI.getText(findTestObject('CadastrarPedidos/pedidosValorUnidadedeMedida_PC'))
		WebUI.verifyMatch(ValorUnidadeMedida, 'PC', false)
	}

	@Keyword
	def ValidarQuantidade(){

		def Quantidade = WebUI.getText(findTestObject('CadastrarPedidos/pedidoLabelQuantidade2'))
		WebUI.verifyMatch(Quantidade, 'Quantidade:', false)
	}

	@Keyword
	def ValidarValorQuantidade(){

		def ValorQuantidade = WebUI.getText(findTestObject('CadastrarPedidos/pedidoValorQuantidade2'))
		WebUI.verifyMatch(ValorQuantidade, '1', false)
	}

	@Keyword
	def ValidarPreco(){

		def Preço = WebUI.getText(findTestObject('CadastrarPedidos/pedidoLabelPreco2'))
		WebUI.verifyMatch(Preço, 'PREÇO', false)
	}

	@Keyword
	def ValidarValorPreco(){

		def ValorPreço = WebUI.getText(findTestObject('CadastrarPedidos/pedidoValorPreco2_78850'))
		WebUI.verifyMatch(ValorPreço, '1 x R$ 788,50', false)
	}


	@Keyword
	def ValidarLabelvalorBruto(){

		def TextoValorBruto = WebUI.getText(findTestObject('CadastrarPedidos/pedidosLabelValorBruto_78850'))
		WebUI.verifyMatch(TextoValorBruto, 'VALOR BRUTO', false)
	}


	@Keyword
	def ValidarValorBruto(){

		def ValorBruto = WebUI.getText(findTestObject('CadastrarPedidos/pedidoValorBruto78850'))
		WebUI.verifyMatch(ValorBruto, 'R$ 788,50', false)
	}

	@Keyword
	def ValidarLabelValorLiquido(){

		def TextoValorLiquido = WebUI.getText(findTestObject('CadastrarPedidos/pedidosLabelValorLiquido'))
		WebUI.verifyMatch(TextoValorLiquido, 'Valor Liquido:', false)
	}


	@Keyword
	def ValidarValorLiquido(){

		def ValorLiquido = WebUI.getText(findTestObject('CadastrarPedidos/pedidosValorValorLiquido_78850'))
		WebUI.verifyMatch(ValorLiquido, 'R$ 788,50', false)
	}

	@Keyword
	def ValidarLabelValorAPagar(){

		def TextoValoraPagar = WebUI.getText(findTestObject('CadastrarPedidos/pedidosLabelValoraPagar'))
		WebUI.verifyMatch(TextoValoraPagar, 'VALOR A PAGAR', false)
	}

	@Keyword
	def ValidarValorAPagar(){

		def ValorAPagar = WebUI.getText(findTestObject('CadastrarPedidos/pedidosValorValoraPagar78850'))
		WebUI.verifyMatch(ValorAPagar, 'R$ 788,50', false)
	}

	@Keyword
	def ValidarExibicaoDetalhesProduto(){

		WebUI.verifyElementPresent(findTestObject('CadastrarPedidos/pedidoCardDetalhePedido'), GlobalVariable.G_ShortTimeOut)
	}

	@Keyword
	def ClicarBotãoGerarPedido(){

		WebUI.click(findTestObject('CadastrarPedidos/pedidosbtnGerarPedido'))
	}

	@Keyword
	def RolarPáginaAtéDetalhesDaVenda(){

		WebUI.scrollToElement(findTestObject('CadastrarPedidos/pedidoCardDetalhePedido'), GlobalVariable.G_ShortTimeOut)
	}

	@Keyword
	def ClicarBotãoGerarOrçamento(){

		WebUI.click(findTestObject('CadastrarPedidos/pedidosbtnGerarOrcamento'))
	}


	@Keyword
	def GuardarNomeCliente(){

		WebUI.delay(3)
		WebUI.click(findTestObject('CadastrarPedidos/pedidosbtnFlechaParaBaixoCliente'))
		WebUI.waitForElementPresent(findTestObject('CadastrarPedidos/pedidoscmpClienteRetornoNome'), GlobalVariable.G_Timeout)
		def NomeCliente2 = WebUI.getText(findTestObject('CadastrarPedidos/pedidoscmpClienteRetornoNome'))
		GlobalVariable.NomeCliente2 = NomeCliente2
		System.out.println(GlobalVariable.NomeCliente2) + "NomeCLiente2"
		WebUI.click(findTestObject('CadastrarPedidos/pedidosbtnFlechaParaCimaCliente'))
	}

	@Keyword
	def CompararNomeClienteCadastrado(){

		WebUI.verifyMatch(GlobalVariable.NomeCliente2, GlobalVariable.NomeCliente, false)
	}

	@Keyword
	def GuardarNomeEmpresa(){

		WebUI.delay(3)
		WebUI.click(findTestObject('CadastrarPedidos/pedidosbtnFlechaParaBaixoCliente'))
		WebUI.waitForElementPresent(findTestObject('CadastrarPedidos/pedidoscmpClienteRetornoNome'), GlobalVariable.G_Timeout)
		def RazãoSocial2 = WebUI.getText(findTestObject('CadastrarPedidos/pedidoscmpClienteRetornoNome'))
		GlobalVariable.RazaoSocial2 = RazãoSocial2
		System.out.println(GlobalVariable.RazaoSocial2) + "RazaoSocial2"
		WebUI.click(findTestObject('CadastrarPedidos/pedidosbtnFlechaParaCimaCliente'))
	}

	@Keyword
	def CompararRazãoSocialCadastrada(){

		WebUI.verifyMatch(GlobalVariable.RazaoSocial2, GlobalVariable.RazaoSocial, false)
	}
}

