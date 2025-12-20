package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarServise{

    List<Car> cars = new ArrayList<>();

    public CarServiceImpl () {
        cars.add(new Car("Citroen", "C4", 2005));
        cars.add(new Car("BMW", "5", 2020));
        cars.add(new Car("Volkswagen", "Golf", 2018));
        cars.add(new Car("Peugeot", "406", 2008));
        cars.add(new Car("Toyota", "Camry", 2023));
    }

    @Override
    public List<Car> getCarList(int count) {
        return count == 0 ? this.cars : this.cars.stream().limit(count).collect(Collectors.toList());
    }
}
