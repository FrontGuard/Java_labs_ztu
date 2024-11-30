package com.education.ztu;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Task5Localization {
    public static void executeTask(Locale locale) {
        try {
            ResourceBundle bundle = ResourceBundle.getBundle("data", locale);
            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);

            System.out.println(bundle.getString("header"));
            System.out.println(bundle.getString("date"));
            System.out.println(bundle.getString("line_separator"));
            System.out.printf("%-5s %-20s %-15s %-10s%n",
                    bundle.getString("item_no"),
                    bundle.getString("item_name"),
                    bundle.getString("category"),
                    bundle.getString("price"));

            System.out.println(bundle.getString("line_separator"));

            double total = 0;
            for (int i = 1; i <= 10; i++) {
                String itemName = bundle.getString("item_" + i);
                String category = bundle.getString("category_" + i);
                double price = Double.parseDouble(bundle.getString("price_" + i));
                total += price;
                System.out.printf("%-5d %-20s %-15s %-10s%n",
                        i, itemName, category, currencyFormat.format(price));
            }

            System.out.println(bundle.getString("line_separator"));
            System.out.printf("%s: %s%n", bundle.getString("total"), currencyFormat.format(total));
        } catch (MissingResourceException e) {
            System.err.println("Помилка: відсутній ресурс або ключ - " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Помилка форматування числа: " + e.getMessage());
        }
    }
}
