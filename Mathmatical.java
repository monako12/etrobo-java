import lejos.nxt.*;
import java.*;
import java.util.Map;
import java.lang.Object;

public class Mathmatical{
    double p_coe;
    double i_coe;
    double d_coe;
    Mathmatical(double p_coe,double i_coe,double d_coe){
        this.p_coe = p;
        this.i_coe = i;
        this.d_coe = d;

    }
    public double pid(int ava,double cur){
        double p,i,d;
        double delta_t = 2;
        double diff[] = new double[3];
        double integral = 0;
        diff[0] = diff[1];
        diff[1] = cur - ava;
        integral += (diff[1] + diff[0])/2*delta_t;
        p = p_coe*diff[1];
        i = i_coe*integral;
        d = d_coe*(diff[1]-diff[0])/delta_t;
        cur = p+i+d;
        cur2 = p/2+i+d;
        return cur;
    }
}