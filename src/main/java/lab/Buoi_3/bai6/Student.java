package lab.Buoi_3.bai6;

public class Student {
    private int id;
    private String name;
    private double score;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) throws MyScoreException {
        if(score < 0 || score > 100 ) {
            throw  new MyScoreException("Diem khong hop le: [1-99]");
        }
        this.score = score;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        double  score = 9;
        try {
            s1.setScore(score);
        } catch (MyScoreException e) {
            System.out.println(e.getMessage());
        }
    }
}
