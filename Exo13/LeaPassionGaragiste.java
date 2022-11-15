package Exo13;

public class LeaPassionGaragiste {

  public static void main(String[] args) {
    Limousine l = new Limousine(130, 190472.9, "blanche", 5);
    Renault r1 = new Renault(150, 8000.9, "rouge", 2010, 1000);
    Renault r2turbo = new Renault(180, 17900.5, "noire", 2015, 2500);

    System.out.println(l.calculerPrixDeVente());
    System.out.println(r1.calculerPrixDeVente());
    System.out.println(r2turbo.calculerPrixDeVente());
  }
  
}