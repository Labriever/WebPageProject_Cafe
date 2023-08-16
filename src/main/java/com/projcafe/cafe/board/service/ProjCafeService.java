package com.projcafe.cafe.board.service;

import java.util.List;
import java.util.Map;

import com.projcafe.cafe.board.repository.ProjCafeVO;

public interface ProjCafeService {

	void insertCafe(ProjCafeVO cafe);

	List<ProjCafeVO> getCafeList(ProjCafeVO cafe);

	List<ProjCafeVO> CafeList(Map<String, Object> map);

	int getCafeListCount(ProjCafeVO vo);

	ProjCafeVO getCafe(int CAFE_ID);

	void updateCafe(ProjCafeVO cafe);

	void deleteCafeTable(int CAFE_ID);

	void deleteCafe(int CAFE_ID);

}