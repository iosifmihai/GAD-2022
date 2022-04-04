package Lab2.ch2;

import java.util.Arrays;

public class Studio {
    private String nume;
    private Film[] filme;
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

    public Film filmByActors(String actor)
    {
        for(int i=0;i<filme.length;i++)
        {
            if(filme[i].getActorByName(actor)!= null)
            {
                return filme[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Studio{" +
                "nume='" + nume + '\'' +
                ", filme=" + Arrays.toString(filme) +
                '}';
    }
}
