package primeirasAulas;
import java.util.HashMap;
import java.util.Map;

public class Colecoes {
    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Filipe", 10);
        notas.put("Amanda", 9);
        notas.put("Sofia", 10);
        //Obs.: o map trabalha com chaves unicas, não serve para coleções de dados com chaves iguais
        // var nota = notas.get("Filipe");
        // System.out.println(nota);

        for(Map.Entry<String, Integer > entry : notas.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("A chave é " + key + " e o valor é " + value);
        }
    }
}
