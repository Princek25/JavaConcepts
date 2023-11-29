package com.workspace.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// count how many failed student marks are there. if passing marks is 35.
// collect a list of failed student marks.

public class Marks {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(56);
        marks.add(26);
        marks.add(50);
        marks.add(17);
        marks.add(25);
        marks.add(76);

        long failedStudent = marks.stream().filter(i-> i<35).count();
        System.out.println(failedStudent);

        List<Integer> failedStudentMarks = marks.stream().filter(i->i<35).collect(Collectors.toList());
        System.out.println(failedStudentMarks);
    }
}
