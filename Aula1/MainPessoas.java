package Aula1;

public class MainPessoas {
    public static void main(String[] args) {
        Pessoas p1 = new Pessoas();

        double indice;
        String name;
        int age;
        double heigth;
        double weight;
        String classification;

        p1.setNome("Érica");
        p1.setIdade(19);
        p1.setAltura(1.66);
        p1.setPeso(60);
        indice = p1.calcularIndice();
        name = p1.name();
        age = p1.age();
        heigth = p1.height();
        weight = p1.weigth ();
        classification = p1.getClasseIMC();




        System.out.println ("A " + name + " tem " + age +" anos.\nEla mede " + heigth + "m e pesa " + weight + "kg." );
        System.out.printf ("O seu índice é " + "%.2f.", indice);
        System.out.println ("\nEste índice indica que está" + classification + ".");
    }
}

