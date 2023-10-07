package Java.Youtube.OOP_6.generics;

import java.util.Arrays;
import java.util.List;

// here T should either be number or its subclass
public class WildcardExample<T extends Number>{

        private Object[] data;
        private static int DEFAULT_SIZE = 10;
        private int size = 0; // also working as index value
        public WildcardExample() {
            data = new Object[DEFAULT_SIZE];
        }

        public void getList(List<? extends Number> list) {
            // do something


//             here you can only pass number type
        }

        public void add(T num) {
            if (isFull()){
                resize();
            }
            data[size++] = num;
        }

        private void resize() {
            Object[] temp = new Object[data.length * 2];

            // copy the current items in the new array
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }

        private boolean isFull() {
            return size == data.length;
        }

        public T remove() {
            T removed = (T)(data[--size]);
            return removed;
        }
        public T get(int index) {
            return (T)data[index];
        }

        public int size() {
            return size;
        }

        public void set(int index, T value) {
            data[index] = value;
        }

        @Override
        public String toString() {
            return "CustomArrayList{" +
                    "data=" + Arrays.toString(data) +
                    ", size=" + size +
                    '}';
        }

        public static void main(String[] args) {
//        CustomArrayList list = new CustomArrayList();
//        list.add(3);
//        list.add(5);
//        list.add(2);

//        for (int i = 0; i < 14; i++) {
//            list.add(2 * i);
//        }
//        System.out.println(list);


            CustomArrayList<Integer> list = new CustomArrayList<>();
            for (int i = 0; i < 14; i++) {
                list.add(2 * i);
            }
            System.out.println(list);
        }
    }
