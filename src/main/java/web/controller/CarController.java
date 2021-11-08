package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.services.CarService;


@Controller
public class CarController {
    @Autowired
    CarService carServiceImp;

    @GetMapping(value = "/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int n, Model model){

        model.addAttribute("list2",carServiceImp.getCarList(n));
        return "cars";
    }

}
