package org.kartik.kbp.codeeval;

import java.io.*;
import java.util.*;

/**
 * Created by kartikbvarma on 7/26/16.
 */
public class LongestLine {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;

        Map<Integer, List<String>> map = new HashMap<>();

        List<String> st = null;

        int i = 0;

        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            if (isInteger(line)) {

                if (i > 0) {

                    map.put(i, st);
                    printString(map);
                    map = new HashMap<>();
                    st = new ArrayList<>();
                    i = Integer.parseInt(line);

                } else {
                    i = Integer.parseInt(line);
                    st = new ArrayList<>();
                }

            } else {
                st.add(line);
            }

        }
    }


    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static void printString(Map<Integer, List<String>> map) {
        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            int maxArraySize = entry.getKey();
            List<String> listAlpha = entry.getValue();
            if (listAlpha.size() < maxArraySize) {
                maxArraySize = listAlpha.size();
            }
            Collections.sort(listAlpha, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    Integer i1 = o1.length();
                    Integer i2 = o2.length();

                    return i2.compareTo(i1);
                }
            });
            if (!listAlpha.isEmpty()) {
                for (int x = 0; x < maxArraySize; x++) {
                    if (listAlpha.get(x) != null) {
                        System.out.println(listAlpha.get(x));
                    }
                }
            }
        }
    }
}
