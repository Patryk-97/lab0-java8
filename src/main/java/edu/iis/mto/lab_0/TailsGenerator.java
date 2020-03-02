package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        List<String> tailList = new ArrayList<>(value.length());
        StringBuilder sB = new StringBuilder(value);
        for(int i = value.length() - 1; i >= 0; i--)
        {
        	tailList.add(sB.toString());
        	sB.deleteCharAt(0);
        }
        tailList.add("");
        return tailList;
    }

}
