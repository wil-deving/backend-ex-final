package com.demoprogra.progratres.service.Inquiry;

import com.demoprogra.progratres.data.entity.Inquiry;

import java.util.List;
import java.util.Map;

public interface InquiryService {

    Inquiry save(Inquiry inquiry);

    List<Map<String, String>> getInquiriesDataByCity(String city);

}
