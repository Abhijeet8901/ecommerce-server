package com.abhijeet.service;

import java.util.List;

import com.abhijeet.exception.ProductException;
import com.abhijeet.modal.Rating;
import com.abhijeet.modal.User;
import com.abhijeet.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
