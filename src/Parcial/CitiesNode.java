package Parcial;

import DataStructure.Node;

public class CitiesNode implements Node{
	private String ciudades;
	public CitiesNode nextCity = null;
	
	//builder of class CitiesNode
	public CitiesNode(String ciudad){
		this.setCiudades(ciudad);
	}
	

	@Override
	public void setNext(Node node) {
		this.nextCity = (CitiesNode)node;
	}

	@Override
	public Node getNext() {
		return nextCity;
	}

	@Override
	public Node clone() {
		CitiesNode temp = new CitiesNode(this.getCiudades());
		return temp;
	}

	@Override
	public boolean isEqual(Node node) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLessThan(Node node) {
		// TODO Auto-generated method stub
		return false;
	}

	public String getCiudades() {
		return ciudades;
	}

	public void setCiudades(String ciudades) {
		this.ciudades = ciudades;
	}


}