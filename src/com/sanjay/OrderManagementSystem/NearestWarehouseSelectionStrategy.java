package com.sanjay.OrderManagementSystem;

import java.util.List;

import com.sanjay.InventoryManagementSystem.Warehouse;
import com.sanjay.InventoryManagementSystem.WarehouseSelectionStrategy;

public class NearestWarehouseSelectionStrategy extends WarehouseSelectionStrategy {

	@Override
	public Warehouse selectWarehouse(List<Warehouse> warehouseList) {
		// TODO Auto-generated method stub
		return warehouseList.get(0);
	}

}
