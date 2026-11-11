public class Client {
    public static void main(String[] args) {
        FabriqueProduit fabrique = new FabriqueProduit();

        // Enregistrement des produits : la fabrique n'est plus modifiée pour ajouter un type
        fabrique.enregistrerProduit(FabriqueProduit.typeA, ProduitA::new);
        fabrique.enregistrerProduit(FabriqueProduit.typeB, ProduitB::new);
        fabrique.enregistrerProduit(FabriqueProduit.typeC, ProduitC::new);
        fabrique.enregistrerProduit(FabriqueProduit.typeD, ProduitD::new);

        System.out.println("=== Exemple modifie : Factory Method avec registre ===");

        fabrique.createProduit(FabriqueProduit.typeA).methodeproduit();
        fabrique.createProduit(FabriqueProduit.typeB).methodeproduit();
        fabrique.createProduit(FabriqueProduit.typeC).methodeproduit();
        fabrique.createProduit(FabriqueProduit.typeD).methodeproduit();

        try {
            fabrique.createProduit("E").methodeproduit();
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
