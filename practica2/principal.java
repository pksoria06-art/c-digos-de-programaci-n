package practica2.src.mx.edu.tesoem.isc.principal;

import practica2.src.mx.edu.tesoem.isc.informacion.datos.datos;

public class principal {
    public static void main(String[] args) {
        datos objdatos = new datos( "juan",19,"juan@mail.com");
        System.out.println("nombre: " + objdatos.getNombre());
        System.out.println("edad: " + objdatos.getEdad());
        System.out.println("correo: " + objdatos.getCorreo());

        datos objdatos2 = new datos();
        objdatos2.setNombre("pedro");
        objdatos2.setEdad(20);
        objdatos2.setCorreo("pedro@gmail.com");

        System.out.println("nombre: " + objdatos2.getNombre());
        System.out.println("edad: " + objdatos2.getEdad());
        System.out.println("correo: " + objdatos2.getCorreo());
    }
}