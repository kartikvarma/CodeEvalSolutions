package org.kartik.kbp.codeeval;

import com.sun.javafx.scene.control.skin.VirtualFlow;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by kartikbvarma on 8/7/16.
 */
public class HighestScore {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            StringTokenizer splitIntialArray = new StringTokenizer(line,"|");


            List<String[]> columnsList = new ArrayList<>();

            while (splitIntialArray.hasMoreElements())
            {
                columnsList.add(splitIntialArray.nextToken().trim().split(" "));
            }

            int row = 0;
            int clm = 0;

            StringBuilder stringBuilder = new StringBuilder();

            int x = 0;


            for(String[] stArray : columnsList){
                for(String s : stArray){
                    
                    row++;
                }

                clm++;
                row = 0;


            }

            System.out.println(stringBuilder.toString());


        }
    }
}
