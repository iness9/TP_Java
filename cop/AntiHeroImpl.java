

public class AntiHeroImpl extends PersonnageImpl {

    //constructeur 
    public AntiHeroImpl(String nom, int hp, int atk) {
        super(nom, hp, atk);
    }

    // AntiHero inflige des dégâts normaux
    @Override
    public void attaquer(PersonnageImpl p){
        super.attaquer(p);
    }

    // AntiHero subit 10% de dégâts supplémentaires
    @Override
    public int recevoirDegats(int degats) {
        // Subit 10% de dégâts supplémentaires peu importe qui l'attaque
        return (int) (degats * 1.1);
    }
}
