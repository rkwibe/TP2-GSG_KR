package tests;

import livres. *;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Librairie {
    private List<Auteur> auteurs  = new ArrayList<>();
    private List<Ouvrage> ouvrages = new ArrayList<>();

    public Librairie(){
        Auteur albertine = new Auteur("Albertine", "Tremblay", new Pays("Canada", "CCC"));
        Auteur john = new Auteur("John", "Smith", new Pays("Etats-Unis", "EEE"));
        Auteur jean = new Auteur("Jean", "Némarre", new Pays("Suisse", "SSS"));
        auteurs.add(albertine);
        auteurs.add(john);
        auteurs.add(jean);

        ouvrages.add(new OuvragePapier("Titre 1", john, LocalDate.now(),1560, 568));
        ouvrages.add(new OuvragePapier("Titre 2", jean, LocalDate.now(),1560, 568));
        ouvrages.add(new OuvragePapier("Titre 3", albertine, LocalDate.now(),1560, 568));
        ouvrages.add(new OuvragePapier("Titre 4", jean, LocalDate.now(),1560, 568));
        ouvrages.add(new OuvragePapier("Titre 5", albertine, LocalDate.now(),1560, 568));
        ouvrages.add(new OuvragePapier("Titre 6", john, LocalDate.now(),1560, 568));
        ouvrages.add(new OuvragePapier("Titre 7", albertine, LocalDate.now(),1560, 568));

        ouvrages.add(new OuvrageVideo("Titre 8", albertine, LocalDate.now(),500000, 15854, 26523.1));
        ouvrages.add(new OuvrageAudio("Titre 9", jean,LocalDate.now(),184161, 15854, OuvrageAudio.FormatAudio.NUMERIQUE));

        ouvrages.add(new OuvragePapier("Titre 10", jean, LocalDate.now(),1560, 568));
    }

    public List<Auteur> getAuteurs() {
        return auteurs;
    }

    public List<Ouvrage> getOuvrages() {
        return ouvrages;
    }

    public List<Ouvrage> trouverOuvrages(Auteur auteur) {
        //ATTENTION il faut implémenter equals dans auteur pour que ca marche!!!!!
        int count = 0;

        List<Ouvrage> trouves = new ArrayList<>();
        for (Ouvrage ouvrage : ouvrages) {
            if (ouvrage.getAuteur().equals(auteur)) {
                trouves.add(ouvrage);
            }
        }

        return trouves;
    }
}
