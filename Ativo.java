public class Ativo {
    //atributos
    private int codigo;
    protected String nome;
    protected double precoAtual;

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
    }
    //getters
    public int getCodigo(){
        return this.codigo;
    }
    
    public String getNome(){
        return this.nome;
    }

    public double getPrecoAtual(){
        return this.precoAtual;
    }
}