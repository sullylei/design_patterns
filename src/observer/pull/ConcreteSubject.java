package observer.pull;

public class ConcreteSubject extends Subject{
    
    private String state;
    
    public String getState() {
        return state;
    }

    public void change(String newState){
        state = newState;
        System.out.println("����״̬Ϊ��" + state);
        //״̬�����ı䣬֪ͨ�����۲���
        this.nodifyObservers();
    }
}