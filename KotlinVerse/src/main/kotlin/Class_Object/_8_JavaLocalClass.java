package Class_Object;

import kotlin.jvm.internal.Ref.IntRef;

class _8_JavaLocalClass {

    public static void main(String[] args) {
        final IntRef x = new IntRef();
        x.element = 1;

        final int y = 2;

        // Inner 클래스, 익명(anonymous) 클래스 내부에서 외부의 변수를 접근할 때는 final 변수만 접근이 가능하다.
        final class Counter {
            public final void increment() {
                x.element++;
                System.out.println(y); // y에 final이 붙지 않으면 오류
                // 자바에서는 포획한 변수의 값을 변경 할 수 없다.
                // y++; // 오류: Variable 'y' is accessed from within inner class, needs to be final or effectively final
            }
        }


        new Counter().increment();

        System.out.println(x.element);

    }
}
