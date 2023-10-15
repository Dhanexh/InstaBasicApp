package com.dhanesh.InstaBasicApp.Service;

import com.dhanesh.InstaBasicApp.Model.Post;
import com.dhanesh.InstaBasicApp.Model.User;
import com.dhanesh.InstaBasicApp.Repository.IPostRepo;
import com.dhanesh.InstaBasicApp.Repository.ITokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    IPostRepo postRepo;

    @Autowired
    ITokenRepo tokenRepo;
    public void addPost(Post post) {
        postRepo.save(post);
    }

    public List<Post> getAllPosts(String token) {
        User user = tokenRepo.findFirstByToken(token).getUser();


        List<Post> postList = postRepo.findByUser(user);

        return postList;


    }

}
