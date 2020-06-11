package configurarAmbiente

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
	def ClicarCampoCaminhoAPI(){

		WebUI.click(findTestObject('Object Repository/ConfigurarAmbiente/configurarAmbientecmpCaminhoAPI'))
	}

	@Keyword
	def DigitarCaminhoAPI(text){

		WebUI.setText(findTestObject('Object Repository/ConfigurarAmbiente/configurarAmbientecmpCaminhoAPI'), text)
	}


	@Keyword
	def LimparCampoCaminhoAPI(){

		WebUI.clearText(findTestObject('Object Repository/ConfigurarAmbiente/configurarAmbientecmpCaminhoAPI'))
	}

	@Keyword
	def EsperarCampoCaminhoAPI(){

		WebUI.waitForElementPresent(findTestObject('Object Repository/ConfigurarAmbiente/configurarAmbientecmpCaminhoAPI'), GlobalVariable.G_ShortTimeOut)
	}


	@Keyword
	def ClicarCampCodigoLoja(){

		WebUI.click(findTestObject('Object Repository/ConfigurarAmbiente/configurarAmbientecmpCodigoLoja'))
	}

	@Keyword
	def DigitarCodigoLoja(text){

		WebUI.setText(findTestObject('Object Repository/ConfigurarAmbiente/configurarAmbientecmpCodigoLoja'), text)
	}


	@Keyword
	def LimparCampoCodigoLoja(){

		WebUI.clearText(findTestObject('Object Repository/ConfigurarAmbiente/configurarAmbientecmpCodigoLoja'))
	}

	@Keyword
	def VerificarCampoCodigoLoja(){

		WebUI.verifyElementPresent(findTestObject('Object Repository/ConfigurarAmbiente/configurarAmbientecmpCodigoLoja'), GlobalVariable.G_ShortTimeOut)
	}

	@Keyword
	def EsperarCampoCodigoLoja(){

		WebUI.waitForElementPresent(findTestObject('Object Repository/ConfigurarAmbiente/configurarAmbientecmpCodigoLoja'), GlobalVariable.G_ShortTimeOut)
	}

	@Keyword
	def ClicarBotãoGravarParametros(){

		WebUI.click(findTestObject('Object Repository/ConfigurarAmbiente/configurarAmbientebtnGravarParametros'))
	}

	@Keyword
	def ClicarBotãoTestarParametros(){
		
		def BotaoDesabilitado = WebUI.getAttribute(findTestObject('Object Repository/ConfigurarAmbiente/configurarAmbientebtnTestarParametros'), 'ng-reflect-disabled')
		if(BotaoDesabilitado == true){
			
			WebUI.waitForElementAttributeValue(findTestObject('Object Repository/ConfigurarAmbiente/configurarAmbientebtnTestarParametros'), 'ng-reflect-disabled', 'false', 0)
			WebUI.click(findTestObject('Object Repository/ConfigurarAmbiente/configurarAmbientebtnTestarParametros'))
			
		} else{
			
			WebUI.click(findTestObject('Object Repository/ConfigurarAmbiente/configurarAmbientebtnTestarParametros'))
				
		}
	
	}

	@Keyword
	def ClicarBotãoVoltar(){

		WebUI.click(findTestObject('Object Repository/ConfigurarAmbiente/configurarAmbientebtnVoltar'))
	}
}
