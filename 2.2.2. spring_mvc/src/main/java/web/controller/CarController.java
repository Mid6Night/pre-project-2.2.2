package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
@RequestMapping("/")
public class CarController {
    @Autowired
    private CarService carService;

    @RequestMapping(value = "cars", method = RequestMethod.GET)
    public String printWelcome(ModelMap model, @RequestParam(required = false) String locale) {
        if (locale != null) {
            if (locale.equals("en")) {
                model.addAttribute("locale", "CARS");
            }else {
                model.addAttribute("locale", "МАШИНЫ");
            }
        } else {
            model.addAttribute("locale", "МАШИНЫ");
        }
        List<Car> cars = carService.getAll();
        model.addAttribute("cars", cars);
        return "cars";
    }
}
