package com.ita.u1.firstWebAppl.service;

import java.util.Collections;
import java.util.List;

public class Sorter implements Sortable{
    
    @Override
    public List<Integer> sort(List<Integer> list){
        Collections.sort(list);
        return list;
    }
}
