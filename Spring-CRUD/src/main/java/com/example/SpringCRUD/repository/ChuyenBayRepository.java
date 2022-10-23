package com.example.SpringCRUD.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.SpringCRUD.entity.ChuyenBay;




@Repository
@Transactional
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, Long> {
}
