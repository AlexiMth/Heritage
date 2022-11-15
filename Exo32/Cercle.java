package Exo32;

public class Cercle extends Forme {

  public Cercle(double taille) {
    super(taille);
  }

  @Override
  public double getSurface()
  {
    return 3.14*(super.getSurface()*super.getSurface());
  }
  
}