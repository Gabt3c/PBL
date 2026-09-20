public class CarteiraInvestimentos{
        //atributos
        public Posicao[] posicao;
        public Cliente cliente;
        public int qtAtivo;
        //construtores
        public CarteiraInvestimentos(int qtAtivo){
            this.posicao = new Posicao[qtAtivo];
        }

        public void adicionarPosicao(Ativo ativo, int quantidade){
            posicao[this.qtAtivo].calcularValor();
        }
        
        //Calcula o total da cateira
        public double calcularPatrimonio(){
            double patrimonioTotal = 0;
            for (int i = 0; this.qtAtivo > i; i++){
                patrimonioTotal = patrimonioTotal + posicao[i].calcularValor();
            }
            return patrimonioTotal;
        }

        //CAOS INEVITAVEL
        public void exibirResumo(){
            System.out.println("Ativo  Preço atual  Quantidade");
            for (int i = 0; i < posicao.length; i++){
                System.out.println(
                    posicao[i].getNomeAtivo() + "  " +  //ativo
                    posicao[i].calcularValor() + "  " + //preço atual
                    posicao[i].getQuantidade());        //quantidade
            }
            
        }
}
