package semana.pkg8;

public class Lista<T> {

    private Nodo<T> cabeza;
    private int size;

    public Lista() {

        this.cabeza = null;
        this.size = 0;

    }

    public Nodo<T> getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo<T> cabeza) {
        this.cabeza = cabeza;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty() {

        return cabeza == null;
    }

    public boolean push(T dato) {
        Nodo nuevo = new Nodo(dato);

        if (isEmpty()) {
            cabeza = nuevo;

        } else {

            Nodo aux = cabeza;
            while (aux.getSig() != null) {

                aux = aux.getSig();

            }

            aux.setSig(nuevo);

        }

        return true;

    }

    public boolean pop() {

        Nodo aux = cabeza;
        if (cabeza.getSig() == null) {

            cabeza = null;

        } else {
            while (aux.getSig().getSig() != null) {

                aux = aux.getSig();

            }
            aux.setSig(null);

        }

        return true;
    }

    public int size() {

        Lista listaTemporal = new Lista();
        Nodo aux = cabeza;

        int cont = 0;
        while (aux != null) {
            listaTemporal.push(aux.getDato());
            aux = aux.getSig();

        }

        while (!isEmpty()) {
            if (pop() == true) {
                cont++;

            }

        }
        Nodo auxm = listaTemporal.getCabeza();
        Lista lista = null;
        while (auxm.getSig() != null) {
            lista.push(auxm.getDato());
            auxm = auxm.getSig();

        }

        System.out.println(listaTemporal.toString());

        return cont;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        Nodo aux = cabeza;
        int cont = 0;

        while (aux != null) {
            builder.append(" ");
            builder.append(aux.getDato());
            builder.append(System.getProperty("line.separator"));

            ++cont;
            aux = aux.getSig();
        }

        return builder.toString();
    }

}
