// if u want 4 on a die ..what are the possible combinations
//{1 2 3 4 5 6}...4 13 22 121
//follow the same taking somthig and ignoring something principle
// we see to find the combinations numbers <= 4 will be considered no/remaining
//eg take 1/3 2/2 3/1 4/0 
// for 1/3...11/2 12/1 13/0  (1 already there look for 3)...


public class diceThrow {

    static void dice(int target, String ans ){
        if(target==0){
            System.out.print(ans + " ");
            return;
        }
        for(int i=1;i<=6 && i<=target;i++){
            dice(target-i, ans+i); //reduce target by i not by 1 ...earlier for 4 now for 3 (combinations with 3 to achieve 4)....

        }  

    }
    public static void main(String[] args) {
        dice(4," ");
    }
    
}
