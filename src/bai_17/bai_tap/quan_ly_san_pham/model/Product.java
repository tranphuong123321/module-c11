package bai_17.bai_tap.quan_ly_san_pham.model;

import java.io.Serializable;

public class Product implements Serializable {
    private String id;
    private  String name;
    private  String company;
    private  int price;
    private String profile;

    public Product() {
    }

    public Product(String id, String name, String company, int prica, String profile) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.price = prica;
        this.profile = profile;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int prica) {
        this.price = prica;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", prica=" + price +
                ", profile='" + profile + '\'' +
                '}';
    }



}
