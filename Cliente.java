public class Cliente {
    private String nome;
    private String CPF;
    //Composições
    protected Posicao[] posicao;
    protected Ativo[] ativo;
    protected CarteiraInvestimentos ctInvestimento;

    public Cliente (String nome, String CPF, int qtAtivo){
        this.nome = nome;
        this.CPF = CPF;
        this.posicao = new Posicao[qtAtivo];
        this.ativo = new Ativo[qtAtivo];
        this.ctInvestimento = new CarteiraInvestimentos(null, qtAtivo);
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    public String getNome(){
        return this.nome;
    }
    public String getCPF(){
        return this.CPF;
    }
}
