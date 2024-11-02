package part2;

public class Student {
	int id;
	String name;
	float math;
	float physic;
	float chemistry;
	float average_score;
	String rate;

	public Student() {
	}

	public Student(int id, String name, float math, float physic, float chemistry, float average_score,
			String rate) {
		this.id = id;
		this.name = name;
		this.math = math;
		this.physic = physic;
		this.chemistry = chemistry;
		this.average_score = average_score;
		this.rate = rate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMath() {
		return math;
	}

	public void setMath(float math) {
		this.math = math;
	}

	public float getPhysic() {
		return physic;
	}

	public void setPhysic(float physic) {
		this.physic = physic;
	}

	public float getChemistry() {
		return chemistry;
	}

	public void setChemistry(float chemistry) {
		this.chemistry = chemistry;
	}

	public float getAverage_score() {
		return average_score;
	}

	public void setAverage_score(float average_score) {
		this.average_score = average_score;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Student id: " + id + ", name:" + name + ", Math: " + math + ", Physic: " + physic + ", Chemistry: "
				+ chemistry + ", Average score: " + average_score + ", Rate: " + rate;
	}

}
