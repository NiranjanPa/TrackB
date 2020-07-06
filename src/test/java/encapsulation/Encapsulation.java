package encapsulation;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       EncapChild Child = new EncapChild();
       Child.setEmpid(100);
       Child.setName("Niranjan");
       Child.setExperience(2);
       System.out.println(Child.getName()+ " whose id is "+ Child.getEmpid()+" having experience of "+ Child.getExperience()+"years");
	}

}
