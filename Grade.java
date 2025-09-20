// src/main/java/Grade.java
public class Grade {
    // convert numeric score to letter grade
    public String letterGrade(double score) {
        if (score >= 90) return "A";
        if (score >= 80) return "B";
        if (score >= 70) return "C";
        if (score >= 60) return "D";
        return "F";
    }

    // simple GPA calculation from array of scores
    public double average(double[] scores) {
        if (scores == null || scores.length == 0) return 0.0;
        double sum = 0;
        for (double s : scores) sum += s;
        return sum / scores.length;
    }
}
