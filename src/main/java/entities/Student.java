package entities;

public class Student {

    public String name;
    public double noteOne;
    public double noteTwo;
    public double noteThree;

    public double finalGrade() {
        return (noteOne + noteTwo + noteThree);
    }

    public double pointMissing() {
        if (finalGrade() > 60) {
            return 0.0;
        } else {
            return 60.0 - finalGrade();
        }
    }

    @Override
    public String toString() {
        return name
                + ", "
                + "FINAL GRADE = "
                + String.format("%.2f", finalGrade());
    }
}
