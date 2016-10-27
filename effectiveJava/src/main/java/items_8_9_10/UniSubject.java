package items_8_9_10;

public class UniSubject {
	
	private String content;
	private String professor;
	private int year;

	public UniSubject(String content, String professor, int year) {
		this.content = content;
		this.professor = professor;
		this.year = year;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof UniSubject)) {
			return false;
		}
		UniSubject subj = (UniSubject) obj;
		return subj.content == content && subj.professor == professor && subj.year == year;
	}
	
	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + content.hashCode();
		result = 31 * result + professor.hashCode();
		result = 31 * result + year;
		return result;
	}
	
	@Override
	public String toString() {
		return "[Content = " + content + ", Professor = " + professor + ", Year = " + year + "]";
	}
	
}
