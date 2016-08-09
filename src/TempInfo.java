/**
 * Created by rusk on 7/8/16.
 */

import java.beans.*;
import java.lang.reflect.Method;

public class TempInfo extends SimpleBeanInfo{

    public PropertyDescriptor[] getPropertyDescriptor(){
        try {
            PropertyDescriptor temp = new PropertyDescriptor("temp", Temperature.class);
            PropertyDescriptor pd[] = {temp};
            return pd;
        } catch (IntrospectionException e) {
            System.out.println("Exception Thrown.");
        }
        return null;
    }

    public MethodDescriptor[] getMethodDescriptor(){
        try {
            Class cl = Temperature.class;
            Class args[] = { };
            Method cToF = cl.getMethod("cToF", args);
            MethodDescriptor cToFDesc = new
                    MethodDescriptor(cToF);
            cToFDesc.setShortDescription("Convert Celsius to Fahrenheit");

            Method fToC = cl.getMethod("fToC", args);
            MethodDescriptor fToCDesc = new
                    MethodDescriptor(fToC);
            fToCDesc.setShortDescription("Convert Fahrenheit to Celcius");
            MethodDescriptor[] md = {cToFDesc, fToCDesc};
            return md;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }
}
