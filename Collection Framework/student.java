import java.util.Objects;

public class student implements Comparable<student> {

    String name;
    int no;

    public student(String name, int no) {
        this.name = name;
        this.no = no;
    }

    // generated code

    @Override
    public String toString() {
        return "student{" + "name = " + name + " ," + "no = " + no + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        student s = (student) o;
        return no == s.no;
    }

    @Override
    public int hashCode() {
        return Objects.hash(no);
    }

    public int compareTo(student that) {
        // return this.no - that.no; // will return + or - (true/false) // sort list acc to rollno
        return this.name.compareTo(that.name); // sort list acc to names
    }

}
