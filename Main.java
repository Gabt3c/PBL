public class Main {
    public static void main (String[] args){

        //instânciação do objeto Cliente
        Cliente J1 = new Cliente("João Pedro", "111.111.111-11", 3);
        Cliente J2 = new Cliente("João Victor", "222.222.222-22", 5);
        Cliente J3 = new Cliente("Andre", "333.333.333-33", 3);
        Cliente J4 = new Cliente("Gabriel", "444.444.444-44", 1);

        //instânciação do objeto Ativo pertencente ao objeto Cliente
        J1.ativo[0] = new Ativo(01, "PETR4", 32.50);
        J1.ativo[1] = new Ativo(02, "ITUB4", 38);
        J1.ativo[2] = new Ativo(03, "VALE3", 62);

        J2.ativo[0] = new Ativo(01, "PETR4", 32.50);
        J2.ativo[1] = new Ativo(02, "ITUB4", 38);
        J2.ativo[2] = new Ativo(03, "VALE3", 62);
        J2.ativo[3] = new Ativo(04, "AIDB2", 72);
        J2.ativo[4] = new Ativo(05, "DEMT6", 10);
        J4.ativo[0] = new Ativo(01, "FABR3", 10);

        //instânciação do objeto Posicao pertencente ao objeto CarteiraInvestimentos
        J1.ctInvestimento.posicao[0] = new Posicao(J1, 100, 0);
        J1.ctInvestimento.posicao[1] = new Posicao(J1, 50, 1);
        J1.ctInvestimento.posicao[2] = new Posicao(J1, 20, 2);
        J2.ctInvestimento.posicao[0] = new Posicao(J2, 3, 0);
        J2.ctInvestimento.posicao[1] = new Posicao(J2, 13, 1);
        J2.ctInvestimento.posicao[2] = new Posicao(J2, 54, 2);
        J2.ctInvestimento.posicao[3] = new Posicao(J2, 3, 3);
        J2.ctInvestimento.posicao[4] = new Posicao(J2, 6, 4);

        J4.ctInvestimento.posicao[0] = new Posicao(J4, 10, 0);


        J3.ctInvestimento.exibirCarteira(); // Caso de teste com carteira zerada
        J3.ctInvestimento.adicionarAtivo(01, "UBEC6", 23);
        J3.ctInvestimento.adicionarPosicao(J3, 20, 0);

        J3.ctInvestimento.exibirCarteira();// Caso de teste com adição de posição e ativo na carteira zerada

        J1.ctInvestimento.exibirCarteira(); // Caso de teste com tres posições


        // Tentativa de venda comum
        J1.ctInvestimento.tentarVenda(0, 50);

        // Tentativa de venda maior que a quantidade disponível
        J1.ctInvestimento.tentarVenda(0, 100);
        
        
        // Tentativa de venda com quantidade inválida
        J1.ctInvestimento.tentarVenda(0, -10);
    }
}
