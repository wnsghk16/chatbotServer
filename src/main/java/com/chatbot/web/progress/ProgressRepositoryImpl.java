package com.chatbot.web.progress;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

@Repository
interface ProgressRepository extends JpaRepository<Progress,Long>,ProgressService{}
interface ProgressService{}
public class ProgressRepositoryImpl extends QuerydslRepositorySupport {
    ProgressRepositoryImpl(){
        super(Progress.class);
    }
}
