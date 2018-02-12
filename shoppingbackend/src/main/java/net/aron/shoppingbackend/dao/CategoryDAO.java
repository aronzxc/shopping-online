package net.aron.shoppingbackend.dao;

import java.util.List;

import net.aron.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);

}
