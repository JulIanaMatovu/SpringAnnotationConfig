package org.juliana.matovu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringBeans.xml");
        PrintService obj = (PrintService) ctx.getBean("printService");
        obj.calledString();


//        PrintFormatHelper obj1 = ctx.getBean("printFormatHelper", PrintFormatHelper.class);
//        obj1.reverseString();

    }
}
