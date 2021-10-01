package com.moglix.InventoryProject.repository;

import com.moglix.InventoryProject.dto.Inventory;

public interface InventoryRepository {
	
	public String addInventory(Inventory inventory1);
	public Inventory getInventoryById(String id);
	public Inventory[] getInventory();
	public String deleteInventoryById(String id);
	public String updateInventory(String id , Inventory inventory2);
	public void deleteAllInventory();

}
