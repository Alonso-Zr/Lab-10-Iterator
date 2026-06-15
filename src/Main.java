public class Main {
    public static void main(String[] args) {
        RegistroAsistencia registro = new RegistroAsistencia();

        registro.listar(new Trabajador("Carlos", "Gómez", "987654321", "Tardanza", "09:15"));
        registro.listar(new Trabajador("Harold", "Arroyo", "912345678", "Presente", "08:00"));
        registro.listar(new Trabajador("Luis", "Chavez", "945612378", "Presente", "08:45"));
        registro.listar(new Trabajador("Elena", "Rojas", "998877665", "Presente", "07:50"));
        registro.listar(new Trabajador("Francesco", "Castro", "933445566", "Tardanza", "09:15"));

        System.out.println("=== REGISTRO DE ASISTENCIA CRONOLÓGICO ===\n");

        IteratorAsistencia iterator = registro.crearIterator();

        while (iterator.hasNext()) {
            Trabajador t = iterator.next();
            System.out.println(t.toString());
        }
    }
}
