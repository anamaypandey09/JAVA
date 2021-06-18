package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Data
@Document(collection="Book")
public class Book {
	@Id
	private int id;
	private String bookName;
	private String authorName;
//	public int getId() {
//		// TODO Auto-generated method stub
//		return id;
//	}
	
	
}
