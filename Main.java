public class Main {
    public static void main(String[] args) {
        //c1 e c2 são instanciados
        Cilindro c1= new Cilindro();
        Cilindro c2 = new Cilindro();
        double v1;
        double v2;

        c1.setRaio(5);
        c1.setAltura(10);
        v1 = c1.calcularVolume(); //método de instância para determinar volume do c1

        c2.setRaio(4);
        c2.setAltura(16);
        v2 = c2.calcularVolume();

        System.out.println("Volume de c1: " + v1);
        System.out.println("Volume de c2: " + v2);
    }
}
