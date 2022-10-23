package com.example.servicecrud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ChuyenBay {
	 private long idCb; 
	private String gaDi;
	private String gaDen;
}
