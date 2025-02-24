package Chapter_17_Static.Singleton;

public class ProductView {
    public class Singleton {
        // 정적 참조 변수(싱글톤 객체를 담을 변수)
        private static Singleton instance;

        // private 생성자
        private Singleton() {
        }

        // getInstance()
        public Singleton getInstance() {
            Singleton singletonObject = null;
            if (singletonObject == null) {
                singletonObject = new Singleton();
            }

            return singletonObject;
        }
    }


}
