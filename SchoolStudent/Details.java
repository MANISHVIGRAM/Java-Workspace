
public class Details {
		final static  String school = "SKV";
		String name;
		final int reg;
		final double fee;
		int tam;
		int eng;
		int mat;
		int sci;
		int ss;
		Details(String name,int reg , double fee,int tam,int eng,int mat,int sci,int ss){
			this.name = name;
			this.reg = reg;
			this.fee = fee;
			this.tam=tam;
			this.eng=eng;
			this.mat=mat;
			this.sci=sci;
			this.ss=ss;
		}
		void display() {
			System.out.println("Student name : "+name);
			System.out.println("Student reg : "+reg);
			System.out.println("Student fee : "+fee);
			System.out.println("tamil="+tam);
			System.out.println("English="+eng);
			System.out.println("Maths="+mat);
			System.out.println("Science="+sci);
			System.out.println("Social="+ss);
		}

		int total() {
			int t = (tam)+(eng)+(mat)+(sci)+(ss);
			return t;
			}
		double avg() {
			double avg = (tam + eng + mat + sci +ss)/5;
			return avg;
		}

		String PassOrFail() {
			if(tam>=35&&eng>=35&&mat>=35&&sci>=35&&ss>=35) {
				return "PASS";
			}
			else {
				return "FAIL";
			}
		}
}
