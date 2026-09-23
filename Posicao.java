public class Posicao { // Classe posicao
    private int referenciaAtivo;
    private int quantidade;// quantidade de posições
    protected Cliente cliente;

    //Construtor
    public Posicao (Cliente cliente, int quantidade, int referenciaAtivo){
        if(quantidade > 0){
            this.quantidade = quantidade;
        }else{
            System.out.println("Não vou deixar você quebrar o sistema, maldito!");
        }
        this.cliente = cliente;
        this.referenciaAtivo = referenciaAtivo;
    }

    //getter
    public int getQuantidade(){
        return this.quantidade;
    }

    // Venda de uma quantidade da posição
    public boolean vender(int quantidade){
        if (quantidade <= 0 || quantidade > this.quantidade){
            return false;
        }else {
            this.quantidade -= quantidade;
            return true;
        }
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
