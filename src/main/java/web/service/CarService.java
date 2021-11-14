package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    public CarService(){}

    public List<Car> getCarList(){
        List<Car> cars = new ArrayList<>();
        for(int i = 1; i <= 5; i++){
            cars.add(new Car(("model"+i),("color"+i),("engine")+i));
        }
        return cars;
    }

    public List<Car> getCarList(int count){
        int limit = count>=5||count<1?5:count;
        List<Car> cars = this.getCarList();
        cars = cars.subList(0,limit);
        return cars;
    }
}
