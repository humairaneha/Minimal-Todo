package Main;

public class File {

    public:
       int i;
    int j;
    String A;

    public File(String a) {
        A = a;
    }

    public File(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setJ(int j) {
        this.j = j;
    }
}

