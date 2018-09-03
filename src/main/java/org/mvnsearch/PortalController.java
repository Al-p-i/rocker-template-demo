package org.mvnsearch;

import com.fizzed.rocker.RockerModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

/**
 * portal controller
 *
 * @author linux_china
 */
@Controller
public class PortalController {

    @GetMapping(value = "/")
    @ResponseBody
    public RockerModel index() {
        return templates.Main.template("Welcome", "Sasha", Arrays.asList("Sasha", "Jackie"), true);
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }
}
