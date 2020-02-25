//package com.codeclan.example.folders_files_users.components;
//
//import com.codeclan.example.folders_files_users.models.File;
//import com.codeclan.example.folders_files_users.models.Folder;
//import com.codeclan.example.folders_files_users.models.User;
//import com.codeclan.example.folders_files_users.repositories.FileRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class DataLoader implements ApplicationRunner {
//    @Autowired
//    FileRepository fileRepository;
//
//    public DataLoader(){
//    }
//
//    public void run(ApplicationArguments args){
//        User user = new User("John");
//        Folder folder = new Folder("job_applications");
//        File file = new File("cv", "txt", 400);
//    }
//}
