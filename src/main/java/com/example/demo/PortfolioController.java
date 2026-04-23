package com.example.demo; 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {

    // Route para sa Home Page [cite: 27, 28]
    @GetMapping("/")
    public String home() {
        return "home"; // Ito dapat ang pangalan ng HTML file sa templates folder
    }

    // Route para sa About Me [cite: 53, 54]
    @GetMapping("/about")
    public String about() {
        return "about";
    }

    // Route para sa College Journey [cite: 65, 66]
    @GetMapping("/journey")
    public String journey() {
        return "journey";
    }

    // Route para sa Skills [cite: 78, 79]
    @GetMapping("/skills")
    public String skills() {
        return "skills";
    }

    // Route para sa Gallery [cite: 112, 113]
    @GetMapping("/gallery")
    public String gallery() {
        return "gallery";
    }
}