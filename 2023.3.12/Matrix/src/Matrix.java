//        6. 矩阵四则运算
//        定义矩阵类Matrix，包括：
//        (1)代表矩阵的行数rows(或m)、列数cols(或n)，以及二维数组data；
//        (2)一个参数为rows,cols的构造方法，实现初始化操作，并将矩阵元素全部置为0；
//        (3)public void setElement(int row, int col, double value);方法，用于设置第row行，第col列元素的值；
//        (4)public Matrix add(Matrix m);方法，实现当前矩阵与m矩阵相加，并返回新的矩阵；若无法相加，则返回null；
//        (5)public Matrix minus(Matrix m);方法，实现当前矩阵减去m矩阵，并返回新的矩阵；若无法相减，则返回null；
//        (6)public Matrix multiple(Matrix m);方法，实现当前矩阵乘以m矩阵，并返回新的矩阵；若无法相乘，则返回null；
//        (7)public Matrix transposition();方法，实现矩阵转置，并返回新的矩阵；
//        (8)public void display();方法，打印当前矩阵。
//        实现该类。编写一个测试程序，随机生成矩阵元素或者由程序中用常量设置（可不必由键盘输入），测试上述四则运算，打印运算结果。
//        注意：要认真考虑矩阵类的封装性与完备性，同时要注意“封装”与“组装”的规范。
public class Matrix {
    private int rows;
    private int cols;
    private double[][] data;

    Matrix(int rows,int cols){
        this.rows=rows;
        this.cols=cols;
        data=new double[rows][cols];
    }
    public void setElement(int row, int col, double value) {
        this.data[row][col]=value;
    }
    public Matrix add(Matrix m){
        if(m.cols!=this.cols||m.rows!=this.rows){
            return  null;
        }
        else {
            Matrix arr=new Matrix(m.rows, m.cols);
            for(int i=0;i<m.rows;i++){
                for(int j=0;j<m.cols;j++){
                    arr.data[i][j]=this.data[i][j]+m.data[i][j];
                }
            }
            return arr;
        }
    }
    public Matrix minus(Matrix m){
        if(m.cols!=this.cols||m.rows!=this.rows){
            return  null;
        }
        else {
            Matrix arr=new Matrix(m.rows, m.cols);
            for(int i=0;i<m.rows;i++){
                for(int j=0;j<m.cols;j++){
                    arr.data[i][j]=this.data[i][j]-m.data[i][j];
                }
            }
            return arr;
        }
    }
    public Matrix multiple(Matrix m){
        if(this.cols!=m.rows){
            return null;
        }
        else {
            Matrix arr=new Matrix(this.rows, m.cols);
            for(int i=0;i<this.rows;i++){
                for(int j=0;j<m.cols;j++){
                    arr.data[i][j]=this.data[i][j]*m.data[i][j];
                }
            }
            return arr;
        }
    }
    public Matrix transposition(){
        Matrix arr=new Matrix(this.cols,this.rows);
        for(int i=0;i<this.rows;i++){
            for(int j=0;j<this.cols;j++){
                arr.data[j][i]=this.data[i][j];
            }
        }
        return arr;
    }
    public void display(){
        for(int i=0;i<this.rows;i++){
            for(int j=0;j<this.cols;j++){
                System.out.printf("%-6.0f",this.data[i][j]);
            }
            System.out.println();
        }
    }
}
