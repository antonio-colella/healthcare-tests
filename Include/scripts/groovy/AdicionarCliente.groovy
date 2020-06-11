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
import cucumber.api.java.pt.Quando
import cucumber.api.java.pt.Então


class AdicionarCliente {

	@Dado("eu estou na tela de listagem de clientes")
	public void eu_estou_na_tela_de_listagem_de_clientes() {

		CustomKeywords.'listagemclientes.Ações.VerificarExibiçãoBotãoPesquisar'()
	}


	@Quando("seleciono o botão Cadastros")
	public void seleciono_o_botão_Cadastros() {

		CustomKeywords.'arealogada.Ações.ClicarBotãoMenuCadastros'()
	}

	@Quando("seleciono o botão Adicionar Clientes")
	public void seleciono_o_botão_Adicionar_Clientes() {

		CustomKeywords.'arealogada.Ações.AguardarExibiçãoBotãoMenuAdicionarClientes'()
		CustomKeywords.'arealogada.Ações.ClicarBotãoMenuAdicionarClientes'()
	}


	@Então("vejo a tela de clientes")
	public void vejo_a_tela_de_clientes() {

		if(CustomKeywords.'clientes.Ações.VerificarExibiçãoTelaAdicionarClientes'()){

			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou a tela de Adicionar Clientes")
		} else {

			CustomKeywords.'evidencia.Ações.Evidencia'("Nao Apresentou a tela de Adicionar Clientes")
			CustomKeywords.'comuns.Ações.TestePassou'("Falhou: Nao Apresentou a tela de Adicionar Clientes")
		}
	}

	@Quando("preencho os campos (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*) como dados pessoais fisicos")
	public void preencho_os_campos_como_dados_pessoais(String pessoa, String cpf, String rg, String nome, String nascimento, String sexo, String email, String celular, String telefone) {

		CustomKeywords.'clientes.Ações.SelecionarTipoPessoa'(pessoa)
		CustomKeywords.'clientes.Ações.GravarTipoPessoaFísica'()
		CustomKeywords.'clientes.Ações.PreencherCampoCPF'(CustomKeywords.'comuns.Ações.GerarCPF'())
		CustomKeywords.'clientes.Ações.GravarCPFCliente'()
		CustomKeywords.'clientes.Ações.PreencherCampoRG'(CustomKeywords.'comuns.Ações.GerarRG'())
		CustomKeywords.'clientes.Ações.GravarRGCliente'()
		CustomKeywords.'clientes.Ações.PreencherCampoNome'(nome)
		CustomKeywords.'clientes.Ações.GravarNomeCliente'()
		CustomKeywords.'clientes.Ações.PreencherCampoDataNascimento'(nascimento)
		CustomKeywords.'clientes.Ações.GravarDataNascimentoCliente'()
		CustomKeywords.'clientes.Ações.SelecionarTipoSexo'(sexo)
		CustomKeywords.'clientes.Ações.PreencherCampoEmail'(email)
		CustomKeywords.'clientes.Ações.GravarEmailCliente'()
		CustomKeywords.'clientes.Ações.PreencherCampoCelular'(celular)
		CustomKeywords.'clientes.Ações.GravarCelularCliente'()
		CustomKeywords.'clientes.Ações.PreencherCampoTelefone'(telefone)
		CustomKeywords.'clientes.Ações.GravarTelefoneCliente'()
	}


	@Quando("preencho os campos (.*), (.*), (.*), (.*), (.*), (.*), (.*) de endereço")
	public void preencho_os_campos_de_endereço(String cep, String endereco, String numero, String bairro, String complemento, String cidade, String uf) {

		CustomKeywords.'clientes.Ações.PreencherCampoCEP'(cep)
		CustomKeywords.'clientes.Ações.GravarCepCliente'()
		CustomKeywords.'clientes.Ações.PreencherCampoEndereço'(endereco)
		CustomKeywords.'clientes.Ações.GravarEndereçoCliente'()
		CustomKeywords.'clientes.Ações.PreencherCampoNúmeroEndereço'(numero)
		CustomKeywords.'clientes.Ações.GravarNumeroCliente'()
		CustomKeywords.'clientes.Ações.PreencherCampoBairro'(bairro)
		CustomKeywords.'clientes.Ações.GravarBairroCliente'()
		CustomKeywords.'clientes.Ações.PreencherCampoComplemento'(complemento)
		CustomKeywords.'clientes.Ações.GravarComplementoCliente'()
		CustomKeywords.'clientes.Ações.PreencherCampoCidade'(cidade)
		CustomKeywords.'clientes.Ações.GravarCidadeCliente'()
		CustomKeywords.'clientes.Ações.PreencherCampoUF'(uf)
		CustomKeywords.'clientes.Ações.GravarUFCliente'()
	}

