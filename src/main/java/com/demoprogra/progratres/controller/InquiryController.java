package com.demoprogra.progratres.controller;

import com.demoprogra.progratres.bo.InquiryBo;
import com.demoprogra.progratres.data.dto.Inquiry.InquiryDto;
import com.demoprogra.progratres.data.entity.Inquiry;
import com.demoprogra.progratres.data.entity.Interested;
import com.demoprogra.progratres.data.entity.People;
import com.demoprogra.progratres.service.Costumer.CostumerService;
import com.demoprogra.progratres.service.Inquiry.InquiryService;
import com.demoprogra.progratres.service.Interested.InterestedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/inquiry")
public class InquiryController {

    @Autowired
    private InquiryService inquiryService;

    @Autowired
    private CostumerService costumerService;

    @Autowired
    private InterestedService interestedService;

    private InquiryBo inquiryBo;

    public InquiryController() {
        this.inquiryBo = new InquiryBo();
    }

    @PostMapping()
    public @ResponseBody
    Inquiry saveInquiryData(@RequestBody InquiryDto inquiryDto) {
        Inquiry inquiryEntity = inquiryBo.prepareInquiry(inquiryDto);
        People peopleEntity = inquiryBo.preparePeople(inquiryDto);
        Interested interestedEntity = inquiryBo.prepareInterested(inquiryDto);
        Inquiry inquirySaved = inquiryService.save(inquiryEntity);
        People peopleSaved = costumerService.savePeople(peopleEntity);
        Interested interestedSaved = interestedService.save(interestedEntity);
        return inquirySaved;
    }

}
