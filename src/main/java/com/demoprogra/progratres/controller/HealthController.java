package com.demoprogra.progratres.controller;


import com.demoprogra.progratres.data.dto.Tester.TesterDto;
import com.demoprogra.progratres.data.dto.Tester.TesterResponseDto;
import com.demoprogra.progratres.data.entity.Tester;
import com.demoprogra.progratres.service.TesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

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
    public TesterResponseDto getTest() {
        TesterResponseDto testerResponseDto = new TesterResponseDto();
        testerResponseDto.setIdColumnOne("ID-Test");
        testerResponseDto.setColumnTwo("nameTest");
        return testerResponseDto;
    }

    @GetMapping("/response-json-list")
    public Iterable<Tester> getListTester() {
        ArrayList<TesterResponseDto> testerResponse = new ArrayList<>();
        TesterResponseDto testerResponseDto = new TesterResponseDto();
        return testerService.getTestList();
    }

    @GetMapping("/response-json-list-by-id/{idTest}")
    public Iterable<Tester> getListTesterById(@PathVariable String idTest) {
        ArrayList<TesterResponseDto> testerResponse = new ArrayList<>();
        TesterResponseDto testerResponseDto = new TesterResponseDto();
        return testerService.getTestListById(idTest);
    }

    @PostMapping()
    public @ResponseBody
    Tester saveTester(@RequestBody TesterDto testerDto) {
        Tester tester = new Tester();
        tester.setIdColumnOne(testerDto.getId());
        tester.setColumnTwo(testerDto.getColTwo());
        return testerService.save(tester);
    }

}
