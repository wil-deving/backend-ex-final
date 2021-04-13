package com.demoprogra.progratres.service.Interested;

import com.demoprogra.progratres.data.entity.Interested;
import com.demoprogra.progratres.repository.InterestedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InterestedServiceMysql implements InterestedService {

    @Autowired
    private InterestedRepository interestedRepository;

    @Override
    public Interested save(Interested interested) {
        return interestedRepository.save(interested);
    }

}
