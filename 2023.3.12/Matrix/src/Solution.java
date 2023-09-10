public class Solution {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(4, 4);
        int count = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix.setElement(i, j, count++);
            }
        }
        matrix.display();
        System.out.println();
        Matrix newmatrix = matrix.transposition();
        newmatrix.display();
        System.out.println();
        Matrix u = matrix.add(newmatrix);
        u.display();
        System.out.println();
        Matrix p = matrix.multiple(u);
        p.display();
        System.out.println();
        Matrix q=matrix.minus(p);
        q.display();
    }
}
