package org.example;

public class Main {
    public static void main(String[] args) {
        // n1
        double price = 150;

        if (price >= 100) {
            price = price - price * 10 / 100;
        }

        System.out.println("საბოლოო ფასი: " + price);


        // n2
        String correctUsername = "taks";
        String correctPassword = "pirvelidavalebaaa";

        String username = "taks";
        String password = "pirvelidavalebaaa";

        if (username.equals(correctUsername)
                && password.equals(correctPassword)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid username or password");
        }


        // n3
        int[] testResults = {1, 0, 1, 1, 0};

        int passed = 0;
        int failed = 0;

        for (int i = 0; i < testResults.length; i++) {
            if (testResults[i] == 1) {
                passed++;
            } else if (testResults[i] == 0) {
                failed++;
            }
        }

        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);


        // n4
        String status = "NEW";

        switch (status) {
            case "NEW":
                System.out.println("Order received");
                break;

            case "PROCESSING":
                System.out.println("Order is being prepared");
                break;

            case "SHIPPED":
                System.out.println("Order is on the way");
                break;

            case "DELIVERED":
                System.out.println("Order delivered");
                break;

            default:
                System.out.println("Unknown status");
                break;
        }


        // n5
        String text = "Hello Java";
        String lowerText = text.toLowerCase();

        int vowelCount = 0;

        for (int i = 0; i < lowerText.length(); i++) {
            char letter = lowerText.charAt(i);

            if (letter == 'a' || letter == 'e'
                    || letter == 'i' || letter == 'o'
                    || letter == 'u') {
                vowelCount++;
            }
        }

        System.out.println("ხმოვნების რაოდენობა: " + vowelCount);
        System.out.println("სტრინგის სიგრძე: " + text.length());

        if (text.length() % 2 == 0) {
            System.out.println("ლუწი");
        } else {
            System.out.println("კენტი");
        }
    }
}
