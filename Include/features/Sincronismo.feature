#language: pt

@Regressivo @ConfiguracaoSincronismo
Funcionalidade: Configuração Sincronismo

	@GTPDV-T5707 @VerificarSincronismoAPIsexibindoLinksComoSincronizados  
  Esquema do Cenário: Verificar sincronismo das APIs exibindo os links sincronizados
    Dado eu estou na tela inicial do Pedido de Venda
    Quando seleciono a opção Configuração
    E seleciono a opção Sincronismo
    Então vejo a tela de sincronismo
    Quando seleciono a opção Sincronizar Todos
    Então vejo os links <modalidade> <CanaisVenda> <Parametros> <Classificadores> com o status sincronizados
    Quando seleciono a opção Pedidos 
    E clico na opção Listagem de Pedido
    Então vejo a tela de listagem de pedido

    Exemplos: 
      | modalidade   | CanaisVenda  | Parametros   | Classificadores |
      | Sincronizado | Sincronizado | Sincronizado | Sincronizado    |
