public class Ativo {
    //atributos
    private int codigo;
    private String nome;
    private double precoAtual;

    //construtor
    public Ativo(int codigo, String nome, double precoAtual){
        this.codigo = codigo;
        this.nome = nome;
        this.precoAtual = precoAtual;
    }
    //getters
    public int getcodigo(){
        return this.codigo;
    }
    
    public String getnome(){
        return this.nome;
    }

    public double getprecoAtual(){
        return this.precoAtual;
    }
}
