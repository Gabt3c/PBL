README - PBL Carteira de Investimentos

Integrantes:
- Gabriel de Souza Silva
- Andre Yurhi
- João Pedro Fernandes
- João Victor Vasconcelos Badaro
- Hyago Henrique

Descrição:
Sistema Java desenvolvido para representar uma carteira de investimentos,
seus ativos e posições, distribuindo as responsabilidades entre as classes.

Casos de teste:
1. Carteira com três posições.
2. Carteira vazia.
3. Adição de uma nova posição.
4. Desafio adicional: venda de uma quantidade válida.
5. Desafio adicional: tentativa de venda maior que a quantidade disponível.
6. Desafio adicional: tentativa de venda com quantidade menor ou igual a zero.

Decisão de modelagem:
O método vender() foi colocado na classe Posicao porque ela possui a
quantidade disponível do ativo. Dessa forma, a própria classe controla as
regras da venda, evitando que a quantidade fique negativa ou receba um
valor inválido por alteração direta.

Desafio adicional:
A classe Posicao possui o método vender(int quantidade), que valida a
quantidade informada, impede vendas maiores que o saldo da posição e
informa quando a operação não pode ser realizada.
