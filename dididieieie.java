import java.util.Scanner;

public class dididieieie {

public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("informe o codigo, 3, 4 ou 5: ");
    int codigo = entrada.nextInt();
    
    System.out.println("Informe o valor de [a] e [b]");
    int a = entrada.nextInt();
    int b =entrada.nextInt();
    
    switch (codigo) {
        case 3:

            a=a+b;
            System.out.println(a=a+(a*20)/100);
            
            break;

        case 4:   
            
            a=b-a;
            System.out.println(a=a+(a*20)/100);
            break;

        case 5:

            a=a+a;
            System.out.println(a=a-(a*5)/100);
            break;

        default:
            System.out.println("VALOR INVALIDO");
            
            
            
    }

}   
}