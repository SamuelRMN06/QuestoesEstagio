public class Soma{
    public static void main(String[] args){
        int indice = 12;
        int soma = 0;
        int k = 1;

        while (k < indice){
            soma = soma + k;
            k++;
        }
        System.out.println(soma);
    }
}