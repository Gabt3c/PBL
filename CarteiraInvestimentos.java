public class CarteiraInvestimentos{
        public Posicao[] posicao;
        public Cliente cliente;
        public int qtAtivo;

        public CarteiraInvestimentos(int qtAtivo){
            this.posicao = new Posicao[qtAtivo];
        }

        public void adicionarPosicao(Ativo ativo, int quantidade){
            posicao[this.qtAtivo].calcularValor();
        }
        public double calcularPatrimonio(){
            double patrimonioTotal = 0;
            for (int i = 0; this.qtAtivo > i; i++){
                patrimonioTotal = patrimonioTotal + posicao[i].calcularValor();
            }
            return patrimonioTotal;
        }

        public void exibirResumo(){
            System.out.println("Ativo  Preço atual  Quantidade");
            for (int i = 0; i < posicao.length; i++){
                System.out.println(posicao[this.qtAtivo].getNomeAtivo()/*  + "  " + Posicao[]*/);
            }
            
        }
}
