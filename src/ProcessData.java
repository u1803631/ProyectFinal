
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Andrew Romero
 */
public class ProcessData {

    int D = 0;
    int S = 0;
    int E = 0;
    int Se = 0;
    String a;
    List<Datoscsv> ListaFinalP = new ArrayList<>();
    List<Datoscsv> ListaFinalE = new ArrayList<>();

    int EdadP;
    String DepartamentoP;
    String StatusP;
    String SexoP;
    int EdadF;
    String DepartamentoF;
    String StatusF;
    String SexoF;

    public void ProcessData(String DepartamentoFE, String StatusFE, String SexoFE, int EdadFE, List<Datoscsv> ListaFi) {

        DepartamentoF = DepartamentoFE;
        EdadF = EdadFE;
        StatusF = StatusFE;
        SexoF = SexoFE;
        ListaFinalP = ListaFi;
    }

    public void RangoEdad() {

    }

    public void Filro1() {
        D = 0;
        for (int k = 1; k < ListaFinalP.size(); k++) {
              E=0;
            DepartamentoP = ListaFinalP.get(k).Departamento;
            StatusP = ListaFinalP.get(k).Status;
            EdadP = ListaFinalP.get(k).Edad;
            SexoP = ListaFinalP.get(k).Sexo;

            switch (EdadF) {

                case 0:
                    
                    break;

                case 1:

                    if (EdadP >= 0 && EdadP <= 18) {
                        E = 1;

                    }

                case 2:
                    if (EdadP >=19 && EdadP <= 30) {
                        E = 2;

                    }

                case 3:

                    if (EdadP>= 31 && EdadP <= 45) {
                        E = 3;

                    }

                case 4:

                    if (EdadP >=46 && EdadP <= 60) {
                        E = 4;

                    }

                case 5:

                    if (EdadP >=61 && EdadP <= 80) {
                        E = 5;

                    }

                case 6:

                    if (EdadP >= 81 && EdadP <= 103) {
                        E = 6;

                    }
                    break;

                //Entre 0-18, Entre19-30, Entre 31-45, Entre 45-60, Entre 61-80, Entre81-103
            }

            if (DepartamentoF.equals(DepartamentoP) && StatusF.equals(StatusP) && SexoF.equals(SexoP) && EdadF == E) {
                D++;

                Datoscsv Exportdato = new Datoscsv();

                Exportdato.Departamento = DepartamentoP;
                Exportdato.Status = StatusP;
                Exportdato.Edad = EdadP;
                Exportdato.Sexo = SexoP;

                ListaFinalE.add(Exportdato);

            }
        }
        
        if (ListaFinalE.isEmpty()) {
             System.out.println(" NINGUNO");   
        }
        else{
        
      

        System.out.println(" " + D + " " + E);
        System.out.println(" " + D + " ");
        int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0;
        for (int i = 0; i < ListaFinalE.size(); i++) {

            System.out.print(ListaFinalE.get(i).Departamento + ",");
            System.out.print(ListaFinalE.get(i).Status + ",");
            System.out.print(ListaFinalE.get(i).Edad + ",");
            System.out.println(ListaFinalE.get(i).Sexo);
             if (ListaFinalE.get(i).Edad >= 0 && ListaFinalE.get(i).Edad <= 18) {
                       c1++;

                    }else{
                         if (ListaFinalE.get(i).Edad >=19 && ListaFinalE.get(i).Edad <= 30) {
                        c2++;

                    }else{
                       if (ListaFinalE.get(i).Edad>= 31 && ListaFinalE.get(i).Edad <= 45) {
                        c3++;

                    }else{
                     if (ListaFinalE.get(i).Edad >=46 && ListaFinalE.get(i).Edad <= 60) {
                        c4++;
                    }
                     else{
                         if (ListaFinalE.get(i).Edad >=61 && ListaFinalE.get(i).Edad <= 80) {
                        c5++;

                    }
                         else{
                           if (ListaFinalE.get(i).Edad >= 81 && ListaFinalE.get(i).Edad <= 103) {
                        c6 ++;

                    }  
                         }
                     }
                    }
                    }
                    }
            
        }
            System.out.println(c1);
            System.out.println(c2);
             System.out.println(c3);
              System.out.println(c4);
               System.out.println(c5);
                System.out.println(c6);
                System.out.println(ListaFinalE.size());
                panel.removeAll();
                        panel.add(chartPanel, BorderLayout.CENTER);
                        panel.validate();
        }

    }

    

};
