// packages are container fr classes...to keep classes names compartment wise
// its just a folder
// normally it isnt alloweed to keep 2 files with same name in one folder so we use packages it allows that...so can keep these files in separate packages but same folder
//packages are strored in hierarchical manner .... for visibility...for class names etc
package com.company.a; // it actually gives us the path of the file 

import static com.company.b.msg.message; // to use all the items from this file which are declared public cant use private items 
public class greetings {
    public static void main(String[] args) {
        System.out.println("hello world");
        message(); // to use the code from diff package import it 
        
    }  
}
