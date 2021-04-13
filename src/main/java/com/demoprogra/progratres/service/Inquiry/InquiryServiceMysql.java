package com.demoprogra.progratres.service.Inquiry;

import com.demoprogra.progratres.data.entity.Inquiry;
import com.demoprogra.progratres.repository.InquiryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InquiryServiceMysql implements InquiryService {

    @Autowired
    private InquiryRepository inquiryRepository;

    @Override
    public Inquiry save(Inquiry inquiry) {
        return inquiryRepository.save(inquiry);
    }
}
