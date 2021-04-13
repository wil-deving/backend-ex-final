package com.demoprogra.progratres.bo;

import com.demoprogra.progratres.data.dto.Inquiry.InquiryDto;
import com.demoprogra.progratres.data.entity.Inquiry;
import com.demoprogra.progratres.data.entity.Interested;
import com.demoprogra.progratres.data.entity.People;

import java.util.Date;

public class InquiryBo {

    public People preparePeople(InquiryDto inquiryDto) {
        People peopleToSave = new People();
        peopleToSave.setPeopleId(inquiryDto.getPeopleId());
        peopleToSave.setName(inquiryDto.getName());
        peopleToSave.setCellphone(inquiryDto.getCellphone());
        peopleToSave.setEmail(inquiryDto.getEmail());
        return peopleToSave;
    }

    public Interested prepareInterested(InquiryDto inquiryDto) {
        Interested interestedToSave = new Interested();
        interestedToSave.setInterestedId(inquiryDto.getInterestedId());
        interestedToSave.setPeopleId(inquiryDto.getPeopleId());
        return interestedToSave;
    }

    public Inquiry prepareInquiry(InquiryDto inquiryDto) {
        Inquiry inquiryToSave = new Inquiry();
        inquiryToSave.setInquirieId(inquiryDto.getInquiryId());
        inquiryToSave.setOfferId(inquiryDto.getOfferId());
        inquiryToSave.setInterestedId(inquiryDto.getInterestedId());
        inquiryToSave.setCreatedAt(new Date());
        return inquiryToSave;
    }

}
