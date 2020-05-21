
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
  

    public List<Datoscsv> crearListado(File F) throws FileNotFoundException
    {

        List<Datoscsv> ListadoFinal = new ArrayList<>();

        try (Scanner scanner = new Scanner(F);) {

            while (scanner.hasNextLine()) {
                List<String> record = getRecordFromLine(scanner.nextLine());
                Datoscsv dato = new Datoscsv();
                dato.Edad = Integer.parseInt(record.get(7));
                dato.Sexo = (record.get(8));
                dato.Departamento = (record.get(5));
                dato.Status = (record.get(10));

                ListadoFinal.add(dato);
            }
            
            for (int i = 0; i <ListadoFinal.size(); i++) {
                
                System.out.println(ListadoFinal.get(i)); 
            }
           
            return ListadoFinal;

        }

    }

    private List<String> getRecordFromLine(String line) {
        List<String> values = new ArrayList<String>();
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(";");
            while (rowScanner.hasNext()) {
                values.add(rowScanner.next());
            }
        }
        return values;
    }

}
