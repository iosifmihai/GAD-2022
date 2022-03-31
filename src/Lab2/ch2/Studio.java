package Lab2.ch2;

import java.util.Arrays;

public class Studio {
    public String nume;
    public Film[] filme;
    public Studio(String nume, Film[] filme)
    {
        this.nume=nume;
        this.filme=filme;
    }


    public String getNume() {
        return nume;
    }

    public Film[] getFilme() {
        return filme;
    }

    @Override
    public String toString() {
        return nume;
    }
}
