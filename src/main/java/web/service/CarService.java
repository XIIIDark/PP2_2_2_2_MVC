package web.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public interface CarService {

    public List<Car> getCars();

    public List<Car> getCarsByCount(int count);
}
