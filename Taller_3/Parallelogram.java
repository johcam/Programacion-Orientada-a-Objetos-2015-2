/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B;

/**
 *
 * @author Johan
 */
public class Parallelogram extends Shapes{
    double width=1;
    void parallelogram (double lenght, double width){
        this.lenght=lenght;
        this.width=width;
        double are;
        double per;
        are=lenght*width;
        this.area=are;
        per=(2*lenght)+(2*width);
        this.perimeter=per;
    }
    
    double getArea(){
        double are;
        are=lenght*width;
        area=are;
        return area;
    }
    
    double getPerimeter(){
        double per;
        per=(2*lenght)+(2*width);
        perimeter=per;
        return perimeter;
    }
}
