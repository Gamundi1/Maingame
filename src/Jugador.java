public class Jugador {
    private Carta[] mano;
    private int ind;

    public Jugador() {
        mano = new Carta[13];
        ind = 0;
    }
    public void añadir_ManoJugador(Carta carta){
        if(ind < 13){
            mano[ind] = carta;
            ind++;
        }//Crear excepcion
    }
    public String toString(){
        String s = "";
        for(int i = 0; i<13;i++){
            s += mano[i] + ", ";
        }
        return s;
    }
}
