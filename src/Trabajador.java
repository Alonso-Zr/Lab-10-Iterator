public class Trabajador {
    String nombre;
    String apellido;
    String telefono;
    String estadoAsistencia;
    String horaIngreso;

    public Trabajador(String nombre, String apellido, String telefono, String estadoAsistencia, String horaIngreso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.estadoAsistencia = estadoAsistencia;
        this.horaIngreso = horaIngreso;
    }

    @Override
    public String toString(){
        return String.format("[%s] %s %s | Tel: %s | Estado: %s",
                horaIngreso, nombre, apellido, telefono, estadoAsistencia);
    }

}
