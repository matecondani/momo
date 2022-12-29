package ar.com.momo.monster.mobile.service;

import org.springframework.stereotype.Service;
import ar.com.momo.monster.mobile.model.entity.Attribute;

@Service
public class AttributeService {

    public Attribute generateInitialAttributes(){
        Attribute initialAttribute = new Attribute();
        initialAttribute.setHealth(200);
        initialAttribute.setMana(100);
        initialAttribute.setAttack(10);
        initialAttribute.setIntelligence(10);
        initialAttribute.setDefense(5);
        initialAttribute.setMagicalResistance(5);
        initialAttribute.setSpeed(5);
        initialAttribute.setRegeneration(5);
        return initialAttribute;
    }
}
