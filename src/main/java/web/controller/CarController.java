package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public CarController(CarService carService){
        this.carService = carService;
    }

    @GetMapping(value = "/")
    public String printCar(ModelMap model){
        List<Car> cars = this.carService.getCarList();
        model.addAttribute("car",cars);
        return "cars";
    }

    @GetMapping(value = "")
    public String printCar(@RequestParam("count")int count, ModelMap model){
        List<Car> cars = this.carService.getCarList(count);
        model.addAttribute("car",cars);
        return "cars";
    }
}
