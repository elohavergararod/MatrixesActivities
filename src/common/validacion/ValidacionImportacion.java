package common.validacion;

public class ValidacionImportacion {
    public static void validarImportacion(int[][] matrix1,int[][] matrix2) {
        if (matrix1 == null || matrix2 == null) {
            System.out.println("Error al importar matrices. Verifica los archivos.");
        }
    }
}
