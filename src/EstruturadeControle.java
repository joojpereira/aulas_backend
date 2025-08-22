public class EstruturadeControle {
    public static void main(String[] args) {

        int numero = 7;
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



        if(media >= 6 && numeroFaltas <= 20 ){
            System.out.println("aprovado");
        } else {
            System.out.println("Reprovado");
        }


        if(media < 6 || numeroFaltas > 20 ) {
            System.out.println("Reprovado");
        }else {
            System.out.println("Aprovado");
        }


        String resultado =  (numero % 2 == 0)? "Par" : "Impar";

        System.out.println("O numero " + numero + " é " + resultado);











    }
}
