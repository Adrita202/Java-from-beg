package debjani;

public class Ax implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    private String bf;

    {
        bf = "Test";
    }

    public String getBf() {
        return bf;
    }

    protected void setBf(String bf) {
        this.bf = bf;
    }
}
