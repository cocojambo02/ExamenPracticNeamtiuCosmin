package exercitiu2.model;

public class Produkte {
    private String name;
    private double price;
    private String sku;
    private Integer initialeAnzahlProdukteamLager;

    public Produkte(String name, double price, String sku, Integer initialeAnzahlProdukteamLager) {
        this.name = name;
        this.price = price;
        this.sku = sku;
        this.initialeAnzahlProdukteamLager = initialeAnzahlProdukteamLager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Integer getInitialeAnzahlProdukteamLager() {
        return initialeAnzahlProdukteamLager;
    }

    public void setInitialeAnzahlProdukteamLager(Integer initialeAnzahlProdukteamLager) {
        this.initialeAnzahlProdukteamLager = initialeAnzahlProdukteamLager;
    }
}
