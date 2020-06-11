#language: pt
@Regressivo @CadastrarPedidoVenda
Funcionalidade: Gerar Pedido de Venda

  @GTPDV-T11179 @CadastrarPedidoComUmProdutoSemDescontoCanalVendaPDV
  Esquema do Cenário: Gerar um novo pedido de venda com um produto sem desconto para canal de venda PDV
    Dado eu estou na tela inicial do Pedido de Venda
    Quando clico na opção Adicionar Novo Pedido
    Então vejo a tela de Pedidos
    Quando preencho os dados Canal de Venda <CanaldeVenda> e Modalidade <Modalidade> e Vendedor <Vendedor> e Cliente <Cliente> e Nome do Produto <NomeProduto>
    Então vejo o valor unitário do produto de 788,50
    E seleciono o botão Adicionar
    Então vejo as informações do produto e o valor a pagar do pedido de 788,50
    Quando seleciono o botao Gerar Pedido
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | CanaldeVenda | Modalidade       | Vendedor     | Cliente     | NomeProduto                               |
      | PDV          | Consumidor Final | ANNA CLAUDIA | ADAO GUEDES | PR EUROMIX EXCELLENCE 1.67 INC AZURI SURF |

  @GTPDV-T11180 @CadastrarPedidoComUmProdutoSemDescontoCanalVendaPDVMovel
  Esquema do Cenário: Gerar um novo pedido de venda com um produto sem desconto para canal de venda PDV Móvel
    Dado eu estou na tela inicial do Pedido de Venda
    Quando clico na opção Adicionar Novo Pedido
    Então vejo a tela de Pedidos
    Quando preencho os dados Canal de Venda <CanaldeVenda> e Modalidade <Modalidade> e Vendedor <Vendedor> e Cliente <Cliente> e Nome do Produto <NomeProduto>
    Então vejo o valor unitário do produto de 788,50
    E seleciono o botão Adicionar
    Então vejo as informações do produto e o valor a pagar do pedido de 788,50
    Quando seleciono o botao Gerar Pedido
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | CanaldeVenda | Modalidade       | Vendedor     | Cliente     | NomeProduto                               |
      | PDV Móvel    | Consumidor Final | ANNA CLAUDIA | ADAO GUEDES | PR EUROMIX EXCELLENCE 1.67 INC AZURI SURF |

  @GTPDV-T11181 @CadastrarPedidoComUmProdutoSemDescontoCanalVendaPreVenda
  Esquema do Cenário: Gerar um novo pedido de venda com um produto sem desconto para canal de venda Pré-venda
    Dado eu estou na tela inicial do Pedido de Venda
    Quando clico na opção Adicionar Novo Pedido
    Então vejo a tela de Pedidos
    Quando preencho os dados Canal de Venda <CanaldeVenda> e Modalidade <Modalidade> e Vendedor <Vendedor> e Cliente <Cliente> e Nome do Produto <NomeProduto>
    Então vejo o valor unitário do produto de 788,50
    E seleciono o botão Adicionar
    Então vejo as informações do produto e o valor a pagar do pedido de 788,50
    Quando seleciono o botao Gerar Pedido
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | CanaldeVenda | Modalidade       | Vendedor     | Cliente     | NomeProduto                               |
      | Pré-venda    | Consumidor Final | ANNA CLAUDIA | ADAO GUEDES | PR EUROMIX EXCELLENCE 1.67 INC AZURI SURF |

  @GTPDV-T11182 @CadastrarPedidoComUmProdutoSemDescontoCanalVendaeCommerce
  Esquema do Cenário: Gerar um novo pedido de venda com um produto sem desconto para canal de venda e-Commerce
    Dado eu estou na tela inicial do Pedido de Venda
    Quando clico na opção Adicionar Novo Pedido
    Então vejo a tela de Pedidos
    Quando preencho os dados Canal de Venda <CanaldeVenda> e Modalidade <Modalidade> e Vendedor <Vendedor> e Cliente <Cliente> e Nome do Produto <NomeProduto>
    Então vejo o valor unitário do produto de 788,50
    E seleciono o botão Adicionar
    Então vejo as informações do produto e o valor a pagar do pedido de 788,50
    Quando seleciono o botao Gerar Pedido
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | CanaldeVenda | Modalidade       | Vendedor     | Cliente     | NomeProduto                               |
      | e-Commerce   | Consumidor Final | ANNA CLAUDIA | ADAO GUEDES | PR EUROMIX EXCELLENCE 1.67 INC AZURI SURF |

  @GTPDV-T11184  @CadastrarPedidoComUmProdutoSemDescontoCanalVendaClickCollect
  Esquema do Cenário: Gerar um novo pedido de venda com um produto sem desconto para canal de venda Click & Collect
    Dado eu estou na tela inicial do Pedido de Venda
    Quando clico na opção Adicionar Novo Pedido
    Então vejo a tela de Pedidos
    Quando preencho os dados Canal de Venda <CanaldeVenda> e Modalidade <Modalidade> e Vendedor <Vendedor> e Cliente <Cliente> e Nome do Produto <NomeProduto>
    Então vejo o valor unitário do produto de 788,50
    E seleciono o botão Adicionar
    Então vejo as informações do produto e o valor a pagar do pedido de 788,50
    Quando seleciono o botao Gerar Pedido
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | CanaldeVenda    | Modalidade       | Vendedor     | Cliente     | NomeProduto                               |
      | Click & Collect | Consumidor Final | ANNA CLAUDIA | ADAO GUEDES | PR EUROMIX EXCELLENCE 1.67 INC AZURI SURF |

  @GTPDV-T11185   @CadastrarPedidoComUmProdutoSemDescontoCanalVendaPickGo
  Esquema do Cenário: Gerar um novo pedido de venda com um produto sem desconto para canal de venda Pick & Go
    Dado eu estou na tela inicial do Pedido de Venda
    Quando clico na opção Adicionar Novo Pedido
    Então vejo a tela de Pedidos
    Quando preencho os dados Canal de Venda <CanaldeVenda> e Modalidade <Modalidade> e Vendedor <Vendedor> e Cliente <Cliente> e Nome do Produto <NomeProduto>
    Então vejo o valor unitário do produto de 788,50
    E seleciono o botão Adicionar
    Então vejo as informações do produto e o valor a pagar do pedido de 788,50
    Quando seleciono o botao Gerar Pedido
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | CanaldeVenda | Modalidade       | Vendedor     | Cliente     | NomeProduto                               |
      | Pick & Go    | Consumidor Final | ANNA CLAUDIA | ADAO GUEDES | PR EUROMIX EXCELLENCE 1.67 INC AZURI SURF |

  @GTPDV-T11186 @CadastrarPedidoComUmProdutoSemDescontoCanalVendaMesaInterativa
  Esquema do Cenário: Gerar um novo pedido de venda com um produto sem desconto para canal de venda Mesa Interativa
    Dado eu estou na tela inicial do Pedido de Venda
    Quando clico na opção Adicionar Novo Pedido
    Então vejo a tela de Pedidos
    Quando preencho os dados Canal de Venda <CanaldeVenda> e Modalidade <Modalidade> e Vendedor <Vendedor> e Cliente <Cliente> e Nome do Produto <NomeProduto>
    Então vejo o valor unitário do produto de 788,50
    E seleciono o botão Adicionar
    Então vejo as informações do produto e o valor a pagar do pedido de 788,50
    Quando seleciono o botao Gerar Pedido
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | CanaldeVenda    | Modalidade       | Vendedor     | Cliente     | NomeProduto                               |
      | Mesa Interativa | Consumidor Final | ANNA CLAUDIA | ADAO GUEDES | PR EUROMIX EXCELLENCE 1.67 INC AZURI SURF |
