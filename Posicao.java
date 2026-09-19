public class Posicao {
    private int quantidade;// quantidade de posições
    protected Ativo[] ativo;

    public Posicao (int quantidade){
        this.quantidade = quantidade;
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
        return ativo[quantidade].precoAtual;
    }
    public String getNomeAtivo(){
        return ativo[quantidade].nome;
    }

    //calculo de posicao
    public double calcularValor(){
         return ativo[quantidade].precoAtual * this.quantidade; //Passível de teste dentro do array, this.quantidade ou somente quantidade.
    }
    
}
