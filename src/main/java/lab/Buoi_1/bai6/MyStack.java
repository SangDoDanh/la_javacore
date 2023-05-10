package lab.Buoi_1.bai6;

import java.util.Arrays;

public class MyStack {
    private Integer[] value;
    private int size;
    private int moreSize;

    public MyStack() {
        this.moreSize = 10;
        this.value = new Integer[moreSize];
        this.size = 0;

    }

    public int size() {
        return this.size;
    }

    public int push(int value) {
        if (this.moreSize - size <= 5) {
           this.setSize();
        }

        this.value[size] = value;
        this.size ++;
        return value;
    }

    public Integer pop() {
        Integer result = null;
        if (!this.isEmpty()) {
            result = this.value[size - 1];
            this.size --;
        }
        return result;
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
