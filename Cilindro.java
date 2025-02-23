public class Cilindro {
    //declarar a classe Cilindro
    private double altura;
    private double raio;

    public double getRaio() {
        return raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
//método de instância para calcular volume do cilindro
    public double calcularVolume(){
        return Math.PI * Math.pow(raio,2) * altura;

    }



}
