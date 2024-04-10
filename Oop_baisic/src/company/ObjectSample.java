package company;


public class ObjectSample {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        var department = new Department("営業部","xx",1000000);
        var employee = new Employee("鈴木", department,"課長",100);
        
        employee.report();
        employee.report(2);
        employee.joinMeeting();
        
        System.out.println("");
        
        var department1 =new Department("開発部","yy",0);
        var engineer =new Engineer("田中",devDepartment,"一般社員",88,"Java");
        
        engineer.report();
        engineer.joinMeeting();
        
        engineer.report();
        engineer.joinMeeting();
        engineer.developSoftware();
        
    }

}
