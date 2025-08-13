import persona.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        Persona juanita = new Persona("Manuel@eia", "Esteban", "Juanitaa", 1L);
        Direccion d= new Direccion("Calle 19", "Sabaneta", "Antioquia", "055450", "Colombia");

        juanita.agregarDireccion(d);
        juanita.verDirecciones();
    }
}