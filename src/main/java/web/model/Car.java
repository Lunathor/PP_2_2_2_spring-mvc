package web.model;

public class Car {
    private Long id;
    private String model;
    private String series;

    public Car() {
    }

    public Car(Long id, String series, String model) {
        this.id = id;
        this.series = series;
        this.model = model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
