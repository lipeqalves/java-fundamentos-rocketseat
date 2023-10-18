package primeirasAulas;
import java.util.HashSet;

public class ColecaoHashSet {
    
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(10);
        numeros.add(12);
        numeros.add(14);
        numeros.add(16);

        // System.out.println(numeros.size());
        // numeros.remove(12);
        // for(Integer elemento:numeros){
        //     System.out.println(elemento);
        // }
        System.out.println(numeros.contains(12));
    }
}
