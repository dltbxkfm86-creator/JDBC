package com.kh.controller;

import com.kh.model.vo.Plant;

public class PlantController {

	public void plantSave(int plantId, String plantName, String species, String wateringCycle, int sunlight,
			String createAt) {
		
		Plant plant = new Plant(plantId, plantName, species, wateringCycle, sunlight, createAt);
		
		
	}

}
