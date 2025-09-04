package com.kh.employee.model.vo;

import java.sql.Date;
import java.util.Objects;

public class Employee {
	private int empId;
	private String empName;
	private String enpNo;
	private String email;
	private int phone;
	private String deptCode;
	private String jobCode;
	private String salLevel;
	private int salary;
	private double bonus;
	private int mangerId;
	private Date hireDate;
	private Date entDate;
	private char entYn;
	
	public Employee() {
		super();
		
	}

	public Employee(int empId, String empName, String enpNo, String email, int phone, String deptCode, String jobCode,
			String salLevel, int salary, double bonus, int mangerId, Date hireDate, Date entDate, char entYn) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.enpNo = enpNo;
		this.email = email;
		this.phone = phone;
		this.deptCode = deptCode;
		this.jobCode = jobCode;
		this.salLevel = salLevel;
		this.salary = salary;
		this.bonus = bonus;
		this.mangerId = mangerId;
		this.hireDate = hireDate;
		this.entDate = entDate;
		this.entYn = entYn;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEnpNo() {
		return enpNo;
	}

	public void setEnpNo(String enpNo) {
		this.enpNo = enpNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getJobCode() {
		return jobCode;
	}

	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}

	public String getSalLevel() {
		return salLevel;
	}

	public void setSalLevel(String salLevel) {
		this.salLevel = salLevel;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public int getMangerId() {
		return mangerId;
	}

	public void setMangerId(int mangerId) {
		this.mangerId = mangerId;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public Date getEntDate() {
		return entDate;
	}

	public void setEntDate(Date entDate) {
		this.entDate = entDate;
	}

	public char getEntYn() {
		return entYn;
	}

	public void setEntYn(char entYn) {
		this.entYn = entYn;
	}

	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", enpNo=" + enpNo + ", email=" + email
				+ ", phone=" + phone + ", deptCode=" + deptCode + ", jobCode=" + jobCode + ", salLevel=" + salLevel
				+ ", salary=" + salary + ", bonus=" + bonus + ", mangerId=" + mangerId + ", hireDate=" + hireDate
				+ ", entDate=" + entDate + ", entYn=" + entYn + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(bonus, deptCode, email, empId, empName, enpNo, entDate, entYn, hireDate, jobCode, mangerId,
				phone, salLevel, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Double.doubleToLongBits(bonus) == Double.doubleToLongBits(other.bonus)
				&& Objects.equals(deptCode, other.deptCode) && Objects.equals(email, other.email)
				&& empId == other.empId && Objects.equals(empName, other.empName) && Objects.equals(enpNo, other.enpNo)
				&& Objects.equals(entDate, other.entDate) && entYn == other.entYn
				&& Objects.equals(hireDate, other.hireDate) && Objects.equals(jobCode, other.jobCode)
				&& mangerId == other.mangerId && phone == other.phone && Objects.equals(salLevel, other.salLevel)
				&& salary == other.salary;
	}
	
	
}
