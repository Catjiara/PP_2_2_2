package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;
import web.service.CarServise;

@Controller
@RequestMapping("/cars")
public class CarsController {

   private final CarServise carService;

   public CarsController(CarServise carService) {
       this.carService = carService;
   }

    @GetMapping()
    public String getAll(Model model) {
       model.addAttribute("cars", carService.getAll());
       return "cars";
    }

    @GetMapping()
    public String getRestrictedQuantity(@RequestParam(name = "count", required = false, defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", carService.getRestrictedQuantity(count));
        return "cars";
    }
}
