

public class SuperHero extends Personnage {
    
    //constructeur 
    public SuperHero(String nom, int hp, int atk) {
        super(nom, hp, atk);
    }

    @Override
    public void attaquer(Personnage p){
        int degat = this.getAtk();
        
        // Les SuperHeros infligent 80% des dégâts aux Villains
        if (p instanceof Vilain) {
            degat = (int) (degat * 0.8);
        }
        
        degat = p.recevoirdegats(degat);
        
        p.hp -= degat;
    }
}
