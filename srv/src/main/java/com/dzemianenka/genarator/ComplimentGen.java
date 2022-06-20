package com.dzemianenka.genarator;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.dzemianenka.model.Compliment;
import com.dzemianenka.model.Gender;
import com.dzemianenka.repository.ComplimentRepository;

@Component
public class ComplimentGen {

    private static final Random RANDOM = new Random();
    private String part0M = ", ты самый ";
    private String part0F = ", ты самая ";

    private List<String> part1M = Arrays.asList(
            "добрый ", "умный ", "надежный ", "классный ", "искренний ", "неповторимый ", "уникальный ", "восхитительный ", "прекрасный ");
    private List<String> part1F = Arrays.asList(
            "добрая ", "умная ", "надежная ", "классная ", "искренняя ", "неповторимая ", "уникальная ", "восхитительная ", "прекрасная ");

    private List<String> part2M = Arrays.asList("Парень ", "Друг ", "Товарищ ");
    private List<String> part2F = Arrays.asList("Девушка ", "Подруга ", "Девушка ");
    private String part3 = "на свете. ";

    private final ComplimentRepository complimentRepository;

    public ComplimentGen(ComplimentRepository complimentRepository) {
        this.complimentRepository = complimentRepository;
    }

    public String getPhrase(Gender gender) {

        int p1 = part1M.size();
        int p2 = part2M.size();
        List<Compliment> compliments = complimentRepository.findAll();
        int p4 = compliments.size();
        if (gender.equals(Gender.MALE)) {
            return part0M
                   + part1M.get(RANDOM.nextInt(p1))
                   + part2M.get(RANDOM.nextInt(p2))
                   + part3
                   + compliments.get(RANDOM.nextInt(p4)).getCompliment();
        }
        return part0F
               + part1F.get(RANDOM.nextInt(p1))
               + part2F.get(RANDOM.nextInt(p2))
               + part3
               + compliments.get(RANDOM.nextInt(p4)).getCompliment();
    }

    public int getNumber() {
        return RANDOM.nextInt(46) + 1;
    }
}