package web.model;

public class Car {
    private String name;
    private String model;
    private Integer number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Car(String name, String model, Integer number) {
        this.name = name;
        this.model = model;
        this.number = number;
    }

    public Car() {
    }
}
