public class GrasshopperGradeBook {
    public static void main(String[] args) {

        //https://www.codewars.com/kata/55cbd4ba903825f7970000f5/train/java
        int s1 = 70, s2 = 70, s3 = 71;

        int average = (s1 + s2 + s3) / 3;
        System.out.println(average);
        char result = 'F';
        if (average >= 90) {
            result = 'A';
        } else if (average >= 80) {
            result = 'B';
        } else if (average >= 70) {
            result = 'C';
        } else if (average >= 60) {
            result = 'D';
        }
        //return result;
        //tests2
    }
}
