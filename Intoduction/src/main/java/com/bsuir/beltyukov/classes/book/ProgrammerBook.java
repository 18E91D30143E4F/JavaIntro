package main.java.com.bsuir.beltyukov.classes.book;

public class ProgrammerBook {
	private String language;
	private int level;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((language == null) ? 0 : language.hashCode());
		result = prime * result + level;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProgrammerBook other = (ProgrammerBook) obj;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		if (level != other.level)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return String.format("Language %s. Level %s", language, level);
	}
}
