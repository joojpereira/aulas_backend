public class Conversor {
    double celsius;
    double fahrenheit;
    int horas;
    int minutos;


    public Conversor(double celsius) {
        this.celsius = celsius;
        fahrenheit = (celsius * 9 / 5) + 32;
    }

    public Conversor(int horas, int minutos){
        this.horas = horas;
        this.minutos = minutos;
    }

    public void exibir() {
        System.out.println("Fahrenheit: " + fahrenheit);
    }

    public void exibircal(){
        System.out.println("horas: " + horas + ", Minutos: " + minutos);
        System.out.println("Os minutos totais são: " + ((horas * 60)+ minutos ));

    }

}