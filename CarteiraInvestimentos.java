public class CarteiraInvestimentos{
        public Posicao[] posicao;
        public Cliente cliente;

        public CarteiraInvestimentos(Cliente cliente){
            this.cliente = cliente;
            this.posicao = new Posicao[cliente.qtativo];
        }

        /*public void adicionarPosicao(Ativo ativo, int quantidade){
            posicao[cliente.qtativo].calcularValor();
        }*/
        
        public double calcularPatrimonio(){
            double patrimonioTotal = 0;
            for (int i = 0; cliente.qtativo > i; i++){
                patrimonioTotal += posicao[i].calcularValor();
            }
            return patrimonioTotal;
        }

        public void exibirResumo(int referencia){
            int refVetor = referencia - 1;
            System.out.println("Ativo  Preço atual  Quantidade");

            System.out.println(posicao[refVetor].getNomeAtivo()
                    + "  R$" + posicao[refVetor].getValorAtivo()
                    + "    " + posicao[refVetor].getQuantidade()
                              );
        }
}