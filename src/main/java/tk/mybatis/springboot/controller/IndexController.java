package tk.mybatis.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by hanhai on 2017/6/14.
 */

@Slf4j
@Controller
public class IndexController {

    @RequestMapping("/")
    public ModelAndView index() {
        log.info("=================");
        ModelAndView result = new ModelAndView("home");
        return result;
    }
}
