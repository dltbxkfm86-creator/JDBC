package com.kh.model.vo;

import java.util.Objects;

public class Plant {
	
	private int plantId;
	private String plantName;
	private String species;
	private String wateringCycle;
	private int sunlight;
	private String createAt;
	
	public Plant() {
		super();
		
	}

	public Plant(int plantId, String plantName, String species, String wateringCycle, int sunlight, String createAt) {
		super();
		this.plantId = plantId;
		this.plantName = plantName;
		this.species = species;
		this.wateringCycle = wateringCycle;
		this.sunlight = sunlight;
		this.createAt = createAt;
	}

	public int getPlantId() {
		return plantId;
	}

	public void setPlantId(int plantId) {
		this.plantId = plantId;
	}

	public String getPlantName() {
		return plantName;
	}

	public void setPlantName(String plantName) {
		this.plantName = plantName;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getWateringCycle() {
		return wateringCycle;
	}

	public void setWateringCycle(String wateringCycle) {
		this.wateringCycle = wateringCycle;
	}

	public int getSunlight() {
		return sunlight;
	}

	public void setSunlight(int sunlight) {
		this.sunlight = sunlight;
	}

	public String getCreateAt() {
		return createAt;
	}

	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}

	@Override
	public String toString() {
		return "Plant [plantId=" + plantId + ", plantName=" + plantName + ", species=" + species + ", wateringCycle="
				+ wateringCycle + ", sunlight=" + sunlight + ", createAt=" + createAt + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(createAt, plantId, plantName, species, sunlight, wateringCycle);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plant other = (Plant) obj;
		return Objects.equals(createAt, other.createAt) && plantId == other.plantId
				&& Objects.equals(plantName, other.plantName) && Objects.equals(species, other.species)
				&& sunlight == other.sunlight && Objects.equals(wateringCycle, other.wateringCycle);
	}
	
	
	
	
}
