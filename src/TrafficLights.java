//package com.project.trafficlights;

import java.util.Scanner;

public class TrafficLights {

    public static void main(String[] args) {
        System.out.print("Input minutes: ");
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        System.out.println(getColorOfTrafficLights(min  ));
    }

    static String getColorOfTrafficLights(int min) {
        if (min < 0) {
            throw new IllegalArgumentException("Minutes cant be negative.");
        }
        int trafficLights;
        trafficLights = min % 10;
        if (trafficLights >= 0 && trafficLights < 2) {
            return "red";
        } else if (trafficLights >= 2 && trafficLights < 5) {
            return "yellow";
        } else {
            return "green";
        }
    }
}

