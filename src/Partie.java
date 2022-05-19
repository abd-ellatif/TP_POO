class Partie{
    protected Joueur player;
    protected Plateau plateau;
    protected Des dices;
    public Partie(String nom){
        this.player = new Joueur(nom);
        this.plateau = new Plateau();
        this.dices = new Des();
    }

    public void SelectCase() throws ImpossibleDeplacerCaseException{
        throw new ImpossibleDeplacerCaseException();
    }
    public void Deroulement() {
        while (player.pos != 99) {
            player.Deplacer(player.Lancer(dices));
            try {
                this.SelectCase();
            } catch (ImpossibleDeplacerCaseException e) {}
            this.plateau.plateau[player.pos].Action(player);
        }


    }

}