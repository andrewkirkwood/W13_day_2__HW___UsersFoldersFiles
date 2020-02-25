package com.codeclan.example.folders_files_users.repositories;

import com.codeclan.example.folders_files_users.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
