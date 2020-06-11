package web.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService implements Service{
    @Override
    public List<Car> getAll() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("name 1","model 1",1));
        cars.add(new Car("name 2","model 2",2));
        cars.add(new Car("name 3","model 3",3));
        return cars;
    }
}
