public class EstruturadeControle {
    public static void main(String[] args) {


        int nota1 = 2;
        int nota2 = 10;
        int nota3 = 9;
        int numeroFaltas = 50;

        int media = (nota1 + nota2 + nota3) / 3;

        if (media >= 6) {
            System.out.println("Aprovado");
        }

        if(media >= 6 && numeroFaltas <= 20 ){
            System.out.println("aprovado");
        }

        if(media < 6 || numeroFaltas > 20 ) {
            System.out.println("Reprovado");
        }


    }
}
