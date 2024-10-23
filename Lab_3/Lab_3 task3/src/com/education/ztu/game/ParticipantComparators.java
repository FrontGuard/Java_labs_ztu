package com.education.ztu.game;

import java.util.Comparator;

public class ParticipantComparators {
    // Компаратор для порівняння учасників по віку
    public static Comparator<Participant> compareByAge() {
        return Comparator.comparingInt(Participant::getAge);
    }

    // Компаратор з пріоритетом: спочатку по імені, потім по віку
    public static Comparator<Participant> compareByNameThenAge() {
        return Comparator.comparing(Participant::getName)
                .thenComparing(Participant::getAge);
    }
}
