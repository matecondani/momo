package ar.com.momo.monster.mobile.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class MomoService {

    private static final String[] FIRST = {"Ma", "Me", "Mi", "Mo", "Mu"};
    private static final String[] SECOND = {"pa", "pe", "pi", "po", "pu", "ta", "te", "ti", "to", "tu", "ca", "ce", "ci", "co",
        "cu", "ya", "ye", "yi", "yo", "yu", "la", "le", "li", "lo", "lu", "ra", "re", "ri", "ro", "ru", "ga", "ge", "gi", "go",
        "gu", "ka", "ke", "ki", "ko", "ku", "sa", "se", "si", "so", "su", "wa", "we", "wi", "wo", "wu", "h", "n", "l"};

    public String generateName() {
        Random random = new Random();
        return FIRST[random.nextInt(FIRST.length)]
            .concat(SECOND[random.nextInt(SECOND.length)]).concat(SECOND[random.nextInt(SECOND.length)]);
    }
}
