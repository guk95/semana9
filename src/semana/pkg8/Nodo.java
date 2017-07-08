package semana.pkg8;

public class Nodo<T> {

    Nodo sig;
    private T dato;

    public Nodo(T dato) {

        this.dato = dato;

    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

}
