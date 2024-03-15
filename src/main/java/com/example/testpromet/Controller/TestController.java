package com.example.testpromet.Controller;

import com.example.testpromet.Model.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
public class TestController {
    @GetMapping
    public ResponseEntity<Test> getTest(){
        Test t = new Test();
        t.setName("popi");
        t.setMessage("pop pop pop pip pip pip pop");
        return new ResponseEntity<>(t, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> insertTest(@RequestBody Test t){
        Test temp = new Test();
        temp.setName(t.getName());
        temp.setMessage(t.getMessage());
        return new ResponseEntity<>("Data Berhasil Ditambahkan",HttpStatus.OK);
    }

}
