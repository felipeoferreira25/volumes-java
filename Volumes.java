import java.util.Scanner;
public class Volumes{
    public static void main(String[] args){
        char opcao;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite letra A, B e C para calcular o volume do paralelepípedo, cilindro ou esferas respectivamente:" );
        opcao = leitor.nextLine().charAt(0);
        switch(opcao){
            case 'A':
                System.out.println("Digite a largura ");
                double lg = leitor.nextDouble();
                System.out.println("Digite a altura ");
                double a = leitor.nextDouble();
                System.out.println("Digite a comprimento ");
                double cm = leitor.nextDouble();
                double volume = (lg*a*cm);
                System.out.println("O volume é " +volume);
                break;
            case 'B':
                System.out.println("Digite o valor do raio ");
                double R = leitor.nextDouble();
                System.out.println("Digite o valor da altura ");
                double H = leitor.nextDouble();
                double volume1 = (Math.PI*(R*R)*H);
                System.out.println("O volume é " +volume1);
                break;
            case 'C':
                System.out.println("Digite o valor do raio ");
                double r = leitor.nextDouble();
                double volume2 = (4*Math.PI*(r*r*r))/3;
                System.out.println("O volume é " +volume2);
                break;
        }
    }
}
