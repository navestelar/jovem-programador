public class RetanguloCompleto {
    private double base;
    private double altura;

    public RetanguloCompleto(double base, double altura){
        this.setBase(base);
        this.setAltura(altura);
    }

    public double calcularArea(){
        return (base*altura)/2;
    }
    
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
