public class CarteiraInvestimentos{
        public Posicao[] posicao;
        public Cliente cliente;

        public CarteiraInvestimentos(Cliente cliente){
            this.cliente = cliente;
            this.posicao = new Posicao[cliente.qtativo];
        }

public void adicionarAtivo(int codigo, String nome, double precoAtual) {
    cliente.ativo[0] = new Ativo(codigo, nome, precoAtual);
}

 public void adicionarPosicao(Cliente cliente, int quantidade, int referenciaAtivo) {
    this.posicao[referenciaAtivo] =
        new Posicao(cliente, quantidade, referenciaAtivo);
}
        
        public double calcularPatrimonio(){
            double patrimonioTotal = 0;
            for (int i = 0; cliente.qtativo > i; i++){
                patrimonioTotal += posicao[i].calcularValor();
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
            exibirResumo(i);
                }
            }
            System.out.println("\nPatrimonio TotaL: R$ " + calcularPatrimonio());
            System.out.println("________________________________________________________");
        }
}