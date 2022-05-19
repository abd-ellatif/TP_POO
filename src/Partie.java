class Partie{
    protected Joueur player;
    protected Plateau plateau;
    protected Des dices;
    public Partie(String nom){
        this.player = new Joueur(nom);
        this.plateau = new Plateau();
    }
    public void SelectCase() throws ImpossibleDeplacerCaseException{
    }



}