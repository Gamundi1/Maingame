public class MainGame {
    private Baraja deck;
    private Jugador p1 = new Jugador();
    private Jugador p2 = new Jugador();
    private Jugador p3 = new Jugador();
    private Jugador p4 = new Jugador();


    public void Inicio(){
        deck = new Baraja(52);
        inicializarCartas();
        deck.barajarCartas();
        deck.repartirCartas(p1,p2,p3,p4);
        deck.mostrarBaraja();
        System.out.println(p1);
    }




    public void inicializarCartas(){
        Carta card = null;
        for(int i = 0;i<13;i++){
            card = new Carta("clubs",i+1);
            deck.añadirCarta(card);
        }
        for(int i = 0;i<13;i++){
            card = new Carta("diamonds",i+1);
            deck.añadirCarta(card);
        }
        for(int i = 0;i<13;i++){
            card = new Carta("heart",i+1);
            deck.añadirCarta(card);
        }
        for(int i = 0;i<13;i++){
            card = new Carta("spades",i+1);
            deck.añadirCarta(card);
        }
    }
    public static void main(String[] args) {
        new MainGame().Inicio();
    }
}
