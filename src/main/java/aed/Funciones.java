package aed;

class Funciones {
    int cuadrado(int x) {
        int res = x * x;
        return res;
    }
    
/*Hola */
    double distancia(double x, double y) {
        double res = Math.sqrt(x * x + y * y);
        return res;
    }

    boolean esPar(int n) {
        boolean res = true;
        if (n % 2 != 0)
        {
            res = false;
        }
        return res;
    }
    boolean esPar2(int n){
        if (n % 2 != 0)
        {
            return true;
        }
        return false;
    
        }

    boolean esBisiesto(int n) {
        if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0))
        {
            return true;
        }
        return false;
    }

    int factorialIterativo(int n) {
        int res = 1;

        for (int i = 1; i <= n; i++)
        {
            res = res * i;
        }
        
        return res;
    }

    int factorialRecursivo(int n) {
        int res = 1;
        if (n == 0)
        {
            return res;
        }
        else
        {
          res = factorialRecursivo(n - 1) * n;
        }
        return res;


    }
    int cantidad_de_divisores(int n) {
        int divisores = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisores += 1;
            }
        }
        return divisores; 
    }
    
    boolean esPrimo(int n) {
        if (cantidad_de_divisores(n) == 2) {
            return true;
        }
        return false;
    }

    boolean esPrimo2(int n){
        int divisores = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisores += 1;
            }
        }
        if (divisores==2) {
            return true;
        }
        return false;
    }
    int sumatoria(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            return 0; 
        }
        int res = numeros[0];
        for (int i = 1; i < numeros.length; i++) { 
            res = res + numeros[i];
        }
        return res;
    }
    

int busqueda(int[] numeros, int buscado) {
    for (int i = 0; i < numeros.length; i++) {
        if (buscado == numeros[i]) {
            return i; 
        }
    }
    return -1; 
}

boolean tienePrimo(int[] numeros) {
    if (numeros == null || numeros.length == 0) {
        return false; // Arreglo nulo o vacío
    }
    int i = 0; // Inicializamos el índice para el bucle
    while (i < numeros.length) {
        if (esPrimo(numeros[i])) {
            return true; // Apenas encontramos un primo, devolvemos true
        }
        i++; // Incrementamos el índice para la próxima iteración
    }
    return false; // No se encontraron primos en el arreglo
}

    boolean todosPares(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            return false; 
        }
        int i = 0; 
        while (i < numeros.length) {
            if (! esPar(numeros[i])) { //!=not
                return false;
            }
            i++; 
        }
        return true; 
    }

    boolean esPrefijo(String s1, String s2) {
        // COMPLETAR
        return false;
    }

    boolean esSufijo(String s1, String s2) {
        // COMPLETAR
        return false;
    }
}