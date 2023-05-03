import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a largura da pista:");
        int largura = sc.nextInt();
        System.out.println("Digite a altura da pista:");
        int altura = sc.nextInt();
        Pista pista = new Pista(largura, altura);

        System.out.println("Digite a posi��o inicial do rob� (x e y separados por espa�o):");
        int x = sc.nextInt();
        int y = sc.nextInt();
        Robo robo = new Robo(x, y);

        for(int i = 1; i <= 7; i++) {
            System.out.println("Digite o " + i + "� par de comando e dist�ncia:");
            String comando = sc.next();
            int distancia = sc.nextInt();
            robo.mover(comando, distancia, pista);
            System.out.println("Posi��o atual do rob�: (" + robo.getX() + "," + robo.getY() + ")");
            if(robo.getBateria() < 0) {
                System.out.println("Bateria insuficiente para completar a pista");
                break;
            }
        }

        robo.calcularPotenciaBateria(pista);
        System.out.println("Pot�ncia da bateria necess�ria para completar a pista: " + robo.getBateria());
    }
}





