package com.abhijeet.service;

import java.util.List;

import com.abhijeet.exception.ProductException;
import com.abhijeet.modal.Review;
import com.abhijeet.modal.User;
import com.abhijeet.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
