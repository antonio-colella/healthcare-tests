import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.logging.KeywordLogger
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

class Login {

	@Quando("digito o usuario (.*) e senha (.*)")
	public void digito_o_meu_usuario_e_senha(String usuario, String senha) {


		CustomKeywords.'login.Ações.DigitarCampoCodigoVendedor'(usuario)
		CustomKeywords.'login.Ações.DigitarCampoInsiraSuaSenha'(senha)
	}

	@Quando("confirmo as informações")
	public void confirmo_as_informações() {


		CustomKeywords.'login.Ações.ClicarBotãoEntrar'()
		CustomKeywords.'comuns.Ações.AguardarPróximaAção'(GlobalVariable.G_Timeout)
	}

	@Então("vejo a mensagem Usuario e Senha invalidos")
	public void vejo_a_mensagem_Usuario_e_Senha_invalidos() {

		try {

			if(CustomKeywords.'comuns.Ações.VerificarAlertaPresenteNaTela'()) {

				CustomKeywords.'login.Ações.ComparaTextoCaixaAlerta'()
				CustomKeywords.'comuns.Ações.AceitaAlerta'()
				CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou a Mensagem Usuário e Senha Inválidos")
			}
		} catch (Exception ex) {

			CustomKeywords.'evidencia.Ações.Evidencia'("Mensagem Usuário e Senha Inválidos NOK")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou a Mensagem Usuário e Senha Inválidos")
		}
	}



	@Quando("informo meu usuario (.*) e senha (.*)")
	public void informo_meu_e_(String usuario, String senha) {

		CustomKeywords.'comuns.Ações.AguardarPróximaAção'(GlobalVariable.G_ShortTimeOut)
		CustomKeywords.'login.Ações.LimparCampoCodigoVendedor'()
		CustomKeywords.'comuns.Ações.AguardarPróximaAção'(GlobalVariable.G_ShortTimeOut)
		CustomKeywords.'login.Ações.DigitarCampoCodigoVendedor'(usuario)
		CustomKeywords.'comuns.Ações.AguardarPróximaAção'(GlobalVariable.G_ShortTimeOut)
		CustomKeywords.'login.Ações.LimparCampoInsiraSuaSenha'()
		CustomKeywords.'comuns.Ações.AguardarPróximaAção'(GlobalVariable.G_ShortTimeOut)
		CustomKeywords.'login.Ações.DigitarCampoInsiraSuaSenha'(senha)
	}

	@Então("vejo a mensagem usuario invalido")
	public void vejo_a_mensagem_usuario_invalido() {

		try {

			if(CustomKeywords.'comuns.Ações.VerificarAlertaPresenteNaTela'()) {

				CustomKeywords.'login.Ações.ComparaTextoCaixaAlerta2'()
				CustomKeywords.'comuns.Ações.AceitaAlerta'()
				CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou a Mensagem Usuário Inválido")
			}
		} catch (Exception ex) {

			CustomKeywords.'evidencia.Ações.Evidencia'("Mensagem Usuário Inválido NOK")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou a Mensagem Usuário Inválido")
		}
	}

	@Quando("informo (.*) e (.*) invalida")
	public void informo_e_invalida(String usuario, String senha) {

		CustomKeywords.'comuns.Ações.AguardarPróximaAção'(GlobalVariable.G_Timeout)
		CustomKeywords.'login.Ações.LimparCampoCodigoVendedor'()
		CustomKeywords.'comuns.Ações.AguardarPróximaAção'(GlobalVariable.G_ShortTimeOut)
		CustomKeywords.'login.Ações.DigitarCampoCodigoVendedor'(usuario)
		CustomKeywords.'comuns.Ações.AguardarPróximaAção'(GlobalVariable.G_ShortTimeOut)
		CustomKeywords.'login.Ações.LimparCampoInsiraSuaSenha'()
		CustomKeywords.'comuns.Ações.AguardarPróximaAção'(GlobalVariable.G_ShortTimeOut)
		CustomKeywords.'login.Ações.DigitarCampoInsiraSuaSenha'(senha)
	}

	@Então("vejo a mensagem senha inválida")
	public void vejo_a_mensagem_senha_inválida() {

		try {

			if(CustomKeywords.'comuns.Ações.VerificarAlertaPresenteNaTela'()) {

				CustomKeywords.'login.Ações.ComparaTextoCaixaAlerta3'()
				CustomKeywords.'comuns.Ações.AceitaAlerta'()
				CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou a Mensagem Senha Inválida")
			}
		} catch (Exception ex) {

			CustomKeywords.'evidencia.Ações.Evidencia'("Mensagem Senha Inválida NOK")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou a Mensagem Senha Inválida")
		}
	}

	@Quando("informo meus acessos (.*) e (.*)")
	public void informo_meus_acessos_e_(String usuario, String senha) {

		CustomKeywords.'comuns.Ações.AguardarPróximaAção'(GlobalVariable.G_ShortTimeOut)
		CustomKeywords.'login.Ações.LimparCampoCodigoVendedor'()
		CustomKeywords.'comuns.Ações.AguardarPróximaAção'(GlobalVariable.G_ShortTimeOut)
		CustomKeywords.'login.Ações.DigitarCampoCodigoVendedor'(usuario)
		CustomKeywords.'comuns.Ações.AguardarPróximaAção'(GlobalVariable.G_ShortTimeOut)
		CustomKeywords.'login.Ações.LimparCampoInsiraSuaSenha'()
		CustomKeywords.'comuns.Ações.AguardarPróximaAção'(GlobalVariable.G_ShortTimeOut)
		CustomKeywords.'login.Ações.DigitarCampoInsiraSuaSenha'(senha)
	}

	@Então("vejo a tela inicial do Pedido de Venda")
	public void vejo_a_tela_inicial_do_Pedido_de_Venda() {

		try {

			if(CustomKeywords.'arealogada.Ações.VerificarExibiçãoIconeTOTVS'())


				CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou ícone TOTVS")
		} catch (Exception ex) {

			CustomKeywords.'evidencia.Ações.Evidencia'("IconeTOTVSNOK")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou ícone TOTVS")
		}
	}

	@Quando("seleciono ícone TOTVS")
	public void seleciono_ícone_TOTVS() {

		CustomKeywords.'arealogada.Ações.ClicarIconeTOTVS'()
	}

	@Então("vejo as minhas informações de acesso")
	public void vejo_as_minhas_informações_de_acesso() {

		CustomKeywords.'comuns.Ações.AguardarPróximaAção'(GlobalVariable.G_ShortTimeOut)

		try {

			if(CustomKeywords.'arealogada.Ações.VerificarExibiçãoUsuarioLogado'())

				CustomKeywords.'arealogada.Ações.CompararUsuarioLogado'()
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou Usuário Logado")
		} catch (Exception ex) {

			CustomKeywords.'evidencia.Ações.Evidencia'("Usuário Logado NOK")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou Usuário Logado")
		}

		try {

			if(CustomKeywords.'arealogada.Ações.VerificarExibiçãoLojaLogada'())

				CustomKeywords.'arealogada.Ações.CompararLojaLogada'()
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou Loja Logada")
		} catch (Exception ex) {

			CustomKeywords.'evidencia.Ações.Evidencia'("Loja Logada NOK")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou Loja Logada")
		}
	}
}