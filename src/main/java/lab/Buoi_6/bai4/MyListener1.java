package lab.Buoi_6.bai4;

import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;

public class MyListener1 implements RowSetListener {

    @Override
    public void rowSetChanged(RowSetEvent rowSetEvent) {
        System.out.println("Cursor Moved ...");
    }

    @Override
    public void rowChanged(RowSetEvent rowSetEvent) {
        System.out.println("Thay doi it nhat 1 truong");
    }

    @Override
    public void cursorMoved(RowSetEvent rowSetEvent) {
        System.out.println("Thay doi it tat ca cac truong");

    }
}