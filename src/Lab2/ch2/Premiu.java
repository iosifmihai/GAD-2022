package Lab2.ch2;

public class Premiu {
    private String nume;
    private int an;

    public Premiu(String nume,int an)
    {
        this.nume=nume;
        this.an=an;
    }

    public String getNume() {
        return nume;
    }

    public int getAn() {
        return an;
    }

    @Override
    public String toString() {
        return "Premiu{" +
                "nume='" + nume + '\'' +
                ", an=" + an +
                '}';
    }
}
