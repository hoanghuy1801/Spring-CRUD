package com.example.SpringCRUD.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringCRUD.entity.ChuyenBay;
import com.example.SpringCRUD.repository.ChuyenBayRepository;


@Service
public class ChuyenBayServiceImp implements ChuyenBayService {
	private ChuyenBayRepository chuyenBayRepository;
	@Autowired
	public ChuyenBayServiceImp(ChuyenBayRepository theChuyenBayRepository) {
		chuyenBayRepository=theChuyenBayRepository;
		// TODO Auto-generated constructor stub
	}



	@Override
	public ChuyenBay saveChuyeBay(ChuyenBay chuyenBay) {
		// TODO Auto-generated method stub
		return chuyenBayRepository.save(chuyenBay);
	}



	@Override
	public List<ChuyenBay> getAllChuyenBay() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.findAll();
	}



	@Override
	public void deleteChuyenBay(long idCb) {
		// TODO Auto-generated method stub
		chuyenBayRepository.deleteById(idCb);
		
	}



	@Override
	public ChuyenBay updateCB(ChuyenBay chuyenBay) {
		// TODO Auto-generated method stub
		return chuyenBayRepository.save(chuyenBay);
		
	}



	@Override
	public ChuyenBay getchuyenbayid(long id) {
		// TODO Auto-generated method stub
		return chuyenBayRepository.getById(null);
	}



	






}
