package org.kartik.kbp.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by kartikbvarma on 8/4/16.
 */
public class SimpleSorting {

    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            String[] charInts = line.split(" ");
            List<Double> doubles = new ArrayList<>();
            for (String charInt : charInts) {
                doubles.add(Double.parseDouble(charInt));
            }
            Collections.sort(doubles, (o1, o2) -> o1.compareTo(o2));

            StringBuilder sb = new StringBuilder();
            for(Double d : doubles){
                sb.append(String.format("%.3f",d)).append(" ");
            }

            System.out.println(sb.toString());
        }
    }

}
