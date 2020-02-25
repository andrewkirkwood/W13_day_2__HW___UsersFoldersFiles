package com.codeclan.example.folders_files_users.components;

import com.codeclan.example.folders_files_users.models.File;
import com.codeclan.example.folders_files_users.models.Folder;
import com.codeclan.example.folders_files_users.models.User;
import com.codeclan.example.folders_files_users.repositories.FileRepository;
import com.codeclan.example.folders_files_users.repositories.FolderRepository;
import com.codeclan.example.folders_files_users.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){
    }

    public void run(ApplicationArguments args){
        User user1 = new User("John");
        userRepository.save(user1);
        Folder folder1 = new Folder("job_applications", user1);
        folderRepository.save(folder1);
        File file1 = new File("cv", "txt", 100, folder1);
        fileRepository.save(file1);

        User user2 = new User("Rob");
        userRepository.save(user2);
        Folder folder2 = new Folder("home", user2);
        folderRepository.save(folder2);
        File file2 = new File("DIY", "xml", 150, folder2);
        fileRepository.save(file2);
    }
}
