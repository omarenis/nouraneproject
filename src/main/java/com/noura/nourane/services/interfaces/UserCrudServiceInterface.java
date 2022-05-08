package com.noura.nourane.services.interfaces;

import com.noura.nourane.models.entities.User;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.nio.file.Paths;

public interface UserCrudServiceInterface {
    final Path root = Paths.get("uploads");
    public void saveFile(MultipartFile file);
    public User save(User user);
    public List<User> list();
    public User update(Long id, User user);
    public void delete(Long id);
}
