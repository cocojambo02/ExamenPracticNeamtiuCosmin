package exercitiu1.model;

public enum Ort {
    Thurgau("Thurgau"),
    Zürich("Zürich"),
    StGallen("St. Gallen");

    private final String ort;

    Ort(final String ort) {
        this.ort = ort;
    }

    @Override
    public String toString() {
        return ort;
    }
}
