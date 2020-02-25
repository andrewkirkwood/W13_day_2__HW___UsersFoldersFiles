package com.codeclan.example.folders_files_users.repositories;

import com.codeclan.example.folders_files_users.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
