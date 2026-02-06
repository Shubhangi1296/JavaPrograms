public class MatrixOperations{
public static void main (String[] args){
int[][] A = {{1, 2}, {3, 4}};
int[][] B = {{5, 6}, {7, 8}};
int[][] result = new int[2][2];
int choice = 2;
switch (choice){
case 1:
System.out.println("Matrix Addition: ");
for (int i = 0; i < 2; i++){
for (int j = 0; j < 2; j++){
result[i][j] = A[i][j] + B[i][j];
System.out.println(result[i][j] + " ");
}
System.out.println();
}
break;
case 2:
System.out.println("Matrix Multiplication: ");
for (int i = 0; i < 2; i++){
for (int j = 0; j < 2; j++){
result[i][j] = 0;
for (int k = 0; k < 2; k++){
result[i][j] = A[i][j] * B[i][j];
}
System.out.println(result[i][j] + " ");
}
System.out.println();
}
break;
case 3:
System.out.println("Transpose of Matrix A: ");
for (int i = 0; i < 2; i++){
for (int j = 0; j < 2; j++){
System.out.println(A[i][j] + " ");
}
System.out.println();
}
break;
default:
System.out.println("Invalid Choice");
}
}
}