	@Quando("preencho os campos (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*) como dados pessoais")
	public void preencho_os_campos_Pessoa_Física_Automação_de_Teste_Masculino_peter_parker_totvs_com_br_como_dados_pessoais(String pessoa, String rg, String nome, String nascimento, String sexo, String email, String celular, String telefone) {

		CustomKeywords.'clientes.Ações.SelecionarTipoPessoa'(pessoa)
		CustomKeywords.'clientes.Ações.PreencherCampoRG'(CustomKeywords.'comuns.Ações.GerarRG'())
		CustomKeywords.'clientes.Ações.PreencherCampoNome'(nome)
		CustomKeywords.'clientes.Ações.GravarNomeCliente'()
		CustomKeywords.'clientes.Ações.PreencherCampoDataNascimento'(nascimento)
		CustomKeywords.'clientes.Ações.SelecionarTipoSexo'(sexo)
		CustomKeywords.'clientes.Ações.PreencherCampoEmail'(email)
		CustomKeywords.'clientes.Ações.PreencherCampoCelular'(celular)
		CustomKeywords.'clientes.Ações.PreencherCampoTelefone'(telefone)
	}

	@Quando("informo os campos (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*) como dados pessoais")
	public void informo_os_campos_Pessoa_Física_Automação_de_Teste_Masculino_peter_parker_totvs_com_br_como_dados_pessoais(String pessoa, String cpf, String nome, String nascimento, String sexo, String email, String celular, String telefone) {

		CustomKeywords.'clientes.Ações.SelecionarTipoPessoa'(pessoa)
		CustomKeywords.'clientes.Ações.PreencherCampoCPF'(CustomKeywords.'comuns.Ações.GerarCPF'())
		CustomKeywords.'clientes.Ações.GravarCPFCliente'()
		CustomKeywords.'clientes.Ações.PreencherCampoNome'(nome)
		CustomKeywords.'clientes.Ações.GravarNomeCliente'()
		CustomKeywords.'clientes.Ações.PreencherCampoDataNascimento'(nascimento)
		CustomKeywords.'clientes.Ações.SelecionarTipoSexo'(sexo)
		CustomKeywords.'clientes.Ações.PreencherCampoEmail'(email)
		CustomKeywords.'clientes.Ações.PreencherCampoCelular'(celular)
		CustomKeywords.'clientes.Ações.PreencherCampoTelefone'(telefone)
	}

	@Quando("preencho apenas os campos obrigatórios (.*), (.*), (.*), (.*), (.*), (.*), (.*) como dados pessoais")
	public void preencho_apenas_os_campos_obrigatórios_Pessoa_Física_Automação_de_Teste_Masculino_como_dados_pessoais(String pessoa, String cpf, String rg, String nome, String nascimento, String sexo, String celular) {

		CustomKeywords.'clientes.Ações.SelecionarTipoPessoa'(pessoa)
		CustomKeywords.'clientes.Ações.PreencherCampoCPF'(CustomKeywords.'comuns.Ações.GerarCPF'())
		CustomKeywords.'clientes.Ações.GravarCPFCliente'()
		CustomKeywords.'clientes.Ações.PreencherCampoRG'(CustomKeywords.'comuns.Ações.GerarRG'())
		CustomKeywords.'clientes.Ações.PreencherCampoNome'(nome)
		CustomKeywords.'clientes.Ações.GravarNomeCliente'()
		CustomKeywords.'clientes.Ações.PreencherCampoDataNascimento'(nascimento)
		CustomKeywords.'clientes.Ações.SelecionarTipoSexo'(sexo)
		CustomKeywords.'clientes.Ações.PreencherCampoCelular'(celular)
	}

	@Quando("informo apenas os campos obrigatórios (.*), (.*), (.*), (.*), (.*), (.*) de endereço")
	public void informo_apenas_os_campos_obrigatórios_Rua_Voluntários_da_Pátria_Santana_São_Paulo_SP_de_endereço(String cep, String endereco, String numero, String bairro, String cidade, String uf) {

		CustomKeywords.'clientes.Ações.PreencherCampoCEP'(cep)
		CustomKeywords.'clientes.Ações.PreencherCampoEndereço'(endereco)
		CustomKeywords.'clientes.Ações.PreencherCampoNúmeroEndereço'(numero)
		CustomKeywords.'clientes.Ações.PreencherCampoBairro'(bairro)
		CustomKeywords.'clientes.Ações.PreencherCampoCidade'(cidade)
		CustomKeywords.'clientes.Ações.PreencherCampoUF'(uf)
	}

