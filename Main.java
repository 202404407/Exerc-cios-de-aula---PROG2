public class Main {
    public static void main(String[] args) {
        //c1 e c2 são instanciados
        Cilindro c1= new Cilindro();
        Cilindro c2 = new Cilindro();
        Cilindro c3 = new Cilindro();
        double v1;
        double v2;
        double v3;

        c1.setRaio(8);
        c1.setAltura(12);
        v1 = c1.calcularVolume(); //método de instância para determinar volume do c1

        c2.setRaio(5);
        c2.setAltura(14);
        v2 = c2.calcularVolume();

        c3.setRaio(10);
        c3.setAltura(18);
        v3 = c3.calcularVolume();

        System.out.println("Volume de c1: " + v1);
        System.out.println("Volume de c2: " + v2);
        System.out.println("Volume de c3: " + v3);
    }
}
