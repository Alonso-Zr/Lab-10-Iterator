public class IteratorRegistro implements IteratorAsistencia{
    private Nodo nodoActual;

    public IteratorRegistro(Nodo cabeza) {
        this.nodoActual = cabeza;
    }

    @Override
    public boolean hasNext() {
        return nodoActual != null;
    }

    @Override
    public Trabajador next() {
        if (nodoActual == null) {
            return null;
        }
        Trabajador trabajador = nodoActual.trabajador;
        nodoActual = nodoActual.next;
        return trabajador;
    }
}
