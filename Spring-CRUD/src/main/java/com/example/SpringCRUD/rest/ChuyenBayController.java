package com.example.SpringCRUD.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringCRUD.entity.ChuyenBay;
import com.example.SpringCRUD.service.ChuyenBayService;



@RestController
@RequestMapping("/api")
public class ChuyenBayController {
	private ChuyenBayService chuyenBayService;
	@Autowired
	public ChuyenBayController(ChuyenBayService theChuyenBayService) {
		chuyenBayService=theChuyenBayService;
		// TODO Auto-generated constructor stub
	}

	@PostMapping("/chuyenbays")
	public ChuyenBay AddChuyenBay(@RequestBody ChuyenBay chuyenBay) {
		
		 return chuyenBayService.saveChuyeBay(chuyenBay);
		
	}
	@GetMapping("/chuyenbays")
	public List<ChuyenBay> getAllChuyenBay() {
		
		 return chuyenBayService.getAllChuyenBay();
		
	}
	@DeleteMapping("/chuyenbays/{idCb}")
	public void deleteChuyenBay(@PathVariable long idCb) {
		
		  chuyenBayService.deleteChuyenBay(idCb);
		
	}
	
	@PutMapping("/chuyenbays")
	public ChuyenBay updateCB(@RequestBody ChuyenBay chuyenBay) {
		
		 return chuyenBayService.updateCB(chuyenBay);
		
	}



}
