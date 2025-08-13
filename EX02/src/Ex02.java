import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02 {

//     Uma P.G. (progressão geométrica) fica determinada pela sua razão (q) e pelo primeiro
//     termo (a1). Implemente um programa em Java que seja capaz de determinar qualquer
//     termo de uma P.G., dado a razão e o primeiro termo.
//                  an = a1 x q(n - 1)
    public static void main(String[] args) throws Exception {
        int q, a1, n, an, i, res;
        String s;
        BufferedReader dado;
        System.out.println("==== Cálculo de uma PG =====");
        try{
            System.out.print("Digite a razão da PG: ");
            dado = new BufferedReader(new InputStreamReader(System.in));
            s = dado.readLine();
            q = Integer.parseInt(s);
            
            System.out.print("Digite o 1 termo da PG: ");
            s = dado.readLine();
            a1 = Integer.parseInt(s);
            
            System.out.print("Digite o termo que deseja da PG (n): ");
            s = dado.readLine();
            n = Integer.parseInt(s);
            res = 1; 
            for(i=0; i<(n-1); i++){
                res*=q;
            }
            
            an = a1 * res;
            
            System.out.println("O "+n+" termo da PG é " + an);
        }
        catch (IOException erro){
            System.out.println("Dado inválido!");  
        }catch (NumberFormatException erro){
            System.out.println("Dado inválido!");            
        }
    }

}
