package Exo41;

public class Maison extends Batiment {

  private int nbPieces;
  private double surfaceJardin;

  public Maison(String adresse, int surfaceH, int surfaceJ, int nbPieces) {
    super(adresse, surfaceH);
    this.surfaceJardin = surfaceJ;
    this.nbPieces = nbPieces;
  }

  @Override
  public String toString() {
    return super.toString()+", un jardin de "+this.surfaceJardin+" ainsi que "+this.nbPieces+" pieces";
  }
  
}