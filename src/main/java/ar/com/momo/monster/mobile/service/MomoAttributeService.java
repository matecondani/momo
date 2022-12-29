package ar.com.momo.monster.mobile.service;

import org.springframework.stereotype.Service;
import ar.com.momo.monster.mobile.model.entity.MomoAttribute;

@Service
public class MomoAttributeService {

    public MomoAttribute generateInitialMomoAttributes(){
        MomoAttribute momoAttribute = new MomoAttribute();
        momoAttribute.setExtraction(10);
        momoAttribute.setQuantity(10);
        return momoAttribute;
    }
}
