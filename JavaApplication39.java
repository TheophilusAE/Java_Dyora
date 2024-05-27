package javaapplication39;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaApplication39 {
    static ArrayList<Food> foodList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int choose;
        String type;
        String name;
        double calories = 0;
        int price = 0;
        boolean exit = false;

        System.out.println("Food Order");
        System.out.println("====");

        while (!exit) {
            System.out.println("1. Insert new food");
            System.out.println("2. List of food");
            System.out.println("3. Search food");
            System.out.println("4. Delete food");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            choose = scn.nextInt();
            scn.nextLine(); // Consume newline

            switch (choose) {
                case 1:
                    do {
                        System.out.print("Input food's type [Appetizer | Main Course | Dessert]: ");
                        type = scn.nextLine().toLowerCase(); // Convert to lowercase
                    } while (!type.equals("appetizer") && !type.equals("main course") && !type.equals("dessert"));

                    do {
                        System.out.print("Input food's name [3-20]: ");
                        name = scn.nextLine();
                    } while (name.length() < 3 || name.length() > 20);

                    do {
                        System.out.print("Input food's calories [1.0..4.0]: ");
                        calories = scn.nextDouble();
                    } while (calories < 1.0 || calories > 4.0);

                    do {
                        System.out.print("Input food's price:[10000..50000] ");
                        price = scn.nextInt();
                    } while (price < 10000 || price > 50000);
                    
                    scn.nextLine(); // Consume newline
                    foodList.add(new Food(type, name, calories, price));
                    System.out.println("Data has been successfully inserted!");
                    break;
                
                case 2:
                    if (foodList.isEmpty()) {
                        System.out.println("No food items available.");
                    } else {
                        System.out.println("List of Food:");
                        System.out.println("=============");
                        for (int i = 0; i < foodList.size(); i++) {
                            Food food = foodList.get(i);
                            System.out.println("Type: " + food.getType());
                            System.out.println("Name: " + food.getName());
                            System.out.println("Calories: " + food.getCalories());
                            System.out.println("Price: " + food.getPrice());
                            System.out.println("---------------------");
                        }
                    }
                    break;

                case 5:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please choose again.");
                    break;
            }
        }
    }
}

class Food {
    private String type;
    private String name;
    private double calories;
    private int price;

    public Food(String type, String name, double calories, int price) {
        this.type = type;
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}