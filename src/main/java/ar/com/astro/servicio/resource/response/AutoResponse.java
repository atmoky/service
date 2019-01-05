package ar.com.astro.servicio.resource.response;

public class AutoResponse {

    private Long id ;
    private String brand;
    private String model;
    private Double price;


    public AutoResponse(Long id, String brand, String model, Double price) {

        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
