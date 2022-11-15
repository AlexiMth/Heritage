package Exo41;

public class Batiment {

  private String adresse;
  private double surfaceHabitable;

  public Batiment(String adresse, double surface) {
    this.adresse = adresse;
    this.surfaceHabitable = surface;
  }

  @Override
  public String toString() {
    return "Le batiment a l'adresse "+this.adresse+" a une surface habitable de "+this.surfaceHabitable;
  }
  
}