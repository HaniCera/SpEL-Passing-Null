package org.example.spel.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component("PreAuth")
@Slf4j
public final class PreAuthComponent {

    public boolean pass(String uid){

        log.info("pass uid: {}", uid);

        return !uid.isEmpty();
    }

}
