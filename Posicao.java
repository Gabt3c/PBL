public class Posicao {
    private int quantidade;
    public Ativo[] ativo;

    public Posicao (int quantidade, Ativo ativo){
        this.quantidade = quantidade;
        this.ativo = new Ativo[quantidade];
    }

    //setter
    public void setQuantidade(int quantidade){
        this.quantidade=quantidade;
    }
    //getter
    public int getQuantidade(){
        return this.quantidade;
    }

    //calculo de posicao
    public double calcularValor(){
         return ativo[quantidade].precoAtual * this.quantidade; //Passível de teste dentro do array, this.quantidade ou somente quantidade.
    }
    
}
