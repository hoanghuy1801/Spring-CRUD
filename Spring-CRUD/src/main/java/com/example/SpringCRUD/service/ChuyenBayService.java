package com.example.SpringCRUD.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.SpringCRUD.entity.ChuyenBay;


@Service
public interface ChuyenBayService {

	
	ChuyenBay saveChuyeBay(ChuyenBay chuyenBay);
	List<ChuyenBay> getAllChuyenBay();
	void deleteChuyenBay(long idCb);
	ChuyenBay updateCB(ChuyenBay chuyenBay);
	ChuyenBay getchuyenbayid(long id);

}
