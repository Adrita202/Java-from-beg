package debjani;

public class Bx {
    public static void main(String[] args) throws Exception {
        Ax objAx = new Ax();
        System.out.println(objAx.getBf());
        objAx.setBf("Test 2");
        System.out.println(objAx.getBf());

        try {
            Ax objAx2 = (Ax) objAx.clone();
        } catch (Exception e) {

        }

        Ax objAx3 = (Ax) objAx.clone();

    }
}
