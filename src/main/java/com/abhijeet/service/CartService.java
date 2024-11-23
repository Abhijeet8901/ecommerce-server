package com.abhijeet.service;

import com.abhijeet.exception.ProductException;
import com.abhijeet.modal.Cart;
import com.abhijeet.modal.CartItem;
import com.abhijeet.modal.User;
import com.abhijeet.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public CartItem addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
