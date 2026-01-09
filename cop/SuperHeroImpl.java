

public class SuperHeroImpl extends PersonnageImpl {
    
    //constructeur 
    public SuperHeroImpl(String nom, int hp, int atk) {
        super(nom, hp, atk);
    }

    // SuperHero inflige 80% des dégâts à un Villain
    @Override
    public void attaquer(PersonnageImpl p){
        int degats = this.getAtk();
        
        // Les SuperHeros infligent 80% des dégâts aux Villains
        if (p instanceof VilainImpl) {
            degats = (int) (degats * 0.8);
        }
        
        // Appliquer les modificateurs du défenseur
        degats = p.recevoirDegats(degats);
        
        p.hp -= degats;
    }
}
