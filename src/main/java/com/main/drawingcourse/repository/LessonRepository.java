package com.main.drawingcourse.repository;

import com.main.drawingcourse.entity.Lesson;
import com.main.drawingcourse.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LessonRepository extends JpaRepository<Lesson, Integer> {

    @Query(
            value = "SELECT * FROM LESSONS l WHERE l.course_id = :id",
            nativeQuery = true)
    List<Lesson> findLessonsByID(@Param("id") int id);
}