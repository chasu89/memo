package com.chasu89.memo.domain;

public class HaveImageFile implements HaveFile{

	@Override
	public void upload() {
		System.out.println("이미지 파일 업로드");
	}

}
