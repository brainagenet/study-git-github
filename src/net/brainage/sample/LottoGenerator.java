/*
 * (#) net.brainage.sample.LottoGenerator.java
 * Created on 2016-05-14
 */
package net.brainage.sample;

import java.util.Arrays;
import java.util.Random;

/**
 * @author <a href="mailto:ms29.seo@gmail.com">ms29.seo</a>
 */
public class LottoGenerator {

    private Random random = new Random(System.nanoTime());

    public int[] generate() {
        int[] result = new int[6];
        for (int i = 0; i < 6; i++) {
            result[i] = random.nextInt(45) + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] result = new LottoGenerator().generate();
        System.out.println(Arrays.toString(result));
    }
}
