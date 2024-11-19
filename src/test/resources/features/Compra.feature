#language: pt

@Global
Funcionalidade: Compra monitor

  Contexto:
    Dado que acesso site do DemoBlaze

  @CenarioCompra
  Cenario: Fazer a compra de um monitor
    Quando pesquiso um monitor
    E adiciono monitor no carrinho
    Entao realizo compra do monitor
    E finalizo a compra
