package com.ita.u1.firstWebAppl.dao;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReader implements Readable {
    
    @Override
    public List<Integer> getList(){
        
        final int carriageReturnSymbol = 13;
        final int newLineSymbol = 10;
        final String pathToFileWithNumbers = "C:\\Users\\anton\\Desktop\\firstWebProject\\FirstWebAppl\\src\\resources\\input.txt";
    
        List<Integer> list = new ArrayList<>();
    
        int symbol = 0;
        String number = "";

        try(FileInputStream fileInputStream = new FileInputStream(pathToFileWithNumbers);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8")){

            while((symbol = inputStreamReader.read()) != -1){                    
                if(symbol != newLineSymbol && symbol != carriageReturnSymbol) {
                    number = number + (char)symbol;
                }
            
                if(symbol == newLineSymbol) {
                    list.add(Integer.parseInt(number));
                    number = "";
                }
            }
        
            list.add(Integer.parseInt(number));

        } catch (IOException e) {
            e.printStackTrace();
        }
    
        return list;    
    }
}
