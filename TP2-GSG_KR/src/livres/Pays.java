package livres;

public class Pays
{
    public String nom;
    public String code_pays;

    public Pays(String nom, String code_pays) {

        this.nom = nom;

        assert code_pays.length() == 3 &&
                Character.isUpperCase(code_pays.charAt(0)) &&
                Character.isUpperCase(code_pays.charAt(1)) &&
                Character.isUpperCase(code_pays.charAt(2))
                : "Le code pays doit contenir exactement 3 lettres majuscules";

        if (code_pays.chars().filter(Character::isUpperCase).count() != 3) {
            throw new IllegalArgumentException("Le code pays doit contenir 3 majuscules");
        }
        else
            this.code_pays = code_pays;
    }
}
