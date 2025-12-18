package web.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import web.model.Car;

@Service
public class CarServiceImpl implements CarService {
    
    private List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car(1L, "Toyota", "Camry"));
        cars.add(new Car(2L, "Honda", "Accord"));
        cars.add(new Car(3L, "Ford", "Mustang"));
        cars.add(new Car(4L, "Audi", "A4"));
        cars.add(new Car(5L, "Honda", "Civic"));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= 5) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
