package org.kartik.kbp.codeeval;

import java.io.*;

/**
 * Created by kartikbvarma on 7/26/16.
 */
public class NumberOfOnes {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while((line = buffer.readLine()) != null){
            line = line.trim();
            int number = Integer.parseInt(line);
            String bits = Integer.toBinaryString(number);
            int count =0;
            String c = "1";
            for(int i =0;i<bits.length();i++){
                if(bits.charAt(i) == new Character('1')){
                    count++;
                }
            }

            System.out.println(count);

        }
    }
}
