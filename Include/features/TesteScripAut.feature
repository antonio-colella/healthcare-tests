#language: pt
@Regressivo @CadastrarPedidoVenda
Funcionalidade: Gerar Pedido de Venda

  @GTPDV- @VerificarNãoAceitedaCartaConsentimentoApósTentativaCadastroNovoCliente
  Esquema do Cenário: Verificar não aceite da carta consentimento após tentativa de cadastro de novo cliente
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Adicionar Clientes
    Então vejo a tela de clientes
    Quando informo os campos <pessoa>, <cpf>, <nome>, <nascimento>, <sexo>, <email>, <celular>, <telefone> como dados pessoais
    E informo o rg <rg> do estado de minas gerais
    E preencho os campos <cep>, <endereco>, <numero>, <bairro>, <complemento>, <cidade>, <uf> de endereço
    E preencho o campo <observação> como observação
    E seleciono o botão Salvar
    Então vejo a janela de Carta Consentimento
    Quando não aceito as condições da carta consentimento
    Então vejo o botão confirmar desabilitado
    Quando cancelo a carta de consentimento
    Então fecha a carta de consentimento
    Então vejo a tela de clientes

    Exemplos: 
      | pessoa        | cpf            | rg           | nome                                            | nascimento | sexo      | email                     | celular     | telefone   | cep       | endereco                  | numero | bairro  | complemento | cidade    | uf | observação                                      | mensagem                             |
      | Pessoa Física | 649.591.008-85 | 27.258.332-7 | Automação de Teste RG para Orgão Emissor SSP-MG | 18/02/1982 | Masculino | peter.parker@totvs.com.br | 11943181900 | 1122435677 | 02401-000 | Rua Voluntários da Pátria |   1000 | Santana | Ap 1000     | São Paulo | SP | Teste Automatizado pelo robô do Pedido de Venda | Deseja desconsiderar as informações? |
