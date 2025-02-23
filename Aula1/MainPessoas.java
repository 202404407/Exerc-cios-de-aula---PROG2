package Aula1;

public class MainPessoas {
    public static void main(String[] args) {
        //p1 e p2 são instanciados
        Pessoas p1 = new Pessoas();
        Pessoas p2 = new Pessoas();

        double indice;
        String name;
        int age;
        double heigth;
        double weight;
        String classification;

        //Objeto p1
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

        //Objeto p2
        p2.setNome("Jorge");
        p2.setIdade(21);
        p2.setAltura(1.75);
        p2.setPeso(65);
        indice = p2.calcularIndice();
        name = p2.name();
        age = p2.age();
        heigth = p2.height();
        weight = p2.weigth ();
        classification = p2.getClasseIMC();

        System.out.println ("O " + name + " tem " + age +" anos.\nEle mede " + heigth + "m e pesa " + weight + "kg." );
        System.out.printf ("O seu índice é " + "%.2f.", indice);
        System.out.println ("\nEste índice indica que está" + classification + ".");
    }
}

