package org.juliana.matovu;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class PrintService {

    PrintFormatHelper obj; //embellishes string
    PrintClient obj2; //prints string to console
    @Inject
    public PrintService(PrintFormatHelper obj, PrintClient obj2){
        this.obj = obj;
        this.obj2 = obj2;
    }
    public void calledString(){
        String name = "Hannah";
        String embellishedString = obj.embellish(name);
        obj2.printIt(embellishedString);
    }


}
