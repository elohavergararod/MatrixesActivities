package common.exportacion;

public class FicheroHTML {
    private static StringBuilder getHTMLTemplate(){
        StringBuilder sb = new StringBuilder();

        sb.append("""
                <!DOCTYPE html>
                <html lang=\"en\">
                <meta charset =\"en\">
                """
        );

        return sb;
    }
}
