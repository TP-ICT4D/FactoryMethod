import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FabriqueProduit {
    public static final String typeA = "A";
    public static final String typeB = "B";
    public static final String typeC = "C";
    public static final String typeD = "D";

    private final Map<String, Supplier<Produit>> registre = new HashMap<>();

    public void enregistrerProduit(String type, Supplier<Produit> fabrique) {
        registre.put(type, fabrique);
    }

    public Produit createProduit(String type) {
        Supplier<Produit> fabrique = registre.get(type);

        if (fabrique == null) {
            throw new IllegalArgumentException("Type de produit inconnu : " + type);
        }

        return fabrique.get();
    }
}
