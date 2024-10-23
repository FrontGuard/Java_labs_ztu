package com.education.ztu;

import com.education.ztu.game.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Створення учасників
            Schoolar schoolar1 = new Schoolar("Ivan", 13);
            Schoolar schoolar2 = new Schoolar("Mariya", 15);
            Team<Schoolar> team = new Team<>("Dragons");
            team.addNewParticipant(schoolar1);
            team.addNewParticipant(schoolar2);

            // Створення нової команди для гри
            Schoolar schoolar3 = new Schoolar("Sergey", 12);
            Schoolar schoolar4 = new Schoolar("Olga", 14);
            Team<Schoolar> team2 = new Team<>("SmartKids");
            team2.addNewParticipant(schoolar3);
            team2.addNewParticipant(schoolar4);

            // Гра між двома командами школярів
            team.playWith(team2);

            // Глибоке клонування команди
            Team<Schoolar> clonedTeam = Team.deepClone(team);

            // Виводимо оригінальну та клоновану команди
            System.out.println("Original team: " + team);
            System.out.println("Cloned team: " + clonedTeam);

            // Перевіряємо hashCode і equals
            System.out.println("Are teams equal? " + team.equals(clonedTeam)); // Має бути true
            System.out.println("Original team's hashCode: " + team.hashCode());
            System.out.println("Cloned team's hashCode: " + clonedTeam.hashCode());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
