package ex28;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Scanner;

public class AppTest 
{

    @org.junit.jupiter.api.Test
    void findSum() {
        int sum = 0;
        int[] numbers = {1,2,3,4,5};
        for(int i = 0; i < 5; i++) {
            sum+=numbers[i];
        }
        assertEquals(sum, 15);
    }
}
