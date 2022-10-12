package com.spring.jwt.mongodb.models;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@Document(collection="order")
	public class Book {
		
		public static final String SEQUENCE_NAME = "book_sequence";
		@Id
	    private int bookingOrderId;
		private LocalDate bookingDate;
	    private String transactionMode;
		private int tickets;
		double totalCost;
		
		public void setBookingOrderId(int sequenceNumberForOrder) {
			// TODO Auto-generated method stub
			this.bookingOrderId = sequenceNumberForOrder;
		}
}
