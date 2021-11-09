package web.sevice;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Ford", "Mustang", 1970));
        cars.add(new Car("Honda", "Accord", 1985));
        cars.add(new Car("Mazda ", "MX-5", 1989));
        cars.add(new Car("Chevrolet", "Chevelle", 1968));
        cars.add(new Car("Ferrari", "F40", 1987));
    }

    public List<Car> getCars(Integer count) {
        if (count == null || count >= 5) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }


}
