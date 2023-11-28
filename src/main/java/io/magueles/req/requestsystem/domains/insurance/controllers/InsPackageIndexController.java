package io.magueles.req.requestsystem.domains.insurance.controllers;

import java.util.HashMap;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/api/packages")
@RestController
public class InsPackageIndexController {
    
    @GetMapping()
    public ResponseEntity<Object> index() {
        var res = new HashMap<String, String>();

        res.put("message", "OK");
        res.put("data", "1");

        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> find(@PathVariable String id) {

        log.info("Reacting to", id);

        var res = new HashMap<String, String>();

        res.put("message", "OK");
        res.put("data", "1");

        return new ResponseEntity<>(res, HttpStatus.OK);
    }
}
