package Chapter9;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

public class UnMFC {

	//回傳Collection類別的值; 傳入Collection的值。
	//表示接受的集合元素的型別是 T 或 T 的子型別。
	//上限通配符 (extends) 允許處理特定型別及其子型別，而下限通配符 (super) 允許處理特定型別及其父型別。
    public static <T> Collection<T> unmodifiableCollection(Collection<? extends T> c) {
        return new UnmodifiableCollection<>(c);
    }
    //內部的類別
    static class UnmodifiableCollection<E> implements Collection<E>, Serializable {
        private static final long serialVersionUID = 1820017752578914078L;
        final Collection<? extends E> c; //成員變數c;

        UnmodifiableCollection(Collection<? extends E> c) { //建構子(式)初始化成員變數;
            if (c == null)
                throw new NullPointerException();
            this.c = c;
        }

        public boolean add(E e) {
            throw new UnsupportedOperationException(); //修改會拋出意外，不可修改
        }

        public boolean remove(Object o) {
            throw new UnsupportedOperationException(); //修改會拋出意外，不可修改
        }

        public boolean containsAll(Collection<?> coll) {
            return c.containsAll(coll);
        }

		@Override
		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean contains(Object o) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Iterator<E> iterator() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object[] toArray() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <T> T[] toArray(T[] a) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean addAll(Collection<? extends E> c) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean removeAll(Collection<?> c) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean retainAll(Collection<?> c) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void clear() {
			// TODO Auto-generated method stub
			
		}

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    }
}
