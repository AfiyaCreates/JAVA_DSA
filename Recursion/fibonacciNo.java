//fibonacci no - o 1 1 2 3 5 8 13 ....
// 1+1=2..2+1=3..3+2=5..
// apply recursion - when a prob can be broken down into similar sub prob 
//fb(n)= fb(n-1)+fb(n-2)
// when u write recursion in a formula it is called the recurrence relation
//the base condition is represented by the ans we already have
//fb(0)=0..fb(1)=1

// how to slve
//identify if u can break down prob in smaller prob
//write the recursion eq if needed
//draw recursive tree
//about thr tree
// see the flow of func how they are getting in stack 
//identify and focus on left ree calls and right tree calls 
// see how te values and what type of values are returned at each step...and see when the func will come out of stack




public class fibonacciNo {

    static int fb(int n){
        if(n<2){                         // base condition
            return n;                    //int fb(0)=0;....int fb(1)=1
        }
       return fb(n-1)+fb(n-2);  //this is not tail recusion
    }
    public static void main(String[] args) {
       System.out.println(fb(6));  // return 6th fb no...8
        
    }
}
