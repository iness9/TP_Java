

public class Personnage {

    private String nom;
    private int hp;
    private int atk;

    //constructeur
    public Personnage(String nom, int hp, int atk) {
        this.nom = nom;
        this.hp = hp;
        this.atk = atk;
    }

    //setter
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setHp(int hp) throws Exception {
        if (hp <= 0) {
            throw new Exception("Les points de vie ne peuvent pas etre negatif");
        }
        this.hp = hp;
    }
    public void setAtk(int atk) {
        this.atk = atk;
    }
    //getter
    public String getNom() {
        return nom;
    }   
    public int getHp() {
        return hp;
    }
    public int getAtk() {
        return atk;
    }


    //methode pour indiquer si un personnage est hors combat hp <= 0
    public boolean estKo()  {
        return this.hp <= 0;
    }
    //attaquer(Personnage p): inflige des dégâts égaux à la valeur de atk au personnage p passé en paramètre. Cela diminue les points de vie de p.
    public void attaquer(Personnage p){

    }



    //methode recevoir degats
    public int recevoirDegats(int degats) {
        return degats;
    }

    @Override
    public String toString() {
        System.out.println("Nom: " + nom);
        System.out.println("Hp: " + hp);
        System.out.println("Atk: " + atk);
    }



}