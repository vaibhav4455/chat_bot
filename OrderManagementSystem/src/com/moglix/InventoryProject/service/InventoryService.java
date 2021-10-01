package com.moglix.InventoryProject.service;

import com.moglix.InventoryProject.dto.Inventory;
import com.moglix.InventoryProject.repository.InventoryDao;

public class InventoryService {
	
	InventoryDao  invDao  = new InventoryDao();
	
	public String addInventory(Inventory inventory) {
		
		return invDao.addInventory(inventory);
		
	}
	
	public Inventory getInventoryById(String empId) {
		return invDao.getInventoryById(empId);
		
	}
	
	public Inventory[] getInventory() {
		return invDao.getInventory();
		
	}
	public void deleteAllInventory() {
		 invDao.deleteAllInventory();
	}
	
	
	public String deleteinventoryById(String id) {
		return invDao.deleteInventoryById(id);
	}
	
	public String updateInventory(String empId, Inventory inventory) {
		return invDao.updateInventory(empId, inventory);
		
	}

	

}
