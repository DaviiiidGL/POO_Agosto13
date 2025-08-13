package persona;

import java.util.ArrayList;

public class Persona {
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private ArrayList<Direccion> direcciones;
    private ArrayList<CuentaBancaria> cuentas;

    public Persona(String email, String apellido, String nombre, Long id) {
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
        this.email = email;
        this.direcciones = new ArrayList<>();
        this.cuentas = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void agregarDireccion(Direccion d) {
        this.direcciones.add(d);
    }


    public void verDirecciones() {
        for (Direccion direccion : this.direcciones) {
            System.out.println(direccion);
        }
    }

    public void agregarCuenta(CuentaBancaria c){
        this.cuentas.add(c);
    }

    public void verCuentas(){
        for(CuentaBancaria c : this.cuentas){
            System.out.println(c);
        }
    }

    public void retirardinero(long idCuenta, long saldo){
        for(int i=0; i<this.cuentas.size(); i++){
            if(this.cuentas.get(i).getNumero() == idCuenta){
                this.cuentas.get(i).retiro(saldo);
                return;
            }
        }
    }
}
