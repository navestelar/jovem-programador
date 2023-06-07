package geometria;

public class Quadrado extends Figura {
    public Quadrado(double unidadeDeMedida) {
        this.setUnidadeDeMedida(unidadeDeMedida);
        this.setQuantidadeDeLados(4);
    }
    public void calcularArea(){
        setArea(Math.pow(getUnidadeDeMedida(), 2));
    }
}