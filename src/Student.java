public class Student{

        private int id;
        private String name;
        private int grade;
        private int feesPaid;
        private int feesTotal;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return this.grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getFeesPaid() {
		return this.feesPaid;
	}

	public void setFeesPaid(int feesPaid) {
		this.feesPaid = feesPaid;
	}

	public int getFeesTotal() {
		return this.feesTotal;
	}

	public void setFeesTotal(int feesTotal) {
		this.feesTotal = feesTotal;
	}


        public Student( int id, String name, int grade){
            feesPaid=0;
            feesTotal=30000;
            this.id = id;
            this.name= name;
            this.grade =grade;

        }

        public void updateFeesPaid( int fees){
            feesPaid+=fees;
        }

}