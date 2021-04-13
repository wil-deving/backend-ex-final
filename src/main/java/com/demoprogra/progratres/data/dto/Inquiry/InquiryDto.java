package com.demoprogra.progratres.data.dto.Inquiry;

import com.demoprogra.progratres.data.dto.People.PeopleDto;

public class InquiryDto extends PeopleDto {

    private String inquiryId;

    private String offerId;

    private String interestedId;

    private String createdAt;

    private String peopleId;

    public InquiryDto() {
    }

    public InquiryDto(String inquiryId,
                      String offerId,
                      String interestedId,
                      String createdAt,
                      String peopleId) {
        this.inquiryId = inquiryId;
        this.offerId = offerId;
        this.interestedId = interestedId;
        this.createdAt = createdAt;
        this.peopleId = peopleId;
    }

    public String getInquiryId() {
        return inquiryId;
    }

    public void setInquiryId(String inquiryId) {
        this.inquiryId = inquiryId;
    }

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public String getInterestedId() {
        return interestedId;
    }

    public void setInterestedId(String interestedId) {
        this.interestedId = interestedId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(String peopleId) {
        this.peopleId = peopleId;
    }

}
