import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.beans.Customizer

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



class ListagemPedidos {

	@Quando("clico na opção Listagem de Pedido")
	public void clico_na_opção_Listagem_de_Pedido() {

		CustomKeywords.'arealogada.Ações.ClicarBotãoListagemPedido'()
	}

	@Quando("informo status (.*) e periodoDE (.*)")
	public void informo_Orcamento_e_(String status, String periodoDE){

		CustomKeywords.'listagempedidos.Ações.SelecionarStatusPedido'(status)
		CustomKeywords.'listagempedidos.Ações.LimparCampoPeriodoDE'()
		CustomKeywords.'listagempedidos.Ações.DigitarCampoPeriodoDE'(periodoDE)
	}

	@Quando("seleciono pesquisar")
	public void seleciono_pesquisar() {

		CustomKeywords.'listagempedidos.Ações.ClicarBotãoPesquisar'()
	}

	@Então("vejo a listagem dos pedidos cadastrados no período")
	public void vejo_a_listagem_dos_pedidos_cadastrados_no_período() {

		try {
			if(CustomKeywords.'listagempedidos.Ações.VerificarResultadoGeralPedidosConsultados'()) {


				CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou Lista dos Pedidos")
			}
		} catch (Exception ex) {

			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou Lista dos Pedidos")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou Lista dos Pedidos")
		}
	}

	@Quando("seleciono carregar mais resultados")
	public void seleciono_carregar_mais_resultados() {

		CustomKeywords.'listagempedidos.Ações.RolarAtéBtnCarregarMaisResultado'()
		CustomKeywords.'listagempedidos.Ações.ClicarbtnCarregarMaisResultado'()
	}

	@Então("exibe a continuacao da pesquisa")
	public void exibe_a_continuacao_da_pesquisa() {

		try {
			if(CustomKeywords.'listagempedidos.Ações.VerificarResultadoGeralPedidosConsultados'()) {


				CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou Lista dos Pedidos")
			}
		} catch (Exception ex) {

			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou Lista dos Pedidos")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou Lista dos Pedidos")
		}
	}


	@Quando("informo periodoDE (.*)")
	public void informo_periodoDE(String periodoDE) {

		CustomKeywords.'listagempedidos.Ações.LimparCampoPeriodoDE'()
		CustomKeywords.'listagempedidos.Ações.DigitarCampoPeriodoDE'(GlobalVariable.DataAtualDia)
	}


	@Então("vejo a mensagem A data Inicial deve ser menor que a data final.")
	public void vejo_a_mensagem_A_data_Inicial_deve_ser_menor_que_a_data_final() {

		try {

			if(CustomKeywords.'listagempedidos.Ações.VerificarExibiçãoJanelaData'()) {

				CustomKeywords.'listagempedidos.Ações.VerificarExibiçãoMensagemRegraData'()
				CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou a Mensagem A data Inicial deve ser superior a data final.")
			}
		} catch (Exception ex) {

			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou a Mensagem A data Inicial deve ser superior a data final.")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou a Mensagem A data Inicial deve ser superior a data final.")
		}
	}


	@Quando("seleciono botão OK")
	public void seleciono_botão_OK() {

		CustomKeywords.'listagempedidos.Ações.ClicarBotãoOK'()
	}

	@Então("vejo a tela de listagem de pedidos")
	public void vejo_a_tela_de_listagem_de_pedidos() {

		try {
			if(CustomKeywords.'arealogada.Ações.VerificarExibiçãoIconeTOTVS'()) {

				CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou ícone TOTVS")
			}
		} catch (Exception ex) {

			CustomKeywords.'evidencia.Ações.Evidencia'("IconeTOTVSNOK")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou ícone TOTVS")
		}
	}



	@Quando("informo numero do pedido (.*)")
	public void informo_numero_do_pedido(String NumPedido) {


		CustomKeywords.'listagempedidos.Ações.ClicarCampoNumeroPedido'()
		CustomKeywords.'listagempedidos.Ações.DigitarCampoNumeroPedido'(NumPedido)
	}

	@Então("vejo apenas um registro no resultado da consulta (.*)")
	public void vejo_apenas_um_registro_no_resultado_da_consulta(String NumPedido)  {

		try {

			if(CustomKeywords.'listagempedidos.Ações.VerificarExibiçãoNumeroPedido'()) {

				CustomKeywords.'listagempedidos.Ações.CompararExibiçãoNumeroPedido'(NumPedido)
				CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o Número do Pedido")
			}
		} catch (Exception ex) {

			CustomKeywords.'evidencia.Ações.Evidencia'("Número do Pedido NOK")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o Número do Pedido")
		}

		CustomKeywords.'comuns.Ações.AtualizarPágina'()
	}

	@Quando("informo nome do cliente (.*)")
	public void informo_nome_do_cliente_ADAO_GUEDES(String NomeCliente) {

		CustomKeywords.'listagempedidos.Ações.ClicarlCampoCliente'()
		CustomKeywords.'listagempedidos.Ações.DigitarlCampoCliente'(NomeCliente)
		CustomKeywords.'listagempedidos.Ações.AguardarExibicaoClienteAdao'()
		CustomKeywords.'listagempedidos.Ações.SelecionarClienteAdao'()
	}


	@Então("vejo apenas um registro com o cliente específico (.*) no resultado da consulta")
	public void vejo_apenas_um_registro_com_o_cliente_específico_ADAO_GUEDES_no_resultado_da_consulta(String NomeCliente) {
		
		CustomKeywords.'comuns.Ações.AguardarPróximaAção'(GlobalVariable.G_ShortTimeOut)

		try {

			if(CustomKeywords.'listagempedidos.Ações.VerificarExibiçãoNomeCliente'()) {

				CustomKeywords.'listagempedidos.Ações.CompararExibiçãoNomeCliente'(NomeCliente)
				CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o Nome do Cliente")
			}
		} catch (Exception ex) {

			CustomKeywords.'evidencia.Ações.Evidencia'("Nome do Cliente NOK")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o Nome do Cliente")
		}
	}

	@Quando("seleciono ...")
	public void seleciono() {

		CustomKeywords.'listagempedidos.Ações.ClicarBotão3PontosOrçamento'()
	}

	@Quando("clico em Editar Pedido")
	public void clico_em_Editar_Pedido() {

		CustomKeywords.'listagempedidos.Ações.ClicarBotãoEditarPedido'()
	}

	@Então("vejo o pedido de venda no status2 (.*) com o numero no pedido")
	public void vejo_o_pedido_de_venda_no_status_com_o_numero_no_pedido(String status2) {

		try {
			if(CustomKeywords.'editarpedido.editarpedidoAções.VerificarExibiçãoStatusOrcamento'()) {


				CustomKeywords.'editarpedido.editarpedidoAções.CompararStatusOrcamento'(status2)
				CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o Status Orçamento")
			}
		} catch (Exception ex) {

			CustomKeywords.'evidencia.Ações.Evidencia'("Status Orçamento NOK")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o Status Orçamento")
		}


		try {
			if(CustomKeywords.'editarpedido.editarpedidoAções.VerificarExibiçãoNumeroPedido'()) {

				CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o Numero do Pedido")
			}
		} catch (Exception ex) {

			CustomKeywords.'evidencia.Ações.Evidencia'("Numero do Pedido NOK")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o Número do Pedido")
		}
	}

	@E("retorno para tela de listagem de pedido")
	public void retorno_para_tela_de_listagem_de_pedido() {

		CustomKeywords.'editarpedido.editarpedidoAções.ClicarBotãoVoltar'()
		CustomKeywords.'editarpedido.editarpedidoAções.ClicarBotãoConfirmar'()
		CustomKeywords.'comuns.Ações.AguardarPróximaAção'(3)
	}

	@Então("vejo o botão Editar Pedido desabilitado")
	public void vejo_o_botão_Editar_Pedido_desabilitado() {

		try {
			if(CustomKeywords.'listagempedidos.Ações.VerificarBotãoEditarPedidoDesabilitado'()) {

				CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou Editar Pedido Desabilitado")
			}
		} catch (Exception ex) {

			CustomKeywords.'evidencia.Ações.Evidencia'("Editar Pedido Desabilitado NOK")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou Editar Pedido Desabilitado")
		}
	}

	@Então("vejo a mensagem (.*) Favor informe as datas de emissão inicial e final ou status do pedido.")
	public void vejo_a_mensagem_Favor_informe_as_datas_de_emissão_inicial_e_final_ou_status_do_pedido_Favor_informe_as_datas_de_emissão_inicial_e_final_ou_status_do_pedido(String mensagem) {


		try {
			if(CustomKeywords.'listagempedidos.Ações.VerificarExibiçãoJanelaData'()) {

				CustomKeywords.'listagempedidos.Ações.CompararMensagemDataInválida'(mensagem)
				CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou a Mensagem Favor informe as datas de emissão inicial e final ou status do pedido.")
			}
		} catch (Exception ex) {

			CustomKeywords.'evidencia.Ações.Evidencia'("Mensagem Favor informe as datas de emissão inicial e final ou status do pedido. NOK")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou a Mensagem Favor informe as datas de emissão inicial e final ou status do pedido.")
		}
	}

	@Quando("informo periodoATE (.*)")
	public void informo_periodoATE_periodoATE(String periodoATE) {

		CustomKeywords.'listagempedidos.Ações.LimparCampoPeriodoATE'()
		CustomKeywords.'listagempedidos.Ações.DigitarCampoPeriodoATE'(periodoATE)
	}

	@Quando("informo a data de emissão pelo calendário")
	public void informo_a_data_de_emissão_pelo_calendário() {

		CustomKeywords.'listagempedidos.Ações.ClicarIconeCalendário'()
		CustomKeywords.'comuns.Ações.AguardarPróximaAção'(1)
		CustomKeywords.'listagempedidos.Ações.ClicarSetaEsquerdaAno'()
		CustomKeywords.'comuns.Ações.AguardarPróximaAção'(1)
		CustomKeywords.'listagempedidos.Ações.ClicarSetaEsquerdaAno'()
		CustomKeywords.'comuns.Ações.AguardarPróximaAção'(1)
		CustomKeywords.'listagempedidos.Ações.ClicarMêsFevereiro'()
		CustomKeywords.'comuns.Ações.AguardarPróximaAção'(1)
		CustomKeywords.'listagempedidos.Ações.ClicarDia1Janeiro'()
	}

	@Quando("informo cpf (.*)")
	public void informo_cpf(String cpf) {

		CustomKeywords.'listagempedidos.Ações.DigitarlCampoCliente'(cpf)
		CustomKeywords.'listagempedidos.Ações.AguardaExibiçãoCliente'()
		CustomKeywords.'comuns.Ações.AguardarPróximaAção'(GlobalVariable.G_ShortTimeOut)
		CustomKeywords.'listagempedidos.Ações.SelecionarRetornoCliente'()
	}

	@Quando("pesquiso pelo cpf (.*) do cliente")
	public void pesquiso_pelo_cpf_do_cliente(String cpf) {

		CustomKeywords.'listagempedidos.Ações.DigitarlCampoCliente'(GlobalVariable.CPF)
		CustomKeywords.'listagempedidos.Ações.AguardaExibiçãoCliente'()
		CustomKeywords.'listagempedidos.Ações.SelecionarRetornoCliente'()
		CustomKeywords.'listagempedidos.Ações.ClicarBotãoPesquisar'()
	}

	@Quando("pesquiso pelo numero identificação (.*) do cliente")
	public void pesquiso_pelo_numero_identificação_do_cliente(String identificação) {

		CustomKeywords.'listagempedidos.Ações.DigitarlCampoCliente'(GlobalVariable.NumeroIdentificacao)
		CustomKeywords.'listagempedidos.Ações.AguardaExibiçãoCliente'()
		CustomKeywords.'listagempedidos.Ações.SelecionarRetornoCliente'()
		CustomKeywords.'listagempedidos.Ações.ClicarBotãoPesquisar'()
	}

	@Quando("pesquiso pelo numero do cnpj (.*) do cliente")
	public void pesquiso_pelo_numero_do_cnpj_do_cliente(String cnpj) {

		CustomKeywords.'listagempedidos.Ações.DigitarlCampoCliente'(GlobalVariable.CNPJ)
		CustomKeywords.'listagempedidos.Ações.AguardaExibiçãoCliente'()
		CustomKeywords.'listagempedidos.Ações.SelecionarRetornoCliente'()
		CustomKeywords.'listagempedidos.Ações.ClicarBotãoPesquisar'()
	}

	@Então("vejo o resultado da consulta com o pedido de venda no status Aberto com numero do pedido")
	public void vejo_o_resultado_da_consulta_com_o_pedido_de_venda_no_status_Aberto_com_numero_do_pedido() {

		if(CustomKeywords.'listagempedidos.Ações.VerificarExibiçãoNumeroPedido'()) {

			CustomKeywords.'listagempedidos.Ações.GravarNumeroPedido'()
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Foi Apresentando e Gravado o Numero do Pedido")
		} else {

			CustomKeywords.'comuns.Ações.TestePassou'("Falhou: Não foi apresentado o numero do pedido")
		}

		if(CustomKeywords.'listagempedidos.Ações.VerificarExibiçãoStatusPedido'()) {

			CustomKeywords.'listagempedidos.Ações.CompararStatusAbertoPedido'()
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o Status Aberto do Pedido de Venda")
		} else {

			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não apresentou o Status Aberto do Pedido de Venda")
		}
	}
}