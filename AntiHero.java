

public class AntiHerp extends Personnage {

    //constructeur 
    public AntiHero (String nom, int hp, int atk) {
        super(nom, hp, atk);
    }

    @Override
    public void attaquer(Personnage p){
        super.attaquer(p);
    }

    // AntiHero subit 10% de dégâts supplémentaires
    @Override
    public int recevoirDegat(int degat) {
        return (int) (degat * 1.1);
    }
}