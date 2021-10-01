package com.moglix.InventoryProject.service;

import com.moglix.InventoryProject.dto.Inventory;

public interface InventoryServiceIn {
	
	public String addInventory(Inventory inventory);
	public Inventory getInventoryById(String empId) ;
	public Inventory[] getInventory();
	public void deleteAllInventory();
	public String deleteInventoryById(String id);
	public String updateInventory(String empId, Inventory inventory);

	

}
