package samples.spring.sender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import samples.spring.sender.MessageSender;

@RestController
@RequestMapping("/send")
public class SenderMessageController {

    @Autowired
    private MessageSender sender;

    @PostMapping()
    public void send(@RequestParam String message) {
        sender.send(message);
    }
}
