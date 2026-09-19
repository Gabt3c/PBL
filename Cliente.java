public class Cliente {
    private String nome;
    private String CPF;
    public Cliente (String nome, String CPF){
        this.nome = nome;
        this.CPF = CPF;
    }
    setNome(String nome){
        this.nome = nome;
    }
    setCPF(String CPF){
        this.CPF = CPF;
    }
    getNome(){
        return this.nome;
    }
    getCPF(){
        return this.CPF;
    }
}
