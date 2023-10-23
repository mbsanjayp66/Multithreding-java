package com.sanjay.OrderManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Inventory {
	List<ProductCategory> productCategoryList;

    Inventory(){
        productCategoryList = new ArrayList<>();
    }

    //add new category
    public void addCategory(int categoryId, String name, int price){
        ProductCategory productCategory = new ProductCategory();
        productCategory.price = price;
        productCategory.categoryName = name;
        productCategory.productCategoryId = categoryId;
        productCategoryList.add(productCategory);
    }


    //add product to the particular category
    public void addProduct(Product product, int productCategoryId){

        //take out the respective productCategory Object
        ProductCategory categoryObject = null;
        for(ProductCategory category : productCategoryList)
        {
            if(category.productCategoryId == productCategoryId){
                categoryObject = category;
            }
        }

        if(categoryObject !=null) {
            categoryObject.addProduct(product);
        }
    }

	public void removeItems(Map<Integer, Integer> productCategoryAndCountMap) {
		// TODO Auto-generated method stub
		
	}


}
