package test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorldController {
	@RequestMapping("/index/{name}")
//	@ResponseBody
    public String index(@PathVariable String name){
        
        if(null==name){
            name="boy";
        }        
        return "hello";
    }
}
