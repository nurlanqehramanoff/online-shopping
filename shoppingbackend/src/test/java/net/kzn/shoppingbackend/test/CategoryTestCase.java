package net.kzn.shoppingbackend.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;



public class CategoryTestCase {
	
	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO;
	
	private Category category;
	

	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.kzn.shoppingbackend");
		context.refresh();		
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}
	
	
	/*@Test
	public void addCategory() {		
		category = new Category();
		category.setName("Television");
		category.setDescription("This is some description for television!");
		category.setImageURL("CAT_1.png");
		assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));			
	}*/
	
	/*@Test
	public void testGetCategory() {
		category = categoryDAO.get(1);
		System.out.println(category);
	}*/
	
	@Test
	public void testGetCategory() {
		category = categoryDAO.get(1);
		category.setName("TV");
		assertEquals("Successfully updated into category inside the table!",true,categoryDAO.update(category));			

	}
}
