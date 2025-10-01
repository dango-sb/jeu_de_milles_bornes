package cartes;

public abstract class Carte {
	@Override
	public boolean equals(Object obj) { 
		if(obj instanceof FinLimite) {
			 if (this.getClass() == obj.getClass()) return true;
		}
		return false; 
	}
}
