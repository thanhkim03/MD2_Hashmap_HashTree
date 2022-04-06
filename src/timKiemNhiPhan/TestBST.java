package timKiemNhiPhan;

public class TestBST {
    public static void main(String[] args) {
        BST<String> tree =new BST<>();
        tree.insert("hà nội");
        tree.insert("Hải Phòng");
        tree.insert("Tuyên Quang");
        tree.insert("lào Cai");
        tree.insert("Hòa Bình");
        tree.insert("Phú Thọ");
        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("the number of nodes is: "+tree.getSize());

    }

}
