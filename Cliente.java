public class Cliente {
    private String nome;
    private String CPF;

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
