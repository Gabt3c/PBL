public class Main {
    public static void main (String[] args){
        Cliente J1 = new Cliente("João Pedro", "111.111.111-11", 3);
        J1.ativo[0] = new Ativo(01, "PETR4", 32.50);
        J1.ativo[1] = new Ativo(02, "ITUB4", 38);
        J1.ativo[2] = new Ativo(03, "VALE3", 62);
        J1.ctInvestimento.posicao[0] = new Posicao(100);

        J1.ctInvestimento.exibirResumo(02);
        
    }
}
