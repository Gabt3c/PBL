public class CarteiraInvestimentos{
        public Posicao[] posicao;
        public Cliente cliente;
        public int qtAtivo;

        public CarteiraInvestimentos(Posicao posicao, int qtAtivo){
            this.posicao = new Posicao[qtAtivo];
        }

        
}
