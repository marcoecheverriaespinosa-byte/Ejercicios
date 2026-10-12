public class Dispositivo {

    private String nombre;
    private String tipo;
    private  boolean activo;

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Activo: " + activo);
    }

    void mostrarEstado() {
        String estado = activo? " esta activo ": " es inactivo";
        System.out.println(nombre  +""+estado);

    }
    public void activar() {
        if (activo==false){
            activo=true;
            System.out.println(nombre+""+ "ha sido activado");


        }
    }
}
