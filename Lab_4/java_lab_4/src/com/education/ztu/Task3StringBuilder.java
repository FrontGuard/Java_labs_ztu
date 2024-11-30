package com.education.ztu;

public class Task3StringBuilder {

    public static void executeTask() {
        int num1 = 4;
        int num2 = 36;

        // Формування рядків
        StringBuilder sb = new StringBuilder();
        sb.append(num1).append(" + ").append(num2).append(" = ").append(num1 + num2);
        System.out.println("Результат додавання: " + sb);

        sb.setLength(0); // Очищення StringBuilder
        sb.append(num1).append(" - ").append(num2).append(" = ").append(num1 - num2);
        System.out.println("Результат віднімання: " + sb);

        sb.setLength(0); // Очищення StringBuilder
        sb.append(num1).append(" * ").append(num2).append(" = ").append(num1 * num2);
        System.out.println("Результат множення: " + sb);

        // Замінити символ "=" на "рівно" за допомогою insert() та deleteCharAt()
        sb.setLength(0);
        sb.append(num1).append(" / ").append(num2).append(" = ").append((double) num1 / num2);
        int index = sb.indexOf("=");
        sb.insert(index, "рівно");
        sb.deleteCharAt(index + 5);
        System.out.println("Рядок з використанням insert() та deleteCharAt(): " + sb);

        // Замінити символ "=" на "рівно" за допомогою replace()
        sb.setLength(0);
        sb.append(num1).append(" + ").append(num2).append(" = ").append(num1 + num2);
        sb.replace(sb.indexOf("="), sb.indexOf("=") + 1, "рівно");
        System.out.println("Рядок з використанням replace(): " + sb);

        // Реверс рядка
        sb.reverse();
        System.out.println("Реверс рядка: " + sb);

        // Довжина та ємність
        System.out.println("Довжина рядка: " + sb.length());
        System.out.println("Capacity рядка: " + sb.capacity());
    }
}
