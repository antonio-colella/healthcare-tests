package editarclientes

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
	def VerificarExibiçãoNumeroRG(){

		WebUI.verifyElementPresent(findTestObject('Clientes/clientesRetornoRG'), GlobalVariable.G_Timeout)
	}

	@Keyword
	def CompararNumeroRG(){

		def RG = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoRG'), 'ng-reflect-model')
		WebUI.verifyMatch(GlobalVariable.RG, RG, false)
	}

	@Keyword
	def VerificarExibiçãoJanelaEditarCliente(){

		WebUI.verifyElementPresent(findTestObject('EditarCliente/JanelaEditarCliente/janelaEditarCliente'), GlobalVariable.G_Timeout)
	}

	@Keyword
	def AguardaExibiçãoJanelaEditarCliente(){

		WebUI.waitForElementPresent(findTestObject('EditarCliente/JanelaEditarCliente/janelaEditarCliente'), GlobalVariable.G_Timeout)
	}


	@Keyword
	def CompararMensagemJanelaEditarCliente(text){

		def mensagem = WebUI.getText(findTestObject('EditarCliente/JanelaEditarCliente/janelaEditarClienteMensagem'))
		WebUI.verifyMatch(text, mensagem, false)
	}

	@Keyword
	def ClicarBotãoConfirmarJanelaEditarCliente(){

		WebUI.click(findTestObject('EditarCliente/JanelaEditarCliente/janelaEditarClientebtnConfirmar'))
	}

	@Keyword
	def VerificarExibiçãoCampoPessoaPreenchido(){

		def Pessoa = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoTipoPessoaFisica'), 'ng-reflect-model')
		WebUI.verifyElementAttributeValue(findTestObject('Clientes/clientesRetornoTipoPessoaFisica'), 'ng-reflect-model', Pessoa, GlobalVariable.G_Timeout)
	}

	@Keyword
	def VerificarExibiçãoCampoCPFDesabilitado(){

		def Desabilitado = true
		WebUI.verifyElementAttributeValue(findTestObject('EditarCliente/editarClientecmpCPF', 'ng-reflect-set-disabled'), Desabilitado, 0)
	}

	@Keyword
	def VerificarExibiçãoCampoCPFPreenchido(){

		def CPF = WebUI.getAttribute(findTestObject('EditarCliente/editarClientecmpCPF'), 'ng-reflect-model')
		WebUI.verifyElementAttributeValue(findTestObject('EditarCliente/editarClientecmpCPF'), 'ng-reflect-model', CPF, GlobalVariable.G_Timeout)
	}

	@Keyword
	def VerificarExibiçãoTipoPessoaFísicaPreenchida(){

		def TipoPessoa = WebUI.getText(findTestObject('Clientes/clientesRetornoTipoPessoaFisica'))
		WebUI.verifyMatch(GlobalVariable.TipoPessoa, TipoPessoa, false)
	}

	@Keyword
	def VerificarExibiçãoTipoPessoaInformalPreenchida(){

		def TipoPessoa = WebUI.getText(findTestObject('Clientes/clientesRetornoTipoPessoaInformal'))
		WebUI.verifyMatch(GlobalVariable.TipoPessoa2, TipoPessoa, false)
	}

	@Keyword
	def VerificarExibiçãoTipoPessoaJurídicaPreenchida(){

		def TipoPessoa = WebUI.getText(findTestObject('Clientes/clientesRetornoTipoPessoaJuridica'))
		WebUI.verifyMatch(GlobalVariable.TipoPessoaJuridica, TipoPessoa, false)
	}


	@Keyword
	def VerificarExibiçãoCPFPreenchido(){

		def CPF = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoCPF'), 'ng-reflect-model')
		WebUI.verifyMatch(GlobalVariable.CPF, CPF, false)
	}

	@Keyword
	def VerificarExibiçãoRGPreenchido(){

		def RG = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoRG'), 'ng-reflect-model')
		WebUI.verifyMatch(GlobalVariable.RG, RG, false)
	}

	@Keyword
	def VerificarExibiçãoNomeClientePreenchido(){

		def NomeCliente = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoNomeCliente'), 'ng-reflect-model')
		WebUI.verifyMatch(GlobalVariable.NomeCliente, NomeCliente, false)
	}

	@Keyword
	def VerificarExibiçãoDataNascimentoPreenchido(){

		WebUI.verifyMatch(GlobalVariable.DataNascimento, GlobalVariable.DataNascimento, false)
	}

	@Keyword
	def VerificarExibiçãoEmailPreenchido(){

		def Email = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoEmail'), 'ng-reflect-model')
		WebUI.verifyMatch(GlobalVariable.Email, Email, false)
	}

	@Keyword
	def VerificarExibiçãoCelularPreenchido(){

		def Celular = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoCelular'), 'ng-reflect-model')
		WebUI.verifyMatch(GlobalVariable.Celular, Celular, false)
	}

	@Keyword
	def VerificarExibiçãoTelefonePreenchido(){

		def Telefone = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoTelefone'), 'ng-reflect-model')
		WebUI.verifyMatch(GlobalVariable.Telefone, Telefone, false)
	}

	@Keyword
	def VerificarExibiçãoCEPPreenchido(){

		def CEP = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoCEP'), 'ng-reflect-model')
		WebUI.verifyMatch(GlobalVariable.CEP, CEP, false)
	}


	@Keyword
	def VerificarExibiçãoEnderecoPreenchido(){

		def Endereco = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoEndereco'), 'ng-reflect-model')
		WebUI.verifyMatch(GlobalVariable.Endereco, Endereco, false)
	}

	@Keyword
	def VerificarExibiçãoNumeroPreenchido(){

		def Numero = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoNumero'), 'ng-reflect-model')
		WebUI.verifyMatch(GlobalVariable.Numero, Numero, false)
	}


	@Keyword
	def VerificarExibiçãoBairroPreenchido(){

		def Bairro = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoBairro'), 'ng-reflect-model')
		WebUI.verifyMatch(GlobalVariable.Bairro, Bairro, false)
	}


	@Keyword
	def VerificarExibiçãoComplementoPreenchido(){

		def Complemento = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoComplemento'), 'ng-reflect-model')
		WebUI.verifyMatch(GlobalVariable.Complemento, Complemento, false)
	}

	@Keyword
	def VerificarExibiçãoCidadePreenchido(){

		def Cidade = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoCidade'), 'ng-reflect-model')
		WebUI.verifyMatch(GlobalVariable.Cidade, Cidade, false)
	}


	@Keyword
	def VerificarExibiçãoUFPreenchido(){

		def UF = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoUF'), 'ng-reflect-model')
		WebUI.verifyMatch(GlobalVariable.UF, UF, false)
	}


	@Keyword
	def VerificarExibiçãoNumeroIdentificaçãoPreenchido(){

		def Identificacao = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoIdentificacao'), 'ng-reflect-model')
		WebUI.verifyMatch(GlobalVariable.NumeroIdentificacao, Identificacao, false)
	}

	@Keyword
	def VerificarExibiçãoCNPJPreenchido(){

		def CNPJ = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoCNPJ'), 'ng-reflect-model')
		WebUI.verifyMatch(GlobalVariable.CNPJ, CNPJ, false)
	}


	@Keyword
	def VerificarExibiçãoInscriçãoEstadualPreenchido(){

		def IE = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoInscricaoEstadual'), 'ng-reflect-model')
		WebUI.verifyMatch(GlobalVariable.InscricaoEstadual, IE, false)
	}


	@Keyword
	def VerificarExibiçãoRazãoSocialPreenchido(){

		def RazaoSocial = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoRazaoSocial'), 'ng-reflect-model')
		WebUI.verifyMatch(GlobalVariable.RazaoSocial, RazaoSocial, false)
	}

	@Keyword
	def VerificarExibiçãoNomeFantasiaPreenchido(){

		def NomeFastasia = WebUI.getAttribute(findTestObject('Clientes/clientesRetornoNomeFantasia'), 'ng-reflect-model')
		WebUI.verifyMatch(GlobalVariable.NomeFantasia, NomeFastasia, false)
	}
}

