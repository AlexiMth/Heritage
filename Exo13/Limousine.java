package Exo13;

public class Limousine extends Voiture {

  private int longueur;

  public Limousine(int vitesseMax, double prixVente, String couleur, int longueur) {
    super(vitesseMax, prixVente, couleur);
    this.longueur = longueur;
  }

  @Override
  public double calculerPrixDeVente() {
    if (longueur > 6) {
      return super.calculerPrixDeVente()*0.95;
    } else {
      return super.calculerPrixDeVente()*0.9;
    }
  }
  
}