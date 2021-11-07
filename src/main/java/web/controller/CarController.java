package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int n, Model model){
        List<Car> list = new ArrayList<>();
        list.add(new Car(3456,"BMW","green"));
        list.add(new Car(309876,"Toyota","white" ));
        list.add(new Car(284756, "Mercedes","black"));
        list.add(new Car(489768, "Mazda", "yellow"));
        list.add(new Car(7869, "Cadillac", "red"));
        model.addAttribute("list2", list.stream().limit(n).collect(Collectors.toList()));
        return "cars";
    }

}
