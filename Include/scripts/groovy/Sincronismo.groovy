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




class Sincronismo {
 
	@Quando("seleciono a opção Configuração")
	public void seleciono_a_opção_Configuração() {
		
		CustomKeywords.'arealogada.Ações.ClicarBotãoConfiguração'()
		
	}
	
	@Quando("seleciono a opção Sincronismo")
	public void seleciono_a_opção_Sincronismo() {
		
		CustomKeywords.'arealogada.Ações.AguardarExibiçãoBotãoSincronismo'()
		CustomKeywords.'arealogada.Ações.ClicarBotãoSincronismo'()
		
	}
	
	@Então("vejo a tela de sincronismo")
	public void vejo_a_tela_de_sincronismo() {
		
		
		
      if(CustomKeywords.'sincronismo.AçõesSincronismo.VerificarExibiçãoBotãoSincronizarTodos'()) {
		  
		  CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o Botão Sincronizar Todos")
		  
	  } else {
	  
	  	  CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o Botão Sincronizar Todos")  
	  
	  }
		
		
	}
	
	@Quando("seleciono a opção Sincronizar Todos")
	public void seleciono_a_opção_Sincronizar_Todos() {
		 
		CustomKeywords.'sincronismo.AçõesSincronismo.ClicarBotãoSincronizarTodos'()
		CustomKeywords.'comuns.Ações.AguardarPróximaAção'(GlobalVariable.G_ShortTimeOut)
		
		
	}
	
	@Então("vejo os links (.*) (.*) (.*) (.*) com o status sincronizados")
	public void vejo_os_links_modalidade_CanaisVenda_Parametros_Classificadores_com_o_status_sincronizados(String modalidade, String CanaisVenda, String Parametros, String Classificadores) {
		
		if(CustomKeywords.'sincronismo.AçõesSincronismo.VerificarExibiçãoStatusModalidade'()){
			
			CustomKeywords.'sincronismo.AçõesSincronismo.CompararStatusSincronizadoCampoModalidade'(modalidade)
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Modalidades com o status Sincronizado")
						
		} else {
		
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Modalidades não está com o status Sincronizado")
		}
		
		
		if(CustomKeywords.'sincronismo.AçõesSincronismo.VerificarExibiçãoStatusCanaisDeVenda'()){
			
			CustomKeywords.'sincronismo.AçõesSincronismo.CompararStatusSincronizadoCampoCanaisDeVenda'(CanaisVenda)
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Canais de Venda com o status Sincronizado")
						
		} else {
		
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Canais de Venda não está com o status Sincronizado")
		}
		

		if(CustomKeywords.'sincronismo.AçõesSincronismo.VerificarExibiçãoStatusParametros'()){
			
			CustomKeywords.'sincronismo.AçõesSincronismo.CompararStatusSincronizadoCampoParametros'(Parametros)
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Canais de Venda com o status Sincronizado")
						
		} else {
		
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Canais de Venda não está com o status Sincronizado")
		}
		
		
		if(CustomKeywords.'sincronismo.AçõesSincronismo.VerificarExibiçãoStatusClassificadores'()){
			
			CustomKeywords.'sincronismo.AçõesSincronismo.CompararStatusSincronizadoCampoClassificadores'(Parametros)
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Canais de Venda com o status Sincronizado")
						
		} else {
		
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Canais de Venda não está com o status Sincronizado")
		}
			
		 
	}
	
	@Quando("seleciono a opção Pedidos")
	public void seleciono_a_opção_Pedidos() {
		
		CustomKeywords.'arealogada.Ações.ClicarBotãoPedidos'()
		
		
	}
	
	
}