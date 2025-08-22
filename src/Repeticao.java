public class Repeticao {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            System.out.println("Indice: " + i);
        }

        int i = 0;
        while (i < 5){
            System.out.println("indice: " + i);
            i++;
        }

        // SE NO LUGAR DO 0 FOR UM NUMERO MAIOR Q 5 ELE VAI EXECUTAR 1 VEZ ANTES DE CONFERIR
        int j = 0;

        do {
            System.out.println("indice: "+ j);
            j++;
        } while (j < 5);


    }
}
