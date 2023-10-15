package com.dhanesh.InstaBasicApp.Repository;

import com.dhanesh.InstaBasicApp.Model.Post;
import com.dhanesh.InstaBasicApp.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPostRepo extends JpaRepository<Post, Integer> {


    List<Post> findByUser(User user);
}
