public class Relatorio {
    public void gerarRelatorioUsuario(Usuario u) {
        if (u != null && u.getConta() != null) {
            System.out.println("Relatório do Usuário:");
            System.out.println("Nome: " + u.getNome());
            System.out.println("Idade: " + u.getIdade());
            System.out.println("Conta: " + u.getConta().getNumeroConta());
            System.out.println("Saldo: " + u.getConta().getSaldo());
        }
    }
}
