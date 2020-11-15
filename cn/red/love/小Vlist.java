package cn.red.love;

public class 小Vlist<T> {

     int num1=count;
     int num2=count;
    static int count = 0;
    Object[] list = new Object[100];
    int firstkey = 0;

    void append(T s) {
        list[firstkey] = s;
    }

    T get(int index) {
        return (T) list[index];
    }

    void add(T index) {
        list[count] = index;
        count++;
    }

    void set(int index, T s) {
        list[index] = s;
    }

    void remove(int index) {
        list[index] = 0;

    }

    class itr implements 小VIterator<T> {

        @Override
        public boolean hasNext() {
            return false;//?????
        }

        @Override
        public T next() {
          return null;//???????
        }
    }

    public 小VIterator iterator() {
        return new itr();
    }
}

