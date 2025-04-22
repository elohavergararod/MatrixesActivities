package common.importacion.input;

import common.interfaces.InterfazImportacion;
import common.matrix.Matrix;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Input implements InterfazImportacion {

    public List<int[][]> transformMatrix(){
        List<String> data = new ArrayList<>();
        Iterator<String> itData = data.iterator();
        int[][] matrix;
        List<int[][]> matrixes = new ArrayList<>();
        //data.read();
        String[] rows;
        String[] columns;
        int number;
        int i = 0;
        int fila = 0;
        while (itData.hasNext()){
            String line = itData.next();
            rows = line.split(";");
            columns = rows[i].split(" ");
            Matrix aMatrix = new Matrix(rows.length,columns.length);
            aMatrix.addNumbersbyRow(0,columns);
            //for (int x = 0;)
            for ( i= 1; i < rows.length;i++){
                columns = rows[i].split(" ");
            }
            matrix = new int[rows.length][columns.length];
            for (int j = 0; j < columns.length; j++){
                number = Integer.parseInt(columns[j]);
                matrix[fila][j] = number;
            }
            matrixes.add(matrix);
        }
        return matrixes;
    }

    public void loadMatriz() {

    }
}
