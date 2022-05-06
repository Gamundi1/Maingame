import java.util.Random;

public class Baraja {
    private Carta[] baraja;
    private int ind;
    private final int MAX;

    public Baraja(int ncartas) {
        baraja = new Carta[ncartas];
        ind = 0;
        MAX = ncartas;
    }

    public void añadirCarta(Carta carta) {
        if (ind < MAX) {
            baraja[ind] = carta;
            ind++;
        } else {
            //Crear clase de errores
        }
    }

    public void barajarCartas() {
        Carta card_aux = null;
        Random ra = new Random();

        int az;
        for (int i = MAX - 1; i > 1; i--) {
            az = ra.nextInt(i);
            card_aux = baraja[az];
            baraja[az] = baraja[i];
            baraja[i] = card_aux;

        }
    }

    public void repartirCartas(Jugador p1, Jugador p2, Jugador p3, Jugador p4) {
        for (int i = 0; i < 13; i++) {
            p1.añadir_ManoJugador(baraja[i]);
        }
        for (int i = 13; i < 26; i++) {
            p2.añadir_ManoJugador(baraja[i]);
        }
        for (int i = 26; i < 39; i++) {
            p3.añadir_ManoJugador(baraja[i]);
        }
        for (int i = 39; i < 52; i++) {
            p4.añadir_ManoJugador(baraja[i]);
        }

    }

    public void mostrarBaraja() {
        for (Carta baraja1 : baraja) {
            System.out.println(baraja1);
        }
    }
}
