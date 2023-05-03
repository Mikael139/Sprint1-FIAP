public class Robo {
    private int x; // posi��o x do rob�
    private int y; // posi��o y do rob�
    private int bateria; // pot�ncia da bateria

    public Robo(int x, int y) {
        this.x = x;
        this.y = y;
        this.bateria = 100; // bateria inicialmente 100%
    }

    public void mover(String comando, int distancia, Pista pista) {
        switch(comando) {
            case "FRENTE":
                if(pista.moverRobo(x, y + distancia)) {
                    y += distancia;
                    bateria -= 1;
                }
                break;
            case "TR�S":
                if(pista.moverRobo(x, y - distancia)) {
                    y -= distancia;
                    bateria -= 1;
                }
                break;
            case "ESQUERDA":
                if(pista.moverRobo(x - distancia, y)) {
                    x -= distancia;
                    bateria -= 2;
                }
                break;
            case "DIREITA":
                if(pista.moverRobo(x + distancia, y)) {
                    x += distancia;
                    bateria -= 2;
                }
                break;
        }
    }

    public int getBateria() {
        return bateria;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void calcularPotenciaBateria(Pista pista) {
        int distanciaTotal = pista.getDistanciaTotal(x, y);
        bateria = 100 - distanciaTotal; // calcula a pot�ncia necess�ria para completar a pista
    }
}

