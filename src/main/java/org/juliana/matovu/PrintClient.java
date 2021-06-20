package org.juliana.matovu;

import javax.inject.Named;

@Named
public class PrintClient {

    public void printIt(String printTheString){
        System.out.println(printTheString);
    }
}
