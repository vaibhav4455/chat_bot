package com.moglix.InventoryProject.service;

import com.moglix.InventoryProject.dto.Inventory;

public class InventoryServiceImpl implements InventoryServiceIn{
	
	InventoryServiceIn invDao = InventoryServiceImpl.getInstance();
	
	private static InventoryServiceIn inventoryServiceIn;
	
	private InventoryServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	private static InventoryServiceIn getInstance() {
		if(inventoryServiceIn == null) {
			inventoryServiceIn = new InventoryServiceImpl();
			return inventoryServiceIn;
		}
		else
		{
			return inventoryServiceIn;
		}
		
	}
	@Override
	public String addInventory(Inventory inventory) {
		return invDao.addInventory(inventory);

	}
	
	@Override
	public void deleteAllInventory() {
		 invDao.deleteAllInventory();

		
	}
	@Override
	public String deleteInventoryById(String id) {
				return invDao.deleteInventoryById(id);
	}
	@Override
	public Inventory getInventoryById(String empId) {
		return invDao.getInventoryById(empId);

	}
	 
	
	@Override
	public Inventory[] getInventory() {
		return invDao.getInventory();

	}
	
	@Override
	public String updateInventory(String empId, Inventory inventory) {
		return invDao.updateInventory(empId, inventory);

	}
	

}
