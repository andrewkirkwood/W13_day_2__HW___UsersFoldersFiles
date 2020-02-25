package com.codeclan.example.folders_files_users.repositories;

import com.codeclan.example.folders_files_users.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

//@RepositoryRestResource(excerptProjection = EmbedFile.class)
@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
