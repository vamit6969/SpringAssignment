package com.yash.itempurchasedbycustomer;

public class Category {

	private String categoryName;
	
	public Category() {
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "Category [categoryName=" + categoryName + "]";
	}
	
	
}
