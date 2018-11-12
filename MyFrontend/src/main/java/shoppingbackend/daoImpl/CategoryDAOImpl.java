/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingbackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import shoppingbackend.dao.CategoryDAO;
import shoppingbackend.dto.Category;

/**
 *
 * @author Saurabh
 */

//@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO{
    private static List<Category> categories=new ArrayList<>();
    static{
        Category category= new Category();
        category.setId(1);
        category.setActive(true);
        category.setDescription("description about television");
        category.setName("Television");
        category.setImageURL("Cat_1.jpg");
        categories.add(category);
        
        category= new Category();
                category.setId(2);
        category.setActive(true);
        category.setDescription("description about IPhone");
        category.setName("Iphone");
        category.setImageURL("Cat_2.jpg");
        categories.add(category);
        category= new Category();
                category.setId(3);
        category.setActive(true);
        category.setDescription("description about Laptops");
        category.setName("Laptops");
        category.setImageURL("Cat_3.jpg");
        categories.add(category);  
        System.out.println(categories);
    }
        @Override
    public List<Category> list() {
        return categories;                      
    }    
}
