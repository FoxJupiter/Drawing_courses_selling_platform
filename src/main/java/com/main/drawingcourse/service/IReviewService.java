package com.main.drawingcourse.service;

import com.main.drawingcourse.dto.ReviewModel;

import java.util.List;

public interface IReviewService {
    ReviewModel addFeedBack(ReviewModel reviewModel);
    List<ReviewModel>findAllFeedBackByUserId(int id);

    List<ReviewModel>findAllFeedBackByCourse(int id);


}