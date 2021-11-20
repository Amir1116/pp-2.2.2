package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/cars")
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping(value = "")
    public String countCar(@RequestParam(name = "count", required = false) Integer count, ModelMap model) {
        if (count != null) {
            List<Car> cars = this.carService.getCarList(count);
            System.out.println(cars);
            model.addAttribute("car", cars);
            return "cars";
        } else {
            List<Car> cars = this.carService.getCarList();
            System.out.println(cars);
            model.addAttribute("car", cars);
            return "cars";
        }
    }
}
