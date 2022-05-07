public class Carta {


    private final String palo;
    private final int numero;
    private boolean colocada = false;
    private final String TagCarta;

    public Carta(String p, int n) {
        palo = p;
        numero = n;
        TagCarta = "../Cartes/" + n + "_of_" + p + ".png"; //esto nos permitirá encontrar la imágen de la carta
    }
    public String getPalo() {
        return palo;
    }
    public void setColocada(boolean valor){
        colocada = valor;
    }
    @Override
    public String toString(){
        return numero + " de " + palo;
    }
}
