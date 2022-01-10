package exercitiu1.model;

public class Offerte implements Comparable<Offerte>{
    private Integer id;
    private String unternahmensname;
    private Integer price;
    private double mehrwertsteuer;
    private String adresse;
    private Ort ort;

    public Offerte(Integer id, String unternahmensname, Integer price, double mehrwertsteuer, String adresse, Ort ort) {
        this.id = id;
        this.unternahmensname = unternahmensname;
        this.price = price;
        this.mehrwertsteuer = mehrwertsteuer;
        this.adresse = adresse;
        this.ort = ort;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUnternahmensname() {
        return unternahmensname;
    }

    public void setUnternahmensname(String unternahmensname) {
        this.unternahmensname = unternahmensname;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public double getMehrwertsteuer() {
        return mehrwertsteuer;
    }

    public void setMehrwertsteuer(double mehrwertsteuer) {
        this.mehrwertsteuer = mehrwertsteuer;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Ort getOrt() {
        return ort;
    }

    public void setOrt(Ort ort) {
        this.ort = ort;
    }


    @Override
    public String toString() {
        return "Offerte{" +
                "id=" + id +
                ", unternahmensname='" + unternahmensname + '\'' +
                ", price=" + price +
                ", mehrwertsteuer=" + mehrwertsteuer +
                ", adresse='" + adresse + '\'' +
                ", ort=" + ort +
                '}';
    }

    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     *
     * <p>The implementor must ensure {@link Integer#signum
     * signum}{@code (x.compareTo(y)) == -signum(y.compareTo(x))} for
     * all {@code x} and {@code y}.  (This implies that {@code
     * x.compareTo(y)} must throw an exception if and only if {@code
     * y.compareTo(x)} throws an exception.)
     *
     * <p>The implementor must also ensure that the relation is transitive:
     * {@code (x.compareTo(y) > 0 && y.compareTo(z) > 0)} implies
     * {@code x.compareTo(z) > 0}.
     *
     * <p>Finally, the implementor must ensure that {@code
     * x.compareTo(y)==0} implies that {@code signum(x.compareTo(z))
     * == signum(y.compareTo(z))}, for all {@code z}.
     *
     * @param offerte the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     * @apiNote It is strongly recommended, but <i>not</i> strictly required that
     * {@code (x.compareTo(y)==0) == (x.equals(y))}.  Generally speaking, any
     * class that implements the {@code Comparable} interface and violates
     * this condition should clearly indicate this fact.  The recommended
     * language is "Note: this class has a natural ordering that is
     * inconsistent with equals."
     */
    @Override
    public int compareTo(Offerte offerte) {
        return Integer.compare(this.price, offerte.getPrice());
    }
}
