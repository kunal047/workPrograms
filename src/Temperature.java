/**
 * Created by rusk on 7/8/16.
 */

import java.io.Serializable;

public class Temperature implements Serializable{
    double temp;
    public Temperature(){
        temp = 0.0;
    }

    public double getTemperature(){
        return temp;
    }

    public void setTemperature(double t){
        temp = t;
    }

    public void cToF(){
        temp = temp * (9.0/5.0) + 32.0;
    }

    public void fToC(){
        temp = (temp - 32.0) * (5.0/9.0);
    }
}
