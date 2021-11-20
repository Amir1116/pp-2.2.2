package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private String color;
    private String engine;

    public Car() {
    }

    public Car(String model, String color, String engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}
