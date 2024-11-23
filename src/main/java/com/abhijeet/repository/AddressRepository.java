package com.abhijeet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhijeet.modal.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
