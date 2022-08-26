public class Aspirant extends Student {
    String scientific;
    public Aspirant(String firstName, String lastName, int group, double averageMark, String scientific) {
        super(firstName, lastName, group, averageMark);
        this.scientific = scientific;
    }
    int getScholarship() {
        return this.scholarship;
    }
    void setScholarship(int scholarship) {
        if (scholarship < 5) System.out.println("180 руб");
        else (scholarship = 5) System.out.println("200 руб");
    }

    }
}




