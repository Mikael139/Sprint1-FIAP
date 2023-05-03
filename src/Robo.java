public class Robo {
    private int x; // posição x do robô
    private int y; // posição y do robô
    private int bateria; // potência da bateria

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
            case "TRÁS":
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
        bateria = 100 - distanciaTotal; // calcula a potência necessária para completar a pista
    }
}

