class Joueur{
    protected String nom;
    protected static int scoreMax;
    protected int points;
    protected int scoreMaxJoueur;
    protected int pos;
    public Joueur(String nom){
        this.nom = nom;

    }
    public void majScoreMax(){
        if (this.points > scoreMax)
        {
            scoreMax = this.points;
        }
        if (this.points > scoreMaxJoueur)
        {
            scoreMaxJoueur = this.points;
        }
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