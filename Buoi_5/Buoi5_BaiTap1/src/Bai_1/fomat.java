### Bài 3:Sử dụng từ khóa throw
        #### a)Ném ra ngoại lệ nhưng không xử lý
```java
public class TestThrow1 {
    static void validate(int age) {
        if (age < 18)
            throw new ArithmeticException("not valid");
        else
            System.out.println("welcome");
    }

    public static void main(String[] args) {
        validate(13);
        System.out.println("rest of the code...");
    }
}
```
#### b)Ném ra ngoại lệ nhưng có xử lý
```java
public class TestThrow2 {
    static void validate(int age) {
        try {
            if (age < 18)
                throw new ArithmeticException("not valid");
            else
                System.out.println("welcome");
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        validate(13);
        System.out.println("rest of the code...");
    }
}
```
### Bài 4:Sử dụng từ khóa throws
#### a)Ví dụ phương thức dùng throws ném trả về ngoại lệ checked
```java
import java.io.IOException;

public class TestThrows1 {
    public static void main(String[] args) {
        TestThrows1 obj = new TestThrows1();
        obj.p();
        System.out.println("luong binh thuong...");
    }

    void m() throws IOException {
        throw new IOException("Loi thiet bi");// checked exception
    }

    void n() throws IOException {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("ngoai le duoc xu ly");
        }
    }
}
```
