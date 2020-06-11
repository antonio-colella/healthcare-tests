package clientes



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
	def VerificarExibiçãoTelaAdicionarClientes(){

		WebUI.verifyElementPresent(findTestObject('Clientes/clientescmpPessoa'), GlobalVariable.G_ShortTimeOut)
		WebUI.verifyElementPresent(findTestObject('Clientes/clientesbtnSalvar'), GlobalVariable.G_ShortTimeOut)
	}

	@Keyword
	def SelecionarTipoPessoa(text){

		WebUI.selectOptionByLabel(findTestObject('Clientes/clientescmpPessoa'), text, false)
	}


	@Keyword
	def ClicarCampoCPF(numeroCPF){

		WebUI.click(findTestObject('Clientes/clientescmpCPF'))
	}

	@Keyword
	def GravarTipoPessoaFísica(){

		def TipoPessoa = WebUI.getText(findTestObject('Clientes/clientesRetornoTipoPessoaFisica'))
		GlobalVariable.TipoPessoa = TipoPessoa
		System.out.println(GlobalVariable.TipoPessoa)
	}

	@Keyword
	def GravarTipoPessoaInformal(){

		def TipoPessoa = WebUI.getText(findTestObject('Clientes/clientesRetornoTipoPessoaInformal'))
		GlobalVariable.TipoPessoa2 = TipoPessoa
		System.out.println(GlobalVariable.TipoPessoa2)
	}

	@Keyword
	def GravarTipoPessoaJurídica(){

		def TipoPessoa = WebUI.getText(findTestObject('Clientes/clientesRetornoTipoPessoaJuridica'))
		GlobalVariable.TipoPessoaJuridica = TipoPessoa
		System.out.println(GlobalVariable.TipoPessoaJuridica)
	}

	@Keyword
	def GravarCPFCliente(){

		def CPF = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoCPF'), 'ng-reflect-model')
		GlobalVariable.CPF = CPF
		System.out.println(GlobalVariable.CPF)
	}

	@Keyword
	def GravarRGCliente(){

		def RG = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoRG'), 'ng-reflect-model')
		GlobalVariable.RG = RG
		System.out.println(GlobalVariable.RG)
	}

	@Keyword
	def GravarNomeCliente(){

		def Nome = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoNomeCliente'), 'ng-reflect-model')
		GlobalVariable.NomeCliente = Nome
		System.out.println(GlobalVariable.NomeCliente) + "NomeCLiente"
	}

	@Keyword
	def GravarDataNascimentoCliente(){

		def DataNascimento = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoDataNascimento'), 'ng-reflect-model')
		GlobalVariable.DataNascimento = DataNascimento
		System.out.println(GlobalVariable.DataNascimento)
	}

	@Keyword
	def GravarEmailCliente(){

		def Email = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoEmail'), 'ng-reflect-model')
		GlobalVariable.Email = Email
		System.out.println(GlobalVariable.Email)
	}

	@Keyword
	def GravarCelularCliente(){

		def Celular = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoCelular'), 'ng-reflect-model')
		GlobalVariable.Celular = Celular
		System.out.println(GlobalVariable.Celular)
	}

	@Keyword
	def GravarTelefoneCliente(){

		def Telefone = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoTelefone'), 'ng-reflect-model')
		GlobalVariable.Telefone = Telefone
		System.out.println(GlobalVariable.Telefone)
	}

	@Keyword
	def GravarCepCliente(){

		def Cep = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoCep'), 'ng-reflect-model')
		GlobalVariable.CEP = Cep
		System.out.println(GlobalVariable.CEP)
	}

	@Keyword
	def GravarEndereçoCliente(){

		def Endereço = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoEndereco'), 'ng-reflect-model')
		GlobalVariable.Endereco = Endereço
		System.out.println(GlobalVariable.Endereco)
	}

	@Keyword
	def GravarNumeroCliente(){

		def Numero = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoNumero'), 'ng-reflect-model')
		GlobalVariable.Numero = Numero
		System.out.println(GlobalVariable.Numero)
	}

	@Keyword
	def GravarBairroCliente(){

		def Bairro = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoBairro'), 'ng-reflect-model')
		GlobalVariable.Bairro = Bairro
		System.out.println(GlobalVariable.Bairro)
	}

	@Keyword
	def GravarComplementoCliente(){

		def Complemento = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoComplemento'), 'ng-reflect-model')
		GlobalVariable.Complemento = Complemento
		System.out.println(GlobalVariable.Complemento)
	}

	@Keyword
	def GravarCidadeCliente(){

		def Cidade = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoCidade'), 'ng-reflect-model')
		GlobalVariable.Cidade = Cidade
		System.out.println(GlobalVariable.Cidade)
	}

	@Keyword
	def GravarUFCliente(){

		def UF = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoUF'), 'ng-reflect-model')
		GlobalVariable.UF = UF
		System.out.println(GlobalVariable.UF)
	}

	@Keyword
	def GravarIdentificaçãoCliente(){

		def identificação = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoIdentificacao'), 'ng-reflect-model')
		GlobalVariable.NumeroIdentificacao = identificação
		System.out.println(GlobalVariable.NumeroIdentificacao)
	}

	@Keyword
	def GravarNúmeroCNPJ(){

		def CNPJ = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoCNPJ'), 'ng-reflect-model')
		GlobalVariable.CNPJ = CNPJ
	}

	@Keyword
	def GravarRazãoSocial(){

		def RazaoSocial = WebUI.getAttribute(findTestObject('CadastrarPedidos/clientesRetornoRazaoSocial'), 'ng-reflect-model')
		GlobalVariable.RazaoSocial = RazaoSocial
		System.out.println(GlobalVariable.RazaoSocial) + "RazãoSocial"
	}

	@Keyword
	def GravarInscriçãoEstadualCliente(){

		def InscriçãoEstadual = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoInscricaoEstadual'), 'ng-reflect-model')
		GlobalVariable.InscricaoEstadual = InscriçãoEstadual
		System.out.println(GlobalVariable.InscricaoEstadual)
	}

	@Keyword
	def GravarNomeFantasiaCliente(){

		def NomeFantasia = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoNomeFantasia'), 'ng-reflect-model')
		GlobalVariable.NomeFantasia = NomeFantasia
		System.out.println(GlobalVariable.NomeFantasia)
	}

	@Keyword
	def PreencherCampoCPF(text){

		WebUI.setText(findTestObject('Clientes/clientescmpCPF'), text)
	}

	@Keyword
	def PreencherCampoRG(text){

		WebUI.setText(findTestObject('Clientes/clientescmpRG'), text)
	}

	@Keyword
	def PreencherCampoNome(text){

		WebUI.setText(findTestObject('Clientes/clientescmpNome'), text)
	}

	@Keyword
	def PreencherCampoCNPJ(text){

		WebUI.setText(findTestObject('Clientes/clientescmpCnpj'), text)
	}

	@Keyword
	def PreencherCampoInscriçãoEstadual(text){

		WebUI.setText(findTestObject('Clientes/clientescmpInscricaoEstadual'), text)
	}


	@Keyword
	def PreencherCampoRazãoSocial(text){

		WebUI.setText(findTestObject('Clientes/clientescmpRazaoSocial'), text)
	}

	@Keyword
	def PreencherCampoNomeFantasia(text){

		WebUI.setText(findTestObject('Clientes/clientescmpNomeFantasia'), text)
	}




	@Keyword
	def VerificarExibiçãoEndereçoAutomático(){

		def Endereço = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoEndereco'), 'ng-reflect-model')
		WebUI.verifyElementAttributeValue(findTestObject('Clientes/clientesRetornoEndereco'), 'ng-reflect-model', Endereço, GlobalVariable.G_Timeout)
	}

	@Keyword
	def VerificarExibiçãoBairroAutomático(){

		def Bairro = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoBairro'), 'ng-reflect-model')
		WebUI.verifyElementAttributeValue(findTestObject('Clientes/clientesRetornoBairro'), 'ng-reflect-model', Bairro, GlobalVariable.G_Timeout)
	}

	@Keyword
	def VerificarExibiçãoCidadeAutomático(){

		def Cidade = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoCidade'), 'ng-reflect-model')
		WebUI.verifyElementAttributeValue(findTestObject('Clientes/clientesRetornoCidade'), 'ng-reflect-model', Cidade, GlobalVariable.G_Timeout)
	}

	@Keyword
	def VerificarExibiçãoUFAutomático(){

		def UF = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoUF'), 'ng-reflect-model')
		WebUI.verifyElementAttributeValue(findTestObject('Clientes/clientesRetornoUF'), 'ng-reflect-model', UF, GlobalVariable.G_Timeout)
	}



	@Keyword
	def PreencherCampoDataNascimento(text){

		WebUI.setText(findTestObject('Clientes/clientescmpNascimento'), text)
	}

	@Keyword
	def SelecionarTipoSexo(text){

		WebUI.selectOptionByLabel(findTestObject('Clientes/clientescmpSexo'), text, false)
	}

	@Keyword
	def PreencherCampoEmail(text){

		WebUI.setText(findTestObject('Clientes/clientescmpEmail'), text)
	}

	@Keyword
	def PreencherCampoCelular(text){

		WebUI.setText(findTestObject('Clientes/clientescmpCelular'), text)
	}

	@Keyword
	def PreencherCampoTelefone(text){

		WebUI.setText(findTestObject('Clientes/clientescmpTelefone'), text)
	}

	@Keyword
	def PreencherCampoCEP(text){

		WebUI.setText(findTestObject('Clientes/clientescmpCEP'), text)
	}

	@Keyword
	def RolarPáginaAtéCampoCEP(){

		WebUI.scrollToElement(findTestObject('Clientes/clientescmpCEP'), GlobalVariable.G_ShortTimeOut)
	}

	@Keyword
	def ClicarBotãoBuscarCEP(){

		WebUI.click(findTestObject('Clientes/clientesbtnBuscar'))
	}

	@Keyword
	def PreencherCampoEndereço(text){

		WebUI.setText(findTestObject('Clientes/clientescmpEndereco'), text)
	}

	@Keyword
	def PreencherCampoNúmeroEndereço(text){

		WebUI.setText(findTestObject('Clientes/clientescmpNumero'), text)
	}

	@Keyword
	def PreencherCampoBairro(text){

		WebUI.setText(findTestObject('Clientes/clientescmpBairro'), text)
	}

	@Keyword
	def PreencherCampoComplemento(text){

		WebUI.setText(findTestObject('Clientes/clientescmpComplemento'), text)
	}

	@Keyword
	def PreencherCampoCidade(text){

		WebUI.setText(findTestObject('Clientes/clientescmpCidade'), text)
	}

	@Keyword
	def PreencherCampoUF(text){

		WebUI.setText(findTestObject('Clientes/clientescmpUF'), text)
	}

	@Keyword
	def PreencherCampoObservações(text){

		WebUI.setText(findTestObject('Clientes/clientescmpObservacoes'), text)
	}

	@Keyword
	def ClicarBotãoSalvar(){

		WebUI.click(findTestObject('CLientes/clientesbtnSalvar'))
	}

	@Keyword
	def PreencherCampoIdentificação(text){

		WebUI.setText(findTestObject('Clientes/clientescmpIdentificacao'), text)
	}

	@Keyword
	def ClicarBotãoSalvareIniciarPedido(){

		WebUI.click(findTestObject('Clientes/clientesbtnSalvarIniciarPedido'))
	}

	@Keyword
	def AguardaExibiçãoJanela(){

		WebUI.waitForElementPresent(findTestObject('JanelaPadrão/clientesJanela'), GlobalVariable.G_ShortTimeOut)
	}

	@Keyword
	def VerificarExibiçãoJanela(){

		WebUI.verifyElementPresent(findTestObject('JanelaPadrão/clientesJanela'), GlobalVariable.G_ShortTimeOut)
	}

	@Keyword
	def CompararMensagem(text){

		def Mensagem = WebUI.getText(findTestObject('JanelaPadrão/clientesJanelaMensagem'))
		WebUI.verifyMatch(text, Mensagem, false)
	}

	@Keyword
	def ClicarBotãoOKJanela(){

		WebUI.click(findTestObject('JanelaPadrão/clientesJanelabtnOK'))
	}

	@Keyword
	def CompararMensagemPessoaInformal(){

		def Mensagem = WebUI.getText(findTestObject('JanelaPadrão/clientesJanelaMensagem'))
		WebUI.verifyMatch(Mensagem, Mensagem, false)
	}

	@Keyword
	def CompararMensagemCPFInválido(text){

		def Mensagem = WebUI.getText(findTestObject('JanelaPadrão/clientesJanelaMensagem'))
		WebUI.verifyMatch(text, Mensagem, false)
	}

	@Keyword
	def CompararMensagemCPFJáCadastrado(text){

		def Mensagem = WebUI.getText(findTestObject('JanelaPadrão/clientesJanelaMensagem'))
		WebUI.verifyMatch(text, Mensagem, false)
	}

	@Keyword
	def CompararMensagemCNPJJáCadastrado(text){

		def Mensagem = WebUI.getText(findTestObject('JanelaPadrão/clientesJanelaMensagem'))
		WebUI.verifyMatch(text, Mensagem, false)
	}

	@Keyword
	def CompararMensagemCPFDeveSerPreenchido(text){

		def Mensagem = WebUI.getText(findTestObject('JanelaPadrão/clientesJanelaMensagem'))
		WebUI.verifyMatch(text, Mensagem, false)
	}

	@Keyword
	def CompararMensagemClienteJáCadastrado(text){

		def Mensagem = WebUI.getText(findTestObject('JanelaPadrão/clientesJanelaMensagem'))
		WebUI.verifyMatch(text, Mensagem, false)
	}

	@Keyword
	def CompararMensagemCNPJInválido(text){

		def Mensagem = WebUI.getText(findTestObject('JanelaPadrão/clientesJanelaMensagem'))
		WebUI.verifyMatch(text, Mensagem, false)
	}

	@Keyword
	def CompararMensagemCNPJNãoInformando(text){

		def Mensagem = WebUI.getText(findTestObject('JanelaPadrão/clientesJanelaMensagem'))
		WebUI.verifyMatch(text, Mensagem, false)
	}

	@Keyword
	def CompararMensagemRGInválido(text){

		def Mensagem = WebUI.getText(findTestObject('JanelaPadrão/clientesJanelaMensagem'))
		WebUI.verifyMatch(text, Mensagem, false)
	}

	@Keyword
	def CompararMensagemCEPInválido(text){

		def Mensagem = WebUI.getText(findTestObject('Clientes/clientesTextoCepInvalido'))
		WebUI.verifyMatch(text, Mensagem, false)
	}

	@Keyword
	def AguardaExibiçãoMensagemCEPInválido(){

		WebUI.waitForElementPresent(findTestObject('Clientes/clientesTextoCepInvalido'), GlobalVariable.G_ShortTimeOut)
	}

	@Keyword
	def ClicarBotãoVoltar(){

		WebUI.click(findTestObject('Clientes/clientesbtnVoltar'))
	}
}
