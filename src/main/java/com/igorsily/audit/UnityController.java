package com.igorsily.audit;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("unities")
@RequiredArgsConstructor
public class UnityController {

    private final UnityService unityService;


    @PostMapping
    public ResponseEntity<Unity> save(@RequestBody Unity unity) {

        var u = this.unityService.save(unity);

        return new ResponseEntity<Unity>(u, HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<Unity> update(@PathVariable("id") UUID id, @RequestBody Unity unity) {

        unity.setId(id);
        var u = this.unityService.update(unity);

        return new ResponseEntity<Unity>(u, HttpStatus.OK);
    }


}
