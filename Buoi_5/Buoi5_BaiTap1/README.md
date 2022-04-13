## BÀI TẬP 1: NGOẠI LỆ VÀ XỬ LÝ NGOẠI LỆ

### Bài 1: Sử dụng try…catch
#### a) Một try nhiều catch
_Ví dụ 1:_
```java
public class TestMultipleCatchBlock {
    public static void main(String[] args) {
        try {
            int[] a = new int[5];
            a[5] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("task1 is completed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("task 2 completed");
        } catch (Exception e) {
            System.out.println("common task completed");
        }
        System.out.println("rest of the code...");
    }
}
```

_Ví dụ 2:_
```java
public class MultipleCatchBlock2 {
    public static void main(String[] args) {

        try {
            int[] a = new int[5];

            System.out.println(a[10]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }
}
```

_Ví dụ 3:_
```java
class MultipleCatchBlock5 {
    public static void main(String[] args) {
        try {
            int[] a = new int[5];
            a[5] = 30 / 0;
        } catch (Exception e) {
            System.out.println("common task completed");
        } catch (ArithmeticException e) {
            System.out.println("task1 is completed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("task 2 completed");
        }
        System.out.println("rest of the code...");
    }
}
```

#### b) Sử dụng try…catch lồng nhau:
_Ví dụ 1:_
```java
public class TestException {
    public static void main(String[] args) {
        try {
            try {
                System.out.println("Thuc hien phep chia");
                int b = 39 / 0;
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            try {
                int[] a = new int[5];
                a[5] = 4;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            System.out.println("khoi lenh khac");
        } catch (Exception e) {
            System.out.println("xy ly ngoai le");
        }
        System.out.println("tiep tuc chuong trinh..");
    }
}
```

_Ví dụ 2:_
```java
class Excep6{
    public static void main(String args[]){
        try{
            try{
                System.out.println("going to divide");
                int b =39/0;
            }catch(ArithmeticException e){System.out.println(e);}

            try{
                int a[]=new int[5];
                a[5]=4;
            }catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}

            System.out.println("other statement);
        }catch(Exception e){System.out.println("handeled");}

        System.out.println("normal flow..");
    }
} 
```

### Bài 2: Sử dụng finally
#### a) Sử dụng finally khi ngoại lệ không xẩy ra
```java
public class TestFinallyBlock {
    public static void main(String[] args) {
        try {
            int data = 25 / 5;
            System.out.println(data);
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code...");
    }
}
```

#### b) Sử dụng finally khi ngoại lệ xẩy ra nhưng không xử lý
```java
public class TestFinallyBlock1 {
    public static void main(String args[]) {
        try {
            int data = 25 / 0;
            System.out.println(data);
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code...");
    }
}
```

#### c)Sử dụng khối lệnh finally nơi ngoại lệ xảy ra và được xử lý.
```java
public class TestFinallyBlock2 {
    public static void main(String[] args) {
        try {
            int data = 25 / 0;
            System.out.println(data);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code...");
    }
}
```

#### d)Sử dụng khối lệnh finally trong trường hợp trong khối try có lệnh return.
```java
public class TestFinallyBlock3 {
    public static void main(String[] args) {
        try {
            int data = 25;
            if (data % 2 != 0) {
                System.out.println(data + " is odd number");
                return;
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code...");
    }
}
```

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
