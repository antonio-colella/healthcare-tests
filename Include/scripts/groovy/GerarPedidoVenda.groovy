import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.beans.Customizer

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.main.CustomKeywordDelegatingMetaClass
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



class GerarPedidoVenda {

	@Dado("eu estou na tela inicial do Pedido de Venda")
	public void eu_estou_na_tela_inicial_do_Pedido_de_Venda() {

		CustomKeywords.'arealogada.Ações.VerificarTituloPrincipal'()
	}

	@Quando("clico na opção Adicionar Novo Pedido")
	public void clico_na_opção_Adicionar_Novo_Pedido() {

		CustomKeywords.'arealogada.Ações.ClicarBotaoAdicionarNovoPedido'()
	}

	@Então("vejo a tela de Pedidos")
	public void vejo_a_tela_de_Pedidos() {

		try {

			if(CustomKeywords.'cadastrarpedidos.Ações.VerificarExibiçãoTituloPedidos'()) {


				CustomKeywords.'comuns.Ações.TestePassou'("Passou: Texto Esperado")
			}
		}
		catch (Exception ex) {

			CustomKeywords.'evidencia.Ações.Evidencia'("TituloPedidosNOK")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Texto Não Esperado")
		}
	}


	@Quando("preencho os dados Canal de Venda (.*) e Modalidade (.*) e Vendedor (.*) e Cliente (.*) e Nome do Produto (.*)")
	public void preencho_os_dados_Canal_de_Venda_PDV_e_Modalidade_Consumidor_Final_e_Vendedor_ALINE_VILLAR_e_Cliente_ADAO_GUEDES_e_Nome_do_Produto_PR_EUROMIX_EXCELLENCE_INC_AZURI_SURF(String CanaldeVenda, String Modalidade, String Vendedor, String Cliente, String NomeProduto) {


		CustomKeywords.'cadastrarpedidos.Ações.SelecionarCanaldeVenda'(CanaldeVenda)
		CustomKeywords.'cadastrarpedidos.Ações.SelecionarModalidade'(Modalidade)


		CustomKeywords.'cadastrarpedidos.Ações.DigitarCampoVendedor'(Vendedor)
		CustomKeywords.'cadastrarpedidos.Ações.AguardarExibicaoVendedorAlive'()
		CustomKeywords.'cadastrarpedidos.Ações.SelecionarVendedorAlive'()


		CustomKeywords.'cadastrarpedidos.Ações.DigitarCampoCliente'(Cliente)
		CustomKeywords.'cadastrarpedidos.Ações.AguardarExibicaoClienteAdao'()
		CustomKeywords.'cadastrarpedidos.Ações.SelecionarClienteAdao'()


		CustomKeywords.'cadastrarpedidos.Ações.DigitarCampoProduto'(NomeProduto)
		CustomKeywords.'cadastrarpedidos.Ações.AguardarExibicaoProdutoPREUROMIX167INC'()
		CustomKeywords.'cadastrarpedidos.Ações.SelecionarProdutoPREUROMIX167INC'()
	}

	@Quando("informo os dados Canal de Venda (.*) e Modalidade (.*) e Vendedor (.*) e Nome do Produto (.*)")
	public void informo_os_dados_Canal_de_Venda_PDV_e_Modalidade_Consumidor_Final_e_Vendedor_ALINE_VILLAR_e_Nome_do_Produto_PR_EUROMIX_EXCELLENCE_INC_AZURI_SURF(String CanaldeVenda, String Modalidade, String Vendedor, String NomeProduto) {

		CustomKeywords.'cadastrarpedidos.Ações.SelecionarCanaldeVenda'(CanaldeVenda)
		CustomKeywords.'cadastrarpedidos.Ações.SelecionarModalidade'(Modalidade)


		CustomKeywords.'cadastrarpedidos.Ações.DigitarCampoVendedor'(Vendedor)
		CustomKeywords.'cadastrarpedidos.Ações.AguardarExibicaoVendedorAlive'()
		CustomKeywords.'cadastrarpedidos.Ações.SelecionarVendedorAlive'()

		CustomKeywords.'cadastrarpedidos.Ações.DigitarCampoProduto'(NomeProduto)
		CustomKeywords.'cadastrarpedidos.Ações.AguardarExibicaoProdutoPREUROMIX167INC'()
		CustomKeywords.'cadastrarpedidos.Ações.SelecionarProdutoPREUROMIX167INC'()
	}



	@Então("vejo o valor unitário do produto de 788,50")
	public void vejo_o_valor_unitário_do_produto_de() {

		CustomKeywords.'comuns.Ações.AguardarPróximaAção'(GlobalVariable.G_ShortTimeOut)

		try {

			if(CustomKeywords.'cadastrarpedidos.Ações.ValidarValorTotalProduto'()) {


				CustomKeywords.'comuns.Ações.TestePassou'("Passou: Valor do Produto Correto 788,50")
			}
		} catch (Exception ex) {

			CustomKeywords.'evidencia.Ações.Evidencia'("ValidarValorTotalProdutoNOK")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Valor do Produto Não Está Correto")
		}
	}

	@Então("seleciono o botão Adicionar")
	public void seleciono_o_botão_Adicionar() {

		CustomKeywords.'cadastrarpedidos.Ações.ClicarBotãoAdicionar'()
		CustomKeywords.'comuns.Ações.AguardarPróximaAção'(GlobalVariable.G_ShortTimeOut)
		CustomKeywords.'cadastrarpedidos.Ações.RolarPáginaAtéDetalhesDaVenda'()
	}

