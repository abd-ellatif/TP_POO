import java.util.Random;

class Des{
    protected int d1;
    protected int d2;
    static String[] faces = new String[6];//tableau de chemins vers images de faces d'un dé
    public void Afficher(){};
    public void lancer()
    {
        Random rd = new Random();
        this.d1 = rd.nextInt(6)+1;
        this.d2 = rd.nextInt(6)+1;

    }
}