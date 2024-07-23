package com.project.repository;

import com.project.domain.Comment;

import java.util.List;

public interface CommentRepository {
    int write(Comment comment);

    int deleteById(Long id);

    List<Comment> findByBoard(Long board_id);
}