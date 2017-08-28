package phl;

public class Cat extends Animal{
	
	private Integer caughtMouses;
		
	public Integer getCaughtMouses() {
		return caughtMouses;
	}

	public void setCaughtMouses(Integer caughtMouses) {
		this.caughtMouses = caughtMouses;
	}

	public Cat(String name, String sound, Integer caughtMouses){
		this.setName(name);
		this.setSound(sound);
	}

	@Override
	public String toString() {
		return "Cat [getCaughtMouses()=" + getCaughtMouses() + ", hashCode()=" + hashCode() + ", getName()=" + getName()
				+ ", getSound()=" + getSound() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((caughtMouses == null) ? 0 : caughtMouses.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		if (caughtMouses == null) {
			if (other.caughtMouses != null)
				return false;
		} else if (!caughtMouses.equals(other.caughtMouses))
			return false;
		return true;
	}

}
