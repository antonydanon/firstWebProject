/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author anton
 */
public class Logic {

public static ArrayList<Integer> getList(){
    
    ArrayList<Integer> list = new ArrayList<>();
    
    int c = 0;
    String s = new String("");

    try(FileInputStream fis = new FileInputStream("C:\\Users\\anton\\Desktop\\iTechArt\\task_1\\FirstWebAppl\\test\\textFiles\\Input.txt");
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8")){

        while((c = isr.read()) != -1){                    
            if(c != 10 && c != 13) {
                s = s + (char)c;
            }
            
            if(c == 10) {
                list.add(Integer.parseInt(s));
                s = "";
            }
        }
        
        list.add(Integer.parseInt(s));

    } catch (IOException e) {
        e.printStackTrace();
    }
    
    return list;
    
}
    
}
