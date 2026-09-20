public class CarteiraInvestimentos{
        public Posicao[] posicao;
        public Cliente cliente;

        public CarteiraInvestimentos(){
            this.posicao = new Posicao[cliente.qtativo];
        }

        public void adicionarPosicao(Ativo ativo, int quantidade){
            posicao[cliente.qtativo].calcularValor();
        }
        
        public double calcularPatrimonio(){
            double patrimonioTotal = 0;
            for (int i = 0; cliente.qtativo > i; i++){
                patrimonioTotal = patrimonioTotal + posicao[i].calcularValor();
            }
            return patrimonioTotal;
        }

        public void exibirResumo(){
            System.out.println("Ativo  Preço atual  Quantidade");
            for (int i = 0; i < posicao.length; i++){
                System.out.println(posicao[i].getNomeAtivo()/*  + "  " + Posicao[]*/);
            }
            
        }
}