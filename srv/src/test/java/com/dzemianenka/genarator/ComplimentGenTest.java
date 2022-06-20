package com.dzemianenka.genarator;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.dzemianenka.model.Compliment;
import com.dzemianenka.repository.ComplimentRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ComplimentGenTest {

    @Mock
    private ComplimentRepository complimentRepository;
    @InjectMocks
    private ComplimentGen complimentGen;

    @Test
    void getPhrase() {
        when(complimentRepository.findAll()).thenReturn(List.of(new Compliment()));

        String phrase = complimentGen.getPhrase();
        verify(complimentRepository, times(1)).findAll();
        assertFalse(phrase.isEmpty());
    }

    @Test
    void getNumber() {
        int number = complimentGen.getNumber();
        assertTrue(number > 0);
    }
}