//find the position of the right most set bit ...the first 1 from rhs
//see ss
//eg - 101101100 - ans = 3
//can write as - 101101 1 00...a1b...a=101101 and b =00
//we have to make a =0 ..so take... (complement of a)1b
// n = a1b ...-n = (complement of a)1b
//ans = n & -n 

public class Q7 {
    public static void main(String[] args) {
        
    }
}
