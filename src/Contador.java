import java.util.Scanner;
import java.lang.Exception;


public class Contador {

    public static void main(String[] args) throws  ParametrosInvalidosException {
        Scanner terminal = new Scanner(System.in);

        int parametroUm = terminal.nextInt();
        int parametroDois = terminal.nextInt();

        try {
            Contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {

            System.out.println("O segundo paramêtro deve ser maior que o primeiro");
            
        }

    }

    



    static void Contar(int parametroUm, int parametroDois) throws  ParametrosInvalidosException  {
        if (parametroUm > parametroDois) {

           throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
            
        }else {
            int contagem = parametroDois - parametroUm;
            for(int i = 1; i <= contagem; i ++){
                System.out.println("Imprimindo o numero " + i);
            }

            
        }
    }

}

        
       
    