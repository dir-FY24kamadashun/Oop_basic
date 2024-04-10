package company;

public class ParttimeWorker implements Workable{
    
    protected final String name;
    private final Department department;
    
    public ParttimeWorker(String name,Department department) {
        this.name=name;
        this.department=department;
        this.position=position;
        this.employeeId=employeeId;
        
        
    }
    public void report(int times) {
        System.out.println(times+"回目の報告をします。役職；"+position+"、名前：”+name);"
                
    }
    public void report() {
    report(1);
}
    
    public abstract void joinMeeting();
    @Override
    public void work() {
        System.out.println("正社員として働きます。名前："+name+slogan);
    }
    }