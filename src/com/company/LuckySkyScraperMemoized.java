package com.company;
import java.util.*;

public class LuckySkyScraperMemoized {

    private ArrayList<Integer> fakeFloorNumbers = new ArrayList<>();

    public LuckySkyScraperMemoized(int numberOfRealFloors){
        // calculate and memoize all fakeFloorNumbers
        // "build a skyscraper as tall of numberOfRealFloors
        // and remember every fake floor number in fakeFloorNumber
        var fakeFloorNo = 1;
        for(var realFloor = 1; realFloor <= numberOfRealFloors; realFloor++){
            fakeFloorNumbers.add(fakeFloorNo);
            do {
                fakeFloorNo++;
            } while(fakeFloorNo % 10 == 4 || fakeFloorNo % 100 == 13);
        }
    }
   //method about how to change fakeFloor to RealFloor
    public int toRealFloor(int fakeFloor){
        return fakeFloorNumbers.indexOf(fakeFloor) + 1;
    }

    //method about how change realFloor to FakeFloor
    public int toFakeFloor(int realFloor){
        return fakeFloorNumbers.get(realFloor - 1);
    }

}
