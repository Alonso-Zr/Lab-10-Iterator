public class RegistroAsistencia implements RegistroAgreggate {

    private Nodo cabeza;

    public void listar(Trabajador t) {
        Nodo nuevoNodo = new Nodo(t);

        if (cabeza == null || t.horaIngreso.compareTo(cabeza.trabajador.horaIngreso) < 0) {
            nuevoNodo.next = cabeza;
            cabeza = nuevoNodo;
            return;
        }

        Nodo actual = cabeza;
        while (actual.next != null &&
                actual.next.trabajador.horaIngreso.compareTo(t.horaIngreso) <= 0) {
            actual = actual.next;
        }

        nuevoNodo.next = actual.next;
        actual.next = nuevoNodo;
    }

    @Override
    public IteratorAsistencia crearIterator() {
        return new IteratorRegistro(cabeza);
    }
}
