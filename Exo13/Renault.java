package Exo13;

public class Renault extends Voiture {

  private int anneeFabr, reduConstr;

  public Renault(int vitesseMax, double prixVente, String couleur, int anneeFabr, int reduConstr) {
    super(vitesseMax, prixVente, couleur);
    this.anneeFabr = anneeFabr;
    this.reduConstr = reduConstr;
  }

  @Override
  public double calculerPrixDeVente() {
    return super.calculerPrixDeVente()-reduConstr;
  }
  
}