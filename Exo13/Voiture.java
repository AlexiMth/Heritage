package Exo13;

public class Voiture {

  private final int vitesseMax;
  private final double prixVenteBase;
  private final String couleur;

  /*
  Final indique qu'on ne peut pas redéfinir les valeurs des variables
  */


  /*
  Vu que les attributs sont finals, on doit les initialiser avant de sortir du constructeur
  */
  public Voiture(int vitesseMax, double prixVenteBase, String couleur) {
    this.vitesseMax = vitesseMax;
    this.prixVenteBase = prixVenteBase;
    this.couleur = couleur;
  }

  public double calculerPrixDeVente() {
    return prixVenteBase;
  }
  
}