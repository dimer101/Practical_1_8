/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.dz_1_8_0;

import java.util.Scanner;

/**
 *
 * @author dmirtypoluektov
 */
public class DZ_1_8_0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Practical task 1.8, Student Dmitry Poluektov, RIBO-01-22, Variant 3");
        Scanner scan = new Scanner(System.in);
        DoctorsProgram doctorsProgram = new DoctorsProgram();
        Scanner scanner = new Scanner(System.in);

        int flag = 1;

        while (flag == 1) {
            System.out.println("Выберите действие: ");
            System.out.println("1. Добавить врача ");
            System.out.println("2. Изменить статус аттестации врача ");
            System.out.println("3. Вывести текущий список врачей ");
            System.out.println("0. Выход ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Введите ФИО:");
                    scanner.nextLine(); 
                    String fullName = scanner.nextLine();

                    System.out.println("Введите специальность:");
                    String specialty = scanner.nextLine();

                    System.out.println("Введите порядковый номер в списке сотрудников:");
                    int employeeNumber = scanner.nextInt();

                    System.out.println("Введите количество рабочих смен в месяц: ");
                    int shiftsPerMonth = scanner.nextInt();

                    System.out.println("Введите отметку о прохождении аттестации ('true'/'false'): ");
                    boolean certificationPassed = scanner.nextBoolean();

                    Doctor newDoctor = new Doctor(fullName, specialty, employeeNumber, shiftsPerMonth, certificationPassed);
                    doctorsProgram.addDoctor(newDoctor);
                    break;

                case 2:
                    System.out.println("Введите номер врача для изменения статуса аттестации: ");
                    int updatingEmployeeNumber = scanner.nextInt();

                    System.out.println("Введите статус аттестации ('true'/'false'): ");
                    boolean newCertificationStatus = scanner.nextBoolean();

                    doctorsProgram.updateCertificationStatus(updatingEmployeeNumber, newCertificationStatus);
                    break;

                case 3:
                    doctorsProgram.displayDoctorsList();
                    break;

                case 0:
                    flag = 0;
                    System.out.println("Выход из программы");
                    break;
                default:
                    System.out.println("Некорректный ввод");
            }
        }

    }
}
