package phl;

public class Dog extends Animal {

	private Integer bones;

	public Integer getBones() {
		return bones;
	}

	public void setBones(Integer bones) {
		this.bones = bones;
	}

	public Dog(String name, String sound, Integer bones) {
		this.setName(name);
		this.setSound(sound);
		this.bones = bones;
	}

	@Override
	public String toString() {
		return "Dog [getBones()=" + getBones() + ", getName()=" + getName() + ", getSound()=" + getSound()
				+ ", toString()=" + super.toString() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((bones == null) ? 0 : bones.hashCode());
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
		Dog other = (Dog) obj;
		if (bones == null) {
			if (other.bones != null)
				return false;
		} else if (!bones.equals(other.bones))
			return false;
		return true;
	}

}
