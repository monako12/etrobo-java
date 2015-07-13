import lejos.nxt.*;
import java.*;
import java.util.Map;
import java.lang.Object;

public class Mathmatical{
    double p_coe;
    double i_coe;
    double d_coe;
    int a;
    Mathmatical(double p_coe,double i_coe,double d_coe,int a){
        this.p_coe = p_coe;
        this.i_coe = i_coe;
        this.d_coe = d_coe;
        this.a = a;
    }
    public double pid(int ava,double cur){
        double p,i,d;
        double delta_t = 2;
        double diff[] = new double[3];
        double integral = 0;
        double cur2;
        diff[0] = diff[1];
        diff[1] = cur - ava;
        integral += (diff[1] + diff[0])/2*delta_t;
        p = p_coe*diff[1];
        i = i_coe*integral;
        d = d_coe*(diff[1]-diff[0])/delta_t;
        if(a == 1) {
            cur = p + i + d;
        }else {
            cur = p / 2 + i + d;
        }
        return cur;
    }
}
