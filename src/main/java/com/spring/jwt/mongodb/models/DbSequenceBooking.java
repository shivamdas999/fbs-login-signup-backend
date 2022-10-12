package com.spring.jwt.mongodb.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "db_sequence")
	
		public class DbSequenceBooking {
		    @Id
		    private String  id;
		    private int seq;
			public int getSeq() {
				// TODO Auto-generated method stub
				return seq;
			}
		

	}
