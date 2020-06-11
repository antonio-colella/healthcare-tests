package comuns

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.sun.jna.platform.KeyboardUtils

import internal.GlobalVariable
import oracle.jdbc.internal.KeywordValue
import java.awt.Graphics2D
import java.awt.image.BufferedImage
import java.io.File
import java.io.IOException

import javax.imageio.ImageIO

import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil
import org.codehaus.groovy.tools.shell.completion.KeywordSyntaxCompletor
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver

import java.util.Random.*
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ações {


	@Keyword
	def EstabilizarAmbienteLogandoNoPedidoVenda(){

		WebUI.closeBrowser()
		CucumberKW.runFeatureFileWithTags('Include/features/ConfigurarAmbiente.feature', '@VerificarConfiguraçãoAmbiente')
		CucumberKW.runFeatureFileWithTags('Include/features/Login.feature', '@LoginComSucesso')
	}

	@Keyword
	def EstabilizarAmbientePedidoVenda(){

		CucumberKW.runFeatureFileWithTags('Include/features/ConfigurarAmbiente.feature', '@VerificarConfiguraçãoAmbiente')
	}


	@Keyword
	def AcessarPedidoVenda() {

		WebUI.openBrowser(GlobalVariable.G_SiteURL)
	}

	@Keyword
	def MaximarNavegador(){

		WebUI.maximizeWindow()
	}

	@Keyword
	def AbrirNavegador(){

		WebUI.openBrowser()
	}

	@Keyword
	def FecharNavegador(){

		WebUI.closeBrowser()
	}

	@Keyword
	def AguardarPróximaAção(text){

		WebUI.delay(text)
	}

	@Keyword
	def AfirmaçãoDoTeste(){

		assert false
	}

	@Keyword
	def AceitaAlerta(){

		WebUI.acceptAlert()
	}

	@Keyword
	def VerificarAlertaPresenteNaTela(){

		WebUI.verifyAlertPresent(GlobalVariable.G_Timeout)
	}

	@Keyword
	def TestePassou(texto){

		KeywordUtil.markPassed(texto)
		KeywordLogger.PASSED
	}

	@Keyword
	def TesteFalhou(texto){

		KeywordUtil.markFailed(texto)
		KeywordLogger.FAILED
	}

	@Keyword
	def AtualizarPágina(){

		WebUI.refresh()
	}

	@Keyword
	def VoltarParaPáginaAnterior(){

		WebUI.back()
	}

	@Keyword
	def RolarPáginaParaBaixo(){

		WebUI.scrollToPosition(0, 500)
	}

	@Keyword
	def RolarPáginaParaCima(){

		WebUI.scrollToPosition(0, 0)
	}

	//Método Randomiza para uso do CPF
	private int randomiza(int n) {
		int ranNum = (int) (Math.random() * n);
		return ranNum;
	}

	//Método Mod para Divisor para uso do CPF
	private int mod(int dividendo, int divisor) {
		return (int) Math.round(dividendo - (Math.floor(dividendo / divisor) * divisor));
	}

	//Bolean para colocar pontos ou não no CPF
	private boolean comPontos = true;


	@Keyword
	def GerarCPF() throws Exception{

		int n = 9;
		int n1 = randomiza(n);
		int n2 = randomiza(n);
		int n3 = randomiza(n);
		int n4 = randomiza(n);
		int n5 = randomiza(n);
		int n6 = randomiza(n);
		int n7 = randomiza(n);
		int n8 = randomiza(n);
		int n9 = randomiza(n);
		int d1 = n9 * 2 + n8 * 3 + n7 * 4 + n6 * 5 + n5 * 6 + n4 * 7 + n3 * 8 + n2 * 9 + n1 * 10;

		d1 = 11 - (mod(d1, 11));

		if (d1 >= 10)
			d1 = 0;

		int d2 = d1 * 2 + n9 * 3 + n8 * 4 + n7 * 5 + n6 * 6 + n5 * 7 + n4 * 8 + n3 * 9 + n2 * 10 + n1 * 11;

		d2 = 11 - (mod(d2, 11));

		String retorno = null;

		if (d2 >= 10)
			d2 = 0;
		retorno = "";

		if (comPontos)
			retorno = "" + n1 + n2 + n3 + '.' + n4 + n5 + n6 + '.' + n7 + n8 + n9 + '-' + d1 + d2;
		else
			retorno = "" + n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + d1 + d2;

		return retorno;

	}

	@Keyword
	def GerarRG() throws Exception{

		String nDigResult;
		String numerosContatenados;
		String numeroGerado;

		Random numeroAleatorio = new Random();


		//numeros gerados
		int n1 = numeroAleatorio.nextInt(10);
		int n2 = numeroAleatorio.nextInt(10);
		int n3 = numeroAleatorio.nextInt(10);
		int n4 = numeroAleatorio.nextInt(10);
		int n5 = numeroAleatorio.nextInt(10);
		int n6 = numeroAleatorio.nextInt(10);
		int n7 = numeroAleatorio.nextInt(10);
		int n8 = numeroAleatorio.nextInt(10);
		int n9 = numeroAleatorio.nextInt(10);


		//Conctenando os numeros
		numerosContatenados = String.valueOf(n1) + String.valueOf(n2) + String.valueOf(n3)  + String.valueOf(n4) +
				String.valueOf(n5) + String.valueOf(n6) + String.valueOf(n7) +String.valueOf(n8)  +
				String.valueOf(n9);

		numeroGerado = numerosContatenados;

		return numeroGerado;

	}

	@Keyword
	def GerarRGParaMG() throws Exception{

		String nDigResult;
		String numerosContatenados;
		String numeroGerado;

		Random numeroAleatorio = new Random();


		//numeros gerados
		int n1 = numeroAleatorio.nextInt(10);
		int n2 = numeroAleatorio.nextInt(10);
		int n3 = numeroAleatorio.nextInt(10);
		int n4 = numeroAleatorio.nextInt(10);
		int n5 = numeroAleatorio.nextInt(10);
		int n6 = numeroAleatorio.nextInt(10);
		int n7 = numeroAleatorio.nextInt(10);
		int n8 = numeroAleatorio.nextInt(10);
		int n9 = numeroAleatorio.nextInt(10);


		//Conctenando os numeros
		numerosContatenados = String.valueOf(n1) + String.valueOf(n2) + String.valueOf(n3)  + String.valueOf(n4) +
				String.valueOf(n5) + String.valueOf(n6) + String.valueOf(n7) +String.valueOf(n8)+
				String.valueOf("X");

		numeroGerado = numerosContatenados;

		return numeroGerado;

	}


	@Keyword
	def GerarCNPJ(){

		int n = 9;
		int n1 = randomiza(n);
		int n2 = randomiza(n);
		int n3 = randomiza(n);
		int n4 = randomiza(n);
		int n5 = randomiza(n);
		int n6 = randomiza(n);
		int n7 = randomiza(n);
		int n8 = randomiza(n);
		int n9 = 0; //randomiza(n);
		int n10 = 0; //randomiza(n);
		int n11 = 0; //randomiza(n);
		int n12 = 1; //randomiza(n);
		int d1 = n12 * 2 + n11 * 3 + n10 * 4 + n9 * 5 + n8 * 6 + n7 * 7 + n6 * 8 + n5 * 9 + n4 * 2 + n3 * 3 + n2 * 4 + n1 * 5;

		d1 = 11 - (mod(d1, 11));

		if (d1 >= 10)
			d1 = 0;

		int d2 = d1 * 2 + n12 * 3 + n11 * 4 + n10 * 5 + n9 * 6 + n8 * 7 + n7 * 8 + n6 * 9 + n5 * 2 + n4 * 3 + n3 * 4 + n2 * 5 + n1 * 6;

		d2 = 11 - (mod(d2, 11));

		if (d2 >= 10)
			d2 = 0;

		String retorno = null;

		if (comPontos)
			retorno = "" + n1 + n2 + "." + n3 + n4 + n5 + "." + n6 + n7 + n8 + "/" + n9 + n10 + n11 + n12 + "-" + d1 + d2;
		else
			retorno = "" + n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10 + n11 + n12 + d1 + d2;

		return retorno;


	}

	@Keyword
	def GerarInscriçãoEstadual() throws Exception{

		String nDigResult;
		String numerosContatenados;
		String numeroGerado;

		Random numeroAleatorio = new Random();


		//numeros gerados
		int n1 = numeroAleatorio.nextInt(10);
		int n2 = numeroAleatorio.nextInt(10);
		int n3 = numeroAleatorio.nextInt(10);
		int n4 = numeroAleatorio.nextInt(10);
		int n5 = numeroAleatorio.nextInt(10);
		int n6 = numeroAleatorio.nextInt(10);
		int n7 = numeroAleatorio.nextInt(10);
		int n8 = numeroAleatorio.nextInt(10);
		int n9 = numeroAleatorio.nextInt(10);
		int n10 = numeroAleatorio.nextInt(10);
		int n11 = numeroAleatorio.nextInt(10);
		int n12 = numeroAleatorio.nextInt(10);


		//Conctenando os numeros
		numerosContatenados = String.valueOf(n1) + String.valueOf(n2) + String.valueOf(n3)  + String.valueOf(n4) +
				String.valueOf(n5) + String.valueOf(n6) + String.valueOf(n7) +String.valueOf(n8)  +
				String.valueOf(n9) + String.valueOf(n10) + String.valueOf(n11) + String.valueOf(n12);

		numeroGerado = numerosContatenados;

		return numeroGerado;

	}

	@Keyword
	def PrimeirosNumerosCPF(){


		String s = GlobalVariable.CPF
		String t = s.substring (0, 3);


		return GlobalVariable.PrimeirosNumerosCPF = t


	}


	@Keyword
	def DataAtualSistema(String[] args){

		Date date = Calendar.getInstance().getTime();
		DateFormat formatter = new SimpleDateFormat("ddMMyyyy");
		String today = formatter.format(date);
		System.out.println(today);

		GlobalVariable.DataAtualDia = today


	}



}








