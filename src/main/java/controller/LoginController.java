package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Porco on 2015/5/21 0021.
 */
@RestController
public class LoginController {

    @RequestMapping("/login")
    public ModelAndView login(){
        System.out.println("hello Porco!!");
        return new ModelAndView("login");
    }
}
