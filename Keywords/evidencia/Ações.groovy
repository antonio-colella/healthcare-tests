package evidencia

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration
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
import java.awt.Graphics2D
import java.awt.image.BufferedImage
import java.io.File
import java.io.IOException

import javax.imageio.ImageIO

public class Ações {

	@Keyword
	def Evidencia(String nome_arquivo){

		String original = RunConfiguration.getReportFolder() + "\\" + nome_arquivo + ".jpg"
		String resized = RunConfiguration.getReportFolder() + "\\" + nome_arquivo + ".jpg"
		WebUI.takeScreenshot(original)
		resize(original, resized, 0.8)
	}

	@Keyword
	def resize(String inputImagePath, String outputImagePath, int scaledWidth, int scaledHeight) throws IOException {

		//lê a imagem de entrada
		File inputFile = new File(inputImagePath)
		BufferedImage inputImage = ImageIO.read(inputFile)

		// Cria a Imagem de Saida
		BufferedImage outputImage = new BufferedImage(scaledWidth, scaledHeight, BufferedImage.TYPE_INT_RGB)

		//Dimensiona imagem de entrada para imagem de saída
		Graphics2D g2d = outputImage.createGraphics()
		g2d.drawImage(inputImage, 0, 0, scaledWidth, scaledHeight, null)
		g2d.dispose()

		//Extrai a extensão do arquivo de saída
		String formatName = outputImagePath.substring(outputImagePath.lastIndexOf(".") + 1)

		//Grava no arquivo de saída
		ImageIO.write(outputImage, formatName, new File(outputImagePath))
	}

	@Keyword
	def resize(String inputImagePath,String outputImagePath, double percent) throws IOException {

		File inputFile = new File(inputImagePath);
		BufferedImage inputImage = ImageIO.read(inputFile);
		int scaledWidth = (int) (inputImage.getWidth() * percent);
		int scaledHeight = (int) (inputImage.getHeight() * percent);
		resize(inputImagePath, outputImagePath, scaledWidth, scaledHeight);
	}
}

