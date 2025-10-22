//given a no n tell if its happy no or not 
// take no n and replace it with sum of sq of its digits 
//eg - 19 - 1 + 81 = 82..
//82 -> 64+4=68
//68-> 36+64=100....
//100->1+0+0=1...ans...its a happy no
//repeat this until n = 1(no bcomes 1)

//if it doesnt becomes 1 it will keep moving endlessly in a cycle
//eg - for 12 .....at a point we get 8sq+9sq.....after some point again we get 8sq+9sq....means its moving in a loop
//for 12-> 5-25-29-89-145-42-20-4-16-37-58-89...it goes in loop ppoints back at 89....so use cycle method
//ques ...when to stop?

//it uses ll cycle
//use s and f ...if at a aprticular point f and s meets so cycle found ..not a happy no
//use a separate method to get sum of sq of no
public class HappyNo {
    public boolean isHappy(int n){
        //s and f starts from n 
        int slow = n;
        int fast = n;
        //run this atleast once
        do{
            slow = findSq(slow); //find sqonce
            fast= findSq(findSq(fast)); //find sq 2 times 

        }while(fast!=slow);
        if(slow==1){
            return true;
        }
        return false;

    }

    private int findSq(int n){
        int ans = 0;
        while(n>0){
            int r = n%10;
            n = n/10;
            ans+=r*r;
        }
        return ans;
    }
}
