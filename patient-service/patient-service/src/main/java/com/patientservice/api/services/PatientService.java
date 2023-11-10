package com.patientservice.api.services;

import com.patientservice.api.entity.Patient;
import com.patientservice.api.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class  PatientService {
    private final PatientRepository patientRepository;

    @Autowired
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }


    public Patient getPatientById(Long id) {
        return patientRepository.findById(id).orElse(null);
    }


    public Patient createPatient(Patient patient) {
        return patientRepository.save(patient);
    }


    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }
}
