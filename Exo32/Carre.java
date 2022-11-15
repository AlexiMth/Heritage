package Exo32;

public class Carre extends Forme {

  public Carre (double taille) {
    super(taille);
  }

  @Override
  public double getSurface()
  {
    return super.getSurface()*super.getSurface();
  }
  
}