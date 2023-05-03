public class Pista {
    private int[][] mapa; // matriz representando o layout da pista
    private int largura; // largura da pista
    private int altura; // altura da pista

    public Pista(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
        this.mapa = new int[largura][altura];
        // inicializa o mapa com 0 em todas as posi��es (representando espa�o vazio)
        for(int i = 0; i < largura; i++) {
            for(int j = 0; j < altura; j++) {
                mapa[i][j] = 0;
            }
        }
    }

    public boolean moverRobo(int x, int y) {
        if(x < 0 || x >= largura || y < 0 || y >= altura) {
            return false; // posi��o inv�lida, movimento n�o permitido
        }
        if(mapa[x][y] == 1) {
            return false; // obst�culo na posi��o, movimento n�o permitido
        }
        mapa[x][y] = 1; // marca a posi��o como ocupada pelo rob�
        return true; // movimento
}

    public int getDistanciaTotal(int x, int y) {
        int distanciaTotal = 0;
        for(int i = 0; i < largura; i++) {
            for(int j = 0; j < altura; j++) {
                if(mapa[i][j] == 1) {
                    // calcula a dist�ncia do rob� at� a posi��o marcada no mapa
                    distanciaTotal += Math.abs(i - x) + Math.abs(j - y);
                }
            }
        }
        return distanciaTotal;
    }
}
