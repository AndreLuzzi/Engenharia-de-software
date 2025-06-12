public class Usuario {
    private String nome;
    private int idade;
    private Conta conta;

    public Usuario(String nome, int idade) {     // Erro original: nome = nome; — estava atribuindo o parametro a ele mesmo.
        this.nome = nome;
        
        
        // Validação para não aceitar idade negativa
        if (idade >= 0) {
            this.idade = idade;
        } else {
            this.idade = 0; // ou lançar exceção, dependendo da regra do sistema
        }
    }

    // Getters e Setters padrão POJO
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        }
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
