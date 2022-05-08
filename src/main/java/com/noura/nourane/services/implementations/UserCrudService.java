package com.noura.nourane.services.implementations;

import com.noura.nourane.models.entities.Doctor;
import com.noura.nourane.models.entities.Patient;
import com.noura.nourane.models.entities.User;
import com.noura.nourane.models.repositories.DoctorRepository;
import com.noura.nourane.models.repositories.PatientRepository;
import com.noura.nourane.models.repositories.UserRepository;
import com.noura.nourane.services.interfaces.UserCrudServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.util.Optional;

@Service
public class UserCrudService implements UserCrudServiceInterface {
    private UserRepository userRepository;
    private DoctorRepository doctorRepository;
    private PatientRepository patientRepository;
    @Autowired
    public UserCrudService(UserRepository userRepository, DoctorRepository doctorRepository,
                           PatientRepository patientRepository)
    {
        this.userRepository = userRepository;
        this.doctorRepository = doctorRepository;
        this.patientRepository = patientRepository;
    }
    @Override
    public void saveFile(MultipartFile file) {

    }

    @Override
    public User save(User user) {
        if(user.getTypeUser().equals("patient"))
        {
            return this.patientRepository.save((Patient) user);
        }
        else if (user.getTypeUser().equals("doctor"))
        {
            return this.doctorRepository.save((Doctor) user);
        }
        return this.userRepository.save(user);
    }

    public Optional<Doctor, Patient> findById(Long id)
    {
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent())
        {
            User userEntity = user.get();
            if(userEntity.getTypeUser().equals("patient"))
            {
                return patientRepository.findById(userEntity.getId());
            }
        }
        return null;
    }

    @Override
    public List<User> list() {
        return userRepository.findAll();
    }

    @Override
    public User update(Long id, User user) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
