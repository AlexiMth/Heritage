import java.util.Scanner;

public class TP1 {
  public static void main(String[] args) {
    // hello();
    // multiply();
    // flag();
    // virg();
    // trirect();
    exo8();
  }

  public static void exo1() {
    System.out.println("Bonjour");
  }

  public static void exo2() {
    int i = 0;
    System.out.println("Entrez un nombre :");
    Scanner sc = new Scanner(System.in);
    if (sc.hasNextInt())
      i = sc.nextInt();

    for (int a = 1; a < 11; a++) {
      int b = i * a;
      System.out.println("" + i + " x " + a + " = " + b);
    }
    sc.close();
  }

  public static void exo3() {
    System.out.println("* * * * * * ===============================");
    System.out.println(" * * * * * ================================");
    System.out.println("* * * * * * ===============================");
    System.out.println(" * * * * * ================================");
    System.out.println("* * * * * * ===============================");
    System.out.println(" * * * * * ================================");
    System.out.println("* * * * * * ===============================");
    System.out.println(" * * * * * ================================");
    System.out.println("* * * * * * ===============================");
    System.out.println("==============================================");
    System.out.println("==============================================");
    System.out.println("==============================================");
    System.out.println("==============================================");
    System.out.println("==============================================");
    System.out.println("==============================================");
  }

  public static void exo4() {
    System.out.println("Entrez un nombre :");
    Scanner sc = new Scanner(System.in);
    if (sc.hasNextFloat()) {
      float nbre = sc.nextFloat();
      System.out.println("Nombre adjacents : " + (nbre + Float.MIN_NORMAL) + " , " + (nbre - Float.MIN_NORMAL));
    }
    sc.close();
  }

  public static void exo5() {
    int i = 0;
    System.out.println("Entrez un nombre :");
    Scanner sc = new Scanner(System.in);
    if (sc.hasNextInt())
      i = sc.nextInt();

    for (int l = 0; l < i; l++) {
      for (int a = 0; a < l + 1; a++) {
        System.out.print(a + 1);
      }
      System.out.println("");
    }
  }

  public static void exo6() {
    int max = 7;

    /*
     * J'utilise Math.abs();
     * Pour les lignes et colonnes inférieures à max/2, il faut que la somme ligne +
     * colonne soit supérieure ou égale à max/2
     * Pour les colonnes inférieures à max/2 et les lignes supérieures à max/2, il
     * faut que colonne - ligne soit inférieure ou égale à max/2
     */

    for (int ligne = 0; ligne < max; ligne++) {
      for (int colonne = 0; colonne < max; colonne++) {
        if (colonne >= Math.abs(max / 2 - ligne) && colonne <= max - 1 - Math.abs(max / 2 - ligne)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println("");
    }
  }

  public static void exo7() {
    // Pour échanger deux variables, il suffit de créer une "copie"
    int i = 5;
    int j = 0;
    int i_copie;

    System.out.println("Nous avons : i = " + i + " et j = " + j);

    i_copie = i;
    i = j;
    j = i_copie;

    System.out.println("i = " + i);
    System.out.println("j = " + j);
  }

  public static void exo8() {
    double x1, x2, y1, y2, rayon;
    x1 = 1.54;
    x2 = 1.1;
    y1 = 5.87;
    y2 = 3.1;
    rayon = 6370.2;

    // Distance entre deux points

  

    //System.out.println(distance);
  }

  public static void exo9(int nbre) {
    StringBuilder sb = new StringBuilder(); // fabrique chaines de caractères
    while (nbre > 0) {
      sb.insert(0, nbre & 1);
      nbre >>= 1;
    }
    System.out.println(sb.toString());
  }

  // EXERCICES TABLEAUX

  public static void exo16() {
    int[] tab = { 1, 30, 2, 10 };
    if (tab[tab.length - 1] == 10) {
      System.out.println("FIN");
    }
    if (tab[0] == 10) {
      System.out.println("DEBUT");
    }
  }

  public static void exo17() {
    int[] tab = { 1, 30, 2390, 58, 2 };
    if (tab[tab.length - 1] == tab[0]) {
      System.out.println("Egal");
    } else {
      System.out.println("Non");
    }
  }

  public static void exo18() {
    int[] tab = { 20, 30, 40 };
    int tab1cop = tab[0];
    tab[0] = tab[2];
    tab[2] = tab1cop;
    for (int i = 0; i < tab.length; i++) {
      System.out.print(tab[i] + ",");
    }
  }

  // CHAINES DE CARACTERES

  public static void exo36() {
    String phrase = "Bonjour abcdef";
    for (int i = 0; i < phrase.length(); i++) {
      System.out.print(phrase.charAt(i));
    }
  }

}
