package io.magueles.req.requestsystem.Domains.Base.Insurance.Controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
