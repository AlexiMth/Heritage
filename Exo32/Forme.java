package Exo32;

public abstract class Forme {

  private double taille;
  
  public Forme(double taille)
  {
    this.taille = taille;
  }

  public double getSurface() {
    return this.taille;
  }
  
}