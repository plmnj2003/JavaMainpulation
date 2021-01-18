package javamanipulation.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoinTest {

    @Test
    public  void isFull() {
        Moim moim = new Moim();
        moim.maxNumberOfAttendes =100;
        moim.numberOfEnrolled =10;
        Assertions.assertFalse(moim.isEnrollment());

    }
}
