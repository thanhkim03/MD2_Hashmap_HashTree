package timKiemNhiPhan;

public interface Tree<E> {
//    chèn phần tử e vào cây tìm kiếm nhị phân
//    trả về true nếu phầ tử đc chèn thành công
    public boolean insert(E e);
//   duyệt từ gốc
    public void  inorder();
// lấy só lượng nút trong cây
    public int getSize();
}
