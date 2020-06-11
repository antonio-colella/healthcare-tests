#language: pt
@Regressivo @Logout
Funcionalidade: Logout

  @GTPDV-T11029 @RealizarLogoutdoPedidodeVenda
  Cenário: Verificar realização do logout do pedido de venda
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono ícone TOTVS
    E clico na opção Sair
    Então devo visualizar a tela de Bem-Vindo com as informação de login  
    