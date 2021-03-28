package com.recipes.list.main.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.recipes.list.main.service.RecipeInterface;

@ResponseStatus(code = HttpStatus.NOT_FOUND,reason = "Searched record not found")
public class RecordNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private String errorcode;
	private String message;
	
	public RecordNotFoundException() {}
	
	public RecordNotFoundException (String errorcode, String message) {
		this.errorcode = errorcode;
		this.message = message;
	}
	@Autowired
	RecipeInterface recipeImp;

	
	public String getErrorcode() {
		return errorcode;
	}

	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
