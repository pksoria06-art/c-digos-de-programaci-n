public class prac1{
        public static void main(String [] args){
        String cadena ="hola mundo" ;
        int edad = 20;
        double altura = 1.75;

        System.out.println(cadena);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura + "metros");
        
        System.out.println("------------------------");
        System.out.println("Creando tipo de dato Abstracto");
        Datos persona = new Datos("Juan Pablo", 25, "pabloir318@gmail.com");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Correo " + persona.getCorreo());

        Datos persona2 = new Datos();
        persona2.setNombre("Maria Lopez");
        persona2.setEdad(20);
        persona2.setCorreo("maria@hotmail.com");
        System.out.println();
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Edada: " + persona2.getEdad());
        System.out.println("Correo: " + persona2.getCorreo());
        
        }
        
    
}