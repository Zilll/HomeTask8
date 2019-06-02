import java.lang.reflect.Array;
public class MavenPush {
public static void main(String[] args) {
    //first task
    int w = 9;
    while (w < 20) {
        w++;
        System.out.print(w + ",");
    }
    System.out.println(" ");
    for (int i = 10; i < 21; i++) {
        System.out.print(i + ",");
    }
    System.out.println(" ");
    int q = 9;
    do {
        q++;
        System.out.print(q + ",");
    }
    while (q < 20);
    System.out.println(" ");
    //second task
    for (int e = 1; e < 101; e++) {
        if (e % 3 == 0) {
            System.out.print(e + ",");
        }
    }
    System.out.println(" ");
    //third task
    int[] MyArr = new int[100];
    for (int t = 0; t < MyArr.length; t++) {
        //System.out.print(MyArr.length);
        MyArr[t] = t + 1;
        System.out.print(MyArr[t] + ",");
    }
    System.out.println("");
    //fourth task
    int[] SmallArray = new int[10];
    for (int y = 1; y < SmallArray.length - 1; y++) {
        SmallArray[y] = y + 1;
        System.out.print(SmallArray[y] + ",");
    }
    System.out.println("\n");
    //fifth task

    //six task

    //seven task

    //eight task
    for (int z = 0; z < 4; z++) {
        for (int j = 0; j < 10; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
        System.out.println("\n");
    //nine task
    int n = 7;
    for (int i = 0; i < n; ++i) {
        int m = i;
        for (int j = 0; j < m; ++j)
            System.out.print("*");
            System.out.println();
        }
        System.out.println("\n");
        //ten task
        int m1 = 10;
        int n1 = 5;
        for (int i1 = 0; i1 < n1; i1++) {
            for (int j1 = 0; j1 < m1; j1++) {
                if (i1 == 0 || i1 == n1 - 1) {
                    System.out.print('*');
                } else {
                    if (j1 == 0 || j1 == m1 - 1) {
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                }
            }
            System.out.print("\n\r");
        }
        //eleven task
    int num = 6;
    for (int i = 1; i <= num; ++i){
        for (int j = num; j > i; --j)
            System.out.print(" ");
        for (int j = 1; j < 2 * i; ++j)
            System.out.print("*");
        System.out.println();
    }
    }

}


