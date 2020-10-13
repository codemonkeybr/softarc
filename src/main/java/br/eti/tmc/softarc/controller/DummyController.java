package br.eti.tmc.softarc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

    Logger logger = LoggerFactory.getLogger(DummyController.class);

    @PostMapping("/dummy")
    public String greetingSubmit(@RequestBody String dummy) {
        logger.info("Logging stuff: "+ dummy);
        return "msg logged";
    }
}
