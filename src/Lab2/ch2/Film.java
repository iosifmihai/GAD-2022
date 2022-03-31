package Lab2.ch2;

import java.util.Arrays;

public class Film {
    public String nume;
    public int anAparitie;
    public Actor[] actori;

    public Film(int anAparitie,String nume, Actor[] actori)
    {
        this.nume=nume;
        this.anAparitie=anAparitie;
        this.actori=actori;
    }

    @Override
    public String toString() {
        return "Film{" +
                "nume='" + nume + '\'' +
                ", anAparitie=" + anAparitie +
                ", actori=" + Arrays.toString(actori) +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public int getAnAparitie() {
        return anAparitie;
    }

    public Actor[] getActori() {
        return actori;
    }


}
