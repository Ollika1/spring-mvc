package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {

    int series;
    String model;
    String color;

    public Car() {
    }

    public Car(int series, String model, String color) {
        this.series = series;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{ " +
                "series=" + series +
                ", model=" + model  +
                ", color=" + color  +
                "}";
    }

}
