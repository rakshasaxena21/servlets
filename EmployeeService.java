package com.cg.service;

import java.util.List;

import com.cg.dao.EmployeeDAO;
import com.cg.dao.IEmployeeDAO;
import com.cg.exceptions.EMSException;
import com.cg.models.Employee;

public class EmployeeService implements IEmployeeService {
private IEmployeeDAO dao = null;

	public EmployeeService() {
		dao = new EmployeeDAO();
	}
	
	@Override
	public int add(Employee e) throws EMSException {
		return dao.add(e);
	}

	@Override
	public List<Employee> getAll() throws EMSException {
		return dao.getAll();
	}

	@Override
	public void update(Employee e)throws EMSException {
		dao.update(e);
	}
	
	@Override
		public Employee search(int empid) throws EMSException {
			return dao.search(empid);
		}

}
