package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printWelcome(ModelMap model,
                               @RequestParam(value = "count", required = false) Integer count) {

        List<Car> table;

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Model_1", 1, 100));
        cars.add(new Car("Model_2", 2, 150));
        cars.add(new Car("Model_3", 3, 200));
        cars.add(new Car("Model_4", 4, 250));
        cars.add(new Car("Model_5", 5, 300));

        if (count != null) {
            table = cars.stream().limit(count).collect(Collectors.toList());
        } else {
            table = cars;
        }


        model.addAttribute("cars", table);

        return "car";
    }
}
