package Exo2;

public class PointNom extends Point {

  private String nom;

  public PointNom(int x, int y, String nom) {
    setPointNom(x, y, nom);
  } 
  
  public void setPointNom(int x, int y, String nom) {
    super.setPoint(x, y);
    this.nom = nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public void affCoordNom() {
    System.out.println("Le point "+this.nom+super.afficheCoords()):
  }
}