	@Então("vejo as informações do produto e o valor a pagar do pedido de 788,50")
	public void vejo_as_informações_do_produto_e_o_valor_a_pagar_do_pedido_de() {


		try {

			if(CustomKeywords.'cadastrarpedidos.Ações.ValidarExibicaoDetalhesProduto'()) {

				CustomKeywords.'cadastrarpedidos.Ações.ValidarValorCodigoProduto'()
				CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou Código do Produto")
			}
		} catch (Exception ex) {

			CustomKeywords.'evidencia.Ações.Evidencia'("Validar Codigo PadrãoNOK")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou Código do Produto")
		}


		try {

			if(CustomKeywords.'cadastrarpedidos.Ações.ValidarValorDescricaoProduto'()) {

				CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou Descrição do Produto")
			}
		} catch (Exception ex) {


			CustomKeywords.'evidencia.Ações.Evidencia'("Descrição do Produto NOK")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou Descrição do Produto")
		}


		try {

			if(CustomKeywords.'cadastrarpedidos.Ações.ValidarValorUnidadeMedida'()) {

				CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou Unidade de Medida")
			}
		} catch (Exception ex) {


			CustomKeywords.'evidencia.Ações.Evidencia'("Unidade de Medida NOK")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou Unidade de Medida")
		}



		try {

			if(CustomKeywords.'cadastrarpedidos.Ações.ValidarPreco'()) {

				CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou Label Preço")
			}
		} catch (Exception ex) {


			CustomKeywords.'evidencia.Ações.Evidencia'("Label Preço NOK")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou Label Preço")
		}

		try {

			if(CustomKeywords.'cadastrarpedidos.Ações.ValidarValorPreco'()) {

				CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o Preço do Item")
			}
		} catch (Exception ex) {


			CustomKeywords.'evidencia.Ações.Evidencia'("Preço Item NOK")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o Preço do Item")
		}

		try {

			if(CustomKeywords.'cadastrarpedidos.Ações.ValidarLabelvalorBruto'()) {

				CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou Label Valor Bruto")
			}
		} catch (Exception ex) {


			CustomKeywords.'evidencia.Ações.Evidencia'("Label Valor Bruto NOK")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou Label Valor Bruto")
		}



		try {

			if(CustomKeywords.'cadastrarpedidos.Ações.ValidarValorBruto'()) {

				CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o Valor Bruto")
			}
		} catch (Exception ex) {


			CustomKeywords.'evidencia.Ações.Evidencia'("Valor Bruto NOK")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o Valor Bruto")
		}

		try {

			if(CustomKeywords.'cadastrarpedidos.Ações.ValidarLabelValorAPagar'()) {

				CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou Label Valor A Pagar")
			}
		} catch (Exception ex) {


			CustomKeywords.'evidencia.Ações.Evidencia'("Label Valor A Pagar NOK")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou Label Valor A Pagar")
		}

		try {

			if(CustomKeywords.'cadastrarpedidos.Ações.ValidarValorAPagar'()) {

				CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o Valor A Pagar")
			}
		} catch (Exception ex) {


			CustomKeywords.'evidencia.Ações.Evidencia'("Valor A Pagar NOK")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o Valor A Pagar")
		}
	}

	@Quando("seleciono o botao Gerar Pedido")
	public void seleciono_o_botao_Gerar_Pedido() {

		CustomKeywords.'cadastrarpedidos.Ações.ClicarBotãoGerarPedido'()
	}


	@Então("vejo a tela de listagem de pedido")
	public void vejo_a_tela_de_listagem_de_pedido() {

		CustomKeywords.'comuns.Ações.AguardarPróximaAção'(GlobalVariable.G_ShortTimeOut)

		try {

			if(CustomKeywords.'listagempedidos.Ações.VerificarExibiçãoBotãoPesquisar'()) {

				CustomKeywords.'listagempedidos.Ações.VerificarExibiçãoColunaID'()
				CustomKeywords.'listagempedidos.Ações.VerificarExibiçãoColunaCliente'()
				CustomKeywords.'listagempedidos.Ações.VerificarExibiçãoColunaDatadoPedido'()
				CustomKeywords.'listagempedidos.Ações.VerificarExibiçãoColunaStatusAtual'()

				CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou tela Pesquisa de Pedido")
			}
		} catch (Exception ex) {

			CustomKeywords.'evidencia.Ações.Evidencia'("ValidarListagemPedidoNOK")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou tela Pesquisa de Pedido")
		}
	}

	@Quando("seleciono o botao Gerar Orçamento")
	public void seleciono_o_botao_Gerar_Orçamento() {

		CustomKeywords.'cadastrarpedidos.Ações.ClicarBotãoGerarOrçamento'()
	}

	@Quando("informo o status (.*)")
	public void informo_o_status_Orcamento(String status) {

		CustomKeywords.'listagempedidos.Ações.SelecionarStatusPedido'(status)
	}

	@E("informo periodo De (.*)")
	public void informo_periodo_De (String periodoDe){

		CustomKeywords.'comuns.Ações.DataAtualSistema'()
		CustomKeywords.'listagempedidos.Ações.LimparCampoPeriodoDE'()
		CustomKeywords.'listagempedidos.Ações.DigitarCampoPeriodoDE'(GlobalVariable.DataAtualDia)
	}

	@E("informo periodo Até (.*)")
	public void informo_periodo_Até (String periodoAté){

		CustomKeywords.'listagempedidos.Ações.LimparCampoPeriodoATE'()
		CustomKeywords.'listagempedidos.Ações.DigitarCampoPeriodoATE'(GlobalVariable.DataAtualDia)
	}
}




