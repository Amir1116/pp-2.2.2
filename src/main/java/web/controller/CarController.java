package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/cars")
public class CarController {

    @GetMapping(value = "/")
    public String printCar(ModelMap model){
        List<Car> cars = new Car().getCarList();
        model.addAttribute("car",cars);
        return "cars";
    }

    @GetMapping(value = "")
    public String printCar(@RequestParam("count")int count, ModelMap model){
        int limit = count>=5||count<1?5:count;
        List<Car> cars = new Car().getCarList();
        cars = cars.subList(0,limit);
        model.addAttribute("car",cars);
        return "cars";
    }
}