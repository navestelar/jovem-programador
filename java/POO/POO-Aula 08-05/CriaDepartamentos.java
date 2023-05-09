public class CriaDepartamentos {
    public static void main(String[] args) {
        Departamentos departamento1 = new Departamentos("Frontend", 10);

        System.out.println(departamento1.getNome());
        System.out.println(departamento1.getNumeroDeFuncionarios());
    }
}
