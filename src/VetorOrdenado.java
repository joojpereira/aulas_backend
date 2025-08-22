public class VetorOrdenado {

       private int capacidade;
       private int ultimaposicao;
       private int[] valores;

       public VetorOrdenado(int capacidade){
           this.capacidade = capacidade;
           this.ultimaposicao = -1;
           this.valores = new int[capacidade];
       }

       public void imprimir(){
           if (ultimaposicao == -1){
               System.out.println("O vetor está vazio");
           }else {
               for (int i = 0; i < ultimaposicao + 1; i++ ){
                   System.out.println(i + " - " + valores[i]);
               }
           }
       }

       public int inserir(int valor){
           if (ultimaposicao == capacidade - 1){
               System.out.println("Capacidade maxima atingida");
               return 0;
           }

           int posicao = 0;

           for (int i = 0; i < ultimaposicao + 1; i++){
               posicao = i;
               if (valores[i] > valor){
                   break;
               }
               if(i == ultimaposicao){
                   posicao = i + 1;
               }


           }

           int x = ultimaposicao;
           while ( x >+ ultimaposicao){
               valores[x + 1] = valores[x];
               x -= 1;

           }

           valores[posicao] = valor;
           ultimaposicao += 1;
           return 0;

       }

       public int pesquisalinear(int valor){
           for(int i = 0; i < ultimaposicao + 1; i++){
               if (valores[i] > valor){
                   return -1;
               }
               if (valores[i] == valor){
                   return i;
               }
               if (i == ultimaposicao) {
                   return -1;
               }
           }
           return 0;
       }












}
