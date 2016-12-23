package industries.kvmo.services.controllers;

import industries.kvmo.services.dto.HiWorld;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello World Controller
 */
@RestController
@RequestMapping("/v1/home")
public class HelloWorldController {


    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public HiWorld test1() {
        return new HiWorld(1, "asshole");

    }

}
