#language: pt
@Regressivo @AdicionarClientes
Funcionalidade: Adicionar Clientes

  @GTPDV-T11612 @VerificarCadastroNovoClientePessoaFisicaSemBuscaCEPMenuLateralComSucesso
  Esquema do Cenário: Verificar o cadastro de um novo cliente como pessoa física sem busca de CEP acessando pelo menu lateral com sucesso
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Adicionar Clientes
    Então vejo a tela de clientes
    Quando preencho os campos <pessoa>, <cpf>, <rg>, <nome>, <nascimento>, <sexo>, <email>, <celular>, <telefone> como dados pessoais fisicos
    E preencho os campos <cep>, <endereco>, <numero>, <bairro>, <complemento>, <cidade>, <uf> de endereço
    E preencho o campo <observação> como observação
    E seleciono o botão Salvar
    Então vejo a tela de listagem de cliente
    Quando realizo a pesquisa pelo <cpf>
    E seleciono pesquisar cliente
    Então vejo no resultado o cliente cadastrado na tela de adicionar cliente
    Quando seleciono a opção Pedidos
    E clico na opção Listagem de Pedido
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | pessoa        | cpf            | rg           | nome               | nascimento | sexo      | email                     | celular     | telefone   | cep       | endereco                  | numero | bairro  | complemento | cidade    | uf | observação                                      |
      | Pessoa Física | 649.591.008-85 | 27.258.332-7 | Automação de Teste | 18/02/1982 | Masculino | peter.parker@totvs.com.br | 11943181900 | 1122435677 | 02401-000 | Rua Voluntários da Pátria |   1000 | Santana | Ap 1000     | São Paulo | SP | Teste Automatizado pelo robô do Pedido de Venda |

  @GTPDV-T11616 @VerificarCadastroNovoClientePessoaFisicaComBuscaCEPMenuLateralComSucesso
  Esquema do Cenário: Verificar o cadastro de um novo cliente como pessoa física com busca de CEP acessando pelo menu lateral com sucesso
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Adicionar Clientes
    Então vejo a tela de clientes
    Quando preencho os campos <pessoa>, <cpf>, <rg>, <nome>, <nascimento>, <sexo>, <email>, <celular>, <telefone> como dados pessoais fisicos
    E preencho o campo cep <cep>
    E seleciono Buscar
    Então vejo os campos de endereço preenchidos automaticamente
    Quando preenho os campos numero <numero>, complemento <complemento> de endereço
    E preencho o campo <observação> como observação
    E seleciono o botão Salvar
    Então vejo a tela de listagem de cliente
    Quando realizo a pesquisa pelo <cpf>
    E seleciono pesquisar cliente
    Então vejo no resultado o cliente cadastrado na tela de adicionar cliente
    Quando seleciono a opção Pedidos
    E clico na opção Listagem de Pedido
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | pessoa        | cpf            | rg           | nome               | nascimento | sexo      | email                     | celular     | telefone   | cep       | numero | complemento | observação                                      |
      | Pessoa Física | 649.591.008-85 | 27.258.332-7 | Automação de Teste | 18/02/1982 | Masculino | peter.parker@totvs.com.br | 11943181900 | 1122435677 | 02401-000 |   1000 | Ap 1000     | Teste Automatizado pelo robô do Pedido de Venda |

  @GTPDV-T11617 @VerificarCadastroNovoClientePessoaFisicaSemBuscaCEPBotãoAdicionarNovoClienteComSucesso
  Esquema do Cenário: Verificar o cadastro de um novo cliente como pessoa física sem busca de CEP acessando pelo botão Adicionar Novo Cliente
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Listagem de Clientes
    Então vejo a tela de listagem de cliente
    Quando seleciono o botão Adicionar Novo Cliente
    Então vejo a tela de clientes
    Quando preencho os campos <pessoa>, <cpf>, <rg>, <nome>, <nascimento>, <sexo>, <email>, <celular>, <telefone> como dados pessoais fisicos
    E preencho os campos <cep>, <endereco>, <numero>, <bairro>, <complemento>, <cidade>, <uf> de endereço
    E preencho o campo <observação> como observação
    E seleciono o botão Salvar
    Então vejo a tela de listagem de cliente
    Quando realizo a pesquisa pelo <cpf>
    E seleciono pesquisar cliente
    Então vejo no resultado o cliente cadastrado na tela de adicionar cliente
    Quando seleciono a opção Pedidos
    E clico na opção Listagem de Pedido
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | pessoa        | cpf            | rg           | nome               | nascimento | sexo      | email                     | celular     | telefone   | cep       | endereco                  | numero | bairro  | complemento | cidade    | uf | observação                                      |
      | Pessoa Física | 649.591.008-85 | 27.258.332-7 | Automação de Teste | 18/02/1982 | Masculino | peter.parker@totvs.com.br | 11943181900 | 1122435677 | 02401-000 | Rua Voluntários da Pátria |   1000 | Santana | Ap 1000     | São Paulo | SP | Teste Automatizado pelo robô do Pedido de Venda |

  @GTPDV-T11618 @VerificarCadastroNovoClientePessoaInformalSemBuscaCEPMenuLateralComSucesso
  Esquema do Cenário: Verificar o cadastro de um novo cliente como pessoa informal sem busca de CEP acessando pelo menu lateral com sucesso
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Adicionar Clientes
    Então vejo a tela de clientes
    Quando informo os dados pessoa informal <pessoa>, identificação <identificação>, nome <nome>, nascimento <nascimento>, sexo <sexo>, email <email>, celular <celular>, telefone <telefone> como dados pessoais
    E preencho os campos <cep>, <endereco>, <numero>, <bairro>, <complemento>, <cidade>, <uf> de endereço
    E preencho o campo <observação> como observação
    E seleciono o botão Salvar
    Então vejo a tela de listagem de cliente
    Quando realizo a pesquisa pela identificação <identificação>
    E seleciono pesquisar cliente
    Então vejo no resultado o cliente cadastrado na tela de adicionar cliente
    Quando seleciono a opção Pedidos
    E clico na opção Listagem de Pedido
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | pessoa          | identificação  | nome                               | nascimento | sexo      | email                     | celular     | telefone   | cep       | endereco                  | numero | bairro  | complemento | cidade    | uf | observação                                      |
      | Pessoa Informal | 649.591.008-85 | Automação de Teste Pessoa Informal | 18/02/1982 | Masculino | peter.parker@totvs.com.br | 11943181900 | 1122435677 | 02401-000 | Rua Voluntários da Pátria |   1000 | Santana | Ap 1000     | São Paulo | SP | Teste Automatizado pelo robô do Pedido de Venda |

  @GTPDV-T11621 @VerificarCadastroNovoClientePessoaInformalComBuscaCEPMenuLateralComSucesso
  Esquema do Cenário: Verificar o cadastro de um novo cliente como pessoa informal com busca de CEP acessando pelo menu lateral com sucesso
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Adicionar Clientes
    Então vejo a tela de clientes
    Quando informo os dados pessoa informal <pessoa>, identificação <identificação>, nome <nome>, nascimento <nascimento>, sexo <sexo>, email <email>, celular <celular>, telefone <telefone> como dados pessoais
    E preencho o campo cep <cep>
    E seleciono Buscar
    Então vejo os campos de endereço preenchidos automaticamente
    Quando preenho os campos numero <numero>, complemento <complemento> de endereço
    E preencho o campo <observação> como observação
    E seleciono o botão Salvar
    Então vejo a tela de listagem de cliente
    Quando realizo a pesquisa pela identificação <identificação>
    E seleciono pesquisar cliente
    Então vejo no resultado o cliente cadastrado na tela de adicionar cliente
    Quando seleciono a opção Pedidos
    E clico na opção Listagem de Pedido
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | pessoa          | identificação  | nome                               | nascimento | sexo      | email                     | celular     | telefone   | cep       | endereco                  | numero | bairro  | complemento | cidade    | uf | observação                                      |
      | Pessoa Informal | 649.591.008-85 | Automação de Teste Pessoa Informal | 18/02/1982 | Masculino | peter.parker@totvs.com.br | 11943181900 | 1122435677 | 02401-000 | Rua Voluntários da Pátria |   1000 | Santana | Ap 1000     | São Paulo | SP | Teste Automatizado pelo robô do Pedido de Venda |

  @GTPDV-T11622 @VerificarCadastroNovoClientePessoaInformalSemBuscaCEPBotãoAdicionarNovoClienteComSucesso
  Esquema do Cenário: Verificar o cadastro de um novo cliente como pessoa informal sem busca de CEP acessando pelo botão Adicionar Novo Cliente
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Listagem de Clientes
    Então vejo a tela de listagem de cliente
    Quando seleciono o botão Adicionar Novo Cliente
    Então vejo a tela de clientes
    Quando informo os dados pessoa informal <pessoa>, identificação <identificação>, nome <nome>, nascimento <nascimento>, sexo <sexo>, email <email>, celular <celular>, telefone <telefone> como dados pessoais
    E preencho os campos <cep>, <endereco>, <numero>, <bairro>, <complemento>, <cidade>, <uf> de endereço
    E preencho o campo <observação> como observação
    E seleciono o botão Salvar
    Então vejo a tela de listagem de cliente
    Quando realizo a pesquisa pela identificação <identificação>
    E seleciono pesquisar cliente
    Então vejo no resultado o cliente cadastrado na tela de adicionar cliente
    Quando seleciono a opção Pedidos
    E clico na opção Listagem de Pedido
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | pessoa          | cpf            | identificação | nome                               | nascimento | sexo      | email                     | celular     | telefone   | cep       | endereco                  | numero | bairro  | complemento | cidade    | uf | observação                                                        |
      | Pessoa Informal | 649.591.008-85 | 27.258.332-7  | Automação de Teste Pessoa Informal | 18/02/1982 | Masculino | peter.parker@totvs.com.br | 11943181900 | 1122435677 | 02401-000 | Rua Voluntários da Pátria |   1000 | Santana | Ap 1000     | São Paulo | SP | Teste Automatizado pelo robô do Pedido de Venda - Pessoa Informal |

  @GTPDV-T11623 @VerificarCadastroNovoClientePessoaJurídicaSemBuscaCEPBotãoAdicionarNovoClienteComSucesso
  Esquema do Cenário: Verificar o cadastro de um novo cliente como pessoa jurídica sem busca de CEP acessando pelo botão Adicionar Novo Cliente
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Listagem de Clientes
    Então vejo a tela de listagem de cliente
    Quando seleciono o botão Adicionar Novo Cliente
    Então vejo a tela de clientes
    Quando preencho pessoa <pessoa>, cnpj <cnpj>, IE <InscricaoEstadual>, razao social <razaosocial>, nome fantasia <nomefantasia>, email <email>, celular <celular>, telefone <telefone> como dados pessoais
    E preencho os campos <cep>, <endereco>, <numero>, <bairro>, <complemento>, <cidade>, <uf> de endereço
    E preencho o campo <observação> como observação
    E seleciono o botão Salvar
    Então vejo a tela de listagem de cliente
    Quando realizo a consulta pelo número cnpj <cnpj>
    E seleciono pesquisar cliente
    Então vejo no resultado o cliente cadastrado na tela de adicionar cliente
    Quando seleciono a opção Pedidos
    E clico na opção Listagem de Pedido
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | pessoa          | cnpj               | InscricaoEstadual | razaosocial                  | nomefantasia           | email                     | celular     | telefone   | cep       | endereco                  | numero | bairro  | complemento | cidade    | uf | observação                                      |
      | Pessoa Jurídica | 83.028.087/0001-32 |      722914934492 | Quality Assurance Automation | Automação de Testes PJ | peter.parker@totvs.com.br | 11943181900 | 1122435677 | 02401-000 | Rua Voluntários da Pátria |   1000 | Santana | Ap 1000     | São Paulo | SP | Teste Automatizado pelo robô do Pedido de Venda |

  @GTPDV-T11624 @VerificarCadastroNovoClientePessoaJurídicaComBuscaCEPBotãoAdicionarNovoClienteComSucesso
  Esquema do Cenário: Verificar o cadastro de um novo cliente como pessoa jurídica com busca de CEP acessando pelo botão Adicionar Novo Cliente
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Listagem de Clientes
    Então vejo a tela de listagem de cliente
    Quando seleciono o botão Adicionar Novo Cliente
    Então vejo a tela de clientes
    Quando preencho pessoa <pessoa>, cnpj <cnpj>, IE <InscricaoEstadual>, razao social <razaosocial>, nome fantasia <nomefantasia>, email <email>, celular <celular>, telefone <telefone> como dados pessoais
    E preencho o campo cep <cep>
    E seleciono Buscar
    Então vejo os campos de endereço preenchidos automaticamente
    Quando preenho os campos numero <numero>, complemento <complemento> de endereço
    E preencho o campo <observação> como observação
    E seleciono o botão Salvar
    Então vejo a tela de listagem de cliente
    Quando realizo a consulta pelo número cnpj <cnpj>
    E seleciono pesquisar cliente
    Então vejo no resultado o cliente cadastrado na tela de adicionar cliente
    Quando seleciono a opção Pedidos
    E clico na opção Listagem de Pedido
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | pessoa          | cnpj               | InscricaoEstadual | razaosocial                  | nomefantasia           | email                     | celular     | telefone   | cep       | endereco                  | numero | bairro  | complemento | cidade    | uf | observação                                      |
      | Pessoa Jurídica | 83.028.087/0001-32 |      722914934492 | Quality Assurance Automation | Automação de Testes PJ | peter.parker@totvs.com.br | 11943181900 | 1122435677 | 02401-000 | Rua Voluntários da Pátria |   1000 | Santana | Ap 1000     | São Paulo | SP | Teste Automatizado pelo robô do Pedido de Venda |

  @GTPDV-T11627 @VerificarGerarPedidoVendaApósCadastroDeNovoClientePessoaFisica
  Esquema do Cenário: Verificar gerar pedido de venda após cadastro de um novo cliente pessoa física
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Adicionar Clientes
    Então vejo a tela de clientes
    Quando preencho os campos <pessoa>, <cpf>, <rg>, <nome>, <nascimento>, <sexo>, <email>, <celular>, <telefone> como dados pessoais fisicos
    E preencho os campos <cep>, <endereco>, <numero>, <bairro>, <complemento>, <cidade>, <uf> de endereço
    E preencho o campo <observação> como observação
    E seleciono o botão Salvar
    Então vejo a tela de listagem de cliente
    Quando realizo a pesquisa pelo <cpf>
    E seleciono pesquisar cliente
    Então vejo no resultado o cliente cadastrado na tela de adicionar cliente
    Quando seleciono os ... na linha do cliente
    E clico em Iniciar Pedido
    Então vejo a tela de adicionar pedido com o campo cliente preenchido com o nome do cliente cadastrado anteriormente
    Quando informo os dados Canal de Venda <CanaldeVenda> e Modalidade <Modalidade> e Vendedor <Vendedor> e Nome do Produto <NomeProduto>
    Então vejo o valor unitário do produto de 788,50
    E seleciono o botão Adicionar
    Então vejo as informações do produto e o valor a pagar do pedido de 788,50
    Quando seleciono o botao Gerar Pedido
    Então vejo a tela de listagem de pedido
    Quando pesquiso pelo cpf <cpf> do cliente
    Então vejo o resultado da consulta com o pedido de venda no status Aberto com numero do pedido

    Exemplos: 
      | pessoa        | cpf            | rg           | nome               | nascimento | sexo      | email                     | celular     | telefone   | cep       | endereco                  | numero | bairro  | complemento | cidade    | uf | observação                                      | CanaldeVenda | Modalidade       | Vendedor     | NomeProduto                               |
      | Pessoa Física | 649.591.008-85 | 27.258.332-7 | Automação de Teste | 18/02/1982 | Masculino | peter.parker@totvs.com.br | 11943181900 | 1122435677 | 02401-000 | Rua Voluntários da Pátria |   1000 | Santana | Ap 1000     | São Paulo | SP | Teste Automatizado pelo robô do Pedido de Venda | PDV          | Consumidor Final | ANNA CLAUDIA | PR EUROMIX EXCELLENCE 1.67 INC AZURI SURF |

  @GTPDV-T11628 @VerificarGerarPedidoVendaApósCadastroDeNovoClientePessoaInformal @Bug
  Esquema do Cenário: Verificar gerar pedido de venda após cadastro de um novo cliente pessoa informal
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Adicionar Clientes
    Então vejo a tela de clientes
    Quando informo os dados pessoa informal <pessoa>, identificação <identificação>, nome <nome>, nascimento <nascimento>, sexo <sexo>, email <email>, celular <celular>, telefone <telefone> como dados pessoais
    E preencho os campos <cep>, <endereco>, <numero>, <bairro>, <complemento>, <cidade>, <uf> de endereço
    E preencho o campo <observação> como observação
    E seleciono o botão Salvar
    Então vejo a tela de listagem de cliente
    Quando realizo a pesquisa pela identificação <identificação>
    E seleciono pesquisar cliente
    Então vejo no resultado o cliente cadastrado na tela de adicionar cliente
    Quando seleciono os ... na linha do cliente
    E clico em Iniciar Pedido
    Então vejo a tela de adicionar pedido com o campo cliente preenchido com o nome do cliente cadastrado anteriormente
    Quando informo os dados Canal de Venda <CanaldeVenda> e Modalidade <Modalidade> e Vendedor <Vendedor> e Nome do Produto <NomeProduto>
    Então vejo o valor unitário do produto de 788,50
    E seleciono o botão Adicionar
    Então vejo as informações do produto e o valor a pagar do pedido de 788,50
    Quando seleciono o botao Gerar Pedido
    Então vejo a tela de listagem de pedido
    Quando pesquiso pelo numero identificação <identificação> do cliente
    Então vejo o resultado da consulta com o pedido de venda no status Aberto com numero do pedido

    Exemplos: 
      | pessoa          | identificação  | nome                  | nascimento | sexo      | email                         | celular     | telefone   | cep       | endereco                  | numero | bairro  | complemento | cidade    | uf | observação                                                           | CanaldeVenda | Modalidade       | Vendedor     | NomeProduto                               |
      | Pessoa Informal | 649.591.008-85 | Automação de Teste PI | 18/02/1982 | Masculino | automação-pedido@totvs.com.br | 11943181900 | 1122435677 | 02401-000 | Rua Voluntários da Pátria |   1000 | Santana | Ap 1000     | São Paulo | SP | Teste Automatizado pelo robô do Pedido de Venda para Pessoa Informal | PDV          | Consumidor Final | ANNA CLAUDIA | PR EUROMIX EXCELLENCE 1.67 INC AZURI SURF |

  @GTPDV-T11629 @VerificarGerarPedidoVendaApósCadastroDeNovoClientePessoaJuridica
  Esquema do Cenário: Verificar gerar pedido de venda após cadastro de um novo cliente pessoa jurídica
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Adicionar Clientes
    Então vejo a tela de clientes
    Quando preencho pessoa <pessoa>, cnpj <cnpj>, IE <InscricaoEstadual>, razao social <razaosocial>, nome fantasia <nomefantasia>, email <email>, celular <celular>, telefone <telefone> como dados pessoais
    E preencho os campos <cep>, <endereco>, <numero>, <bairro>, <complemento>, <cidade>, <uf> de endereço
    E preencho o campo <observação> como observação
    E seleciono o botão Salvar
    Então vejo a tela de listagem de cliente
    Quando realizo a consulta pelo número cnpj <cnpj>
    E seleciono pesquisar cliente
    Então vejo no resultado o cliente cadastrado na tela de adicionar cliente
    Quando seleciono os ... na linha do cliente
    E clico em Iniciar Pedido
    Então vejo a tela de adicionar pedido com o campo cliente preenchido com a razão social cadastrado anteriormente
    Quando informo os dados Canal de Venda <CanaldeVenda> e Modalidade <Modalidade> e Vendedor <Vendedor> e Nome do Produto <NomeProduto>
    Então vejo o valor unitário do produto de 788,50
    E seleciono o botão Adicionar
    Então vejo as informações do produto e o valor a pagar do pedido de 788,50
    Quando seleciono o botao Gerar Pedido
    Então vejo a tela de listagem de pedido
    Quando pesquiso pelo numero do cnpj <cnpj> do cliente
    Então vejo o resultado da consulta com o pedido de venda no status Aberto com numero do pedido
    Quando clico na opção Listagem de Pedido
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | pessoa          | cnpj               | InscricaoEstadual | razaosocial                  | nomefantasia           | email                         | celular     | telefone   | cep       | endereco                  | numero | bairro  | complemento | cidade    | uf | observação                                                           | CanaldeVenda | Modalidade       | Vendedor     | NomeProduto                               |
      | Pessoa Jurídica | 83.028.087/0001-32 |      722914934492 | Quality Assurance Automation | Automação de Testes PJ | automação-pedido@totvs.com.br | 11943181900 | 1122435677 | 02401-000 | Rua Voluntários da Pátria |   1000 | Santana | Ap 1000     | São Paulo | SP | Teste Automatizado pelo robô do Pedido de Venda para Pessoa Juridica | PDV          | Consumidor Final | ANNA CLAUDIA | PR EUROMIX EXCELLENCE 1.67 INC AZURI SURF |

  @GTPDV-T11637 @VerificarCadastroNovoClientePessoaFisicaSemPreencherNenhumCampoPeloBotãoSalvarIniciarPedido
  Esquema do Cenário: Verificar o cadastro de um novo cliente como pessoa física sem preencher nenhum campo e clicar botão Salvar e Iniciar Pedido
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Adicionar Clientes
    Então vejo a tela de clientes
    Quando preencho o tipo de pessoa <pessoa>
    Quando seleciono o botão Salvar e Iniciar Pedido
    Então vejo a mensagem <mensagem> sem efetivar o cadastro do cliente inválido
    Quando fecho a mensagem
    Então vejo a tela de clientes
    Quando seleciono Voltar
    Então vejo a tela de Listagem de Clientes
    Quando seleciono a opção Pedidos
    E clico na opção Listagem de Pedido
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | pessoa        | mensagem                                        |
      | Pessoa Física | Você precisa informar o número de RG do cliente |

  @GTPDV-T11638 @VerificarCadastroNovoClientePessoaJuridicaSemPreencherNenhumCampoPeloBotãoSalvarIniciarPedido
  Esquema do Cenário: Verificar o cadastro de um novo cliente como pessoa jurídica sem preencher nenhum campo e clicar botão Salvar e Iniciar Pedido
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Adicionar Clientes
    Então vejo a tela de clientes
    Quando preencho o tipo de pessoa <pessoa>
    E seleciono o botão Salvar e Iniciar Pedido
    Então vejo a mensagem <mensagem> sem efetivar o cadastro do cliente inválido
    Quando fecho a mensagem
    Então vejo a tela de clientes
    Quando seleciono Voltar
    Então vejo a tela de Listagem de Clientes
    Quando seleciono a opção Pedidos
    E clico na opção Listagem de Pedido
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | pessoa          | mensagem                                          |
      | Pessoa Jurídica | Você precisa informar o número de CNPJ do cliente |

  @GTPDV-T11639 @VerificarCadastroNovoClientePessoaInformalSemPreencherNenhumCampoPeloBotãoSalvarIniciarPedido
  Esquema do Cenário: Verificar o cadastro de um novo cliente como pessoa informal sem preencher nenhum campo e clicar botão Salvar e Iniciar Pedido
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Adicionar Clientes
    Então vejo a tela de clientes
    Quando preencho o tipo de pessoa <pessoa>
    E seleciono o botão Salvar e Iniciar Pedido
    Então vejo a mensagem <mensagem> sem efetivar o cadastro do cliente inválido para pessoa informal
    Quando fecho a mensagem
    Então vejo a tela de clientes
    Quando seleciono Voltar
    Então vejo a tela de Listagem de Clientes
    Quando seleciono a opção Pedidos
    E clico na opção Listagem de Pedido
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | pessoa          | mensagem                                                                                                 |
      | Pessoa Informal | Endereço não informado O nome é obrigatório Data de nascimento não informada identificação não informada |

  @GTPDV-T11640 @VerificarCadastroNovoClientePessoaFisicaSemPreencherNenhumCampoPeloBotãoSalvar
  Esquema do Cenário: Verificar o cadastro de um novo cliente como pessoa física sem preencher nenhum campo e clicar botão Salvar
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Adicionar Clientes
    Então vejo a tela de clientes
    Quando preencho o tipo de pessoa <pessoa>
    E seleciono o botão Salvar
    Então vejo a mensagem <mensagem> sem efetivar o cadastro do cliente inválido
    Quando fecho a mensagem
    Então vejo a tela de clientes
    Quando seleciono Voltar
    Então vejo a tela de Listagem de Clientes
    Quando seleciono a opção Pedidos
    E clico na opção Listagem de Pedido
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | pessoa        | mensagem                                        |
      | Pessoa Física | Você precisa informar o número de RG do cliente |

  @GTPDV-T11641 @VerificarCadastroNovoClientePessoaJuridicaSemPreencherNenhumCampoPeloBotãoSalvar
  Esquema do Cenário: Verificar o cadastro de um novo cliente como pessoa jurídica sem preencher nenhum campo e clicar botão Salvar
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Adicionar Clientes
    Então vejo a tela de clientes
    Quando preencho o tipo de pessoa <pessoa>
    E seleciono o botão Salvar
    Então vejo a mensagem <mensagem> sem efetivar o cadastro do cliente inválido
    Quando fecho a mensagem
    Então vejo a tela de clientes
    Quando seleciono Voltar
    Então vejo a tela de Listagem de Clientes
    Quando seleciono a opção Pedidos
    E clico na opção Listagem de Pedido
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | pessoa          | mensagem                                          |
      | Pessoa Jurídica | Você precisa informar o número de CNPJ do cliente |

  @GTPDV-T11642 @VerificarCadastroNovoClientePessoaInformalSemPreencherNenhumCampoPeloBotãoSalvar
  Esquema do Cenário: Verificar o cadastro de um novo cliente como pessoa informal sem preencher nenhum campo e clicar botão Salvar
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Adicionar Clientes
    Então vejo a tela de clientes
    Quando preencho o tipo de pessoa <pessoa>
    E seleciono o botão Salvar
    Então vejo a mensagem <mensagem> sem efetivar o cadastro do cliente inválido para pessoa informal
    Quando fecho a mensagem
    Então vejo a tela de clientes
    Quando seleciono Voltar
    Então vejo a tela de Listagem de Clientes
    Quando seleciono a opção Pedidos
    E clico na opção Listagem de Pedido
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | pessoa          | mensagem                                                                                                 |
      | Pessoa Informal | Endereço não informado O nome é obrigatório Data de nascimento não informada identificação não informada |

  @GTPDV-T11648 @VerificarCadastroNovoClientePessoaFisicaComCPFInvalidoSemBuscaCEPBotãoAdicionarNovoCliente
  Esquema do Cenário: Verificar o cadastro de um novo cliente como pessoa física com CPF Inválido sem busca de CEP acessando pelo botão Adicionar Novo Cliente
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Listagem de Clientes
    Então vejo a tela de listagem de cliente
    Quando seleciono o botão Adicionar Novo Cliente
    Então vejo a tela de clientes
    Quando preencho os campos <pessoa>, <rg>, <nome>, <nascimento>, <sexo>, <email>, <celular>, <telefone> como dados pessoais
    E informo o cpf <cpf> inválido
    E preencho os campos <cep>, <endereco>, <numero>, <bairro>, <complemento>, <cidade>, <uf> de endereço
    E preencho o campo <observação> como observação
    E seleciono o botão Salvar
    Então vejo a mensagem <mensagem> de CPF inválido
    Quando fecho a mensagem
    Então vejo a tela de clientes
    Quando seleciono a opção Pedidos
    E clico na opção Listagem de Pedido
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | pessoa        | cpf            | rg           | nome               | nascimento | sexo      | email                     | celular     | telefone   | cep       | endereco                  | numero | bairro  | complemento | cidade    | uf | observação                                      | mensagem     |
      | Pessoa Física | 133.000.234-00 | 27.258.332-7 | Automação de Teste | 18/02/1982 | Masculino | peter.parker@totvs.com.br | 11943181900 | 1122435677 | 02401-000 | Rua Voluntários da Pátria |   1000 | Santana | Ap 1000     | São Paulo | SP | Teste Automatizado pelo robô do Pedido de Venda | CPF inválido |

  @GTPDV-T11649 @VerificarCadastroNovoClientePessoaFisicaComNumeroCPFJáCadastradoSemBuscaCEPBotãoAdicionarNovoCliente
  Esquema do Cenário: Verificar o cadastro de um novo cliente como pessoa física com numero de CPF já cadastrado sem busca de CEP acessando pelo botão Adicionar Novo Cliente
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Listagem de Clientes
    Então vejo a tela de listagem de cliente
    Quando seleciono o botão Adicionar Novo Cliente
    Então vejo a tela de clientes
    Quando preencho os campos <pessoa>, <rg>, <nome>, <nascimento>, <sexo>, <email>, <celular>, <telefone> como dados pessoais
    E informo o cpf já cadastrado <cpf>
    E preencho os campos <cep>, <endereco>, <numero>, <bairro>, <complemento>, <cidade>, <uf> de endereço
    E preencho o campo <observação> como observação
    E seleciono o botão Salvar
    Então vejo a mensagem <mensagem> CPF já existente no cadastro
    Quando fecho a mensagem
    Então vejo a tela de clientes
    Quando seleciono a opção Pedidos
    E clico na opção Listagem de Pedido
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | pessoa        | cpf            | rg           | nome               | nascimento | sexo      | email                     | celular     | telefone   | cep       | endereco                  | numero | bairro  | complemento | cidade    | uf | observação                                      | mensagem                     |
      | Pessoa Física | 999.999.999-99 | 27.258.332-7 | Automação de Teste | 18/02/1982 | Masculino | peter.parker@totvs.com.br | 11943181900 | 1122435677 | 02401-000 | Rua Voluntários da Pátria |   1000 | Santana | Ap 1000     | São Paulo | SP | Teste Automatizado pelo robô do Pedido de Venda | CPF já existente no cadastro |

  @GTPDV-T11650 @VerificarCadastroNovoClientePessoaFisicaSemPreenhcerCPFSemBuscaCEPBotaoAdicionarNovoCliente
  Esquema do Cenário: Verificar o cadastro de um novo cliente como pessoa física sem preencher o CPF sem busca de CEP acessando pelo botão Adicionar Novo Cliente
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Listagem de Clientes
    Então vejo a tela de listagem de cliente
    Quando seleciono o botão Adicionar Novo Cliente
    Então vejo a tela de clientes
    Quando preencho os campos <pessoa>, <rg>, <nome>, <nascimento>, <sexo>, <email>, <celular>, <telefone> como dados pessoais
    E preencho os campos <cep>, <endereco>, <numero>, <bairro>, <complemento>, <cidade>, <uf> de endereço
    E preencho o campo <observação> como observação
    E seleciono o botão Salvar
    Então vejo a mensagem <mensagem> o CPF deve estar preenchido
    Quando fecho a mensagem
    Então vejo a tela de clientes
    Quando seleciono a opção Pedidos
    E clico na opção Listagem de Pedido
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | pessoa        | rg           | nome               | nascimento | sexo      | email                     | celular     | telefone   | cep       | endereco                  | numero | bairro  | complemento | cidade    | uf | observação                                      | mensagem                    |
      | Pessoa Física | 27.258.332-7 | Automação de Teste | 18/02/1982 | Masculino | peter.parker@totvs.com.br | 11943181900 | 1122435677 | 02401-000 | Rua Voluntários da Pátria |   1000 | Santana | Ap 1000     | São Paulo | SP | Teste Automatizado pelo robô do Pedido de Venda | O CPF deve estar preenchido |

  @GTPDV-T11685 @VerificarCadastroNovoClientePessoaFisicaIncluindoRGComLetraContemplandoNumeralComSucesso @Bug
  Esquema do Cenário: Verificar o cadastro de um novo cliente como pessoa física no RG incluir uma letra contemplando o numeral com sucesso
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
    Quando aceito as condições da carta consentimento
    Então vejo o texto "ACEITO"
    E confirmo a carta consentimento
    Então vejo a tela de listagem de cliente
    Quando realizo a pesquisa pelo <cpf>
    E seleciono pesquisar cliente
    Então vejo no resultado o cliente cadastrado na tela de adicionar cliente
    Quando seleciono os ... na linha do cliente
    E clico em Editar Cliente
    Então vejo o numero do rg contendo o valor X contemplando o numeral
    Quando clico em Pedidos
    E seleciono Listagem de Pedidos
    Então vejo a mensagem <mensagem> Deseja desconsiderar as informações
    Quando confirmo a mensagem
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | pessoa        | cpf            | rg           | nome                                            | nascimento | sexo      | email                     | celular     | telefone   | cep       | endereco                  | numero | bairro  | complemento | cidade    | uf | observação                                      | mensagem                             |
      | Pessoa Física | 649.591.008-85 | 27.258.332-7 | Automação de Teste RG para Orgão Emissor SSP-MG | 18/02/1982 | Masculino | peter.parker@totvs.com.br | 11943181900 | 1122435677 | 02401-000 | Rua Voluntários da Pátria |   1000 | Santana | Ap 1000     | São Paulo | SP | Teste Automatizado pelo robô do Pedido de Venda | Deseja desconsiderar as informações? |

  @GTPDV-T5744 @VerificarCadastroNovoClientePessoaFisicaInformandoDadosObrigatoriosSemDadosOpcionais
  Esquema do Cenário: Verificar o cadastro de um novo cliente como pessoa física apenas preenchendo os campos obrigatórios e sem preencher os campos opcionais
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Adicionar Clientes
    Então vejo a tela de clientes
    Quando preencho apenas os campos obrigatórios <pessoa>, <cpf>, <rg>, <nome>, <nascimento>, <sexo>, <celular>, como dados pessoais
    E informo apenas os campos obrigatórios <cep>, <endereco>, <numero>, <bairro>, <cidade>, <uf> de endereço
    E seleciono o botão Salvar
    Então vejo a tela de listagem de cliente
    Quando realizo a pesquisa pelo <cpf>
    E seleciono pesquisar cliente
    Então vejo no resultado o cliente cadastrado na tela de adicionar cliente
    Quando clico em Pedidos
    E seleciono Listagem de Pedidos
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | pessoa        | cpf            | rg           | nome               | nascimento | sexo      | celular     | cep       | endereco                  | numero | bairro  | cidade    | uf | observação                                      | mensagem                             |
      | Pessoa Física | 649.591.008-85 | 27.258.332-7 | Automação de Teste | 18/02/1982 | Masculino | 11943181900 | 02401-000 | Rua Voluntários da Pátria |   1000 | Santana | São Paulo | SP | Teste Automatizado pelo robô do Pedido de Venda | Deseja desconsiderar as informações? |

  @GTPDV-T6085 @VerificarCadastroNovoClientePessoaJurídicaUtilizandoDadosClienteJáCadastrado
  Esquema do Cenário: Verificar o cadastro de um novo cliente como pessoa jurídica utilizando os dados de um cliente já cadastrado
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Listagem de Clientes
    Então vejo a tela de listagem de cliente
    Quando seleciono o botão Adicionar Novo Cliente
    Então vejo a tela de clientes
    Quando informo pessoa <pessoa>, cnpj <cnpj>, IE <InscricaoEstadual>, razao social <razaosocial>, nome fantasia <nomefantasia>, email <email>, celular <celular>, telefone <telefone> como dados pessoais
    E preencho os campos <cep>, <endereco>, <numero>, <bairro>, <complemento>, <cidade>, <uf> de endereço
    E preencho o campo <observação> como observação
    E seleciono o botão Salvar
    Então vejo a mensagem <mensagem> CNPJ já Cadastrado
    Quando fecho a mensagem
    Então vejo a tela de clientes
    Quando clico em Pedidos
    E seleciono Listagem de Pedidos
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | pessoa          | cnpj               | InscricaoEstadual | razaosocial                  | nomefantasia           | email                     | celular     | telefone   | cep       | endereco                  | numero | bairro  | complemento | cidade    | uf | observação                                      | mensagem           |
      | Pessoa Jurídica | 63.515.221/0001-12 |      970439216127 | Quality Assurance Automation | Automação de Testes PJ | peter.parker@totvs.com.br | 11943181900 | 1122435677 | 02401-000 | Rua Voluntários da Pátria |   1000 | Santana | Ap 1000     | São Paulo | SP | Teste Automatizado pelo robô do Pedido de Venda | CNPJ já Cadastrado |

  @GTPDV-T6086 @VerificarCadastroNovoClientePessoaInformalUtilizandoDadosClienteJáCadastrado
  Esquema do Cenário: Verificar o cadastro de um novo cliente como pessoa informal utilizando os dados de um cliente já cadastrado
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Listagem de Clientes
    Então vejo a tela de listagem de cliente
    Quando seleciono o botão Adicionar Novo Cliente
    Então vejo a tela de clientes
    Quando informo já cadastrados os dados pessoa informal <pessoa>, identificação <identificação>, nome <nome>, nascimento <nascimento>, sexo <sexo>, email <email>, celular <celular>, telefone <telefone> como dados pessoais
    E preencho os campos <cep>, <endereco>, <numero>, <bairro>, <complemento>, <cidade>, <uf> de endereço
    E preencho o campo <observação> como observação
    E seleciono o botão Salvar
    Então vejo a mensagem <mensagem> Cliente já Cadastrado
    Quando fecho a mensagem
    Então vejo a tela de clientes
    Quando clico em Pedidos
    E seleciono Listagem de Pedidos
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | pessoa          | identificação | nome                               | nascimento | sexo      | email                     | celular     | telefone   | cep       | endereco                  | numero | bairro  | complemento | cidade    | uf | observação                                      | mensagem              |
      | Pessoa Informal |     023780071 | Automação de Teste Pessoa Informal | 18/02/1982 | Masculino | peter.parker@totvs.com.br | 11943181900 | 1122435677 | 02401-000 | Rua Voluntários da Pátria |   1000 | Santana | Ap 1000     | São Paulo | SP | Teste Automatizado pelo robô do Pedido de Venda | Cliente já Cadastrado |

  @GTPDV-T5735 @VerificarCadastroNovoClientePessoaJurídicaComCNPJInvalidoSemBuscaCepAcessandoBotãoNovoCliente
  Esquema do Cenário: Verificar o cadastro de um novo cliente como pessoa jurídica com CNPJ Inválido sem busca de CEP acessando pelo botão Adicionar Novo Cliente
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Listagem de Clientes
    Então vejo a tela de listagem de cliente
    Quando seleciono o botão Adicionar Novo Cliente
    Então vejo a tela de clientes
    Quando informo pessoa <pessoa>, cnpj <cnpj>, IE <InscricaoEstadual>, razao social <razaosocial>, nome fantasia <nomefantasia>, email <email>, celular <celular>, telefone <telefone> como dados pessoais
    E preencho os campos <cep>, <endereco>, <numero>, <bairro>, <complemento>, <cidade>, <uf> de endereço
    E preencho o campo <observação> como observação
    E seleciono o botão Salvar
    Então vejo a mensagem <mensagem> O CNPJ informado não é válido
    Quando fecho a mensagem
    Então vejo a tela de clientes
    Quando clico em Pedidos
    E seleciono Listagem de Pedidos
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | pessoa          | cnpj               | InscricaoEstadual | razaosocial                  | nomefantasia           | email                     | celular     | telefone   | cep       | endereco                  | numero | bairro  | complemento | cidade    | uf | observação                                      | mensagem                       |
      | Pessoa Jurídica | 23.111.222/0001-00 |      970439216127 | Quality Assurance Automation | Automação de Testes PJ | peter.parker@totvs.com.br | 11943181900 | 1122435677 | 02401-000 | Rua Voluntários da Pátria |   1000 | Santana | Ap 1000     | São Paulo | SP | Teste Automatizado pelo robô do Pedido de Venda | O CNPJ informado não é válido. |

  @GTPDV-T5736 @VerificarCadastroNovoClientePessoaJurídicaSemInformarCNPJ
  Esquema do Cenário: Verificar o cadastro de um novo cliente como pessoa jurídica sem informar o CNPJ
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Listagem de Clientes
    Então vejo a tela de listagem de cliente
    Quando seleciono o botão Adicionar Novo Cliente
    Então vejo a tela de clientes
    Quando informo pessoa <pessoa>, cnpj <cnpj>, IE <InscricaoEstadual>, razao social <razaosocial>, nome fantasia <nomefantasia>, email <email>, celular <celular>, telefone <telefone> como dados pessoais
    E preencho os campos <cep>, <endereco>, <numero>, <bairro>, <complemento>, <cidade>, <uf> de endereço
    E preencho o campo <observação> como observação
    E seleciono o botão Salvar
    Então vejo a mensagem <mensagem> Você precisa informar o número de CNPJ do cliente
    Quando fecho a mensagem
    Então vejo a tela de clientes
    Quando clico em Pedidos
    E seleciono Listagem de Pedidos
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | pessoa          | cnpj | InscricaoEstadual | razaosocial                  | nomefantasia           | email                     | celular     | telefone   | cep       | endereco                  | numero | bairro  | complemento | cidade    | uf | observação                                      | mensagem                                          |
      | Pessoa Jurídica |      |      970439216127 | Quality Assurance Automation | Automação de Testes PJ | peter.parker@totvs.com.br | 11943181900 | 1122435677 | 02401-000 | Rua Voluntários da Pátria |   1000 | Santana | Ap 1000     | São Paulo | SP | Teste Automatizado pelo robô do Pedido de Venda | Você precisa informar o número de CNPJ do cliente |

  @GTPDV-T5738 @VerificarMensagemCEPInvalidoPreenchedoCampoCom6Digitos
  Esquema do Cenário: Verificar a mensagem de CEP inválido ao preencher o campo com 6 dígitos
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Listagem de Clientes
    Então vejo a tela de listagem de cliente
    Quando seleciono o botão Adicionar Novo Cliente
    Então vejo a tela de clientes
    E preencho o campo cep <cep>
    Então vejo a mensagem <mensagem> CEP Inválido
    Quando clico em Pedidos
    E seleciono Listagem de Pedidos
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | cep    | mensagem     |
      | 024010 | CEP Inválido |

  @GTPDV-T11693 @VerificarCadastroNovoClientePessoaFisicaIncluindoNumeroRGInvalido1111111111 @Bug
  Esquema do Cenário: Verificar o cadastro de um novo cliente como pessoa física incluindo número do RG Inválido 11.111.111-11
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Adicionar Clientes
    Então vejo a tela de clientes
    Quando informo os campos <pessoa>, <cpf>, <nome>, <nascimento>, <sexo>, <email>, <celular>, <telefone> como dados pessoais
    E informo o numero do rg <rg> inválido
    E preencho os campos <cep>, <endereco>, <numero>, <bairro>, <complemento>, <cidade>, <uf> de endereço
    E preencho o campo <observação> como observação
    E seleciono o botão Salvar
    Então vejo a mensagem <mensagem> Número do RG inválido
    Quando fecho a mensagem
    Então vejo a tela de clientes
    Quando clico em Pedidos
    E seleciono Listagem de Pedidos
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | pessoa        | cpf            | rg            | nome                               | nascimento | sexo      | email                     | celular     | telefone   | cep       | endereco                  | numero | bairro  | complemento | cidade    | uf | observação                                      | mensagem              |
      | Pessoa Física | 649.591.008-85 | 11.111.111-11 | Automação de Teste Pedido de Venda | 18/02/1982 | Masculino | peter.parker@totvs.com.br | 11943181900 | 1122435677 | 02401-000 | Rua Voluntários da Pátria |   1000 | Santana | Ap 1000     | São Paulo | SP | Teste Automatizado pelo robô do Pedido de Venda | Número do RG inválido |

  @GTPDV-T11694 @VerificarCadastroNovoClientePessoaFisicaIncluindoNumeroRGInvalido2222222222 @Bug
  Esquema do Cenário: Verificar o cadastro de um novo cliente como pessoa física incluindo número do RG Inválido 22.222.222-22
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Adicionar Clientes
    Então vejo a tela de clientes
    Quando informo os campos <pessoa>, <cpf>, <nome>, <nascimento>, <sexo>, <email>, <celular>, <telefone> como dados pessoais
    E informo o numero do rg <rg> inválido
    E preencho os campos <cep>, <endereco>, <numero>, <bairro>, <complemento>, <cidade>, <uf> de endereço
    E preencho o campo <observação> como observação
    E seleciono o botão Salvar
    Então vejo a mensagem <mensagem> Número do RG inválido
    Quando fecho a mensagem
    Então vejo a tela de clientes
    Quando clico em Pedidos
    E seleciono Listagem de Pedidos
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | pessoa        | cpf            | rg            | nome                               | nascimento | sexo      | email                     | celular     | telefone   | cep       | endereco                  | numero | bairro  | complemento | cidade    | uf | observação                                      | mensagem              |
      | Pessoa Física | 649.591.008-85 | 22.222.222-22 | Automação de Teste Pedido de Venda | 18/02/1982 | Masculino | peter.parker@totvs.com.br | 11943181900 | 1122435677 | 02401-000 | Rua Voluntários da Pátria |   1000 | Santana | Ap 1000     | São Paulo | SP | Teste Automatizado pelo robô do Pedido de Venda | Número do RG inválido |

  @GTPDV-T11709 @VerificarApresentacaoInformacoesClientePFNaEdicaoAposEfetuarAnteriormenteSeuCadastro
  Esquema do Cenário: Verificar a apresentação das informações do cliente pessoa física na sua edição após efetuar anteriormente o seu cadastramento
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Adicionar Clientes
    Então vejo a tela de clientes
    Quando preencho os campos <pessoa>, <cpf>, <rg>, <nome>, <nascimento>, <sexo>, <email>, <celular>, <telefone> como dados pessoais fisicos
    E preencho os campos <cep>, <endereco>, <numero>, <bairro>, <complemento>, <cidade>, <uf> de endereço
    E preencho o campo <observação> como observação
    E seleciono o botão Salvar
    Então vejo a tela de listagem de cliente
    Quando realizo a pesquisa pelo <cpf>
    E seleciono pesquisar cliente
    Então vejo no resultado o cliente cadastrado na tela de adicionar cliente
    Quando seleciono os ... na linha do cliente
    E clico em Editar Cliente
    Então vejo a tela de edição do cadastro com os campos preenhcidos com as informações feitas no cadastro do cliente pessoa fisica anteriormente
    Quando clico em Pedidos
    E seleciono Listagem de Pedidos
    Então vejo a mensagem <mensagem> Deseja desconsiderar as informações
    Quando confirmo a mensagem
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | pessoa        | cpf            | rg           | nome               | nascimento | sexo      | email                     | celular     | telefone   | cep       | endereco                  | numero | bairro  | complemento | cidade                 | uf | observação                                      | CanaldeVenda | Modalidade       | Vendedor     | NomeProduto                               | mensagem                             |
      | Pessoa Física | 649.591.008-85 | 27.258.332-7 | Automação de Teste | 18/02/1982 | Masculino | peter.parker@totvs.com.br | 11943181900 | 1122435677 | 02401-000 | Rua Voluntários da Pátria |   1000 | Santana | Ap 1000     | PALMEIRAS DE SAO PAULO | SP | Teste Automatizado pelo robô do Pedido de Venda | PDV          | Consumidor Final | ANNA CLAUDIA | PR EUROMIX EXCELLENCE 1.67 INC AZURI SURF | Deseja desconsiderar as informações? |

  @GTPDV-T11714 @VerificarApresentacaoInformacoesClientePInaEdicaoAposEfetuarAnteriormenteSeuCadastro
  Esquema do Cenário: Verificar a apresentação das informações do cliente pessoa informal na sua edição após efetuar anteriormente o seu cadastramento
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Adicionar Clientes
    Então vejo a tela de clientes
    Quando informo os dados pessoa informal <pessoa>, identificação <identificação>, nome <nome>, nascimento <nascimento>, sexo <sexo>, email <email>, celular <celular>, telefone <telefone> como dados pessoais
    E preencho os campos <cep>, <endereco>, <numero>, <bairro>, <complemento>, <cidade>, <uf> de endereço
    E preencho o campo <observação> como observação
    E seleciono o botão Salvar
    Então vejo a tela de listagem de cliente
    Quando realizo a pesquisa pela identificação <identificação>
    E seleciono pesquisar cliente
    Então vejo no resultado o cliente cadastrado na tela de adicionar cliente
    Quando seleciono os ... na linha do cliente
    E clico em Editar Cliente
    Então vejo a tela de edição do cadastro com os campos preenhcidos com as informações feitas no cadastro do cliente pessoa informal anteriormente
    Quando clico em Pedidos
    E seleciono Listagem de Pedidos
    Então vejo a mensagem <mensagem> Deseja desconsiderar as informações
    Quando confirmo a mensagem
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | pessoa          | identificação | nome               | nascimento | sexo      | email                     | celular     | telefone   | cep       | endereco                  | numero | bairro  | complemento | cidade                 | uf | observação                                      | CanaldeVenda | Modalidade       | Vendedor     | NomeProduto                               | mensagem                             |
      | Pessoa Informal | 27.258.332-7  | Automação de Teste | 18/02/1982 | Masculino | peter.parker@totvs.com.br | 11943181900 | 1122435677 | 02401-000 | Rua Voluntários da Pátria |   1000 | Santana | Ap 1000     | PALMEIRAS DE SAO PAULO | SP | Teste Automatizado pelo robô do Pedido de Venda | PDV          | Consumidor Final | ANNA CLAUDIA | PR EUROMIX EXCELLENCE 1.67 INC AZURI SURF | Deseja desconsiderar as informações? |

  @GTPDV-T11715 @VerificarApresentacaoInformacoesClientePJNaEdicaoAposEfetuarAnteriormenteSeuCadastro
  Esquema do Cenário: Verificar a apresentação das informações do cliente pessoa jurídica na sua edição após efetuar anteriormente o seu cadastramento
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Adicionar Clientes
    Então vejo a tela de clientes
    Quando preencho pessoa <pessoa>, cnpj <cnpj>, IE <InscricaoEstadual>, razao social <razaosocial>, nome fantasia <nomefantasia>, email <email>, celular <celular>, telefone <telefone> como dados pessoais
    E preencho os campos <cep>, <endereco>, <numero>, <bairro>, <complemento>, <cidade>, <uf> de endereço
    E preencho o campo <observação> como observação
    E seleciono o botão Salvar
    Então vejo a tela de listagem de cliente
    Quando realizo a consulta pelo número cnpj <cnpj>
    E seleciono pesquisar cliente
    Então vejo no resultado o cliente cadastrado na tela de adicionar cliente
    Quando seleciono os ... na linha do cliente
    E clico em Editar Cliente
    Então vejo a tela de edição do cadastro com os campos preenhcidos com as informações feitas no cadastro do cliente pessoa jurídica anteriormente
    Quando clico em Pedidos
    E seleciono Listagem de Pedidos
    Então vejo a mensagem <mensagem> Deseja desconsiderar as informações
    Quando confirmo a mensagem
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | pessoa          | cnpj               | InscricaoEstadual | razaosocial                  | nomefantasia           | email                     | celular     | telefone   | cep       | endereco                  | numero | bairro  | complemento | cidade             | uf | observação                                      | mensagem                             |
      | Pessoa Jurídica | 83.028.087/0001-32 |      722914934492 | Quality Assurance Automation | Automação de Testes PJ | peter.parker@totvs.com.br | 11943181900 | 1122435677 | 02401-000 | Rua Voluntários da Pátria |   1000 | Santana | Ap 1000     | MORRO DE SAO PAULO | BA | Teste Automatizado pelo robô do Pedido de Venda | Deseja desconsiderar as informações? |

  @GTPDV-T11796 @VerificarCadastroClientePreenchendoApenasUfApresentaçãoMensagemPerdaDasInformacoesAoSairdoCadastroIncompletoNoPedidoDeVendaParaPessoaFisica
  Esquema do Cenário: Verificar no cadastro de cliente preenchendo apenas o UF a apresentação da mensagem de perda das informações ao sair do cadastro incompleto no pedido de venda para pessoa física
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Adicionar Clientes
    Então vejo a tela de clientes
    Quando preencho o campo UF <uf> como dados pessoais
    E clico em Pedidos
    E seleciono Listagem de Pedidos
    Então vejo a mensagem <mensagem> Deseja desconsiderar as informações
    Quando confirmo a mensagem
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | uf        | mensagem                             |
      | São Paulo | Deseja desconsiderar as informações? |

  @GTPDV-T11794 @VerificarCadastroClientePreenchendoApenasCidadeApresentaçãoMensagemPerdaDasInformacoesAoSairdoCadastroIncompletoNoPedidoDeVendaParaPessoaFisica
  Esquema do Cenário: Verificar no cadastro de cliente preenchendo apenas o Cidade a apresentação da mensagem de perda das informações ao sair do cadastro incompleto no pedido de venda para pessoa física
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Adicionar Clientes
    Então vejo a tela de clientes
    Quando preencho o campo cidade <cidade> como dados pessoais
    E clico em Pedidos
    E seleciono Listagem de Pedidos
    Então vejo a mensagem <mensagem> Deseja desconsiderar as informações
    Quando confirmo a mensagem
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | cidade    | mensagem                             |
      | São Paulo | Deseja desconsiderar as informações? |

  @GTPDV-T11793 @VerificarCadastroClientePreenchendoApenasComplementoApresentaçãoMensagemPerdaDasInformacoesAoSairdoCadastroIncompletoNoPedidoDeVendaParaPessoaFisica
  Esquema do Cenário: Verificar no cadastro de cliente preenchendo apenas o Complemento a apresentação da mensagem de perda das informações ao sair do cadastro incompleto no pedido de venda para pessoa física
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Adicionar Clientes
    Então vejo a tela de clientes
    Quando preencho o campo complemento <complemento> como dados pessoais
    E clico em Pedidos
    E seleciono Listagem de Pedidos
    Então vejo a mensagem <mensagem> Deseja desconsiderar as informações
    Quando confirmo a mensagem
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | complemento         | mensagem                             |
      | ao lado do Verdinho | Deseja desconsiderar as informações? |

  @GTPDV-T11792 @VerificarCadastroClientePreenchendoApenasBairroApresentaçãoMensagemPerdaDasInformacoesAoSairdoCadastroIncompletoNoPedidoDeVendaParaPessoaFisica
  Esquema do Cenário: Verificar no cadastro de cliente preenchendo apenas o Bairro a apresentação da mensagem de perda das informações ao sair do cadastro incompleto no pedido de venda para pessoa física
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Adicionar Clientes
    Então vejo a tela de clientes
    Quando preencho o campo bairro <bairro> como dados pessoais
    E clico em Pedidos
    E seleciono Listagem de Pedidos
    Então vejo a mensagem <mensagem> Deseja desconsiderar as informações
    Quando confirmo a mensagem
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | bairro     | mensagem                             |
      | Casa Verde | Deseja desconsiderar as informações? |

  @GTPDV-T11791 @VerificarCadastroClientePreenchendoApenasNumeroApresentaçãoMensagemPerdaDasInformacoesAoSairdoCadastroIncompletoNoPedidoDeVendaParaPessoaFisica
  Esquema do Cenário: Verificar no cadastro de cliente preenchendo apenas o Numero a apresentação da mensagem de perda das informações ao sair do cadastro incompleto no pedido de venda para pessoa física
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Adicionar Clientes
    Então vejo a tela de clientes
    Quando preencho o campo numero <numero> como dados pessoais
    E clico em Pedidos
    E seleciono Listagem de Pedidos
    Então vejo a mensagem <mensagem> Deseja desconsiderar as informações
    Quando confirmo a mensagem
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | numero | mensagem                             |
      |   1000 | Deseja desconsiderar as informações? |

  @GTPDV-T11790 @VerificarCadastroClientePreenchendoApenasEnderecoApresentaçãoMensagemPerdaDasInformacoesAoSairdoCadastroIncompletoNoPedidoDeVendaParaPessoaFisica
  Esquema do Cenário: Verificar no cadastro de cliente preenchendo apenas o Endereço a apresentação da mensagem de perda das informações ao sair do cadastro incompleto no pedido de venda para pessoa física
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Adicionar Clientes
    Então vejo a tela de clientes
    Quando preencho o campo endereco <endereco> como dados pessoais
    E clico em Pedidos
    E seleciono Listagem de Pedidos
    Então vejo a mensagem <mensagem> Deseja desconsiderar as informações
    Quando confirmo a mensagem
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | endereco          | mensagem                             |
      | Avenida Bras Leme | Deseja desconsiderar as informações? |

  @GTPDV-T11789 @VerificarCadastroClientePreenchendoApenasCepApresentaçãoMensagemPerdaDasInformacoesAoSairdoCadastroIncompletoNoPedidoDeVendaParaPessoaFisica
  Esquema do Cenário: Verificar no cadastro de cliente preenchendo apenas o Cep a apresentação da mensagem de perda das informações ao sair do cadastro incompleto no pedido de venda para pessoa física
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Adicionar Clientes
    Então vejo a tela de clientes
    Quando preencho o campo cep <cep> como dados pessoais
    E clico em Pedidos
    E seleciono Listagem de Pedidos
    Então vejo a mensagem <mensagem> Deseja desconsiderar as informações
    Quando confirmo a mensagem
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | cep      | mensagem                             |
      | 02401000 | Deseja desconsiderar as informações? |

  @GTPDV-T11788 @VerificarCadastroClientePreenchendoApenasCelularApresentaçãoMensagemPerdaDasInformacoesAoSairdoCadastroIncompletoNoPedidoDeVendaParaPessoaFisica
  Esquema do Cenário: Verificar no cadastro de cliente preenchendo apenas o Celular a apresentação da mensagem de perda das informações ao sair do cadastro incompleto no pedido de venda para pessoa física
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Adicionar Clientes
    Então vejo a tela de clientes
    Quando preencho o campo celular <celular> como dados pessoais
    E clico em Pedidos
    E seleciono Listagem de Pedidos
    Então vejo a mensagem <mensagem> Deseja desconsiderar as informações
    Quando confirmo a mensagem
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | celular    | mensagem                             |
      | 1199432314 | Deseja desconsiderar as informações? |

  @GTPDV-T11787 @VerificarCadastroClientePreenchendoApenasEmailApresentaçãoMensagemPerdaDasInformacoesAoSairdoCadastroIncompletoNoPedidoDeVendaParaPessoaFisica
  Esquema do Cenário: Verificar no cadastro de cliente preenchendo apenas o Email a apresentação da mensagem de perda das informações ao sair do cadastro incompleto no pedido de venda para pessoa física
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Adicionar Clientes
    Então vejo a tela de clientes
    Quando preencho o campo email <email> como dados pessoais
    E clico em Pedidos
    E seleciono Listagem de Pedidos
    Então vejo a mensagem <mensagem> Deseja desconsiderar as informações
    Quando confirmo a mensagem
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | email                        | mensagem                             |
      | antonio.colella@totvs.com.br | Deseja desconsiderar as informações? |

  @GTPDV-T11785 @VerificarCadastroClientePreenchendoApenasNascimentoApresentaçãoMensagemPerdaDasInformacoesAoSairdoCadastroIncompletoNoPedidoDeVendaParaPessoaFisica
  Esquema do Cenário: Verificar no cadastro de cliente preenchendo apenas o Nascimento a apresentação da mensagem de perda das informações ao sair do cadastro incompleto no pedido de venda para pessoa física
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Adicionar Clientes
    Então vejo a tela de clientes
    Quando preencho o campo nascimento <nascimento> como dados pessoais
    E clico em Pedidos
    E seleciono Listagem de Pedidos
    Então vejo a mensagem <mensagem> Deseja desconsiderar as informações
    Quando confirmo a mensagem
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | nascimento | mensagem                             |
      |   18021982 | Deseja desconsiderar as informações? |

  @GTPDV-T11784 @VerificarCadastroClientePreenchendoApenasNomeApresentaçãoMensagemPerdaDasInformacoesAoSairdoCadastroIncompletoNoPedidoDeVendaParaPessoaFisica
  Esquema do Cenário: Verificar no cadastro de cliente preenchendo apenas o Nome a apresentação da mensagem de perda das informações ao sair do cadastro incompleto no pedido de venda para pessoa física
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Adicionar Clientes
    Então vejo a tela de clientes
    Quando preencho o campo nome <nome> como dados pessoais
    E clico em Pedidos
    E seleciono Listagem de Pedidos
    Então vejo a mensagem <mensagem> Deseja desconsiderar as informações
    Quando confirmo a mensagem
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | nome                       | mensagem                             |
      | Testes Automatizados TOTVS | Deseja desconsiderar as informações? |

  @GTPDV-T11783 @VerificarCadastroClientePreenchendoApenasRGApresentaçãoMensagemPerdaDasInformacoesAoSairdoCadastroIncompletoNoPedidoDeVendaParaPessoaFisica
  Esquema do Cenário: Verificar no cadastro de cliente preenchendo apenas o RG a apresentação da mensagem de perda das informações ao sair do cadastro incompleto no pedido de venda para pessoa física
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Adicionar Clientes
    Então vejo a tela de clientes
    Quando preencho o campo rg <rg> como dados pessoais
    E clico em Pedidos
    E seleciono Listagem de Pedidos
    Então vejo a mensagem <mensagem> Deseja desconsiderar as informações
    Quando confirmo a mensagem
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | rg           | mensagem                             |
      | 27.258.332-7 | Deseja desconsiderar as informações? |

  @GTPDV-T11782 @VerificarCadastroClientePreenchendoApenasCPFApresentaçãoMensagemPerdaDasInformacoesAoSairdoCadastroIncompletoNoPedidoDeVendaParaPessoaFisica
  Esquema do Cenário: Verificar no cadastro de cliente preenchendo apenas o CPF a apresentação da mensagem de perda das informações ao sair do cadastro incompleto no pedido de venda para pessoa física
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono o botão Cadastros
    E seleciono o botão Adicionar Clientes
    Então vejo a tela de clientes
    Quando preencho o campo cpf <cpf> como dados pessoais
    E clico em Pedidos
    E seleciono Listagem de Pedidos
    Então vejo a mensagem <mensagem> Deseja desconsiderar as informações
    Quando confirmo a mensagem
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | cpf            | mensagem                             |
      | 649.591.008-85 | Deseja desconsiderar as informações? |

      
  @GTPDV- @VerificarAceitedaCartaConsentimentoApósRealizarNovoCadastrodeCliente
  Esquema do Cenário: Verificar aceite da carta consentimento após realizar novo cadastro de cliente
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
    Quando aceito as condições da carta consentimento
    Então vejo o texto "ACEITO"
    E confirmo a carta consentimento
    Então vejo a tela de listagem de cliente
    Quando realizo a pesquisa pelo <cpf>
    E seleciono pesquisar cliente
    Então vejo no resultado o cliente cadastrado na tela de adicionar cliente
    Quando seleciono os ... na linha do cliente
    E clico em Editar Cliente
    Então vejo o numero do rg contendo o valor X contemplando o numeral
    Quando clico em Pedidos
    E seleciono Listagem de Pedidos
    Então vejo a mensagem <mensagem> Deseja desconsiderar as informações
    Quando confirmo a mensagem
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | pessoa        | cpf            | rg           | nome                                            | nascimento | sexo      | email                     | celular     | telefone   | cep       | endereco                  | numero | bairro  | complemento | cidade    | uf | observação                                      | mensagem                             |
      | Pessoa Física | 649.591.008-85 | 27.258.332-7 | Automação de Teste RG para Orgão Emissor SSP-MG | 18/02/1982 | Masculino | peter.parker@totvs.com.br | 11943181900 | 1122435677 | 02401-000 | Rua Voluntários da Pátria |   1000 | Santana | Ap 1000     | São Paulo | SP | Teste Automatizado pelo robô do Pedido de Venda | Deseja desconsiderar as informações? |
      
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
    Quando clico em Pedidos
    E seleciono Listagem de Pedidos
    Então vejo a mensagem <mensagem> Deseja desconsiderar as informações
    Quando confirmo a mensagem
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | pessoa        | cpf            | rg           | nome                                            | nascimento | sexo      | email                     | celular     | telefone   | cep       | endereco                  | numero | bairro  | complemento | cidade    | uf | observação                                      | mensagem                             |
      | Pessoa Física | 649.591.008-85 | 27.258.332-7 | Automação de Teste RG para Orgão Emissor SSP-MG | 18/02/1982 | Masculino | peter.parker@totvs.com.br | 11943181900 | 1122435677 | 02401-000 | Rua Voluntários da Pátria |   1000 | Santana | Ap 1000     | São Paulo | SP | Teste Automatizado pelo robô do Pedido de Venda | Deseja desconsiderar as informações? |
      