package builder.message;


public class GoodbyeBuilder extends Builder {

    public GoodbyeBuilder(){
        msg = new GoodbyeMessage();
    }
    @Override
    public void buildBody() {
        // TODO Auto-generated method stub
    	msg.setBody("��������");
    }

    @Override
    public void buildSubject() {
        // TODO Auto-generated method stub
    	msg.setSubject("���ͱ���");
    }

}