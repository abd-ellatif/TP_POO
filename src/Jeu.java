import java.io.*;
import java.util.TreeMap;

class Jeu{
    protected Partie partie;
    protected static TreeMap<String,Partie> partiesSauvegardies = null;

    public void NouvellePartie(String nom) throws IOException {

        this.partie = new Partie(nom);
    }
    public void SuspendrePartie() throws IOException {
        if (this.partie != null)
        {
            partiesSauvegardies.put(this.partie.player.nom,this.partie);
            try
            {
                ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("parties.dat"))));
                out.writeObject(Jeu.partiesSauvegardies);
                out.close();
            }
            catch (FileNotFoundException e) {e.printStackTrace();}
            catch (IOException e) {e.printStackTrace();}

        }


    }//pauser et enregistrer l'état de la partie dans la structure parties
    public void ReprendrePartie(String name) throws IOException {
        try
        {
            ObjectInputStream  in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("parties.dat"))));
            Jeu.partiesSauvegardies = (TreeMap<String,Partie>) in.readObject();
            if(Jeu.partiesSauvegardies.containsKey(name))
            {
                this.partie = Jeu.partiesSauvegardies.get(name);
            }
            else {
                System.out.println("Ce joueur n'a pas d'une partie sauvegardé");
            }
        }
        catch (FileNotFoundException e) {e.printStackTrace();}
        catch (IOException e) {e.printStackTrace();}
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }//récuperer une partie
    public void FinPartie(){

    }//arreter la partie et afficher les points et le score max
}