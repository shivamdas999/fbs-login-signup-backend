package com.spring.jwt.mongodb.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jwt.mongodb.exceptions.NoProperDataException;
import com.spring.jwt.mongodb.exceptions.OrderNotFoundException;
import com.spring.jwt.mongodb.models.Book;
import com.spring.jwt.mongodb.security.services.SequenceGeneratorService;
import com.spring.jwt.mongodb.util.ClientUtilBooking;

@RestController
@RequestMapping("/api/booking")
public class BookingController {
	
	@Autowired
	private ClientUtilBooking clientUtilBooking;

	@Autowired
	private SequenceGeneratorService service;
	
	@GetMapping("/get") 
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<List<Book>> getAllOrders(@RequestHeader("Authorization") String token) throws OrderNotFoundException {
	{
		
		return clientUtilBooking.getAllBookings(token);
		
	}
	
	}
	
@PostMapping("/add")
	@PreAuthorize("hasRole('USER') ")
	public ResponseEntity<Book> addBookings(@RequestBody Book book) throws NoProperDataException {
	
		book.setBookingOrderId(service.getSequenceNumberForBooking(Book.SEQUENCE_NAME));
		return clientUtilBooking.addBooking(book);
	}



	@DeleteMapping(path="/delete/{id}")
	@PreAuthorize("hasRole('ADMIN') ")
	public ResponseEntity<String> deleteBookings(@RequestHeader("Authorization") String token,@PathVariable int id) throws OrderNotFoundException {
			return clientUtilBooking.deleteBooking(token,id);
	}

}
