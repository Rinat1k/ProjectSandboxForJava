package javacourses.nestedClasses;

public class Outer {

    private int privateOuterValue = 10;

    public int getPrivateOuterValue() {
        return privateOuterValue;
    }

    public class NestedClass {
        private int privateNestedValue = 10;

        public static void nestedStaticMethod() {
            System.out.println("Nested static method");
        }

        public int getPrivateOuterValue() {
            return privateOuterValue;
        }
    }

    void methodWithLocalInnerClass() {
        int value = 10;

        class LocalInnerClass extends NestedClass {
            @Override
            public String toString() {
                int val = value;
                super.getPrivateOuterValue();
                return getClass().getName() + privateOuterValue;
            }
        }

        LocalInnerClass localInnerClass = new LocalInnerClass();
        System.out.println(localInnerClass);
    }

}
