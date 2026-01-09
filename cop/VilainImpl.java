

public class VilainImpl extends PersonnageImpl {
    
    //constructeur 
    public VilainImpl(String nom, int hp, int atk) {
        super(nom, hp, atk);
    }

    // Vilain inflige 20% de dégâts supplémentaires à un SuperHero
    @Override
    public void attaquer(PersonnageImpl p){
        int degats = this.getAtk();
        
        // Les Villains infligent 20% de dégâts supplémentaires aux SuperHeros
        if (p instanceof SuperHeroImpl) {
            degats = (int) (degats * 1.2);
        }
        
        // Appliquer les modificateurs du défenseur
        degats = p.recevoirDegats(degats);
        
        p.hp -= degats;
    }
}
