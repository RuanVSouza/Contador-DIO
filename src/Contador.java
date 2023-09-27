import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Primeiro parametro");
        int parametroUm = sc.nextInt();
        System.out.println("Segundo parametro");
        int parametroDois = sc.nextInt();

        try{
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{

        if(parametroUm > parametroDois){
         throw new ParametrosInvalidosException("o segundo parametro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        for(int n = 1; n <= contagem; n++) {
            System.out.println(n);
        }
    }

    private static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String message){
            super(message);
        }
    }
}
