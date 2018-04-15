package dj;

import localmath.*;

public class Main {
    
    public static void main(String[] args) {
        int ln = Integer.parseInt(args[0]);
        int wd = Integer.parseInt(args[1])	
        Ops m1 = new Ops();
        Rectangle rc = new Rectangle(ln, wd);
		System.out.println("Square of first argument is : " + m1.square(ln));
		
		System.out.println("Lenght of Rectangle is : " + rc.lenght)
		System.out.println("Width of Rectangle is : " + rc.width)
		System.out.println("Perimeter of Rectangle is : " + rc.getPerimeter())
		System.out.println("Area of Rectangle is : " + rc.getArea())
    }       
}



