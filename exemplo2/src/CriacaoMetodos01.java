public class CriacaoMetodos01 {

    public static void tela(String texto){
        System.out.println("O texto informado é: ");
        System.out.println(texto);
    }

    public static void limpatela(){
        for(int i =1; i<=25; i++){
            System.out.println();            
        }

    }
    public static void main(String[] args) throws Exception {
        String frase = "O gato roeu a roupa do rei de roma";
        CriacaoMetodos01.limpatela();
        tela(frase);
        System.out.println("acabou...");
    }
}
