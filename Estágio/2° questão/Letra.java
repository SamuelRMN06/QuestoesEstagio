public class Letra {
    public static void main(String[] args){
        String palavra = "ola";

        if (palavra.contains("a") || palavra.contains("A")){
            System.out.println("A letra (a) foi encontrada na palavra!");
        }
        else{
            System.out.println("A letra (a) não foi encontrada na palavra!");
        }
    }
}
