class Jeu{
    public Partie[] parties;
    static int nbparties ;
    public void NouvellePartie(String nom){

        parties[nbparties] = new Partie(nom);
    }
    public void SuspendrePartie(){}//pauser et enregistrer l'état de la partie dans la structure parties
    public void ReprendrePartie(){}//récuperer une partie
    public void FinPartie(){

    }//arreter la partie et afficher les points et le score max
}