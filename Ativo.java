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
    //setters
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setPrecoAtual(double precoAtual){
        this.precoAtual=precoAtual;
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
