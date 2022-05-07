public class Tablero {
    private Carta[] filaCorazones;
    private Carta[] filaBastos;
    private Carta[] filaDiamantes;
    private Carta[] filaEspadas;

    public Tablero() {
        filaBastos = new Carta[13];
        filaCorazones = new Carta[13];
        filaEspadas = new Carta[13];
        filaDiamantes = new Carta[13];
    }
    public void colocarCarta(int pos,Carta card){
        switch(card.getPalo()){
            case "spades":
                filaEspadas[pos] = card;
                break;
            case "hearts":
                filaCorazones[pos] = card;
                break;
            case "diamonds":
                filaDiamantes[pos] = card;
                break;
            case "clubs":
                filaBastos[pos] = card;
                break;
        }
        card.setColocada(true);
    }
}
