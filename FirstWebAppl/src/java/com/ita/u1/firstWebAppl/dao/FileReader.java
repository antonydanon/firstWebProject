package com.ita.u1.firstWebAppl.dao;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReader implements Readable {
    
    @Override
    public List<Integer> getList(){
    
        List<Integer> list = new ArrayList<>();
    
        int c = 0;
        String s = "";

        try(FileInputStream fis = new FileInputStream("C:\\Users\\anton\\Desktop\\firstWebProject\\FirstWebAppl\\src\\resources\\input.txt");
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
