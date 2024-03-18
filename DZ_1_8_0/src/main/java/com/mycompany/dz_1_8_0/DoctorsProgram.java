/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dz_1_8_0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author dmirtypoluektov
 */
public class DoctorsProgram {
    private HashMap<Integer, Doctor> doctorsMap;

    public DoctorsProgram() {
        doctorsMap = new HashMap<>();
        // Начальные значения (минимум 3 врача)
        doctorsMap.put(345, new Doctor("Антонов Андрей Антонович", "сантехник", 345, 15, false));
        doctorsMap.put(5, new Doctor("Иванов Иван Иванович", "хирург", 5, 20, true));
        doctorsMap.put(65, new Doctor("Юрьев Юрий Аристархович", "офтальмолог", 65, 10, false));
    }

    public void displayDoctorsList() {

        ArrayList<Doctor> doctorsList = new ArrayList<>(doctorsMap.values());

        ArrayList<Doctor> sortedList = new ArrayList<>();
        Iterator<Doctor> iterator = doctorsList.iterator();
        
        while (iterator.hasNext()) {
            Doctor currentDoctor = iterator.next();
            boolean inserted = false;
            
            for (int i = 0; i < sortedList.size(); i++) {
                Doctor sortedDoctor = sortedList.get(i);
                
                if (currentDoctor.getFullName().compareTo(sortedDoctor.getFullName()) < 0) {
                    sortedList.add(i, currentDoctor);
                    inserted = true;
                    break;
                }
                
            }
            
            if (!inserted) {
                sortedList.add(currentDoctor);
            }
        }

        System.out.println("Список врачей:");
        
    for (Doctor doctor : sortedList) {    
        String certificationStatus = String.valueOf(doctor.isCertificationPassed());
        System.out.println("ФИО: " + doctor.getFullName());
        System.out.println("Специальность: " + doctor.getSpecialty());
        System.out.println("Порядковый номер: " + doctor.getEmployeeNumber());
        System.out.println("Количество рабочих смен в месяц: " + doctor.getShiftsPerMonth());
        System.out.println("Статус аттестации: " + (doctor.isCertificationPassed()));
        System.out.println();
        }
    }

    public void addDoctor(Doctor newDoctor) {
        
        Doctor existingDoctor = doctorsMap.get(newDoctor.getEmployeeNumber());


        if (existingDoctor != null) {

            System.out.println("Врач с таким номером уже существует");
            
        } else {
            
            doctorsMap.put(newDoctor.getEmployeeNumber(), newDoctor);
            System.out.println("Врач был добавлен в список");
            displayDoctorsList();
            
        }
    }

    public void updateCertificationStatus(int employeeNumber, boolean newCertificationStatus) {
        
        Doctor doctor = doctorsMap.get(employeeNumber);

        if (doctor != null) {
            
            doctor.setCertificationPassed(newCertificationStatus);
            System.out.println("Статус аттестации был изменен");
            displayDoctorsList();
            
        } else {
            
            System.out.println("Врач с таким номером не был найден");
            
        }
    }
}