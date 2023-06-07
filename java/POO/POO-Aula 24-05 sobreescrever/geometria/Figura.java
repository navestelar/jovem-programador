package geometria;

public class Figura {
    private double area;
    private double perimetro;
    private double unidadeDeMedida;
    private int quantidadeDeLados;
    
    public void calcularPerimetro(){
        setPerimetro(getUnidadeDeMedida()*getQuantidadeDeLados());
    }
    
    public int getQuantidadeDeLados() {
        return quantidadeDeLados;
    }

    public void setQuantidadeDeLados(int quantidadeDeLados) {
        this.quantidadeDeLados = quantidadeDeLados;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public double getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    public double getUnidadeDeMedida() {
        return unidadeDeMedida;
    }
    public void setUnidadeDeMedida(double unidadeDeMedida) {
        this.unidadeDeMedida = unidadeDeMedida;
    }
}
