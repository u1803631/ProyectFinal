
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Andrew Romero
 */
public class ExtraccionArchivo {

    private File Archivo;
    int c = 0;
    boolean Bandera= false;
      List<Datoscsv> ListadoFinals = new ArrayList<>();

    ExtraccionArchivo(String path) {
        this.Archivo = new File(path);
        
    }

    ExtraccionArchivo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Datoscsv> crearListado() throws FileNotFoundException {

        List<Datoscsv> ListadoFinal = new ArrayList<>();

        try (Scanner scanner = new Scanner(this.Archivo);) {

            while (scanner.hasNextLine()) {
                List<String> record = getRecordFromLine(scanner.nextLine());
                Datoscsv dato = new Datoscsv();

                if (c > 0) {
                    dato.Departamento = (record.get(4));
                    dato.Status = (record.get(5));
                    dato.Edad = Integer.parseInt(record.get(6));
                    dato.Sexo = (record.get(7));
                    ListadoFinal.add(dato);

                }
                c++;

            }

           /* for (int i = 0; i < ListadoFinal.size(); i++) {

                System.out.print(ListadoFinal.get(i).Departamento + ",");
                System.out.print(ListadoFinal.get(i).Status + ",");
                System.out.print(ListadoFinal.get(i).Edad + ",");
                System.out.println(ListadoFinal.get(i).Sexo);
            }
           */ 

            
            ListadoFinals= ListadoFinal;
           
            return ListadoFinal;
          
        }

    }


    
    private List<String> getRecordFromLine(String line) {

        List<String> values = new ArrayList<String>();

        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(",");
            while (rowScanner.hasNext()) {

                values.add(rowScanner.next());

            }

        }

        return values;

    }

}
