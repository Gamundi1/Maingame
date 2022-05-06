public class Carta {
    private final String palo;
    private final int numero;
    private final String TagCarta;

    public Carta(String p, int n) {
        palo = p;
        numero = n;
        TagCarta = "../Cartes/" + n + "_of_" + p + ".png"; //esto nos permitirá encontrar la imágen de la carta
    }
    @Override
    public String toString(){
        return numero + " of " + palo;
    }
}
