package hw_remarks;

public class InnerObjects {

    public static void main(String[] args) {
        InnerObjects.InnerObject1 object = new InnerObject1();

        InnerObjects objects = new InnerObjects();
        InnerObjects.InnerObject2 object2 = objects.new InnerObject2();
    }

    public static class InnerObject1{

        public InnerObject1() {
        }
    }

    public class InnerObject2 {
        public InnerObject2() {

        }
    }
}
