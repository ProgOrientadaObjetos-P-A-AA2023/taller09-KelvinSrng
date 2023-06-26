package paquete1;

import java.util.Scanner;
import paquete2.*;
import paquete3.PrestamoAutomovil;
import paquete4.*;

public class Ejecutor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean bandera = true;
        String cadena = " ";

        do {

            System.out.println("Ingrese su nombres: ");
            String nombre1 = sc.nextLine();

            System.out.println("Ingrese su apellidos: ");
            String apellidos1 = sc.nextLine();

            System.out.println("Ingrese su username: ");
            String username1 = sc.nextLine();

            Persona p = new Persona(nombre1, apellidos1, username1);

            System.out.println("\nQue tipo de prestamo desea?: ");
            System.out.println("1) Prestamo Automovil");
            System.out.println("2) Prestamo Educativo");
            System.out.print("Elija una opcion: ");
            
            int opcion = sc.nextInt();

            if (opcion == 1) {

                System.out.print("\nIngrese la ciudad donde se otorga el prestamo: ");
                String ciud = sc.next().toLowerCase();
                sc.nextLine();
                System.out.print("Ingrese el tipo de auto: ");
                String tipoAuto = sc.nextLine();
                System.out.print("Ingrese la marca del auto: ");
                String marcaAuto = sc.nextLine();
                System.out.print("Datos del Garante:\nNombre del garante: ");
                String nombreG = sc.nextLine();
                System.out.print("Apellido del garante: ");
                String apellG = sc.nextLine();
                System.out.print("Username del garante: ");
                String usernameG = sc.nextLine();
                System.out.print("Automovil: ");
                System.out.print("Valor Automovil: ");
                double valorAutomovil = sc.nextDouble();
                System.out.print("Tiempo del prestamo(EN MESES): ");
                int meses = sc.nextInt();

                Persona p1 = new Persona(nombreG, apellG, usernameG);

                PrestamoAutomovil pA = new PrestamoAutomovil(p, meses, ciud, tipoAuto, marcaAuto, p1, valorAutomovil);

                pA.calcularValorMensualAutomovil();

                cadena = String.format("%s%s\n", cadena, pA);

            } else {

                if (opcion == 2) {

                    System.out.print("\nIngrese la ciudad donde se otorga el prestamo: ");
                    String ciud1 = sc.next().toUpperCase();
                    sc.nextLine();
                    System.out.print("Cual es su nivel de estudio?: ");
                    int nivelE = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese el nombre de la Institucion Educativa: ");
                    String instEdu = sc.nextLine();
                    System.out.print("Ingrese las siglas de la Institucion Educativa: ");
                    String siglas = sc.nextLine();
                    System.out.print("Valor de la Carrera: ");
                    double valorCarrera = sc.nextDouble();
                    System.out.print("Tiempo del prestamo(EN MESES): ");
                    int meses1 = sc.nextInt();

                    InstitucionEducativa ed = new InstitucionEducativa(instEdu, siglas);

                    PrestamoEducativo pE = new PrestamoEducativo(p, meses1, ciud1, nivelE, ed, valorCarrera);

                    pE.calculoValorMensual();

                    cadena = String.format("%s%s\n", cadena, pE);

                } else {

                    System.out.println("OPCION INCORRECTA...");

                }

            }

            sc.nextLine();

            System.out.println("Desea ingresar otro tipo de prestamo?: ");
            String res = sc.nextLine();

            if (res.equals("No")) {
                bandera = false;
            }

        } while (bandera == true);

        System.out.printf("%s\n", cadena);
    }
}
