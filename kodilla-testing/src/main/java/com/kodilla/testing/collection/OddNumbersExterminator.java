package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {

        int tempNum;
        List<Integer> newList1 = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            tempNum = numbers.get(i) % 2;
            if (tempNum == 0) {
                newList1.add(numbers.get(i));
            }
        }
        return newList1;
    }
}





