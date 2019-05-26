package z.ivan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import z.ivan.entity.User;
import z.ivan.service.UserService;

import java.time.OffsetDateTime;

@Controller
public class HelloResource {

    @Autowired
    private UserService userService;

    /**
     * main page
     */
    @GetMapping("/")
    public ModelAndView root(Model model) {
        ModelAndView mov = new ModelAndView("show_info");
        return mov;
    }

    /**
     * let's retrieve data from local repo: ArrayList
     */
    @GetMapping("/info")
    public ModelAndView getInfo(Model model) {
        ModelAndView mov = new ModelAndView("show_info");
        String name, total;
        userService.store(new User(1L, "Aden", OffsetDateTime.now()));

        name = userService.getById(1).getLogin();

        model.addAttribute("name", name);
        model.addAttribute("total", "0.0001");
        return mov;
    }

}
