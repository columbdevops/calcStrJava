import java.util.*;
import methods.ResMeth;
public class Main {
    public static void main(String[] args) {
            // Считаем строку из консоли
            Scanner scanner = new Scanner(System.in);
            String stringInput = scanner.nextLine();
            ResMeth resMeth = new ResMeth();
            System.out.println("\"" + resMeth.resultMeth(stringInput) + "\"");
    }
}