package controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/calender")
public class CalenderController {
    @PostMapping("/add/{userId}")
    public ResponseEntity<?> addCalender(@PathVariable("userId") String userId){

    }
}
