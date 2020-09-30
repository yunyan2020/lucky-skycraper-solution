package com.company;

public class Main {

    public static void main(String[] args) {
        var skyScraper = new LuckySkyScraperMemoized(220);
        for(var floor = 1; floor <= 220; floor++){
            System.out.print("floor: " + floor);
            var fakeFloor = skyScraper.toFakeFloor(floor);
            System.out.print("  fake floor: " + fakeFloor);
            var backToRealFloor = skyScraper.toRealFloor(fakeFloor);
            System.out.println("  back to real: " + backToRealFloor);
        }
    }
}
