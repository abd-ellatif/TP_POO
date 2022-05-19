class Joueur{
    protected String nom;
    protected static int scoreMax;
    protected int points;
    protected int pos;
    public Joueur(String nom){
        this.nom = nom;
    }
    public void Deplacer(int deplacement){
        this.pos =+ deplacement;
        if (this.pos > 99) this.pos = 99 - (this.pos - 99);
    }
    public int Lancer(Des dices){
        dices.lancer();
        return (dices.d1 + dices.d2);
    }

}