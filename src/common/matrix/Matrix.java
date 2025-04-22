package common.matrix;

public class Matrix {
    int rows;
    int columns;

    int[][] content;

    public Matrix(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        content = new int[rows][columns];
    }

    public void addNumbersbyRow(int fila,String[] numbers){
        for (int i= 0; i < numbers.length; i++){
            int number = Integer.parseInt(numbers[i]);
            content[fila][i] = number;
        }
    }
}
