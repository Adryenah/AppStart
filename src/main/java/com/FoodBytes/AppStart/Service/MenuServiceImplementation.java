package com.FoodBytes.AppStart.Service;

import com.FoodBytes.AppStart.Domain.Menu;
import com.FoodBytes.AppStart.Repository.MenuRepoInterface;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class MenuServiceImplementation implements MenuServiceInterface{

    @Autowired
    private MenuRepoInterface i;

    @Override
    public Menu saveMenu(Menu menu) {
        return i.save(menu);
    }

    @Override
    public List<Menu> getAllMenusByID(Integer menuId) {
        List<Menu> MenuByID=new ArrayList<Menu>();
        List<Menu> AllMenu =i.findAll();
        for (Menu j : AllMenu) {
            if (j.getMenuID()==menuId) {
                MenuByID.add(j);
            }
        }
        return MenuByID;
    }

    @Override
    public Menu updateMenu(Menu menu) {
        int t=menu.getMenuID();
        i.deleteById(t);
        return i.save(menu);
    }

    @Override
    public void deleteMenu(Menu menu) {
        i.delete(menu);
    }
}
