
import java.util.Scanner;



/*
 * Copyright 2015 tbking.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 *
 * @author tbking
 */
public class waterjug {
    Scanner scan=new Scanner(System.in);
    int maxA,maxB,desA,desB,a,b;
    
    
    public static void main(String args[])
    {
        System.out.println("*** Water Jug ***\n\n");
        waterjug jug=new waterjug();
        jug.input();
        jug.mix();
    }
    
    
    void input()
    {
        System.out.println("Enter the capacity of the bigger jug.");
        maxA=scan.nextInt();
        System.out.println("Enter the capacity of the smaller jug.");
        maxB=scan.nextInt();
        desA=maxA+1;
        desB=maxB+1;
        while(desA>maxA || desB>maxB)
        {
            System.out.println("Enter the desired water in the bigger jug.");
            desA=scan.nextInt();
            System.out.println("Enter the desired water in the smaller jug.");
            desB=scan.nextInt(); 
        }
    }
    void mix()
    {
        a=0;
        b=0;
        
        while(a!=desA || b!=desB)
        {
            if(b==0)
            {
                fillB();
                System.out.println(+a+","+b);
            }
            else if(a<maxA && b>0)
            {
                B2A();
                System.out.println(a+","+b);
            }
            else if(a==maxA)
            {
                emptyA();
                System.out.println(a+","+b);
            }
        }
    }
    
    void fillB()
    {
        b=maxB;
    }
    
    void B2A()
    {
        int diff=maxA-a;
        while(a!=maxA && b!=0)
        {
            a++;
            b--;
        }
    }
    
    void emptyA()
    {
        a=0;
    }
}