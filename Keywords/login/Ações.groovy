package login

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
	def ClicarBotãoParametros(){

		WebUI.click(findTestObject('Object Repository/Login/loginbtnConfigurarParametros'))
	}

	@Keyword
	def VerificarBotãoParametros(){

		WebUI.verifyElementPresent(findTestObject('Object Repository/Login/loginbtnConfigurarParametros'), GlobalVariable.G_Timeout)
	}

	@Keyword
	def EsperarBotãoParametros(){

		WebUI.waitForElementPresent(findTestObject('Object Repository/Login/loginbtnConfigurarParametros'), GlobalVariable.G_Timeout)
	}

	@Keyword
	def VerificarNãoExibirMensagemErroAmbiente(){

		WebUI.verifyElementNotPresent(findTestObject('Object Repository/Login/loginMensagemErroAmbiente'), GlobalVariable.G_Timeout)
	}	

	@Keyword
	def ClicarCampoCodigoVendedor(){

		WebUI.click(findTestObject('Object Repository/Login/logincmdCodigoVendedor'))
	}

	@Keyword
	def VerificarCampoCodigoVendedor(){

		WebUI.verifyElementPresent(findTestObject('Object Repository/Login/logincmdCodigoVendedor'), GlobalVariable.G_Timeout)
	}

	@Keyword
	def LimparCampoCodigoVendedor(){

		WebUI.clearText(findTestObject('Object Repository/Login/logincmdCodigoVendedor'))
	}

	@Keyword
	def DigitarCampoCodigoVendedor(text){

		WebUI.setText(findTestObject('Object Repository/Login/logincmdCodigoVendedor'), text)
	}

	@Keyword
	def DigitarCampoInsiraSuaSenha(text){

		WebUI.setText(findTestObject('Object Repository/Login/logincmdInsiraSenha'), text)
	}

	@Keyword
	def ClicarCampoInsiraSuaSenha(){

		WebUI.click(findTestObject('Object Repository/Login/logincmdInsiraSenha'))
	}

	@Keyword
	def VerificarCampoInsiraSuaSenha(){

		WebUI.verifyElementPresent(findTestObject('Object Repository/Login/logincmdInsiraSenha'), GlobalVariable.G_Timeout)
	}

	@Keyword
	def LimparCampoInsiraSuaSenha(){

		WebUI.clearText(findTestObject('Object Repository/Login/logincmdCodigoVendedor'))
	}

	@Keyword
	def ClicarBotãoEntrar(){

		WebUI.click(findTestObject('Object Repository/Login/loginbtnEntrar'))
	}

	@Keyword
	def VerificarBotãoEntrar(){

		WebUI.verifyElementPresent(findTestObject('Object Repository/Login/loginbtnEntrar'), GlobalVariable.G_Timeout)
	}

	@Keyword
	def VerificarLogoTotvs(){

		WebUI.verifyElementPresent(findTestObject('Object Repository/Login/loginLogoTotvs'), GlobalVariable.G_Timeout)
	}

	@Keyword
	def VerificarTextoBemVindo(){

		WebUI.verifyElementPresent(findTestObject('Object Repository/Login/loginTextoBemVindo'), GlobalVariable.G_Timeout)
	}

	@Keyword
	def ObterTextoCaixaAlerta(){

		def MensagemAlert = WebUI.getAlertText()
	}


	@Keyword
	def ComparaTextoCaixaAlerta(){

		def MensagemAlert = WebUI.getAlertText()
		WebUI.verifyEqual(MensagemAlert, 'Usuario e Senha inválidos')
		

	}


	@Keyword
	def ComparaTextoCaixaAlerta2(){

		def MensagemAlert = WebUI.getAlertText()
		WebUI.verifyEqual(MensagemAlert, 'Usuário Inválido')
		
	}

	@Keyword
	def ComparaTextoCaixaAlerta3(){

		def MensagemAlert = WebUI.getAlertText()
		WebUI.verifyEqual(MensagemAlert, 'Senha inválida')
	}
}
