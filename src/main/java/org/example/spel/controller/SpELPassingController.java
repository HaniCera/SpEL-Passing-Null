package org.example.spel.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
@Slf4j
public class SpELPassingController {

    @GetMapping("{uid}/v1")
    @PreAuthorize("@PreAuth.pass(#uid)")
    public ResponseEntity<String> getV1(@PathVariable(name = "uid") String uid){
        log.info("getV1 uid: {}", uid);
        return ResponseEntity.ok("getV1 - " + uid);
    }

    @GetMapping("{uid}/v2")
    public ResponseEntity<String> getV2(@PathVariable(name = "uid") String uid){
        log.info("getV2uid: {}", uid);
        return ResponseEntity.ok("getV2 - " + uid);
    }

}
