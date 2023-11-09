package Observer;

import javax.security.auth.Subject;

public class HexaObserver extends Observer{

    private final Subject subject;

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.Clone(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}