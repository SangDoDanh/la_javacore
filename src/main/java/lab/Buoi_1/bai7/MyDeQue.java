package lab.Buoi_1.bai7;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class MyDeQue {
    private Integer[] value;
    private int size;
    private int moreSize;

    public MyDeQue() {
        this.moreSize = 10;
        this.value = new Integer[moreSize];
        this.size = 0;

    }

    public int size() {
        return this.size;
    }

    // thêm phần tử vào cuối
    public Boolean add(int value) {
        if (this.moreSize - size <= 5) {
            this.setSize();
        }

        this.value[size] = value;
        this.size ++;
        return true;
    }

    // thêm phần tử vào cuối
    public void addLast(int value) {
        this.add(value);
    }

    // them phan tu vao dau
    public void addFirst(int value) {
        if (this.moreSize - size < 5) {
            this.setSize();
        }
        int i = this.size;

        while( i > 0) {
            this.value[i] = this.value[i - 1];
        }

        this.value[0] = value;
        this.size ++;
    }

    /**
     * sử dụng để truy xuất và loại bỏ phần đầu của deque này
     * @return phần tử đầu của deque này hoặc trả về null nếu deque trống.
     */
    public Integer poll() {
        if (this.size == 0) {
            return null;
        }
        int result = this.value[0];
        int i = 0;

        while (i < this.size - 1 ) {
            this.value[i] = this.value[i + 1];
            i ++;
        }

        this.size --;
        return result;
    }

    /**
     * sử dụng để truy xuất và loại bỏ phần đầu của deque này
     * @return phần tử đầu của deque này hoặc trả về null nếu deque trống.
     */
    public Integer pollFirst() {
       return this.poll();
    }

    /**
     * sử dụng để truy xuất và loại bỏ phần cuoi của deque này
     * @return phần tử đầu của deque này hoặc trả về null nếu deque trống.
     */
    public Integer pollLast() {
        if (this.size == 0) {
            return null;
        }
        int result = this.value[this.size - 1];
        this.size --;
        return result;
    }

    /**
     * Lấy ra và truy xuất đến phần tử đầu của deque này,
     * không loại bỏ phần tử này
     *
     * @return phần tử đầu hoặc null nếu deque này trống
     */
    public Integer peek() {
        if(this.size == 0) {
            return null;
        }

        return this.value[0];
    }

    /**
     * Lấy ra và truy xuất đến phần tử đầu của deque này
     * @return phần tử đầu hoặc null nếu deque này trống
     */
    public Integer peekFirst() {
        return  this.peek();
    }


    /**
     * Lấy ra và truy xuất đến phần tử cuối của deque này
     * @return phần tử đầu hoặc null nếu deque này trống
     */
    public Integer peekLast() {
        if(this.size == 0) {
            return null;
        }

        return  this.value[size-1];
    }

    public boolean removeFirst() {
        return this.poll() != null;
    }

    public boolean removeLast() {
        return this.pollLast() != null;
    }


    public boolean insert(int value, int index) {
        if (this.moreSize - size < 5) {
            this.setSize();
        }
        if (index >= this.size)
            return false;
        int i = this.size;
        while (i > index) {
            this.value[i] = this.value[i - 1];
            i --;
        }
        this.value[index] = value;
        this.size ++;
        return true;
    }


    void demo() {
        Deque<String> demoQ = new LinkedList<>();

    }


    public boolean isEmpty() {
        return this.size == 0;
    }

    private void setSize() {
        this.moreSize += 10;
        Integer[] tmpValue = Arrays.copyOf(this.value, this.moreSize);
        this.value = tmpValue;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer("");
        result.append("[");

        for (int i = 0 ; i < size; i++) {
            if(i == size - 1) {
                result.append(this.value[i]);
            } else {
                result.append(this.value[i] + ", ");
            }
        }

        result.append("]");
        return result.toString();
    }
}
