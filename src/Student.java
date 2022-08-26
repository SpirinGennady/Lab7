public class Student {
    String firstName;
    String lastName;
    int group;
    double averageMark; // средн€€ оценка
    int scholarship;
    public Student(String firstName,String lastName,int group,double averageMark){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }
    int getScholarship() {
        return scholarship;
    }
    final void setScholarship(int scholarship) {
        if (scholarship<5) System.out.println("80 руб");
        else (scholarship=5) System.out.println("100 руб");
    }

    }


}
