/*
 * (#) net.brainage.sample.LottoGenerator.java
 * Created on 2016-05-14
 */
package net.brainage.sample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author <a href="mailto:ms29.seo@gmail.com">ms29.seo</a>
 */
public class LottoGenerator {

    private Random random = new Random(System.nanoTime());

    public Integer[] generate() {
        Set<Integer> generated = new HashSet<>();
        while (generated.size() < 6) {
            int num = random.nextInt(45) + 1;
            if (!generated.contains(num)) {
                generated.add(num);
            }
        }
        Integer[] results = generated.toArray(new Integer[6]);
        return results;
    }

    public static void main(String[] args) {
        Integer[] result = new LottoGenerator().generate();
        System.out.println(Arrays.toString(result));
    }

}
