import Ejercicio.EjercicioDos;
import Ejercicio.EjercicioUno;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        
        
        
        EjercicioUno ejerUno = new EjercicioUno();
        List<Integer> set = new ArrayList<>();
        set.add(1);
        set.add(2);
        
        List<List<Integer>> result = ejerUno.subsets(set);
        System.out.println("Resolución del Ejercicio Uno:");
        System.out.println(result);
        
        EjercicioDos ejercicioDos = new EjercicioDos();
        
        // Ejemplo 1
        int n1 = 1;
        List<String> result1 = ejercicioDos.generateParenthesis(n1);
        System.out.println("Ejemplo 1 para n=" + n1 + ": " + result1);
        
        // Ejemplo 2
        int n2 = 3;
        List<String> result2 = ejercicioDos.generateParenthesis(n2);
        System.out.println("Ejemplo 2 para n=" + n2 + ": " + result2);
        
        

    }
}
