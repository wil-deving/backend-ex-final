package com.demoprogra.progratres.controller;


import com.demoprogra.progratres.data.dto.EntityResponseDto;
import com.demoprogra.progratres.data.entity.Tester;
import com.demoprogra.progratres.service.EntityService;
import com.demoprogra.progratres.service.TesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/health")
public class HealthController {

    @Autowired
    private TesterService testerService;

    @GetMapping()
    public String serverIsRunning() {
        return "Bienvenidos a la demo de programacion III UTB";
    }

    @GetMapping("/response-json")
    public EntityResponseDto getTest() {
        EntityResponseDto entityResponseDto = new EntityResponseDto();
        entityResponseDto.setId("ABC");
        entityResponseDto.setName("my name");
        return entityResponseDto;
    }

    @PostMapping()
    public @ResponseBody
    Tester saveTester() {
        Tester tester = new Tester();
        tester.setIdColumnOne("Test-1");
        tester.setColumnTwo("Hello DB!!");
        return testerService.save(tester);
    }

}
