public class CriaConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta(281, 10987, "Ana", 101.57);

        System.out.println(conta1.getAgencia());
        System.out.println(conta1.getNumero());
        System.out.println(conta1.getTitular());
        System.out.println(conta1.getSaldo());
    }
}
