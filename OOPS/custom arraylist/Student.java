//comparison obj
//public class CompareObj implements Comparable..(its an interface)
//interace can alao be of generic typre...eg - Comparable<T>
// see kunal kushwaha notes 

// even while sorting it might get confused on what basis u want to asort ...so comparablr is required ....along with compareto method
//can use comparator<>..along with compare funct 
public class Student implements Comparable<Student> { // type is student only coz we want to compare the student
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) { // overrides the method of comparable interface
        int diff = (int) (this.marks - o.marks); // we are specifying to compare the marks parameter
        return diff;
        // if diff =0 ..both are equal
        // if diff<1...o is bigger
        // if diff>1. else o is smaller
    }

    public static void main(String[] args) {

        Student kunal = new Student(23, 67f);
        Student rahul = new Student(5, 99.6f);

        if (kunal.compareTo(rahul) < 0) {
            System.out.println("Rahul has more marks");
        }

    }
}
