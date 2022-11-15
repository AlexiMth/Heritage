package Exo13;

public class Camion extends Voiture {
  
  private final int poids;

  public Camion(int vitesseMax, double prixBase, String couleur, int poids) {
    super(vitesseMax, prixBase, couleur);
    this.poids = poids;
  }
  
  @Override
  public double calculerPrixDeVente() {
    if (poids > 2000) {
      return super.calculerPrixDeVente()*0.9;
    } else {
      return super.calculerPrixDeVente()*0.8;
    }
  }

}