package part1;

public class Student {

	String id;
	String name;
	float math;
	float physic;
	float chemistry;
	float average_score;
	String rate;

	public Student() {
	}

	public Student(String id, String name, float math, float physic, float chemistry, String rate,
			float average_score) {
		super();
		this.id = id;
		this.name = name;
		this.math = math;
		this.physic = physic;
		this.chemistry = chemistry;
		this.rate = rate;
		this.average_score = average_score;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getRate() {
		return rate;
	}

	public void setRate(float value) {
		String result = "";
		if (value >= 5) {
			result = "Ordinary";
		}
		if (value >= 6) {
			result = "Average good";
		}
		if (value >= 7) {
			result = "Good";
		}
		if (value >= 8) {
			result = "Verry good";
		}
		if (value >= 9) {
			result = "Excellent";
		}
		if (value < 5) {
			result = "Weak";
		}
		this.rate = result;
	}

	public float getAverage_score() {
		return average_score;
	}

	public void setAverage_score(float value_1, float value_2, float value_3) {
		this.average_score = (value_1 + value_2 + value_3) / 3;
	}

}
