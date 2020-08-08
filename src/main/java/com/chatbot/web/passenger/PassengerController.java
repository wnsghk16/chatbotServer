package com.chatbot.web.passenger;

import com.chatbot.web.utils.Box;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/passenger")
public class PassengerController {
    @Autowired PassengerService passengerService;
    @GetMapping("/csv")
    public void csvRead(){
        passengerService.readCsv();
    }
}
