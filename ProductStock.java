import java.util.HashMap;
import java.util.Map;

public class ProductStock {
    public static void main(String[] args) {
        HashMap<String, Integer> stock = new HashMap<>();
        stock.put("Laptop", 5);
        stock.put("Mouse", 20);
        stock.put("Keyboard", 10);
        stock.put("Monitor", 3);

        System.out.println("All products:");
        stock.forEach((s, c) -> System.out.printf(s + "->" + c + "\n"));

        System.out.println("\nLow stock products:");
        for(Map.Entry<String, Integer> e : stock.entrySet()){
            if(e.getValue() < 6){
                System.out.println(e.getKey() + "->" + e.getValue());
            }
        }
    }
}