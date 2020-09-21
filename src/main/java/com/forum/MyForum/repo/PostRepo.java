package com.forum.MyForum.repo;

import com.forum.MyForum.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends CrudRepository<Post, Long> {

}
