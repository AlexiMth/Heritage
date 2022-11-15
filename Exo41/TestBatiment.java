package Exo41;

public class TestBatiment {

  public static void main(String[] args) {
    Batiment b = new Batiment("3 rue de Londres", 46);
    System.out.println(b.toString());
    Maison m = new Maison("2 rue de Londres", 42, 4, 2);
    System.out.println(m.toString());
    Immeuble i = new Immeuble("4 rue de Londres", 42, 19);
    System.out.println(i.toString());

  Batiment[] bTab = new Batiment[10];
    for (int i = 0; i < bTab.length; i++) {
      
    }
    
  }
  
}