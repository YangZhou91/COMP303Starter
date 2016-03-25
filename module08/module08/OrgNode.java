package module08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class OrgNode
{
	private String aName = "<default>";
	
	public String getName() { return aName; }
	public OrgNode( String pName ) { aName = pName; }
	public String toString() { return getName(); }
}

class University extends OrgNode
{	
	private final List<Faculty> aFaculties = new ArrayList<Faculty>();
	
	public University(String pName) { super(pName); }
	public void addFaculty(Faculty pFaculty) { aFaculties.add(pFaculty); }
	public Iterator<Faculty> getFaculties() { return aFaculties.iterator(); }
}

class Faculty extends OrgNode
{
	private final List<Department> aDepts = new ArrayList<Department>();
	private final List<Committee> aCommittees = new ArrayList<Committee>();
	
	public Faculty(String pName) { super(pName); }
	public void addDepartment(Department pDepartment) { aDepts.add(pDepartment); }
	public void addCommittee(Committee pCommittee) { aCommittees.add(pCommittee); }
	public Iterator<Department> getDepartments() { return aDepts.iterator(); }
	public Iterator<Committee> getCommittees() { return aCommittees.iterator(); }
}

class Department extends OrgNode
{
	private final List<Committee> aCommittees = new ArrayList<Committee>();
	
	public Department(String pName) { super(pName); }
	public void addCommittee(Committee pCommittee) { aCommittees.add(pCommittee); }
	public Iterator<Committee> getCommittees() { return aCommittees.iterator(); }
}

class Committee extends OrgNode
{
	private final List<Committee> aCommittees = new ArrayList<Committee>();
	
	public Committee(String pName) { super(pName); }
	public void addCommittee(Committee pCommittee) { aCommittees.add(pCommittee); }
	public Iterator<Committee> getCommittees() { return aCommittees.iterator(); }
}