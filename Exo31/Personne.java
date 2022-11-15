package Exo31;

public class Personne {

  private String nom;
  
  public Personne(String nom) {
    this.nom = nom;
  }

  public void afficher() {
    System.out.println("Le nom est "+this.nom);
  }
  
}