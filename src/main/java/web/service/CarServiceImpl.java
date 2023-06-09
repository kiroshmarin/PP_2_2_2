package web.service;


import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private static long CARS_COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++CARS_COUNT,"Лада", 2112));
        cars.add(new Car(++CARS_COUNT,"Газ", 2705));
        cars.add(new Car(++CARS_COUNT,"BMW", 3));
        cars.add(new Car(++CARS_COUNT,"Citroen", 9));
        cars.add(new Car(++CARS_COUNT,"Audi", 4));
    }

    public List<Car> index(int carsToReturn) {
        if (carsToReturn <= cars.size() && carsToReturn > -1) {
            return cars.subList(0, carsToReturn);
        } else {
            return cars;
        }

    }
}
