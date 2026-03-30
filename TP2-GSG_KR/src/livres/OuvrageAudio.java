package livres;

import java.time.LocalDate;

public class OuvrageAudio extends Ouvrage{

    public enum FormatAudio { NUMERIQUE, ANALOGIQUE }

    private int dureeMinutes;
    private FormatAudio format;

    public OuvrageAudio(String titre, Auteur auteur, LocalDate date, int nombreExemplaires,
                        int dureeMinutes, FormatAudio format) {
        super(titre, auteur, date, nombreExemplaires);
        this.dureeMinutes = dureeMinutes;
        this.format = format;
    }

    public int getDureeMinutes() { return dureeMinutes; }
    public FormatAudio getFormat() { return format; }

    @Override
    public String toString() {
        return super.toString() + " [Audio - " + dureeMinutes + " min - " + format + "]";
    }
}
