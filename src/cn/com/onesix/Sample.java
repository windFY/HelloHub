package cn.com.onesix;

public class Sample {
	private String name;
	private String sex;
	public Sample(String name,String sex){
		this.name = name;
		this.sex = sex;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Sample [name=" + name + ", sex=" + sex + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
