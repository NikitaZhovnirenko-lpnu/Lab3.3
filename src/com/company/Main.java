// Lab_03_3
// Жовніренко Нікіта
// Лабораторна робота No 3.3
// Розгалуження, задане графіком функції.
// Варіант 5

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        double x;
        double R;

        double y;

        String result = "";

        System.out.println("Введіть аргумент Х: ");
        x = sc.nextDouble();

        System.out.println("Введіть параметр R: " );
        R = sc.nextDouble();

        if (x <= 2)
        {
        y = x + 3;
        result = "\"За даного аргументу: "+ x +", та параметру " + R + ", значення Y дорівнює: " + y;
        }

        else if(x > -2 && x <= 4)
        {
        y = -0.5 * x;
        result = "\"За даного аргументу: " + x + ", та параметру " + R + ", значення Y дорівнює: " + y;
        }

        else if(x > 4 && x <= 8 - R)
        {
        y = -R;
        result = "\"За даного аргументу: " + x + ", та параметру " + R + ", значення Y дорівнює: " + y;

        }

        else if(x > 8 - R && x <= 8 + R)
        {
        y = Math.sqrt(Math.pow(R, 2) - Math.pow(x - 8, 2)) - R;
        result = "\"За даного аргументу: " + x + ", та параметру " + R + ", значення Y дорівнює: " + y;
        }

        else
        {
        y = -R;
        result = "\"За даного аргументу: " + x + ", та параметру " + R + ", значення Y дорівнює: " + y;
        }



        System.out.println(result);

        if (x <= 2)
        {
            y = x + 3;
            result = "\"За даного аргументу: "+ x +", та параметру " + R + ", значення Y дорівнює: " + y;

        }
        else
        {
            if (x > 8 + R)
            {
                y = -R;
                result = "\"За даного аргументу: " + x + ", та параметру " + R + ", значення Y дорівнює: " + y;
            }
            else
            {
                if (x > -2)
                {
                    if (x <= 4)
                    {
                        y = -0.5 * x;
                        result = "\"За даного аргументу: " + x + ", та параметру " + R + ", значення Y дорівнює: " + y;
                    }
                }
                else
                {
                    if (x > 4)
                    {
                        if(x <= 8 - R)
                        {
                            y = -R;
                            result = "\"За даного аргументу: " + x + ", та параметру " + R + ", значення Y дорівнює: " + y;
                        }
                    }
                    else
                    {
                        if(x > 8 - R)
                        {
                            if(x <= 8 + R)
                            {
                                y = Math.sqrt(Math.pow(R, 2) - Math.pow(x - 8, 2)) - R;
                                result = "\"За даного аргументу: " + x + ", та параметру " + R + ", значення Y дорівнює: " + y;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(result);



    }
}
