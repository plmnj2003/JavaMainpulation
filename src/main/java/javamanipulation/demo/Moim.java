package javamanipulation.demo;

public class Moim {
    int maxNumberOfAttendes;
    int numberOfEnrolled;


    public boolean isEnrollment() {
        if (maxNumberOfAttendes == 0) {
            return false;
        }

        if (numberOfEnrolled < maxNumberOfAttendes) {
            return false;
        }

        return true;
    }

}
