package com.education.ztu;

import java.util.Formatter;
import java.util.Locale;

public class Task4Formatter {

    public static void executeTask() {
        Formatter formatter = new Formatter();
        Locale locale = new Locale("uk", "UA");

        String[] products = {
                "Джинси", "Жіночий одяг", "1500.78",
                "Спідниця", "Жіночий одяг", "1000.56",
                "Краватка", "Чоловічий одяг", "500.78",
                "Футболка", "Чоловічий одяг", "300.50",
                "Сорочка", "Чоловічий одяг", "750.30",
                "Сукня", "Жіночий одяг", "2500.10",
                "Шорти", "Чоловічий одяг", "600.45",
                "Блузка", "Жіночий одяг", "800.20",
                "Пальто", "Жіночий одяг", "3500.75",
                "Штани", "Чоловічий одяг", "1300.99"
        };

        double total = 0.0;
        formatter.format("Дата та час покупки: %1$td.%1$tm.%1$tY %1$tH:%1$tM:%1$tS%n", java.util.Calendar.getInstance());
        formatter.format("===========================================%n");
        formatter.format("%-4s %-12s %-15s %10s%n", "№", "Товар", "Категорія", "Ціна");
        formatter.format("===========================================%n");

        for (int i = 0; i < products.length; i += 3) {
            int index = i / 3 + 1;
            String productName = products[i];
            String category = products[i + 1];
            double price = Double.parseDouble(products[i + 2]);
            total += price;

            formatter.format(locale, "%-4d %-12s %-15s %10.2f ₴%n", index, productName, category, price);
        }

        formatter.format("===========================================%n");
        formatter.format(locale, "Разом: %33.2f ₴%n", total);

        System.out.println(formatter);
        formatter.close();
    }
}
