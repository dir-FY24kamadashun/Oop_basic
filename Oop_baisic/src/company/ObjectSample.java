package company;

import javax.xml.stream.XMLReporter;

public class ObjectSample {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        var employee = new Employee("鈴木","営業部","課長",100);
        
        employee.report(1);
        employee.report(2);
    }

}
