#language: pt
@Regressivo @GerarOrcamento
Funcionalidade: Gerar Orçamento

  @GTPDV-T11427 @GerarNovoOrcamentoComProdutoSemDescontoCanalVendaPDV
  Esquema do Cenário: Gerar um novo orçamento com um produto sem desconto para canal de venda PDV
    Dado eu estou na tela inicial do Pedido de Venda
    Quando clico na opção Adicionar Novo Pedido
    Então vejo a tela de Pedidos
    Quando preencho os dados Canal de Venda <CanaldeVenda> e Modalidade <Modalidade> e Vendedor <Vendedor> e Cliente <Cliente> e Nome do Produto <NomeProduto>
    Então vejo o valor unitário do produto de 788,50
    E seleciono o botão Adicionar
    Então vejo as informações do produto e o valor a pagar do pedido de 788,50
    Quando seleciono o botao Gerar Orçamento
    Então vejo a tela de listagem de pedido
    Quando informo o status <status>
    E informo periodo De <periodoDe>
    E informo periodo Até <periodoAté>
    E seleciono pesquisar
    Então vejo a listagem dos pedidos cadastrados no período

    Exemplos: 
      | CanaldeVenda | Modalidade       | Vendedor     | Cliente     | NomeProduto                               | status    | periodoDe  | periodoAté |
      | PDV          | Consumidor Final | ANNA CLAUDIA | ADAO GUEDES | PR EUROMIX EXCELLENCE 1.67 INC AZURI SURF | Orcamento | 28/02/2020 | 28/02/2020 |

  @GTPDV-T11428 @GerarNovoOrcamentoComProdutoSemDescontoCanalVendaPDVMovel
  Esquema do Cenário: Gerar um novo orçamento com um produto sem desconto para canal de venda PDV Móvel
    Dado eu estou na tela inicial do Pedido de Venda
    Quando clico na opção Adicionar Novo Pedido
    Então vejo a tela de Pedidos
    Quando preencho os dados Canal de Venda <CanaldeVenda> e Modalidade <Modalidade> e Vendedor <Vendedor> e Cliente <Cliente> e Nome do Produto <NomeProduto>
    Então vejo o valor unitário do produto de 788,50
    E seleciono o botão Adicionar
    Então vejo as informações do produto e o valor a pagar do pedido de 788,50
    Quando seleciono o botao Gerar Orçamento
    Então vejo a tela de listagem de pedido
    Quando informo o status <status>
    E informo periodo De <periodoDe>
    E informo periodo Até <periodoAté>
    E seleciono pesquisar
    Então vejo a listagem dos pedidos cadastrados no período

    Exemplos: 
      | CanaldeVenda | Modalidade       | Vendedor     | Cliente     | NomeProduto                               | status    | periodoDe  | periodoAté |
      | PDV Móvel    | Consumidor Final | ANNA CLAUDIA | ADAO GUEDES | PR EUROMIX EXCELLENCE 1.67 INC AZURI SURF | Orcamento | 28/02/2020 | 28/02/2020 |

  @GTPDV-T11429 @GerarNovoOrcamentoComProdutoSemDescontoCanalVendaPreVenda
  Esquema do Cenário: Gerar um novo orçamento com um produto sem desconto para canal de venda Pre Venda
    Dado eu estou na tela inicial do Pedido de Venda
    Quando clico na opção Adicionar Novo Pedido
    Então vejo a tela de Pedidos
    Quando preencho os dados Canal de Venda <CanaldeVenda> e Modalidade <Modalidade> e Vendedor <Vendedor> e Cliente <Cliente> e Nome do Produto <NomeProduto>
    Então vejo o valor unitário do produto de 788,50
    E seleciono o botão Adicionar
    Então vejo as informações do produto e o valor a pagar do pedido de 788,50
    Quando seleciono o botao Gerar Orçamento
    Então vejo a tela de listagem de pedido
    Quando informo o status <status>
    E informo periodo De <periodoDe>
    E informo periodo Até <periodoAté>
    E seleciono pesquisar
    Então vejo a listagem dos pedidos cadastrados no período

    Exemplos: 
      | CanaldeVenda | Modalidade       | Vendedor     | Cliente     | NomeProduto                               | status    | periodoDe  | periodoAté |
      | Pré-venda    | Consumidor Final | ANNA CLAUDIA | ADAO GUEDES | PR EUROMIX EXCELLENCE 1.67 INC AZURI SURF | Orcamento | 28/02/2020 | 28/02/2020 |

  @GTPDV-T11430 @GerarNovoOrcamentoComProdutoSemDescontoCanalVendaEcommerce
  Esquema do Cenário: Gerar um novo orçamento com um produto sem desconto para canal de venda e-Commerce
    Dado eu estou na tela inicial do Pedido de Venda
    Quando clico na opção Adicionar Novo Pedido
    Então vejo a tela de Pedidos
    Quando preencho os dados Canal de Venda <CanaldeVenda> e Modalidade <Modalidade> e Vendedor <Vendedor> e Cliente <Cliente> e Nome do Produto <NomeProduto>
    Então vejo o valor unitário do produto de 788,50
    E seleciono o botão Adicionar
    Então vejo as informações do produto e o valor a pagar do pedido de 788,50
    Quando seleciono o botao Gerar Orçamento
    Então vejo a tela de listagem de pedido
    Quando informo o status <status>
    E informo periodo De <periodoDe>
    E informo periodo Até <periodoAté>
    E seleciono pesquisar
    Então vejo a listagem dos pedidos cadastrados no período

    Exemplos: 
      | CanaldeVenda | Modalidade       | Vendedor     | Cliente     | NomeProduto                               | status    | periodoDe  | periodoAté |
      | e-Commerce   | Consumidor Final | ANNA CLAUDIA | ADAO GUEDES | PR EUROMIX EXCELLENCE 1.67 INC AZURI SURF | Orcamento | 28/02/2020 | 28/02/2020 |

  @GTPDV-T11431 @GerarNovoOrcamentoComProdutoSemDescontoCanalVendaClickeCollect
  Esquema do Cenário: Gerar um novo orçamento com um produto sem desconto para canal de venda Click & Collect
    Dado eu estou na tela inicial do Pedido de Venda
    Quando clico na opção Adicionar Novo Pedido
    Então vejo a tela de Pedidos
    Quando preencho os dados Canal de Venda <CanaldeVenda> e Modalidade <Modalidade> e Vendedor <Vendedor> e Cliente <Cliente> e Nome do Produto <NomeProduto>
    Então vejo o valor unitário do produto de 788,50
    E seleciono o botão Adicionar
    Então vejo as informações do produto e o valor a pagar do pedido de 788,50
    Quando seleciono o botao Gerar Orçamento
    Então vejo a tela de listagem de pedido
    Quando informo o status <status>
    E informo periodo De <periodoDe>
    E informo periodo Até <periodoAté>
    E seleciono pesquisar
    Então vejo a listagem dos pedidos cadastrados no período

    Exemplos: 
      | CanaldeVenda    | Modalidade       | Vendedor     | Cliente     | NomeProduto                               | status    | periodoDe  | periodoAté |
      | Click & Collect | Consumidor Final | ANNA CLAUDIA | ADAO GUEDES | PR EUROMIX EXCELLENCE 1.67 INC AZURI SURF | Orcamento | 28/02/2020 | 28/02/2020 |

  @GTPDV-T11432 @GerarNovoOrcamentoComProdutoSemDescontoCanalVendaPickeGo
  Esquema do Cenário: Gerar um novo orçamento com um produto sem desconto para canal de venda Pick & Go
    Dado eu estou na tela inicial do Pedido de Venda
    Quando clico na opção Adicionar Novo Pedido
    Então vejo a tela de Pedidos
    Quando preencho os dados Canal de Venda <CanaldeVenda> e Modalidade <Modalidade> e Vendedor <Vendedor> e Cliente <Cliente> e Nome do Produto <NomeProduto>
    Então vejo o valor unitário do produto de 788,50
    E seleciono o botão Adicionar
    Então vejo as informações do produto e o valor a pagar do pedido de 788,50
    Quando seleciono o botao Gerar Orçamento
    Então vejo a tela de listagem de pedido
    Quando informo o status <status>
    E informo periodo De <periodoDe>
    E informo periodo Até <periodoAté>
    E seleciono pesquisar
    Então vejo a listagem dos pedidos cadastrados no período

    Exemplos: 
      | CanaldeVenda | Modalidade       | Vendedor     | Cliente     | NomeProduto                               | status    | periodoDe  | periodoAté |
      | Pick & Go    | Consumidor Final | ANNA CLAUDIA | ADAO GUEDES | PR EUROMIX EXCELLENCE 1.67 INC AZURI SURF | Orcamento | 28/02/2020 | 28/02/2020 |

  @GTPDV-T11433 @GerarNovoOrcamentoComProdutoSemDescontoCanalVendaMesaInterativa
  Esquema do Cenário: Gerar um novo orçamento com um produto sem desconto para canal de venda Mesa Interativa
    Dado eu estou na tela inicial do Pedido de Venda
    Quando clico na opção Adicionar Novo Pedido
    Então vejo a tela de Pedidos
    Quando preencho os dados Canal de Venda <CanaldeVenda> e Modalidade <Modalidade> e Vendedor <Vendedor> e Cliente <Cliente> e Nome do Produto <NomeProduto>
    Então vejo o valor unitário do produto de 788,50
    E seleciono o botão Adicionar
    Então vejo as informações do produto e o valor a pagar do pedido de 788,50
    Quando seleciono o botao Gerar Orçamento
    Então vejo a tela de listagem de pedido
    Quando informo o status <status>
    E informo periodo De <periodoDe>
    E informo periodo Até <periodoAté>
    E seleciono pesquisar
    Então vejo a listagem dos pedidos cadastrados no período

    Exemplos: 
      | CanaldeVenda    | Modalidade       | Vendedor     | Cliente     | NomeProduto                               | status    | periodoDe  | periodoAté |
      | Mesa Interativa | Consumidor Final | ANNA CLAUDIA | ADAO GUEDES | PR EUROMIX EXCELLENCE 1.67 INC AZURI SURF | Orcamento | 28/02/2020 | 28/02/2020 |
