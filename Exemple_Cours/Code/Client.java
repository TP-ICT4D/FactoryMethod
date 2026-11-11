public class Client {
    public static void main(String[] args) {
        FabriqueProduit fabriqueProduit = new FabriqueProduit();
        Produit produit = null;

        System.out.println("=== Exemple du cours : Factory Method ===");

        // Affiche un produit de type A
        produit = fabriqueProduit.createProduit(FabriqueProduit.typeA);
        produit.methodeproduit();

        // Affiche un produit de type B
        produit = fabriqueProduit.createProduit(FabriqueProduit.typeB);
        produit.methodeproduit();

        // Affiche un produit de type C
        produit = fabriqueProduit.createProduit(FabriqueProduit.typeC);
        produit.methodeproduit();

        // Produit inexistant
        try {
            produit = fabriqueProduit.createProduit("D");
            produit.methodeproduit();
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
