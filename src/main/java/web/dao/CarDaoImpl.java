package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car(1, "KIA", 19585757L));
        cars.add(new Car(2, "NISSAN", 274774784L));
        cars.add(new Car(3, "BMW", 657839L));
        cars.add(new Car(4, "HONDA", 98700L));
        cars.add(new Car(5, "AUDI", 11886655L));
    }

    @Override
    public List<Car> getAllCars() {
        return Collections.unmodifiableList(cars);
    }

    @Override
    public List<Car> getSomeCars(int number) {
        return Collections.unmodifiableList(cars.subList(0, number));
    }
}
