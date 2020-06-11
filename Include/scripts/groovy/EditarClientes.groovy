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



class EditarClientes {


	@Então("vejo o numero do rg contendo o valor X contemplando o numeral")
	def vejo_o_numero_do_rg_contendo_o_valor_X_contemplando_o_numeral() {
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoNumeroRG'()) {
			
				CustomKeywords.'editarclientes.Ações.CompararNumeroRG'()			
				CustomKeywords.'comuns.Ações.TestePassou'("Passou: Foi Apresentado o número do RG preenchido no campo")
				
		} 
		
		else {
				CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Foi Apresentado o número do RG preenchido no campo")
				
				
					}
		}
	
	@Então("vejo a tela de edição do cadastro com os campos preenhcidos com as informações feitas no cadastro do cliente pessoa fisica anteriormente")
	public void vejo_a_tela_de_edição_do_cadastro_com_os_campos_preenhcidos_com_as_informações_feitas_no_cadastro_do_cliente_pessoa_fisica_anteriormente() {
	
		CustomKeywords.'comuns.Ações.AguardarPróximaAção'(GlobalVariable.G_ShortTimeOut)		
			
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoTipoPessoaFísicaPreenchida'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Tipo de Pessoa Física com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Tipo de Pessoa com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Tipo de Pessoa com a Informação Cadastrada Anteriormente")
		
		}
		
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoCPFPreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo CPF com a Informação Cadastrada Anteriormente")
				
		} else {
		
		    CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo CPF com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo CPF com a Informação Cadastrada Anteriormente")
		
		}
		
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoRGPreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo RG com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo RG com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo RG com a Informação Cadastrada Anteriormente")
			
		
		}
		
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoNomeClientePreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Nome com a Informação Cadastrada Anteriormente")
				
		} else {
		
		    CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo RG com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Nome com a Informação Cadastrada Anteriormente")
		
		}
		
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoDataNascimentoPreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Data Nascimento com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Data Nascimento com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Data Nascimento com a Informação Cadastrada Anteriormente")
		
		}
		
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoDataNascimentoPreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Data Nascimento com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Data Nascimento com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Data Nascimento com a Informação Cadastrada Anteriormente")
		
		}
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoEmailPreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Email com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Email com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Email com a Informação Cadastrada Anteriormente")
			
		
		}
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoEmailPreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Email com a Informação Cadastrada Anteriormente")
				
		} else {
		
		    CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Email com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Email com a Informação Cadastrada Anteriormente")
			
		
		}
		

		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoCelularPreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Celular com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Celular com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Celular com a Informação Cadastrada Anteriormente")
				
		}
		
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoTelefonePreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Telefone com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Telefone com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Telefone com a Informação Cadastrada Anteriormente")
					
		}
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoCEPPreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo CEP com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo CEP com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo CEP com a Informação Cadastrada Anteriormente")
					
		}
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoEnderecoPreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Endereço com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Endereço com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Endereço com a Informação Cadastrada Anteriormente")
					
		}
		
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoNumeroPreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Numero com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Numero com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Numero com a Informação Cadastrada Anteriormente")
			
					
		}
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoBairroPreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Bairro com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Bairro com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Bairro com a Informação Cadastrada Anteriormente")
			
					
		}
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoComplementoPreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Complemento com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Complemento com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Complemento com a Informação Cadastrada Anteriormente")
			
					
		}
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoCidadePreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Cidade com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Cidade com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Cidade com a Informação Cadastrada Anteriormente")
			
					
		}
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoUFPreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo UF com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo UF com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo UF com a Informação Cadastrada Anteriormente")
				
					
		}
				
	}
		
	
	@Então("vejo a tela de edição do cadastro com os campos preenhcidos com as informações feitas no cadastro do cliente pessoa informal anteriormente")
	public void vejo_a_tela_de_edição_do_cadastro_com_os_campos_preenhcidos_com_as_informações_feitas_no_cadastro_do_cliente_pessoa_informal_anteriormente() {
	
		
		
		CustomKeywords.'comuns.Ações.AguardarPróximaAção'(GlobalVariable.G_ShortTimeOut)
				
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoTipoPessoaInformalPreenchida'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Tipo de Pessoa Informal com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Tipo de Pessoa Informal com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Tipo de Pessoa Informal com a Informação Cadastrada Anteriormente")
		
		}
		
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoNumeroIdentificaçãoPreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Identificação com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Identificação com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Identificação com a Informação Cadastrada Anteriormente")
		
		}
				
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoNomeClientePreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Nome com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Nome com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Nome com a Informação Cadastrada Anteriormente")
		
		}
		
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoDataNascimentoPreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Data Nascimento com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Data Nascimento com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Data Nascimento com a Informação Cadastrada Anteriormente")
		
		}
				
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoEmailPreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Email com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Email com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Email com a Informação Cadastrada Anteriormente")
			
		
		}

		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoCelularPreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Celular com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Celular com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Celular com a Informação Cadastrada Anteriormente")
				
		}
		
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoTelefonePreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Telefone com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Telefone com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Telefone com a Informação Cadastrada Anteriormente")
					
		}
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoCEPPreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo CEP com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo CEP com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo CEP com a Informação Cadastrada Anteriormente")
					
		}
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoEnderecoPreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Endereço com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Endereço com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Endereço com a Informação Cadastrada Anteriormente")
					
		}
		
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoNumeroPreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Numero com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Numero com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Numero com a Informação Cadastrada Anteriormente")
			
					
		}
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoBairroPreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Bairro com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Bairro com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Bairro com a Informação Cadastrada Anteriormente")
			
					
		}
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoComplementoPreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Complemento com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Complemento com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Complemento com a Informação Cadastrada Anteriormente")
			
					
		}
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoCidadePreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Cidade com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Cidade com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Cidade com a Informação Cadastrada Anteriormente")
			
					
		}
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoUFPreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo UF com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo UF com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo UF com a Informação Cadastrada Anteriormente")
				
					
		}
	
		
	}
	
	
	@Então("vejo a tela de edição do cadastro com os campos preenhcidos com as informações feitas no cadastro do cliente pessoa jurídica anteriormente")
	public void vejo_a_tela_de_edição_do_cadastro_com_os_campos_preenhcidos_com_as_informações_feitas_no_cadastro_do_cliente_pessoa_jurídica_anteriormente() {
	
	
		CustomKeywords.'comuns.Ações.AguardarPróximaAção'(GlobalVariable.G_ShortTimeOut)
				
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoTipoPessoaJurídicaPreenchida'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Tipo de Pessoa Jurídica com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Tipo de Pessoa Jurídica com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Tipo de Pessoa Jurídica com a Informação Cadastrada Anteriormente")
		
		}
		
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoCNPJPreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo CNPJ com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo CNPJ com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo CNPJ com a Informação Cadastrada Anteriormente")
		
		}
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoInscriçãoEstadualPreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Inscrição Estadual com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Inscrição Estadual com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Inscrição Estadual com a Informação Cadastrada Anteriormente")
					
		}
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoRazãoSocialPreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Razão Social com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Razão Social com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Razão Social com a Informação Cadastrada Anteriormente")
					
		}
				

		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoNomeFantasiaPreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Nome Fantasia com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Nome Fantasia com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Nome Fantasia com a Informação Cadastrada Anteriormente")
								
		}
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoEmailPreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Email com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Email com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Email com a Informação Cadastrada Anteriormente")
			
		
		}
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoEmailPreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Email com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Email com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Email com a Informação Cadastrada Anteriormente")
			
		
		}
		

		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoCelularPreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Celular com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Celular com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Celular com a Informação Cadastrada Anteriormente")
				
		}
		
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoTelefonePreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Telefone com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Telefone com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Telefone com a Informação Cadastrada Anteriormente")
					
		}
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoCEPPreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo CEP com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo CEP com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo CEP com a Informação Cadastrada Anteriormente")
					
		}
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoEnderecoPreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Endereço com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Endereço com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Endereço com a Informação Cadastrada Anteriormente")
					
		}
		
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoNumeroPreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Numero com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Numero com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Numero com a Informação Cadastrada Anteriormente")
			
					
		}
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoBairroPreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Bairro com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Bairro com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Bairro com a Informação Cadastrada Anteriormente")
			
					
		}
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoComplementoPreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Complemento com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Complemento com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Complemento com a Informação Cadastrada Anteriormente")
			
					
		}
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoCidadePreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo Cidade com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo Cidade com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo Cidade com a Informação Cadastrada Anteriormente")
			
					
		}
		
		if(CustomKeywords.'editarclientes.Ações.VerificarExibiçãoUFPreenchido'()) {
			
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o campo UF com a Informação Cadastrada Anteriormente")
				
		} else {
		
			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o campo UF com a Informação Cadastrada Anteriormente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o campo UF com a Informação Cadastrada Anteriormente")
				
					
		}
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}






































