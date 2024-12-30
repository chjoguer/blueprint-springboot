package com.gizlocorp.blueprintspringboot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gizlocorp.blueprintspringboot.Config.Configuration;

@RestController
@RequestMapping(Configuration.URL_MAIN_PATH_SERVICE)
public class Controller {
    @GetMapping("/response")
    public String sendCustromResponse(){
        return "example33";
    }
}
