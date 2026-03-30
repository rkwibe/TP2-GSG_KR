package livres;

import java.util.List;

public class Serie {
    private String nom;
    private List<Ouvrage> ouvrages;

    public Serie(String nom, List<Ouvrage> ouvrages) {
        this.nom = nom;
        this.ouvrages = ouvrages;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Ouvrage> getOuvrages() {
        return ouvrages;
    }

    public void setOuvrages(List<Ouvrage> ouvrages) {
        this.ouvrages = ouvrages;
    }

    public void ajouterOuvrage(Ouvrage o) {
        ouvrages.add(o);
    }

    public boolean retirerOuvrage(Ouvrage o) {
        return ouvrages.remove(o);

    }
    @Override
    public String toString() {
        String affichage = "Série : " + nom + "\n";
        for (Ouvrage o : ouvrages) {
            affichage += "  - " + o + "\n";
        }
        return affichage;
    }
}
