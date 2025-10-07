import java.util.Arrays;

public class EficienciaAlgoritmos {
    public static class Busquedas {
        public static int busquedaLineal(int[] array, int objetivo) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == objetivo) {
                    return i;
                }
            }
            return -1;
        }
        public static int busquedaBinariaEficiente(int[] array, int objetivo) {
            Arrays.sort(array);
            return busquedaBinaria(array, objetivo);
        }
        private static int busquedaBinaria(int[] array, int objetivo) {
            int izquierda = 0, derecha = array.length - 1;
            while (izquierda <= derecha) {
                int medio = izquierda + (derecha - izquierda) / 2;
                if (array[medio] == objetivo) return medio;
                if (array[medio] < objetivo) izquierda = medio + 1;
                else derecha = medio - 1;
            }
            return -1;
        }
    }
    public static class Fibonacci {
        public static int fibExponencial(int n) {
            if (n <= 1) return n;
            return fibExponencial(n - 1) + fibExponencial(n - 2);
        }
        public static int fibMemoization(int n) {
            int[] memo = new int[n + 1];
            Arrays.fill(memo, -1);
            return fibMemoHelper(n, memo);
        }
        private static int fibMemoHelper(int n, int[] memo) {
            if (n <= 1) return n;
            if (memo[n] != -1) return memo[n];
            memo[n] = fibMemoHelper(n - 1, memo) + fibMemoHelper(n - 2, memo);
            return memo[n];
        }
        public static int fibIterativo(int n) {
            if (n <= 1) return n;
            int a = 0, b = 1;
            for (int i = 2; i <= n; i++) {
                int temp = a + b;
                a = b;
                b = temp;
            }
            return b;
        }
    }
    public static class AnalisisCasos {
        public static int busquedaConAnalisis(int[] array, int objetivo) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == objetivo) {
                    return i;
                }
            }
            return -1;
        }
        public static void algoritmoAdaptativo(int[] array) {
            if (estaOrdenado(array)) {
                System.out.println("Array ordenado - usando búsqueda binaria");
            } else {
                System.out.println("Array no ordenado - ordenando primero");
                Arrays.sort(array);
            }
        }
        private static boolean estaOrdenado(int[] array) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    return false;
                }
            }
            return true;
        }
    }
}
