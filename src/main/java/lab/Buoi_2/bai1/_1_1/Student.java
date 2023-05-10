package lab.Buoi_2.bai1._1_1;

public class Student extends Person{
    private String program;
    private int year;
    private double score;

    public Student(String name, String address, String program, int year, double score) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.score = score;
    }

    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }

    public double getScore() {
        return score;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getRating() {
        return null;
    }
}
