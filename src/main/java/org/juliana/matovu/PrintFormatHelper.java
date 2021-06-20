package org.juliana.matovu;

import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class PrintFormatHelper {


    public String embellish(String simpleString){
        return "Hello, " + simpleString +"\nIf this is your first time here, please sign up!!!";
    }



}
