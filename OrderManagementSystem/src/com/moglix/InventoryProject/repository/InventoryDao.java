package com.moglix.InventoryProject.repository;

import com.moglix.InventoryProject.dto.Inventory;

public class InventoryDao {
	
    private static int counter =0;
	
	Inventory inventory[] = new Inventory[10];
	
	
	public String addInventory(Inventory inventory1){
		
		if(counter<inventory.length) {
			
			inventory[counter++] = inventory1;
			return "success";
		}
		
		else
		{
			return "array is full";
		}

}
	
	
	public Inventory getInventoryById(String id) {
		
		for (Inventory inventory2 : inventory) {
			
			if(inventory2 != null && id.equals(inventory2.getInvId())){
				
				return inventory2;
			}
			
		}
	 return null;
	}
	
	
	public Inventory[] getInventory() {
		
		return inventory;
	}
	
	
	private int  getIndex(String id) {
		for (int i = 0; i < inventory.length; i++) {
			if(inventory[i] != null && inventory[i].getInvId().equals(id)) {
				return i;
			}
			
		}
		return -1;
	}
	
	
	public String deleteInventoryById(String id) {
		
		int index = this.getIndex(id);
		if(index !=-1) {
			inventory[index] = null;
			return "success";
		}
		else {
			return "notfound";
		}
}
	
	public String updateInventory(String id , Inventory inventory2) {
		
		int index = this.getIndex(id);
		if(index !=-1) {
			inventory[index] = inventory2;
			return "success";
		}
		else {
			return "notfound";
		}
	
	}
	
	
	public void deleteAllInventory() {
		inventory = null;
		
	}
	

}
