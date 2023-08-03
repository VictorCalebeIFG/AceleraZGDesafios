public class DesafioK0T0 {
    
    public static void main(String[] args) {

        //System.out.println(somaMultiplosDe3());
        //System.out.println(Fibonaci());
        //600851475143l
        System.out.println(maiorPrimo(600851475143l));

    }

    public static int somaMultiplosDe3(){
        int soma = 0;
        
        for (int i = 0 ; i < 1000 ; i++){
            if (i%3 == 0 || i%5 ==0){
                soma += i;
            }
        }
        
        return soma;
    }

    public static int Fibonaci(){
        int anteriorE   = 2;
        int anteriorEE  = 1;
        int novoValor   = 0;
        int sum         = 2;

        while (novoValor<4*1000000){
            novoValor   = anteriorE + anteriorEE;
            anteriorEE  = anteriorE;
            anteriorE   = novoValor;
            if (novoValor%2==0){
                sum += novoValor;
            }
        }

        return sum;
    }

    public static long maiorPrimo(long val){
        long maior           = 0;
        long naoPrimo        = 0;

        for (long current = 2 ; current <Math.sqrt(val); current++ ){
            for (long i = 1 ; i < Math.sqrt(current); i++){
                if (current%i == 0 && i!= 1 && i!=current){
                    naoPrimo = current;
                    break;
                }
            }
        
            if (current != naoPrimo && val%current==0){
                maior = current; 
                System.out.printf("primo: %d, resto %d \n",current,val%current );
            }
        }
        return maior;
    }
}