	@E("informo o rg (.*) do estado de minas gerais")
	public void informo_o_rg_do_estado_de_minas_gerais(String rg){

		CustomKeywords.'clientes.Ações.PreencherCampoRG'(CustomKeywords.'comuns.Ações.GerarRGParaMG'())
		CustomKeywords.'clientes.Ações.GravarRGCliente'()
	}

	@E("informo o numero do rg (.*) inválido")
	public void informo_o_numero_do_rg_inválido(String rg){

		CustomKeywords.'clientes.Ações.PreencherCampoRG'(rg)
	}

	@E("informo o cpf (.*) inválido")
	public void informo_o_cpf_inválido(String cpf) {

		CustomKeywords.'clientes.Ações.PreencherCampoCPF'(cpf)
	}

	@E("informo o cpf já cadastrado (.*)")
	public void informo_o_cpf_já_cadastrado(String cpf) {

		CustomKeywords.'clientes.Ações.PreencherCampoCPF'(cpf)
	}

	@Então("vejo a mensagem (.*) de CPF inválido")
	public void vejo_a_mensagem_mensagem_de_CPF_inválido(String mensagem) {

		if(CustomKeywords.'clientes.Ações.VerificarExibiçãoJanela'()) {

			CustomKeywords.'clientes.Ações.CompararMensagemCPFInválido'(mensagem)
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou a mensagem CPF Inválido")
		} else {

			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou a mensagem CPF Inválido")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou a mensagem CPF Inválido")
		}
	}

	@Quando("preencho o campo (.*) como observação")
	public void preencho_o_campo_como_observação(String observação) {

		CustomKeywords.'clientes.Ações.PreencherCampoObservações'(observação)
	}

	@Quando("seleciono o botão Salvar")
	public void seleciono_o_botão_Salvar() {

		CustomKeywords.'clientes.Ações.ClicarBotãoSalvar'()
	}

	@Então("vejo a tela de listagem de cliente")
	public void vejo_a_tela_de_listagem_de_cliente() {

		if(CustomKeywords.'listagemclientes.Ações.VerificarExibiçãoBotãoPesquisar'()) {

			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o botão Pesquisar da Tela de Listagem de Cliente")
		} else {

			CustomKeywords.'evidencia.Ações.Evidencia'("Não Apresentou o botão Pesquisar da Tela de Listagem de Cliente")
			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o botão Pesquisar da Tela de Listagem de Cliente")
		}
	}

	@Quando("realizo a pesquisa pelo (.*)")
	public void realizo_a_pesquisa_pelo(String cpf) {

		CustomKeywords.'listagemclientes.Ações.AguardaApresentaçãoCampoIdentificação'()
		CustomKeywords.'comuns.Ações.AguardarPróximaAção'(GlobalVariable.G_ShortTimeOut)
		CustomKeywords.'listagemclientes.Ações.VerificarCampoidentificaçãoClicável'()
		CustomKeywords.'listagemclientes.Ações.PreencherCampoIdentificação'(GlobalVariable.CPF)
	}

	@Quando("realizo a pesquisa pela identificação (.*)")
	public void realizo_a_pesquisa_pela_identificação(String identificação) {

		CustomKeywords.'listagemclientes.Ações.AguardaApresentaçãoCampoIdentificação'()
		CustomKeywords.'comuns.Ações.AguardarPróximaAção'(GlobalVariable.G_ShortTimeOut)
		CustomKeywords.'listagemclientes.Ações.PreencherCampoIdentificação'(GlobalVariable.NumeroIdentificacao)
	}

	@Quando("realizo a consulta pelo número cnpj (.*)")
	public void realizo_a_consulta_pelo_número_cnpj(String cnpj) {

		CustomKeywords.'listagemclientes.Ações.AguardaApresentaçãoCampoIdentificação'()
		CustomKeywords.'listagemclientes.Ações.VerificarCampoidentificaçãoClicável'()
		CustomKeywords.'listagemclientes.Ações.PreencherCampoIdentificação'(GlobalVariable.CNPJ)
	}

	@Quando("seleciono pesquisar cliente")
	public void seleciono_pesquisar_cliente() {

		CustomKeywords.'listagemclientes.Ações.ClicarBotoãoPesquisar'()
	}



	@Então("vejo no resultado o cliente cadastrado na tela de adicionar cliente")
	public void vejo_no_resultado_o_cliente_cadastrado_na_tela_de_adicionar_cliente() {

		if(CustomKeywords.'listagemclientes.Ações.VerificarExibiçãoResultadoGridClientes'()) {

			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Foi Apresentado o Cliente com o CPF cadastrado com sucesso!")
		} else {

			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Foi Apresentado o Cliente com o CPF cadastrado com sucesso!")
		}
	}

	@E("preencho o campo cep (.*)")
	public void preencho_o_campo_cep(String cep) {

		CustomKeywords.'clientes.Ações.RolarPáginaAtéCampoCEP'()
		CustomKeywords.'clientes.Ações.PreencherCampoCEP'(cep)
	}

	@E("seleciono Buscar")
	public void seleciono_Buscar() {

		CustomKeywords.'clientes.Ações.ClicarBotãoBuscarCEP'()
		CustomKeywords.'comuns.Ações.AguardarPróximaAção'(GlobalVariable.G_ShortTimeOut)
	}

	@Então("vejo os campos de endereço preenchidos automaticamente")
	public void vejo_os_campos_de_endereço_preenchidos_automaticamente() {

		if(CustomKeywords.'clientes.Ações.VerificarExibiçãoEndereçoAutomático'()){

			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o Endereço Automaticamente com sucesso")
		} else {

			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o Endereço Automaticamente com sucesso")
		}

		if(CustomKeywords.'clientes.Ações.VerificarExibiçãoBairroAutomático'()){

			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou o Bairro Automaticamente com sucesso")
		} else {

			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou o Bairro Automaticamente com sucesso")
		}

		if(CustomKeywords.'clientes.Ações.VerificarExibiçãoCidadeAutomático'()){

			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou a Cidade Automaticamente com sucesso")
		} else {

			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou a Cidade Automaticamente com sucesso")
		}

		if(CustomKeywords.'clientes.Ações.VerificarExibiçãoUFAutomático'()){

			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou a UF Automaticamente com sucesso")
		} else {

			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou a UF Automaticamente com sucesso")
		}
	}

	@Quando("preenho os campos numero (.*), complemento (.*) de endereço")
	public void preenho_os_campos_numero_complementoo_de_endereço(String numero, String complemento) {

		CustomKeywords.'clientes.Ações.PreencherCampoNúmeroEndereço'(numero)
		CustomKeywords.'clientes.Ações.PreencherCampoComplemento'(complemento)
	}

	@Quando("seleciono o botão Adicionar Novo Cliente")
	public void seleciono_o_botão_Adicionar_Novo_Cliente() {

		CustomKeywords.'listagemclientes.Ações.VerificarExibiçãoBotãoAdicionarNovoCliente'()
		CustomKeywords.'listagemclientes.Ações.ClicarBotãoAdicionarNovoCliente'()
	}

	@E("seleciono o botão Listagem de Clientes")
	public void seleciono_o_botão_Listagem_de_Clientes(){

		CustomKeywords.'arealogada.Ações.AguardaExibiçãoBotãoListagemClientes'()
		CustomKeywords.'arealogada.Ações.ClicarBotãoListagemClientes'()
		CustomKeywords.'comuns.Ações.AguardarPróximaAção'(GlobalVariable.G_ShortTimeOut)
	}


	@Quando("informo os dados pessoa informal (.*), identificação (.*), nome (.*), nascimento (.*), sexo (.*), email (.*), celular (.*), telefone (.*) como dados pessoais")
	public void informo_os_dados_pessoa_informal_Pessoa_Informal_identificação_nome_Automação_de_Teste_Pessoa_Informal_nascimento_sexo_Masculino_email_peter_parker_totvs_com_br_celular_telefone_como_dados_pessoais(String pessoa, String identificação, String nome, String nascimento, String sexo, String email, String celular, String telefone) {


		CustomKeywords.'clientes.Ações.SelecionarTipoPessoa'(pessoa)
		CustomKeywords.'clientes.Ações.GravarTipoPessoaInformal'()
		CustomKeywords.'clientes.Ações.PreencherCampoIdentificação'(CustomKeywords.'comuns.Ações.GerarRG'())
		CustomKeywords.'clientes.Ações.GravarIdentificaçãoCliente'()
		CustomKeywords.'clientes.Ações.PreencherCampoNome'(nome)
		CustomKeywords.'clientes.Ações.GravarNomeCliente'()
		CustomKeywords.'clientes.Ações.PreencherCampoDataNascimento'(nascimento)
		CustomKeywords.'clientes.Ações.GravarDataNascimentoCliente'()
		CustomKeywords.'clientes.Ações.SelecionarTipoSexo'(sexo)
		CustomKeywords.'clientes.Ações.PreencherCampoEmail'(email)
		CustomKeywords.'clientes.Ações.GravarEmailCliente'()
		CustomKeywords.'clientes.Ações.PreencherCampoCelular'(celular)
		CustomKeywords.'clientes.Ações.GravarCelularCliente'()
		CustomKeywords.'clientes.Ações.PreencherCampoTelefone'(telefone)
		CustomKeywords.'clientes.Ações.GravarTelefoneCliente'()
	}

	@Quando("informo já cadastrados os dados pessoa informal (.*), identificação (.*), nome (.*), nascimento (.*), sexo (.*), email (.*), celular (.*), telefone (.*) como dados pessoais")
	public void informo_já_cadastrados_os_dados_pessoa_informal_Pessoa_Informal_identificação_nome_Automação_de_Teste_Pessoa_Informal_nascimento_sexo_Masculino_email_peter_parker_totvs_com_br_celular_telefone_como_dados_pessoais(String pessoa, String identificação, String nome, String nascimento, String sexo, String email, String celular, String telefone) {


		CustomKeywords.'clientes.Ações.SelecionarTipoPessoa'(pessoa)
		CustomKeywords.'clientes.Ações.PreencherCampoIdentificação'(identificação)
		CustomKeywords.'clientes.Ações.PreencherCampoNome'(nome)
		CustomKeywords.'clientes.Ações.PreencherCampoDataNascimento'(nascimento)
		CustomKeywords.'clientes.Ações.SelecionarTipoSexo'(sexo)
		CustomKeywords.'clientes.Ações.PreencherCampoEmail'(email)
		CustomKeywords.'clientes.Ações.PreencherCampoCelular'(celular)
		CustomKeywords.'clientes.Ações.PreencherCampoTelefone'(telefone)
	}


	@Quando("preencho pessoa (.*), cnpj (.*), IE (.*), razao social (.*), nome fantasia (.*), email (.*), celular (.*), telefone (.*) como dados pessoais")
	public void preencho_pessoa_Pessoa_Jurídica_cnpj_IE_razao_social_Quality_Assurance_Automation_nome_fantasia_Automação_de_Testes_PJ_email_peter_parker_totvs_com_br_celular_telefone_como_dados_pessoais(String pessoa, String cnpj, String InscricaoEstadual, String razaosocial, String nomefantasia, String email, String celular, String telefone) {

		CustomKeywords.'clientes.Ações.SelecionarTipoPessoa'(pessoa)
		CustomKeywords.'clientes.Ações.GravarTipoPessoaJurídica'()
		CustomKeywords.'clientes.Ações.PreencherCampoCNPJ'(CustomKeywords.'comuns.Ações.GerarCNPJ'())
		CustomKeywords.'clientes.Ações.GravarNúmeroCNPJ'()
		CustomKeywords.'clientes.Ações.PreencherCampoInscriçãoEstadual'(CustomKeywords.'comuns.Ações.GerarInscriçãoEstadual'())
		CustomKeywords.'clientes.Ações.GravarInscriçãoEstadualCliente'()
		CustomKeywords.'clientes.Ações.PreencherCampoRazãoSocial'(razaosocial)
		CustomKeywords.'clientes.Ações.GravarRazãoSocial'()
		CustomKeywords.'clientes.Ações.PreencherCampoNomeFantasia'(nomefantasia)
		CustomKeywords.'clientes.Ações.GravarNomeFantasiaCliente'()
		CustomKeywords.'clientes.Ações.PreencherCampoEmail'(email)
		CustomKeywords.'clientes.Ações.GravarEmailCliente'()
		CustomKeywords.'clientes.Ações.PreencherCampoCelular'(celular)
		CustomKeywords.'clientes.Ações.GravarCelularCliente'()
		CustomKeywords.'clientes.Ações.PreencherCampoTelefone'(telefone)
		CustomKeywords.'clientes.Ações.GravarTelefoneCliente'()
	}

	@Quando("informo pessoa (.*), cnpj (.*), IE (.*), razao social (.*), nome fantasia (.*), email (.*), celular (.*), telefone (.*) como dados pessoais")
	public void informo_pessoa_Pessoa_Jurídica_cnpj_IE_razao_social_Quality_Assurance_Automation_nome_fantasia_Automação_de_Testes_PJ_email_peter_parker_totvs_com_br_celular_telefone_como_dados_pessoais(String pessoa, String cnpj, String InscricaoEstadual, String razaosocial, String nomefantasia, String email, String celular, String telefone) {

		CustomKeywords.'clientes.Ações.SelecionarTipoPessoa'(pessoa)
		CustomKeywords.'clientes.Ações.PreencherCampoCNPJ'(cnpj)
		CustomKeywords.'clientes.Ações.PreencherCampoInscriçãoEstadual'(InscricaoEstadual)
		CustomKeywords.'clientes.Ações.PreencherCampoRazãoSocial'(razaosocial)
		CustomKeywords.'clientes.Ações.PreencherCampoNomeFantasia'(nomefantasia)
		CustomKeywords.'clientes.Ações.PreencherCampoEmail'(email)
		CustomKeywords.'clientes.Ações.PreencherCampoCelular'(celular)
		CustomKeywords.'clientes.Ações.PreencherCampoTelefone'(telefone)
	}

	@Então("vejo a mensagem (.*) CNPJ já Cadastrado")
	public void vejo_a_mensagem_CNPJ_já_Cadastrado_CNPJ_já_Cadastrado(String mensagem) {

		if(CustomKeywords.'clientes.Ações.VerificarExibiçãoJanela'()) {

			CustomKeywords.'clientes.Ações.CompararMensagemCNPJJáCadastrado'(mensagem)
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou a mensagem CNPJ Já Cadastrado")
		} else {

			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou a mensagem CNPJ Já Cadastrado")
		}
	}


	@Então("vejo a mensagem (.*) O CNPJ informado não é válido")
	public void vejo_a_mensagem_O_CNPJ_informado_não_é_válido(String mensagem) {

		if(CustomKeywords.'clientes.Ações.VerificarExibiçãoJanela'()) {

			CustomKeywords.'clientes.Ações.CompararMensagemCNPJInválido'(mensagem)
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou a mensagem CNPJ Já Cadastrado")
		} else {

			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou a mensagem CNPJ Já Cadastrado")
		}
	}

	@Então("vejo a mensagem (.*) Você precisa informar o número de CNPJ do cliente")
	public void vejo_a_mensagem_Você_precisa_informar_o_número_de_CNPJ_do_cliente(String mensagem) {

		if(CustomKeywords.'clientes.Ações.VerificarExibiçãoJanela'()) {

			CustomKeywords.'clientes.Ações.CompararMensagemCNPJNãoInformando'(mensagem)
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou a mensagem Você precisa informar o número de CNPJ do cliente")
		} else {

			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou a mensagem Você precisa informar o número de CNPJ do cliente")
		}
	}


	@Então("vejo a mensagem (.*) Número do RG inválido")
	public void vejo_a_mensagem_Número_do_RG_inválido(String mensagem) {

		if(CustomKeywords.'clientes.Ações.VerificarExibiçãoJanela'()) {

			CustomKeywords.'clientes.Ações.CompararMensagemRGInválido'(mensagem)
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou a mensagem Número do RG inválido")
		} else {

			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou a mensagem Número do RG inválido")
		}
	}

	@Quando("preencho o tipo de pessoa (.*)")
	public void preencho_tipo_de_pessoa_Pessoa_Jurídica(String pessoa) {

		CustomKeywords.'clientes.Ações.SelecionarTipoPessoa'(pessoa)
	}

	@E("seleciono o botão Salvar e Iniciar Pedido")
	public void seleciono_o_botão_Salvar_e_Iniciar_Pedido() {

		CustomKeywords.'clientes.Ações.ClicarBotãoSalvareIniciarPedido'()
	}

	@Então("vejo a mensagem (.*) sem efetivar o cadastro do cliente inválido")
	public void vejo_a_mensagem_sem_efetivar_o_cadastro_do_cliente_inválido(String mensagem) {

		if(CustomKeywords.'clientes.Ações.VerificarExibiçãoJanela'()) {

			CustomKeywords.'clientes.Ações.CompararMensagemCPFInválido'(mensagem)
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou a mensagem")
		} else {

			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou a mensagem")
		}
	}

	@Então("vejo a mensagem (.*) sem efetivar o cadastro do cliente inválido para pessoa informal")
	public void vejo_a_mensagem_Endereço_não_informado_O_nome_é_obrigatório_Data_de_nascimento_não_informada_identificação_não_informada_sem_efetivar_o_cadastro_do_cliente_inválido_para_pessoa_informal(String mensagem) {

		if(CustomKeywords.'clientes.Ações.VerificarExibiçãoJanela'()) {


			CustomKeywords.'clientes.Ações.CompararMensagemPessoaInformal'()
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou a mensagem")
		} else {


			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou a mensagem")
		}
	}

	@Então("vejo a mensagem (.*) CPF já existente no cadastro")
	public void vejo_a_mensagem_CPF_já_existente_no_cadastro(String mensagem) {

		if(CustomKeywords.'clientes.Ações.VerificarExibiçãoJanela'()) {

			CustomKeywords.'clientes.Ações.CompararMensagemCPFJáCadastrado'(mensagem)
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou a mensagem CPF já existente no cadastro")
		} else {

			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou a mensagem CPF já existente no cadastro")
		}
	}

	@Então("vejo a mensagem (.*) o CPF deve estar preenchido")
	public void vejo_a_mensagem_o_CPF_deve_estar_preenchido(String mensagem) {

		if(CustomKeywords.'clientes.Ações.VerificarExibiçãoJanela'()) {

			CustomKeywords.'clientes.Ações.CompararMensagemCPFDeveSerPreenchido'(mensagem)
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou a mensagem o CPF deve estar preenchido")
		} else {

			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou a mensagem o CPF deve estar preenchido")
		}
	}

	@Então("vejo a mensagem (.*) Cliente já Cadastrado")
	public void vejo_a_mensagem_Cliente_já_Cadastrado(String mensagem) {

		if(CustomKeywords.'clientes.Ações.VerificarExibiçãoJanela'()) {

			CustomKeywords.'clientes.Ações.CompararMensagemClienteJáCadastrado'(mensagem)
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou a mensagem Cliente já Cadastrado")
		} else {

			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou a mensagem Cliente já Cadastrado")
		}
	}

	@Quando("fecho a mensagem")
	public void fecho_a_mensagem() {

		CustomKeywords.'clientes.Ações.ClicarBotãoOKJanela'()
	}

	@Quando("seleciono Voltar")
	public void seleciono_Voltar() {

		CustomKeywords.'clientes.Ações.ClicarBotãoVoltar'()
	}

	@Então("vejo a tela de Listagem de Clientes")
	public void vejo_a_tela_de_Listagem_de_Clientes() {

		if(CustomKeywords.'listagemclientes.Ações.VerificarExibiçãoBotãoPesquisar'()){

			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou a tela de Listagem de Clientes")
		} else {

			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou a tela de Listagem de Clientes")
		}
	}

	@Então("vejo a mensagem (.*) CEP Inválido")
	public void vejo_a_mensagem_CEP_Inválido(String mensagem) {

		if(CustomKeywords.'clientes.Ações.AguardaExibiçãoMensagemCEPInválido'()) {

			CustomKeywords.'clientes.Ações.CompararMensagemCEPInválido'(mensagem)
			CustomKeywords.'comuns.Ações.TestePassou'("Passou: Apresentou a mensagem Cliente já Cadastrado")
		} else {

			CustomKeywords.'comuns.Ações.TesteFalhou'("Falhou: Não Apresentou a mensagem Cliente já Cadastrado")
		}
	}

	@Quando("preencho o campo cpf (.*) como dados pessoais")
	public void preencho_o_campo_cpf_como_dados_pessoais(String cpf){

		CustomKeywords.'clientes.Ações.PreencherCampoCPF'(cpf)
	}

	@Quando("preencho o campo rg (.*) como dados pessoais")
	public void preencho_o_campo_rg_como_dados_pessoais(String rg){

		CustomKeywords.'clientes.Ações.PreencherCampoRG'(rg)
	}

	@Quando("preencho o campo nome (.*) como dados pessoais")
	public void preencho_o_campo_nome_como_dados_pessoais(String nome){

		CustomKeywords.'clientes.Ações.PreencherCampoNome'(nome)
	}

	@Quando("preencho o campo nascimento (.*) como dados pessoais")
	public void preencho_o_campo_nascimento_como_dados_pessoais(String nascimento){

		CustomKeywords.'clientes.Ações.PreencherCampoDataNascimento'(nascimento)
	}

	@Quando("preencho o campo email (.*) como dados pessoais")
	public void preencho_o_campo_email_como_dados_pessoais(String email){

		CustomKeywords.'clientes.Ações.PreencherCampoEmail'(email)
	}

	@Quando("preencho o campo celular (.*) como dados pessoais")
	public void preencho_o_campo_celular_como_dados_pessoais(String celular){

		CustomKeywords.'clientes.Ações.PreencherCampoCelular'(celular)
	}

	@Quando("preencho o campo telefone (.*) como dados pessoais")
	public void preencho_o_campo_telefone_como_dados_pessoais(String telefone){

		CustomKeywords.'clientes.Ações.PreencherCampoTelefone'(telefone)
	}

	@Quando("preencho o campo endereco (.*) como dados pessoais")
	public void preencho_o_campo_endereco_como_dados_pessoais(String endereco){

		CustomKeywords.'clientes.Ações.PreencherCampoEndereço'(endereco)
	}

	@Quando("preencho o campo numero (.*) como dados pessoais")
	public void preencho_o_campo_numero_como_dados_pessoais(String numero) {

		CustomKeywords.'clientes.Ações.PreencherCampoNúmeroEndereço'(numero)
	}

	@Quando("preencho o campo bairro (.*) como dados pessoais")
	public void preencho_o_campo_bairro_Casa_Verde_como_dados_pessoais(String bairro) {

		CustomKeywords.'clientes.Ações.PreencherCampoBairro'(bairro)
	}

	@Quando("preencho o campo complemento (.*) como dados pessoais")
	public void preencho_o_campo_complemento_ao_lado_do_Verdinho_como_dados_pessoais(String complemento) {

		CustomKeywords.'clientes.Ações.PreencherCampoComplemento'(complemento)
	}

	@Quando("preencho o campo cidade (.*) como dados pessoais")
	public void preencho_o_campo_cidade_São_Paulo_como_dados_pessoais(String cidade) {

		CustomKeywords.'clientes.Ações.PreencherCampoCidade'(cidade)
	}

	@Quando("preencho o campo UF (.*) como dados pessoais")
	public void preencho_o_campo_UF_São_Paulo_como_dados_pessoais(String uf) {

		CustomKeywords.'clientes.Ações.PreencherCampoUF'(uf)
	}
	
	@Então("vejo a janela de Carta Consentimento")
	public void vejo_a_janela_de_Carta_Consentimento() {

		CustomKeywords.'cartaConsentimento.Ações.VerificarExibiçãoJanelaCartaConsentimento'()
		CustomKeywords.'cartaConsentimento.Ações.AguardaExibiçãoTextoCartaConsentimento'()
		CustomKeywords.'cartaConsentimento.Ações.VerificarExibiçãoTextoCartaConsentimento'()
		
	}
	
	@Quando("aceito as condições da carta consentimento")
	public void aceito_as_condições_da_carta_consentimento() {
 
		CustomKeywords.'cartaConsentimento.Ações.ClicarBotãoSwitch'()
		
	}
	
	@Então("vejo o texto {string}")
	public void vejo_o_texto(String aceito) {
 
		CustomKeywords.'cartaConsentimento.Ações.VerificarTextoAceito'(aceito)
		
	}
	
	@Então("confirmo a carta consentimento")
	public void confirmo_a_carta_consentimento() {
		
		
		CustomKeywords.'cartaConsentimento.Ações.ClicarBotãoConfirmar'()		
		
	}
	
	@Quando("não aceito as condições da carta consentimento")
	public void não_aceito_as_condições_da_carta_consentimento() {
 
		CustomKeywords.'cartaConsentimento.Ações.DuploCliqueBotãoSwitch'()

		
	}
	
	@Então("vejo o botão confirmar desabilitado")
	public void vejo_o_botão_confirmar_desabilitado() {
 
		CustomKeywords.'cartaConsentimento.Ações.VerificarBotãoConfirmarDesabilitado'()
	}
	
	@Quando("cancelo a carta de consentimento")
	public void cancelo_a_carta_de_consentimento() {
 
		CustomKeywords.'cartaConsentimento.Ações.ClicarBotãoCancelar'()
				
	}
	
	
	@Então("fecha a carta de consentimento")
	public void fecha_a_carta_de_consentimento() {
 
		CustomKeywords.'cartaConsentimento.Ações.VerificarNaõExebiçãoJanelaCartaConsentimento'()
		
		
	}
	
 }
