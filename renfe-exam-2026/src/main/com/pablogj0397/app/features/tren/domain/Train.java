package main.com.pablogj0397.app.features.tren.domain; //cambiar por la ruta correcta

public class Train {
    private String id;
    private String capacity;
    private String model;
    private String operator;
    private String type;

    public Train(String id, String capacity, String model, String operator, String type) {
        this.id = id;
        this.capacity = capacity;
        this.model = model;
        this.operator = operator;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Train{" +
                "id='" + id + '\'' +
                ", capacity='" + capacity + '\'' +
                ", model='" + model + '\'' +
                ", operator='" + operator + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
