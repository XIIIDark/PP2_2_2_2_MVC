package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private List<Car> cars;

    public CarServiceImp() {
        this.cars = new ArrayList<>();
        this.cars.add(new Car("RX", 1995, 2000));
        this.cars.add(new Car("RX", 1996, 3000));
        this.cars.add(new Car("RX", 1997, 4000));
        this.cars.add(new Car("RX", 1998, 5000));
        this.cars.add(new Car("RX", 1999, 6000));
    }
    
    @Override
    public List<Car> getCarsByCount(int count) {
        if (count < 1) {
            return null;
        }
        if (count > this.cars.size()) {
            return this.cars;
        }
        return this.cars.subList(0, count);
    }
}
