//printing  inverted star pattern ...see notes.ss

public class pattern{

    //inverted triangle

    // static void star(int r,int c){
    //     if(r==0){
    //         return;
    //     }
    //     if(c<r){
    //         System.out.print( "* "); // keeps printing star while the col<row
    //         star(r,c+1);
    //     }
    //     else{   //when c==r or c>r
    //         System.out.println(); // to print a new line
    //          star(r-1,0);  // as soon as col==row moves to next row ....r-1..coz we are starting with n rows 
    //     }
    // }

    // proper triangle
    // will print while returning ...

    static void star(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            star(r,c+1); // First print stars for the current row
            System.out.print( "* "); // keeps printing star while the col<row
        }
        else{   //when c==r or c>r
            star(r-1,0);  // as soon as col==row moves to next row ....r-1..coz we are starting with n rows 
            System.out.println(); // to print a new line
            
        }
    }

    public static void main(String[] args) {
        star(4, 0);
    }
}