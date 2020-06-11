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

import cucumber.api.java.pt.Dado
import cucumber.api.java.pt.Quando
import cucumber.api.java.pt.E
import cucumber.api.java.pt.Então
import cucumber.runner.*



class ConfigurarAmbienteSteps {

	@Dado("que estou na tela inicial")
	public void que_estou_na_tela_inicial() {

		CustomKeywords.'comuns.Ações.AcessarPedidoVenda'()
		CustomKeywords.'comuns.Ações.MaximarNavegador'()
		CustomKeywords.'comuns.Ações.DataAtualSistema'()
	}

	@Quando("seleciono a opcao Parametros")
	public void seleciono_a_opcao_Parametros() {

		CustomKeywords.'login.Ações.ClicarBotãoParametros'()
	}

	@Quando("preencho a url da api (.*)")
	public void preencho_a_url_da_api(String UrlAPI){

		CustomKeywords.'configurarAmbiente.Ações.LimparCampoCaminhoAPI'()
		CustomKeywords.'configurarAmbiente.Ações.DigitarCaminhoAPI'(UrlAPI)
	}

	@Quando("preencho o numero do (.*)")
	public void preencho_o_numero_do(String OwnerID) {

		//CustomKeywords.'configurarAmbiente.Ações.EsperarCampoCodigoLoja'()
		CustomKeywords.'configurarAmbiente.Ações.LimparCampoCodigoLoja'()
		CustomKeywords.'configurarAmbiente.Ações.DigitarCodigoLoja'(OwnerID)
		CustomKeywords.'configurarAmbiente.Ações.ClicarBotãoTestarParametros'()
		CustomKeywords.'comuns.Ações.AguardarPróximaAção'(GlobalVariable.G_ShortTimeOut)
	}

	@Quando("confirmo no botao Gravar")
	public void confirmo_no_botao_Gravar() {

		CustomKeywords.'configurarAmbiente.Ações.ClicarBotãoGravarParametros'()
	}

	@Então("vejo as informacoes de login sem mensagem de erro")
	public void vejo_as_informacoes_de_login_sem_mensagem_de_erro() {

		//CustomKeywords.'comuns.Ações.AguardarPróximaAção'(GlobalVariable.G_Timeout)

		if(CustomKeywords.'login.Ações.VerificarNãoExibirMensagemErroAmbiente'()) {
				
				CustomKeywords.'comuns.Ações.TestePassou'("Passou: Mensagem de Erro de Ambiente Não Apresentado")
			}
		       else  {

			CustomKeywords.'evidencia.Ações.Evidencia'("Apresentou Mensagem de Erro")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Mensagem de Erro de Ambiente Não Apresentado")
		}
	}
}