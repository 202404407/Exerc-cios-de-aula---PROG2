package Aula1;

public class Pessoas {
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public String getNome() {

        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

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
