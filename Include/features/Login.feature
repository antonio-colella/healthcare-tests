#language: pt
@Regressivo @Login
Funcionalidade: Login

  Contexto: Dado que estou na tela de login

  @GTPDV-T7698 @LoginDadosInválidos @Bug
  Esquema do Cenário: Tentativa de realizar o login com dados inválidos
    Quando digito o usuario <usuario> e senha <senha>
    E confirmo as informações
    Então vejo a mensagem Usuario e Senha invalidos

    Exemplos: 
      | usuario | senha  |
      | colella | abc123 |

  @GTPDV-T7699 @LoginUsuárioInválidos @Bug
  Esquema do Cenário: Tentativa de realizar o login com usuario inválido
    Quando digito o usuario <usuario> e senha <senha>
    E confirmo as informações
    Então vejo a mensagem usuario invalido

    Exemplos: 
      | usuario | senha |
      | teste   | super |

  @GTPDV-T7700 @LoginSenhaInválida
  Esquema do Cenário: Tentativa de realizar o login com senha inválida
    Quando digito o usuario <usuario> e senha <senha>
    E confirmo as informações
    Então vejo a mensagem senha inválida

    Exemplos: 
      | usuario | senha    |
      |       1 | super123 |

  @GTPDV-T7697 @LoginComSucesso
  Esquema do Cenário: Realizar o login com sucesso no Pedido de Venda
    Quando digito o usuario <usuario> e senha <senha>
    E confirmo as informações
    Então vejo a tela inicial do Pedido de Venda
    Quando seleciono ícone TOTVS
    Então vejo as minhas informações de acesso 

    Exemplos: 
      | usuario | senha |
      |       1 | super |
      
