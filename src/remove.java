//public static void sortStudents(ArrayList<Student> studentsToSort) {
//        Student[] sorted = new Student[studentsToSort.size()];
//        sorted[0] = studentsToSort.get(0);
//        double comp = 0;
//        for (int i = 1; i<studentsToSort.size(); i++) {
//        comp = (sorted[i-1].getLastName().compareTo(studentsToSort.get(i).getLastName()));
//        if (comp<0) {
//        sorted[i] = studentsToSort.get(i);
//        } else if (comp>0) {
//        Student old = studentsToSort.get(i-1);
//        sorted[i-1] = studentsToSort.get(i);
//        sorted[i] = old;
//        } else {
//        comp = (sorted[i-1].getFirstName().compareTo(studentsToSort.get(i).getFirstName()));
//        if (comp<0) {
//        sorted[i] = studentsToSort.get(i);
//        } else if (comp>0) {
//        Student old = studentsToSort.get(i-1);
//        sorted[i-1] = studentsToSort.get(i);
//        sorted[i] = old;
//        } else {
//        double ok = (sorted[i-1].getGpa() - studentsToSort.get(i).getGpa());
//        if (ok>0) {
//        sorted[i] = studentsToSort.get(i);
//        } else if (ok<0) {
//        Student old = studentsToSort.get(i-1);
//        sorted[i-1] = studentsToSort.get(i);
//        sorted[i] = old;
//        }
//        }
//        }}
//        for (int i = 0; i<sorted.length; i++) {
//        studentsToSort.set(i, sorted[i]);
//        }
//
//        }


//public static void sortStudents(ArrayList<Student> studentsToSort) {
//        Student[] sorted = new Student[studentsToSort.size()];
//        sorted[0] = studentsToSort.get(0);
//        boolean done = false;
//        double comp = 0;
//
//        while (!done) {
//        for (int i = 1; i < studentsToSort.size(); i++) {
//        comp = (sorted[i - 1].getLastName().compareTo(studentsToSort.get(i).getLastName())); //compare last name
//        if (comp == 0) {
//        comp = (sorted[i - 1].getFirstName().compareTo(studentsToSort.get(i).getFirstName())); //compare first name
//        }
//        if (comp == 0) {
//        comp = (studentsToSort.get(i).getGpa() - sorted[i - 1].getGpa()); //compare GPA
//        }
//
//        if (comp < 0) {
//        sorted[i] = studentsToSort.get(i);
//        } else {
//        Student old = studentsToSort.get(i - 1);
//        sorted[i - 1] = studentsToSort.get(i);
//        sorted[i] = old;
//
//        }
//
//        }
//        }
//
//        for (int i = 0; i<sorted.length; i++) {
//        studentsToSort.set(i, sorted[i]);
//        }
//
//        }


//SORTED:
//        1: Michelle Jones: 98.1
//        2: Chase Bean: 95.2
//        3: Jack Clancy: 97.3
//        4: Chase Bean: 95.2
//        5: Lisa Frank: 92.4
//        6: Marie Angelina: 96.5
//        7: Lisa Frank: 92.4
//        8: Lisa Frank: 99.5
//        9: Peter Frank: 97.9
//        10: Dean Jones: 93.2