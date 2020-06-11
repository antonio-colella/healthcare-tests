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



class AreaLogada {
 
	@Quando("clico em Pedidos")
	public void clico_em_Pedidos() {

		CustomKeywords.'arealogada.Ações.ClicarBotãoPedidos'()
		
	}
	
	@Quando("seleciono Listagem de Pedidos")
	public void seleciono_Listagem_de_Pedidos() {
		
		CustomKeywords.'arealogada.Ações.AguardaExibiçãoBotãoListagemPedido'() 
		CustomKeywords.'arealogada.Ações.ClicarBotãoListagemPedido'()
		
	}

	@Então("vejo a mensagem (.*) Deseja desconsiderar as informações")
    public void vejo_a_mensagem_Deseja_desconsiderar_as_informações_Deseja_desconsiderar_as_informações(String mensagem) {
		 
		CustomKeywords.'editarclientes.Ações.AguardaExibiçãoJanelaEditarCliente'()
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoJanelaEditarCliente'()) {
		
			CustomKeywords.'editarclientes.Ações.CompararMensagemJanelaEditarCliente'(mensagem)
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou a mensagem Deseja desconsiderar as informações?")
		
		} else {
		
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou a mensagem Deseja desconsiderar as informações?")
		
		}
	}
	
	@Quando("confirmo a mensagem")
	public void confirmo_a_mensagem() {
		 
		CustomKeywords.'editarclientes.Ações.ClicarBotãoConfirmarJanelaEditarCliente'()
		
	}
	
	
	
	
}