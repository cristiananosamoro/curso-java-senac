
package com.cristian.projeto;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController

public class Hello {
    @GetMapping("/hello") 
    public String helloString() {
        return "oiii, tudo bom?";
    }
    
}
