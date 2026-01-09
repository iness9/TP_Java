

public class Vilain extends Personnage {
    
    //constructeur 
    public Vilain(String nom, int hp, int atk) {
        super(nom, hp, atk);
    }

    @Override
    public void attaquer(Personnage p){
        int degat = this.getAtk();
        
        // Les Villains infligent 20% de dégâts supplémentaires aux SuperHeros
        if (p instanceof SuperHero) {
            degat = (int) (degat * 1.2);
        }
        
        degat = p.recevoirDegat(degat);
        
        p.hp -= degat;
    }
        
}
