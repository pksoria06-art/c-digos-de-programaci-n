package practica3;

import java.util.ArrayList;

public class memoriaDinamica {
    ArrayList<Integer> memoria = new ArrayList<>();
    int contador;
    public memoriaDinamica(){
        contador=0;
    }

    public void agregar(int valor){
        memoria.add(valor);
        contador++;
    }

    public boolean eliminar(){
        if (contador>0) {
            memoria.remove(--contador);
            return true;
        }
            return false;
    }

    public void mostrar(){
        System.out.println("[");
        for (int i = 0; i < contador; i++) {
            System.out.println(memoria.get(i) + " ");
        }
        System.out.println("]");
    }

    public int buscar(int valor){
        for (int i = 0; i < contador; i++) {
            if (memoria.get(i) == valor) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        memoriaDinamica memoria = new memoriaDinamica();
        memoria.agregar(10);
        memoria.agregar(20);
        memoria.agregar(30);
        memoria.mostrar();

        System.out.println("indice de 20: " + memoria.buscar(20));
        System.out.println("indice de 20: " + memoria.buscar(40));

        memoria.eliminar();
        memoria.mostrar();
    }
}
