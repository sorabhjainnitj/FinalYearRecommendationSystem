/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingbackend.dao;

import java.util.List;
import shoppingbackend.dto.Category;
/**
 *
 * @author Saurabh
 */
public interface CategoryDAO {
    
    List<Category> list();
}
