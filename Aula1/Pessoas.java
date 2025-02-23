package Aula1;

public class Pessoas {
    //declarar a classe Pessoas
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    //declara método de acesso getNome
    public String getNome() {

        return nome;
    }
    //declara método de acesso getIdade
    public int getIdade() {
        return idade;
    }
    //declara método de acesso getAltura
    public double getAltura() {
        return altura;
    }
    //declara método de acesso getPeso
    public double getPeso() {
        return peso;
    }
    //declara método de modificação setNome
    public void setNome(String nome) {
        this.nome = nome;
    }
    //declara método de modificação setIdade
    public void setIdade(int idade) {
        this.idade = idade;
    }
    //declara método de modificação setAltura
    public void setAltura(double altura) {
        this.altura = altura;
    }
    //declara método de modificação setPeso
    public void setPeso(double peso) {
        this.peso = peso;
    }
    //declara método de instância
    public double calcularIndice (){
        return peso/ Math.pow(altura, 2);
    }

    public String name () {
        return nome;
    }

    public int age (){
        return idade;
    }

    public double height() {
        return altura;
    }

    public double weigth (){
        return peso;
    }

    public String getClasseIMC () {
        double imc = this.calcularIndice();
        String classificacao = "";
        if (imc < 18.5) {
            classificacao = "abaixo do peso";
        } else {
            if (imc < 24.9) {
                classificacao = " com peso adequado";
            } else {
                if (imc > 25) {
                    classificacao = "acima do peso";
                }
            }
        }
        return classificacao;
    }

}
