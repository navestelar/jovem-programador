public class CirculoCompleto {
    private double raio;

    public CirculoCompleto(double raio){
        this.setRaio(raio);
    }

    public double CalculaArea(){
        return Math.PI*Math.pow(raio, 2);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
