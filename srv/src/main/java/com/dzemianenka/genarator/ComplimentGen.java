package com.dzemianenka.genarator;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.dzemianenka.model.Compliment;
import com.dzemianenka.repository.ComplimentRepository;

@Component
public class ComplimentGen {

    private static final Random RANDOM = new Random();
    private String part0 = ", ты самый ";
    private List<String> part1 = Arrays.asList(
            "добрый ", "умный ", "надежный ", "классный ", "искренний ", "заботливый ", "неповторимый ", "уникальный ", "восхитительный ", "прекрасный ", "крутой ");
    private List<String> part2 = Arrays.asList("Человек ", "Друг ", "Товарищ ");
    private String part3 = "на свете. ";

    private final ComplimentRepository complimentRepository;

    public ComplimentGen(ComplimentRepository complimentRepository) {
        this.complimentRepository = complimentRepository;
    }

    public String getPhrase() {
        int p1 = part1.size();
        int p2 = part2.size();
        List<Compliment> compliments = complimentRepository.findAll();
        int p4 = compliments.size();
        return part0 + part1.get(RANDOM.nextInt(p1)) + part2.get(RANDOM.nextInt(p2)) + part3 + compliments.get(RANDOM.nextInt(p4)).getCompliment();
    }

    public int getNumber() {
        return RANDOM.nextInt(30) + 1;
    }
}