import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /**desarrollar un sistema de notas para un estudiante que desea saber la nota (de cada materia)
        el sistema debe pedir el nombre del estudiante documento y programa al que esta matriculado
                (menu de opciones entre desarrollo de sotware, diseño grafico, gastronomia)
        debe permitir seleccionar la materia (menu de opciones)
        desarrollode sotsware: logica, metodologia,introduccion
        diseño: tipografia,iconografia,semantica
        gastronomia: costos,panaderia dulce, cocina internacional
        el calculo de notas es de la siguiente manera,
        para cada materia hay un examen parcial que vale el 20% de la nota
        un taller que vale el 30% de la nota y un final que vale el 50% de la nota
                una vez calculada la nota final tener en cuenta:
                si la nota esta entre 0 y 2 el estudiante pierde
                si esta entre 2.1 y 2.9 tiene derecho a plan de mejoramiento
                si la nota es igual o superior a 3 asi le queda la materia
                si el estudiante hace plan de mejoramiento la nota maxima sera 3.0
         el sistema debe discriminar la informacion general del estudiante es decir
         nombre, documento,nota materia**/

        Scanner leer = new Scanner(System.in);
        /**definir variables**/
        double notaexamenparcial = 0;
        double notataller =0;
        double notafinal =0;
        double notamateria =0;
        String materia = " ";
                System.out.println("ingrese el nombre del estudiante ");
        String nombre_estudiante = leer.nextLine();
        System.out.println("ingrese el documento del estudiante");
        String documento_estudiante = leer.nextLine();
        /**definir condicional**/
        /**condicional multiple ejemplo
                switch () {
                    case1 "":
                        break;
                     case2 "":
                        break;
                       case3 "":
                        break;
                }**/
        System.out.println("seleccione el programa: \n1-desarrollo de software\n2-diseño grafico\n3-gastronomia");
        String programa = leer.nextLine();
        switch (programa){
            case "1":
                System.out.println("programa de desarrollo de software");
                System.out.println("seleccione la materia \n1-logica de programacion\n2-metodologias agiles\n3-introduccion a la programacion");
                materia = leer.nextLine();
                switch (materia){
                    case "1":
                        System.out.println("nota de logica de programacion");
                        System.out.println("nota examen parcial");
                        notaexamenparcial = leer.nextDouble();
                        System.out.println("nota taller");
                        notataller = leer.nextDouble();
                        System.out.println("nota final");
                        notafinal = leer.nextDouble();
                        notamateria = (notaexamenparcial * 0.2) + (notataller*0.3) + (notafinal*0.5);
                        System.out.println("el estudiante"+ nombre_estudiante + "tiene la siguiente nota final de la materia " + notamateria);
                        if (notamateria < 2){
                            System.out.println("perdio definitivamente");
                        } else if (notamateria < 2.9){
                            System.out.println("tiene derecho al plan de mejoramiento");
                        }
                         else {
                            System.out.println("asi le quedo la materia");
                        }
                        break;

                    case "2":
                        System.out.println("nota de metodologias agiles");
                        System.out.println("nota examen parcial");
                        notaexamenparcial = leer.nextDouble();
                        System.out.println("nota taller");
                        notataller = leer.nextDouble();
                        System.out.println("nota final");
                        notafinal = leer.nextDouble();
                        notamateria = (notaexamenparcial * 0.2) + (notataller*0.3) + (notafinal*0.5);
                        System.out.println("el estudiante"+ nombre_estudiante + "tiene la siguiente nota final de la materia " + notamateria);
                        if (notamateria < 2){
                            System.out.println("perdio definitivamente");
                        } else if (notamateria < 2.9){
                            System.out.println("tiene derecho al plan de mejoramiento");
                        }
                        else {
                            System.out.println("asi le quedo la materia");
                        }
                        break;
                    case "3":
                        System.out.println("nota de introduccion a la programacion");
                        System.out.println("nota examen parcial");
                        notaexamenparcial = leer.nextDouble();
                        System.out.println("nota taller");
                        notataller = leer.nextDouble();
                        System.out.println("nota final");
                        notafinal = leer.nextDouble();
                        notamateria = (notaexamenparcial * 0.2) + (notataller*0.3) + (notafinal*0.5);
                        System.out.println("el estudiante"+ nombre_estudiante + "tiene la siguiente nota final de la materia " + notamateria);
                        if (notamateria < 2){
                            System.out.println("perdio definitivamente");
                        } else if (notamateria < 2.9){
                            System.out.println("tiene derecho al plan de mejoramiento");
                        }
                        else {
                            System.out.println("asi le quedo la materia");
                        }
                        break;
                }
                break;
            case "2":
                System.out.println("programa de diseño");
                System.out.println("seleccione la materia \n1-tipografia\n2-iconografia\n3-semantica");
                materia = leer.nextLine();
                switch (materia){
                    case "1":
                        System.out.println("nota de tipografia");
                        System.out.println("nota examen parcial");
                        notaexamenparcial = leer.nextDouble();
                        System.out.println("nota taller");
                        notataller = leer.nextDouble();
                        System.out.println("nota final");
                        notafinal = leer.nextDouble();
                        notamateria = (notaexamenparcial * 0.2) + (notataller*0.3) + (notafinal*0.5);
                        System.out.println("el estudiante"+ nombre_estudiante + "tiene la siguiente nota final de la materia " + notamateria);
                        if (notamateria < 2){
                            System.out.println("perdio definitivamente");
                        } else if (notamateria < 2.9){
                            System.out.println("tiene derecho al plan de mejoramiento");
                        }
                        else {
                            System.out.println("asi le quedo la materia");
                        }

                        break;

                    case "2":
                        System.out.println("nota de iconografia");
                        System.out.println("nota examen parcial");
                        notaexamenparcial = leer.nextDouble();
                        System.out.println("nota taller");
                        notataller = leer.nextDouble();
                        System.out.println("nota final");
                        notafinal = leer.nextDouble();
                        notamateria = (notaexamenparcial * 0.2) + (notataller*0.3) + (notafinal*0.5);
                        System.out.println("el estudiante"+ nombre_estudiante + "tiene la siguiente nota final de la materia " + notamateria);
                        if (notamateria < 2){
                            System.out.println("perdio definitivamente");
                        } else if (notamateria < 2.9){
                            System.out.println("tiene derecho al plan de mejoramiento");
                        }
                        else {
                            System.out.println("asi le quedo la materia");
                        }
                        break;
                    case "3":
                        System.out.println("nota de semantica");
                        System.out.println("nota examen parcial");
                        notaexamenparcial = leer.nextDouble();
                        System.out.println("nota taller");
                        notataller = leer.nextDouble();
                        System.out.println("nota final");
                        notafinal = leer.nextDouble();
                        notamateria = (notaexamenparcial * 0.2) + (notataller*0.3) + (notafinal*0.5);
                        System.out.println("el estudiante"+ nombre_estudiante + "tiene la siguiente nota final de la materia " + notamateria);
                        if (notamateria < 2){
                            System.out.println("perdio definitivamente");
                        } else if (notamateria < 2.9){
                            System.out.println("tiene derecho al plan de mejoramiento");
                        }
                        else {
                            System.out.println("asi le quedo la materia");
                        }
                        break;
                }

                break;
            case "3":
                System.out.println("programa de gastronomia");
                System.out.println("seleccione la materia \n1-costos\n2-panaderia dulce\n3-cocina internacional");
                materia = leer.nextLine();
                switch (materia){
                    case "1":
                        System.out.println("nota de costos");
                        System.out.println("nota examen parcial");
                        notaexamenparcial = leer.nextDouble();
                        System.out.println("nota taller");
                        notataller = leer.nextDouble();
                        System.out.println("nota final");
                        notafinal = leer.nextDouble();
                        notamateria = (notaexamenparcial * 0.2) + (notataller*0.3) + (notafinal*0.5);
                        System.out.println("el estudiante"+ nombre_estudiante + "tiene la siguiente nota final de la materia " + notamateria);
                        if (notamateria < 2){
                            System.out.println("perdio definitivamente");
                        } else if (notamateria < 2.9){
                            System.out.println("tiene derecho al plan de mejoramiento");
                        }
                        else {
                            System.out.println("asi le quedo la materia");
                        }

                        break;

                    case "2":
                        System.out.println("nota de panaderia dulce");
                        System.out.println("nota examen parcial");
                        notaexamenparcial = leer.nextDouble();
                        System.out.println("nota taller");
                        notataller = leer.nextDouble();
                        System.out.println("nota final");
                        notafinal = leer.nextDouble();
                        notamateria = (notaexamenparcial * 0.2) + (notataller*0.3) + (notafinal*0.5);
                        System.out.println("el estudiante"+ nombre_estudiante + "tiene la siguiente nota final de la materia " + notamateria);
                        if (notamateria < 2){
                            System.out.println("perdio definitivamente");
                        } else if (notamateria < 2.9){
                            System.out.println("tiene derecho al plan de mejoramiento");
                        }
                        else {
                            System.out.println("asi le quedo la materia");
                        }
                        break;
                    case "3":
                        System.out.println("nota de cocina internacional");
                        System.out.println("nota examen parcial");
                        notaexamenparcial = leer.nextDouble();
                        System.out.println("nota taller");
                        notataller = leer.nextDouble();
                        System.out.println("nota final");
                        notafinal = leer.nextDouble();
                        notamateria = (notaexamenparcial * 0.2) + (notataller*0.3) + (notafinal*0.5);
                        System.out.println("el estudiante"+ nombre_estudiante + "tiene la siguiente nota final de la materia " + notamateria);
                        if (notamateria < 2){
                            System.out.println("perdio definitivamente");
                        } else if (notamateria < 2.9){
                            System.out.println("tiene derecho al plan de mejoramiento");
                        }
                        else {
                            System.out.println("asi le quedo la materia");
                        }
                        break;
                }

                break;



        }















    }




}