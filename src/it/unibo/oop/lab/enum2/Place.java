package it.unibo.oop.lab.enum2;

import java.util.ArrayList;
import java.util.List;

public enum Place {
	INDOOR, OUTDOOR;
	
	public List<Sport> getSports(){
		final ArrayList<Sport> list = new ArrayList<>();
		for (final Sport s: Sport.values()) {
			if (s.getPlace() == this) {
				list.add(s);
			}
		}
		return list;
	}
}
