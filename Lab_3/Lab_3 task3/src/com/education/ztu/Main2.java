package com.education.ztu;

import com.education.ztu.game.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        // Створюємо учасників
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Mariya", 15);
        Schoolar schoolar3 = new Schoolar("Sergey", 12);
        Schoolar schoolar4 = new Schoolar("Olga", 14);

        // Створюємо команду
        Team<Schoolar> team = new Team<>("Dragons");
        team.addNewParticipant(schoolar1);
        team.addNewParticipant(schoolar2);
        team.addNewParticipant(schoolar3);
        team.addNewParticipant(schoolar4);

        // Сортуємо команду по імені (Comparable)
        List<Schoolar> participants = new ArrayList<>(team.getParticipants());
        System.out.println("Before sorting by name:");
        participants.forEach(System.out::println);

        Collections.sort(participants);  // Сортування по імені
        System.out.println("After sorting by name:");
        participants.forEach(System.out::println);

        // Сортуємо по віку (Comparator)
        participants.sort(ParticipantComparators.compareByAge());
        System.out.println("After sorting by age:");
        participants.forEach(System.out::println);

        // Сортуємо по імені, а потім по віку (Comparator з пріоритетом)
        participants.sort(ParticipantComparators.compareByNameThenAge());
        System.out.println("After sorting by name then age:");
        participants.forEach(System.out::println);
    }
}
