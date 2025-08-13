import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Ricardo");
        nombres.add("Sofia la preguntona y lambona");
        for(int i = 0; i < nombres.size(); i++){
            System.out.println(nombres.get(i));
        }
        System.out.println(nombres.contains("Majo"));
    }
}