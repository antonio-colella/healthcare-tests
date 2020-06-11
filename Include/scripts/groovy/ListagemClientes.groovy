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



class ListagemClientes {

	@Quando("seleciono os ... na linha do cliente")
	public void seleciono_os_na_linha_do_cliente() {

		CustomKeywords.'listagemclientes.Ações.Clicar3pontosRegistro'()
	}

	@E("clico em Iniciar Pedido")
	public void clico_em_Iniciar_Pedido() {

		CustomKeywords.'listagemclientes.Ações.AguardarExibiçãoBotãoIniciarPedido'()
		CustomKeywords.'listagemclientes.Ações.ClicarBotãoIniciarPedido'()
	}

	@Então("vejo a tela de adicionar pedido com o campo cliente preenchido com o nome do cliente cadastrado anteriormente")
	public void vejo_a_tela_de_adicionar_pedido_com_o_campo_cliente_preenchido_com_o_nome_do_cliente_cadastrado_anteriormente() {

		CustomKeywords.'cadastrarpedidos.Ações.GuardarNomeCliente'()
		CustomKeywords.'cadastrarpedidos.Ações.CompararNomeClienteCadastrado'()
	}

	@Então("vejo a tela de adicionar pedido com o campo cliente preenchido com a razão social cadastrado anteriormente")
	public void vejo_a_tela_de_adicionar_pedido_com_o_campo_cliente_preenchido_com_a_razão_social_cadastrado_anteriormente() {

		CustomKeywords.'cadastrarpedidos.Ações.GuardarNomeEmpresa'()
		CustomKeywords.'cadastrarpedidos.Ações.CompararRazãoSocialCadastrada'()
	}
	
	@Quando("clico em Editar Cliente")
	public void clico_em_Editar_Cliente() {
		 
		CustomKeywords.'listagemclientes.Ações.ClicarBotãoEditarCliente'()
		
		
	}
	
	
}