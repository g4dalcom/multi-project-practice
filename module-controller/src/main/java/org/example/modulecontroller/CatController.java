package org.example.modulecontroller;

import org.example.moduledomain.Cat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatController {
    @GetMapping("/cat")
    public String getPrettyCat() {
        Cat cat = new Cat(1L, "cheeze", "korean short hair");
        return cat.toString();
    }
}
