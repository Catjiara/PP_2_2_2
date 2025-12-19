package web.service;

import web.models.Car;

import java.util.List;

public interface CarServise {
    public List<Car> getAll();
    public List<Car> getRestrictedQuantity(int count);

}
