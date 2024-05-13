package net.az3l1t.JWT.controller;

import net.az3l1t.JWT.model.AuthenticationResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public ResponseEntity<String> test(){
        return ResponseEntity.ok("Test url");
    }

    @GetMapping("/admin_only")
    public ResponseEntity<String> adminOnly(){
        return ResponseEntity.ok("admin place");
    }
}
