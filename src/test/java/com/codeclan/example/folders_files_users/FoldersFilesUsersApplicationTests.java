package com.codeclan.example.folders_files_users;

import com.codeclan.example.folders_files_users.models.File;
import com.codeclan.example.folders_files_users.models.Folder;
import com.codeclan.example.folders_files_users.models.User;
import com.codeclan.example.folders_files_users.repositories.FileRepository;
import com.codeclan.example.folders_files_users.repositories.FolderRepository;
import com.codeclan.example.folders_files_users.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class FoldersFilesUsersApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createFileAndFolder(){
		User user = new User("John");
		userRepository.save(user);
		Folder folder = new Folder("job_applications", user);
		folderRepository.save(folder);
		File file = new File("cv", "txt", 100, folder);
		fileRepository.save(file);

	}

}
