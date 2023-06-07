package POO;
public class Executa {
    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa("Ana", 18, 1.57, 50);
        Aluno aluno1 = new Aluno("Carlos", 22, 1.78, 70, "3251635");

        System.out.print(pessoa1.getNome()+" ");
        System.out.print(pessoa1.getIdade()+" ");
        System.out.print(pessoa1.getAltura()+" ");
        System.out.print(pessoa1.getPeso()+" ");
        System.out.println(pessoa1.calcularImc()+" ");
        System.out.print(aluno1.getNome()+" ");
        System.out.print(aluno1.getIdade()+" ");
        System.out.print(aluno1.getAltura()+" ");
        System.out.print(aluno1.getPeso()+" ");
        System.out.print(aluno1.calcularImc()+" ");
        System.out.println(aluno1.getMatricula());

        Animal animal1 = new Cachorro();
        Animal animal2 = new Gato();
        Animal animal3 = new Animal();

        animal1.emitirSom();
        animal2.emitirSom();
        animal3.emitirSom();

        
    }

}
