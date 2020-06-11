#language: pt
@Regressivo @ConfigurarAmbiente
Funcionalidade: Configuração Ambiente

  @GTPDV-T7696 @VerificarConfiguraçãoAmbiente
  Esquema do Cenário: Verificar configuração do Ambiente via parametros para Acesso ao Pedido de Venda
    Dado que estou na tela inicial
    Quando seleciono a opcao Parametros
    E preencho a url da api <UrlAPI>
    E preencho o numero do <OwnerID>
    E confirmo no botao Gravar
    Então vejo as informacoes de login sem mensagem de erro

    Exemplos: 
      | UrlAPI                                   | OwnerID                              |
      | http://sposrvlqadev004/TOTVS.POS.API/api | 50EB7548-CF56-4EA3-806E-239A1001C060 |

  @GTPDV-T11357 @VerificarTelaLoginSemMensagemErroAmbiente
  Cenário: Verificar Tela de Login Sem Apresentam a Mensagem de Erro do Ambiente
    Dado devo visualizar a tela de Bem-Vindo com as informação de login
    Então vejo as informacoes de login sem mensagem de erro
