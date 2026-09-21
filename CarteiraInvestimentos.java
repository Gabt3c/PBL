public class CarteiraInvestimentos{
        public Posicao[] posicao;
        public Cliente cliente;
        private int qtdPosicoes;//será usado para percorrer a matriz no lugar de qtAtivo

        public CarteiraInvestimentos(Cliente cliente){
            this.cliente = cliente;
            this.posicao = new Posicao[cliente.qtativo];
            this.qtdPosicoes = 0;
        }
//construtor para adicionar um ativo
public void adicionarAtivo(int codigo, String nome, double precoAtual) {
    cliente.ativo[0] = new Ativo(codigo, nome, precoAtual);
}
//criação de posições para alocar os ativos
 public void adicionarPosicao(Cliente cliente, int quantidade, int referenciaAtivo) {
    this.posicao[qtdPosicoes] = new Posicao(cliente, quantidade, referenciaAtivo);
    this.qtdPosicoes++;
}
        
        public double calcularPatrimonio(){
            double patrimonioTotal = 0;
            for (int i = 0; cliente.qtativo > i; i++){
                if (posicao[i] != null){
                    patrimonioTotal += posicao[i].calcularValor();
                }
            }

            return patrimonioTotal;
        }

        public void exibirResumo(int referencia){ //Exibe resumo dos dados do ativo
            //int refVetor = referencia - 1;
            int refVetor = referencia; 
            System.out.println(posicao[refVetor].getNomeAtivo()
                    + "    R$ " + posicao[refVetor].getValorAtivo()
                    + "         " + posicao[refVetor].getQuantidade()
                    + "          " + posicao[refVetor].calcularValor()
                              );
        }

        public void exibirCarteira(){
            System.out.println("              CARTEIRA DE INVESTIMENTOS");
            System.out.println("________________________________________________________\n");
            System.out.println("Cliente: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCPF());
            if(cliente.qtativo != 0){
            System.out.println("\nAtivo  Preço atual  Quantidade Valor da posição\n");
            for (int i = 0; cliente.qtativo > i; i++){
            if(posicao[i] != null){exibirResumo(i);}
                }
                
            }
            System.out.println("\nPatrimonio TotaL: R$ " + calcularPatrimonio());
            System.out.println("________________________________________________________");
        }
}