package com.education.ztu.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Team<T extends Participant> {
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(T participant) {
        participants.add(participant);
        System.out.println("To the team " + name + " was added participant " + participant.getName());
    }

    public String getName() {
        return name;
    }

    public List<T> getParticipants() {
        return participants;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Team<?> team = (Team<?>) obj;
        return Objects.equals(name, team.name) && Objects.equals(participants, team.participants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, participants);
    }

    @Override
    public String toString() {
        return "Team{name='" + name + "', participants=" + participants + '}';
    }

    // Метод для глибокого клонування
    public static <T extends Participant> Team<T> deepClone(Team<T> original) throws CloneNotSupportedException {
        Team<T> clonedTeam = new Team<>(original.getName());
        for (T participant : original.getParticipants()) {
            clonedTeam.addNewParticipant((T) participant.clone());
        }
        return clonedTeam;
    }

    // Додаємо метод для гри між командами з однаковими типами
    public void playWith(Team<T> opponentTeam) {
        Random random = new Random();
        String winner = random.nextInt(2) == 0 ? this.name : opponentTeam.getName();
        System.out.println("The team " + winner + " is winner!");
    }
}
