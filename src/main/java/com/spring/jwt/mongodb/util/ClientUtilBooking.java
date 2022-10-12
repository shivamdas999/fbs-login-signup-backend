package com.spring.jwt.mongodb.util;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.spring.jwt.mongodb.models.Book;





@FeignClient(value="Booking-Service",url="http://localhost:9092/api/booking")
public interface ClientUtilBooking {
	
	@GetMapping("/get") 
	public ResponseEntity<List<Book>> getAllBookings(@RequestHeader("Authorization") String token);
	

	@PostMapping("/add") 
	public ResponseEntity<Book> addBooking(@RequestBody Book book);


	@DeleteMapping(path="/delete/{id}")
	public ResponseEntity<String> deleteBooking(@RequestHeader("Authorization") String token,@PathVariable int id);
	

}
