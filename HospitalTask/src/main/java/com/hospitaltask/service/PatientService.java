package com.hospitaltask.service;

import com.hospitaltask.entity.*;

import java.util.List;
import java.util.Optional;

public interface PatientService
{
    //Add & Update Operation

    Patient save(Patient patient);
    Patient updatePatientById(Patient patient,Long id);
    Patient updatePatientByName(Patient patient,String name);





    //Fetch & filter Operation

    List< Patient > getAllPatient();
    Patient getPatientById(Long id);
    Patient findByEmail(String email);
    Optional<Patient> findByDoctorID(Long id);
    Patient findByName(String name);

    //Delete Operation

    void deleteAllPatient();
    void deletePatientByID(Long patientId);


}
