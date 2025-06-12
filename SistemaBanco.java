public class SistemaBanco {
    public static void main(String[] args) {
        Usuario u = new Usuario("Severo", -25); // idade negativa será corrigida para 0
        Conta c = new Conta(1856645377);
        u.setConta(c); // uso do setter em vez de acessar diretamente

        u.getConta().depositar(-100); // tentativa inválida de depósito
        u.getConta().sacar(50); // tentativa inválida de saque (saldo = 0)

        // Impressão usando getters
        System.out.println("Usuário: " + u.getNome() + ", Idade: " + u.getIdade());
        System.out.println("Conta: " + u.getConta().getNumeroConta() + ", Saldo: " + u.getConta().getSaldo());
    }
}
