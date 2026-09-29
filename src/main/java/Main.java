import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Setup
        Scanner sc = new Scanner(System.in);
        
        //Variables
        System.out.println("Digite o numero de vezes");
        int n = sc.nextInt();
        System.out.println("Digite a frase");
        String frase = sc.next();
        
        //Logic and Output
        for(int i=0;i<n;i++){
            System.out.println("Aqui esta: " + frase);
        }
    }
}
