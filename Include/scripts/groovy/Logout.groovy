import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.pt.E
import cucumber.api.java.pt.Dado
import cucumber.api.java.pt.Então
import cucumber.api.java.pt.Quando



class Logout {

	@Quando("clico na opção Sair")
	public void clico_na_opção_Sair() {

		CustomKeywords.'arealogada.Ações.ClicarBotãoSair'()
	}

	@Então("devo visualizar a tela de Bem-Vindo com as informação de login")
	public void devo_visualizar_a_tela_de_Bem_Vindo_com_as_informação_de_login() {

		try {

			if(CustomKeywords.'login.Ações.VerificarLogoTotvs'())

				CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou Logo TOTVS")
		} catch (Exception ex) {

			CustomKeywords.'evidencia.Ações.EvidenciaErro'("Logo TOTVS NOK")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou Logo TOTVS")
		}


		try {

			if(CustomKeywords.'login.Ações.VerificarTextoBemVindo'())


				CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou Texto Bem Vindo")
		} catch (Exception ex) {

			CustomKeywords.'evidencia.Ações.EvidenciaErro'("Texto Bem Vindo NOK")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou Texto Bem Vindo")
		}

		try {

			if(CustomKeywords.'login.Ações.VerificarCampoCodigoVendedor'())

				CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou Campo Vendedor")
		} catch (Exception ex) {

			CustomKeywords.'evidencia.Ações.EvidenciaErro'("Campo Vendedor NOK")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou Campo Vendedor")
		}

		try {

			if(CustomKeywords.'login.Ações.VerificarCampoInsiraSuaSenha'())


				CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou Campo Senha")
		} catch (Exception ex) {

			CustomKeywords.'evidencia.Ações.EvidenciaErro'("Campo Senha NOK")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou Campo Senha")
		}



		try {

			if(CustomKeywords.'login.Ações.VerificarBotãoEntrar'())


				CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou Botão Entrar")
		} catch (Exception ex) {

			CustomKeywords.'evidencia.Ações.EvidenciaErro'("Botão Entra NOK")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou Botão Entra")
		}
	}
}