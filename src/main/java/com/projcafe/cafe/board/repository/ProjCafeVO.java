package com.projcafe.cafe.board.repository;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProjCafeVO {
	
	private int CAFE_ID;
	private String CAFE_NAME;
	private String CAFE_LOCATION;
	
	private String CAFE_OPERATETIME;
	private String CAFE_PHONENUMBER;
	private String CAFE_SNS;
	private String CAFE_INTRODUCTION;
	private String CAFE_IMAGE;
	
	private String GIFTYCORN_CLN;
	private MultipartFile UPLOADIMAGE;
	private String CAFE_LAT;
	private String CAFE_LONG;
	
	private String SEARCHKEYWORD; // 카페 리스트 검색 기능 추가
	
	private String SEARCHCONDITION;
	
	private int STARTPAGE; //페이징
	private int ENDPAGE; //페이징
	private int MAXPAGE; //페이징

	
	
	
}
