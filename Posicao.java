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

    //setter
    public void setQuantidade(int quantidade){
        this.quantidade=quantidade;
    }
    
    //getter
    public int getQuantidade(){
        return this.quantidade;
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
