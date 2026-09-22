public class Posicao { // Classe posicao
    private int referenciaAtivo;
    private int quantidade;// quantidade de posições
    protected Cliente cliente;

    //Construtor
    public Posicao (Cliente cliente, int quantidade, int referenciaAtivo){
        this.quantidade = quantidade;
        this.cliente = cliente;
        this.referenciaAtivo = referenciaAtivo;
    }

    //getter
    public int getQuantidade(){
        return this.quantidade;
    }

    // Venda de uma quantidade da posição
    public void vender(int quantidade){
        if (quantidade <= 0){
            System.out.println("Venda não realizada: a quantidade deve ser maior que zero.");
            return;
        }

        if (quantidade > this.quantidade){
            System.out.println("Venda não realizada: quantidade insuficiente.");
            return;
        }

        this.quantidade -= quantidade;
        System.out.println("Venda realizada com sucesso: " + quantidade + " unidade(s).");
    }

    //Obtenção e retorno de ativos
    public double getValorAtivo(){
        return cliente.ativo[referenciaAtivo].precoAtual;
    }

    public String getNomeAtivo(){
        return cliente.ativo[referenciaAtivo].nome;
    }

    //calculo de posicao
    public double calcularValor(){
         return getValorAtivo() * this.quantidade; //Passível de teste dentro do array, this.quantidade ou somente quantidade.
    }

}
