//package com.springapp.mvc;
//
//import com.springapp.model.Categories;
//import com.springapp.model.CategoriesDao;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
//import java.util.List;
//
///**
// * Created by murat on 13/12/14.
// */
//public class CategoriesTest extends AbstractTest {
//    @PersistenceContext
//    EntityManager entityManager;
//    @Autowired
//    CategoriesDao categoriesDao;
//
//    @Test
//    public void getCategory() {
//        Categories cat = categoriesDao.getCat();
//        Query query = entityManager.createQuery("select b from Categories b");
//        List<Categories> baskets = query.getResultList();
//        Categories categories = entityManager.find(Categories.class, 1l);
//        System.out.println(categories.getCategoriName());
//    }
//
//    @Test
//    @Transactional
//    public void saveCategory() {
//        Categories categories = new Categories();
//        categories.setCategoriName("mrt");
//        entityManager.persist(categories);
//        System.out.println(categories.getCategoriName());
//    }
//
//
//}
