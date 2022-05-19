enum Couleur {Jaune(0),Blanc(0),Vert(0),Rouge(0),Orange(0),Bleu(0),Rose(0),Noir(0);
    public int cpt;
    private Couleur(int n){
        this.cpt = n;
    }
    public int getcpt(){
        return this.cpt;
    }
}