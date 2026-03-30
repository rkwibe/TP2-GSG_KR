package livres;

import java.time.LocalDate;
public class OuvrageVideo extends Ouvrage {

    private int dureeMinutes;
    private double tailleMb;

    public OuvrageVideo(String titre, Auteur auteur, LocalDate date, int nombreExemplaires,
                        int dureeMinutes, double tailleMb) {
        super(titre, auteur, date, nombreExemplaires);
        this.dureeMinutes = dureeMinutes;
        this.tailleMb = tailleMb;
    }

    public int getDureeMinutes() { return dureeMinutes; }
    public double getTailleMb() { return tailleMb; }

    @Override
    public String toString() {
        return super.toString() + " [Vidéo - " + dureeMinutes + " min - " + tailleMb + " Mb]";
    }

}
