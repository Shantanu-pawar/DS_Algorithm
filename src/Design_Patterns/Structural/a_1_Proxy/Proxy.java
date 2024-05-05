package Design_Patterns.Structural.a_1_Proxy;

interface EmployeeDao{
    void create(String client);
}

class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String client) {
        System.out.println("new employee created by admin");
    }
}

class EmployeeDaoProxy implements EmployeeDao{

    EmployeeDao emp;
    EmployeeDaoProxy(){
        emp = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client) {
        // controlling access level here
        if(client.equals("Admin")){
            emp.create(client);
        }
        else System.out.println("Access Denied");
    }
}


public class Proxy {
    public static void main(String[] args) {
        EmployeeDao obj = new EmployeeDaoProxy();
        obj.create("Admin");
    }
}

