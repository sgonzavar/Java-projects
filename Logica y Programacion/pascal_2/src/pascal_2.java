import java.util.*;
 
public class pascal_2 {

public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
System.out.println("Hasta ke linea decea trabajar: ");
int limite = leer.nextInt();

System.out.println("");
int[] a = new int[1];
for (int i = 1; i <= limite; i++) {
int[] x = new int[i];
for (int j = 0; j < i; j++) {
if (j == 0 || j == (i - 1)) {
x[j] = 1;
} else {
x[j] = a[j] + a[j - 1];
}
System.out.print(x[j] + " ");
}
a = x;
System.out.println();
}
}
}