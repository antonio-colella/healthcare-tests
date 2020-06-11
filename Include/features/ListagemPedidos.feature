#language: pt
@Regressivo @ConsultaPedidos
Funcionalidade: Listagem de Pedidos

  @GTPDV-T11155 @ConsultaPedidosStatusTodosPeriodo1ano
  Esquema do Cenário: Verificar listagem dos Pedidos de Venda pelo Status Todos no período de 1 ano
    Dado eu estou na tela inicial do Pedido de Venda
    Quando clico na opção Listagem de Pedido
    Então vejo a tela de listagem de pedido
    Quando informo status <status> e periodoDE <periodoDE>
    E seleciono pesquisar
    Então vejo a listagem dos pedidos cadastrados no período

    Exemplos: 
      | status | periodoDE |
      | TODOS  |  01012018 |

  @GTPDV-T11358 @CarregarMaisResultadosdePesquisa
  Esquema do Cenário: Verificar ao selecionar o botão carregar mais resultado de pesquisa a continuidade da lista de pedidos
    Quando informo status <status> e periodoDE <periodoDE>
    E seleciono pesquisar
    Então vejo a listagem dos pedidos cadastrados no período
    Quando seleciono carregar mais resultados
    Então exibe a continuacao da pesquisa

    Exemplos: 
      | status | periodoDE |
      | TODOS  |  01012018 |

  @GTPDV-T5710 @ConsultaSelecionarDataEmissãoCorreta
  Esquema do Cenário: Verificar selecionar Data de Emissão Correta
    Dado eu estou na tela inicial do Pedido de Venda
    Quando informo status <status> e periodoDE <periodoDE>
    E seleciono pesquisar
    Então vejo a listagem dos pedidos cadastrados no período

    Exemplos: 
      | status | periodoDE |
      | TODOS  |  01012018 |

  @GTPDV-T5711 @ConsultaSelecionarDataEmissãoPeloCalendário
  Cenário: Verificar selecionar Data de Emissão pelo Calendário
    Dado eu estou na tela inicial do Pedido de Venda
    Quando informo a data de emissão pelo calendário
    E seleciono pesquisar
    Então vejo a listagem dos pedidos cadastrados no período

  @GTPDV-T11156 @ConsultaPedidosStatusOrcamentoPeriodo1ano
  Esquema do Cenário: Verificar listagem dos Pedidos de Venda pelo Status Orçamento no período de 1 ano
    Dado eu estou na tela inicial do Pedido de Venda
    Quando clico na opção Listagem de Pedido
    Então vejo a tela de listagem de pedido
    Quando informo status <status> e periodoDE <periodoDE>
    E seleciono pesquisar
    Então vejo a listagem dos pedidos cadastrados no período

    Exemplos: 
      | status    | periodoDE |
      | Orcamento |  01012018 |

  @GTPDV-T11381 @VisualizarEditarPedidoStatusOrçamentoENumeroPedido
  Esquema do Cenário: Verificar na Edição do Pedido o status Orçamento e o número do pedido
    Quando informo status <status> e periodoDE <periodoDE>
    E seleciono pesquisar
    Então vejo a listagem dos pedidos cadastrados no período
    Quando seleciono ...
    E clico em Editar Pedido
    Então vejo o pedido de venda no status2 <status2> com o numero no pedido
    E retorno para tela de listagem de pedido

    Exemplos: 
      | status    | periodoDE | status2           |
      | Orcamento |  01012018 | Status: Orcamento |

  @GTPDV-T11157 @ConsultaPedidosStatusAbertoPeriodo1ano
  Esquema do Cenário: Verificar listagem dos Pedidos de Venda pelo Status Aberto no período de 1 ano
    Dado eu estou na tela inicial do Pedido de Venda
    Quando clico na opção Listagem de Pedido
    Então vejo a tela de listagem de pedido
    Quando informo status <status> e periodoDE <periodoDE>
    E seleciono pesquisar
    Então vejo a listagem dos pedidos cadastrados no período

    Exemplos: 
      | status | periodoDE |
      | Aberto |  01012018 |

  @GTPDV-T11382 @VisualizarEditarPedidoStatusAbertoENumeroPedido
  Esquema do Cenário: Verificar na Edição do Pedido o status Aberto e o número do pedido
    Quando informo status <status> e periodoDE <periodoDE>
    E seleciono pesquisar
    Então vejo a listagem dos pedidos cadastrados no período
    Quando seleciono ...
    E clico em Editar Pedido
    Então vejo o pedido de venda no status2 <status2> com o numero no pedido
    E retorno para tela de listagem de pedido

    Exemplos: 
      | status | periodoDE | status2        |
      | Aberto |  01012018 | Status: Aberto |

  @GTPDV-T11159 @ConsultaPedidosStatusAtualizadoPDVPeriodo1ano
  Esquema do Cenário: Verificar listagem dos Pedidos de Venda pelo Status AtualizadoPDV no período de 1 ano
    Dado eu estou na tela inicial do Pedido de Venda
    Quando clico na opção Listagem de Pedido
    Então vejo a tela de listagem de pedido
    Quando informo status <status> e periodoDE <periodoDE>
    E seleciono pesquisar
    Então vejo a listagem dos pedidos cadastrados no período

    Exemplos: 
      | status        | periodoDE |
      | AtualizadoPDV |  01012018 |

  @GTPDV-T11383 @VisualizarEditarPedidoStatusAtualizadoPDV
  Esquema do Cenário: Verificar edição do pedido de venda que está no status AtualizadoPDV
    Quando informo status <status> e periodoDE <periodoDE>
    E seleciono pesquisar
    Então vejo a listagem dos pedidos cadastrados no período
    Quando seleciono ...
    Então vejo o botão Editar Pedido desabilitado

    Exemplos: 
      | status        | periodoDE |
      | AtualizadoPDV |  01012018 |

  @GTPDV-T11162 @ConsultaPedidosStatusEntreguePeriodo1ano
  Esquema do Cenário: Verificar listagem dos Pedidos de Venda pelo Status Entregue no período de 1 ano
    Dado eu estou na tela inicial do Pedido de Venda
    Quando clico na opção Listagem de Pedido
    Então vejo a tela de listagem de pedido
    Quando informo status <status> e periodoDE <periodoDE>
    E seleciono pesquisar
    Então vejo a listagem dos pedidos cadastrados no período

    Exemplos: 
      | status   | periodoDE |
      | Entregue |  01012018 |

  @GTPDV-T11384 @VisualizarEditarPedidoStatusEntregue
  Esquema do Cenário: Verificar edição do pedido de venda que está no status Entregue
    Quando informo status <status> e periodoDE <periodoDE>
    E seleciono pesquisar
    Então vejo a listagem dos pedidos cadastrados no período
    Quando seleciono ...
    Então vejo o botão Editar Pedido desabilitado

    Exemplos: 
      | status   | periodoDE |
      | Entregue |  01012018 |

  @GTPDV-T11165 @ConsultaPedidosStatusFaturadoPeriodo1ano
  Esquema do Cenário: Verificar listagem dos Pedidos de Venda pelo Status Faturado no período de 1 ano
    Dado eu estou na tela inicial do Pedido de Venda
    Quando clico na opção Listagem de Pedido
    Então vejo a tela de listagem de pedido
    Quando informo status <status> e periodoDE <periodoDE>
    E seleciono pesquisar
    Então vejo a listagem dos pedidos cadastrados no período

    Exemplos: 
      | status   | periodoDE |
      | Faturado |  01012018 |

  @GTPDV-T11385 @VisualizarEditarPedidoStatusFaturado
  Esquema do Cenário: Verificar edição do pedido de venda que está no status Faturado
    Quando informo status <status> e periodoDE <periodoDE>
    E seleciono pesquisar
    Então vejo a listagem dos pedidos cadastrados no período
    Quando seleciono ...
    Então vejo o botão Editar Pedido desabilitado

    Exemplos: 
      | status   | periodoDE |
      | Faturado |  01012018 |

  @GTPDV-T11168 @ConsultaPedidosStatusCanceladoPDVPeriodo1ano
  Esquema do Cenário: Verificar listagem dos Pedidos de Venda pelo Status CanceladoPDV no período de 1 ano
    Dado eu estou na tela inicial do Pedido de Venda
    Quando clico na opção Listagem de Pedido
    Então vejo a tela de listagem de pedido
    Quando informo status <status> e periodoDE <periodoDE>
    E seleciono pesquisar
    Então vejo a listagem dos pedidos cadastrados no período

    Exemplos: 
      | status       | periodoDE |
      | CanceladoPDV |  01012018 |

  @GTPDV-T11386 @VisualizarEditarPedidoStatusCanceladoPDV
  Esquema do Cenário: Verificar edição do pedido de venda que está no status CanceladoPDV
    Quando informo status <status> e periodoDE <periodoDE>
    E seleciono pesquisar
    Então vejo a listagem dos pedidos cadastrados no período
    Quando seleciono ...
    Então vejo o botão Editar Pedido desabilitado

    Exemplos: 
      | status       | periodoDE |
      | CanceladoPDV |  01012018 |

  @GTPDV-T11170 @ConsultaPedidosStatusFinalizadoPDVPeriodo1ano
  Esquema do Cenário: Verificar listagem dos Pedidos de Venda pelo Status FinalizadoPDV no período de 1 ano
    Dado eu estou na tela inicial do Pedido de Venda
    Quando clico na opção Listagem de Pedido
    Então vejo a tela de listagem de pedido
    Quando informo status <status> e periodoDE <periodoDE>
    E seleciono pesquisar
    Então vejo a listagem dos pedidos cadastrados no período

    Exemplos: 
      | status        | periodoDE |
      | FinalizadoPDV |  01012018 |

  @GTPDV-T11387 @VisualizarEditarPedidoStatusFinalizadoPDV
  Esquema do Cenário: Verificar edição do pedido de venda que está no status FinalizadoPDV
    Quando informo status <status> e periodoDE <periodoDE>
    E seleciono pesquisar
    Então vejo a listagem dos pedidos cadastrados no período
    Quando seleciono ...
    Então vejo o botão Editar Pedido desabilitado

    Exemplos: 
      | status        | periodoDE |
      | FinalizadoPDV |  01012018 |

  @GTPDV-T11173 @ConsultaPedidosStatusEmAtendimentoPeriodo1ano
  Esquema do Cenário: Verificar listagem dos Pedidos de Venda pelo Status EmAtendimento no período de 1 ano
    Dado eu estou na tela inicial do Pedido de Venda
    Quando clico na opção Listagem de Pedido
    Então vejo a tela de listagem de pedido
    Quando informo status <status> e periodoDE <periodoDE>
    E seleciono pesquisar
    Então vejo a listagem dos pedidos cadastrados no período

    Exemplos: 
      | status        | periodoDE |
      | EmAtendimento |  01012018 |

  @GTPDV-T11388 @VisualizarEditarPedidoStatusEmAtendimento
  Esquema do Cenário: Verificar edição do pedido de venda que está no status EmAtendimento
    Quando informo status <status> e periodoDE <periodoDE>
    E seleciono pesquisar
    Então vejo a listagem dos pedidos cadastrados no período
    Quando seleciono ...
    E clico em Editar Pedido
    Então vejo o botão Editar Pedido desabilitado

    Exemplos: 
      | status        | periodoDE | status2               |
      | EmAtendimento |  01012018 | Status: EmAtendimento |

  @GTPDV-T11174 @ConsultaPedidosComDataPeriodoDEMaiorPeriodoAte
  Esquema do Cenário: Verificar pesquisa de pedidos com a data de Periodo De maior que a Periodo Até
    Dado eu estou na tela inicial do Pedido de Venda
    Quando informo periodoDE <periodoDE>
    Quando informo periodoATE <periodoATE>
    E seleciono pesquisar
    Então vejo a mensagem A data Inicial deve ser menor que a data final.
    Quando seleciono botão OK
    Então vejo a tela de listagem de pedidos

    Exemplos: 
      | periodoDE | periodoATE |
      |  30122020 |   01012020 |

  @GTPDV-T5708 @ConsultaPedidospeloNumerodoPedido
  Esquema do Cenário: Verificar pesquisa de pedidos pelo número do pedido
    Dado eu estou na tela inicial do Pedido de Venda
    Quando informo numero do pedido <NumPedido>
    E seleciono pesquisar
    Então vejo apenas um registro no resultado da consulta <NumPedido>

    Exemplos: 
      | NumPedido |
      |      9001 |

  @GTPDV-T5719 @ConsultaPedidospeloNomedoCliente
  Esquema do Cenário: Verificar pesquisa de pedidos pelo nome do cliente
    Dado eu estou na tela inicial do Pedido de Venda
    Quando informo nome do cliente <NomeCliente>
    E seleciono pesquisar
    Então vejo apenas um registro com o cliente específico <NomeCliente> no resultado da consulta

    Exemplos: 
      | NomeCliente          |
      | ADAO GUEDES MULINANI |

  @GTPDV-T5709 @ConsultaPedidoComDataInvalidaPeriodoDE
  Esquema do Cenário: Verificar consulta de pedido com data inválida de Periodo DE
    Dado eu estou na tela inicial do Pedido de Venda
    Quando informo periodoDE <periodoDE>
    E seleciono pesquisar
    Então vejo a mensagem <mensagem> Favor informe as datas de emissão inicial e final ou status do pedido.
    Quando seleciono botão OK
    Então vejo a tela de listagem de pedidos

    Exemplos: 
      | periodoDE | mensagem                                                               |
      |  00000000 | Favor informe as datas de emissão inicial e final ou status do pedido. |

  @GTPDV-T11396 @ConsultaPedidoComDataInvalidaPeriodoATE
  Esquema do Cenário: Verificar consulta de pedido com data inválida de Periodo ATE
    Dado eu estou na tela inicial do Pedido de Venda
    Quando informo periodoATE <periodoATE>
    E seleciono pesquisar
    Então vejo a mensagem <mensagem> Favor informe as datas de emissão inicial e final ou status do pedido.
    Quando seleciono botão OK
    Então vejo a tela de listagem de pedidos

    Exemplos: 
      | periodoATE | mensagem                                                               |
      |   00000000 | Favor informe as datas de emissão inicial e final ou status do pedido. |

  @GTPDV-T11397 @ConsultaPedidoComDataInvalidaPeriodoDEPeriodoATE
  Esquema do Cenário: Verificar consulta de pedido com data inválida de Periodo DE e Periodo ATE
    Dado eu estou na tela inicial do Pedido de Venda
    Quando informo periodoDE <periodoDE>
    Quando informo periodoATE <periodoATE>
    E seleciono pesquisar
    Então vejo a mensagem <mensagem> Favor informe as datas de emissão inicial e final ou status do pedido.
    Quando seleciono botão OK
    Então vejo a tela de listagem de pedidos

    Exemplos: 
      | periodoDE | periodoATE | mensagem                                                               |
      |  00000000 |   00000000 | Favor informe as datas de emissão inicial e final ou status do pedido. |

  @GTPDV-T5747 @ConsultaPedidospeloNumeroCompletodoCPFdoCliente
  Esquema do Cenário: Verificar pesquisa de pedidos pelo numero completo do CPF do Cliente
    Dado eu estou na tela inicial do Pedido de Venda
    Quando informo cpf <cpf>
    E seleciono pesquisar
    Então vejo apenas um registro com o cliente específico <NomeCliente> no resultado da consulta

    Exemplos: 
      | cpf         | NomeCliente          |
      | 12741374899 | ADAO GUEDES MULINANI |

  @GTPDV-T11513 @ConsultaPedidospelos3PrimeirosNumerosdoCPFdoCliente
  Esquema do Cenário: Verificar pesquisa de pedidos pelos 3 primeiros numeros do CPF do Cliente
    Dado eu estou na tela inicial do Pedido de Venda
    Quando informo cpf <cpf>
    E seleciono pesquisar
    Então vejo apenas um registro com o cliente específico <NomeCliente> no resultado da consulta

    Exemplos: 
      | cpf | NomeCliente          |
      | 127 | ADAO GUEDES MULINANI |

  @GTPDV-T11514 @ConsultaPedidospelas3PrimeirosLetrasdoNomeCliente
  Esquema do Cenário: Verificar pesquisa de pedidos pelas as primeiras 3 letras do Nome do Cliente
    Dado eu estou na tela inicial do Pedido de Venda
    Quando informo nome do cliente <NomeCliente>
    E seleciono pesquisar
    Então vejo apenas um registro com o cliente específico <NomeCliente2> no resultado da consulta

    Exemplos: 
      | NomeCliente | NomeCliente2         |
      | ADA     | ADAO GUEDES MULINANI |
