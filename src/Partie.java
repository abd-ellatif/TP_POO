import java.io.IOException;
import java.io.Serializable;

class Partie implements Serializable {
    protected Joueur player;
    protected Plateau plateau;
    protected Des dices;
    public Partie(String nom) throws IOException {
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