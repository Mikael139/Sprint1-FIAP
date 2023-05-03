import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a largura da pista:");
        int largura = sc.nextInt();
        System.out.println("Digite a altura da pista:");
        int altura = sc.nextInt();
        Pista pista = new Pista(largura, altura);

        System.out.println("Digite a posição inicial do robô (x e y separados por espaço):");
        int x = sc.nextInt();
        int y = sc.nextInt();
        Robo robo = new Robo(x, y);

        for(int i = 1; i <= 7; i++) {
            System.out.println("Digite o " + i + "º par de comando e distância:");
            String comando = sc.next();
            int distancia = sc.nextInt();
            robo.mover(comando, distancia, pista);
            System.out.println("Posição atual do robô: (" + robo.getX() + "," + robo.getY() + ")");
            if(robo.getBateria() < 0) {
                System.out.println("Bateria insuficiente para completar a pista");
                break;
            }
        }

        robo.calcularPotenciaBateria(pista);
        System.out.println("Potência da bateria necessária para completar a pista: " + robo.getBateria());
    }
}





