import java.util.*;

public class BinaryTree{
    private int value;
    private BinaryTree left;
    private BinaryTree right;

    public BinaryTree(int value) {
        setValue(value);
    }

    public BinaryTree(int value, BinaryTree left, BinaryTree right) {
        setValue(value);
        setLeft(left);
        setRight(right);
    }

    public void addNode(int value) {
        if (value == this.getValue()) {
            System.out.println("This value already exists in the tree");
            return;
        }
        if (value < this.getValue()) {
            if (this.hasLeft()) {
                this.getLeft().addNode(value);
            } else {
                this.setLeft(new BinaryTree(value));
            }
        } else {
            if (this.hasRight()) {
                this.getRight().addNode(value);
            } else {
                this.setRight(new BinaryTree(value));
            }
        }
    }

    public void removeNode(int value) {
        if (value < this.getValue()) {
            if (this.hasLeft()) {
                this.getLeft().removeNode(value);
            } else {
                System.out.println("The value does not exist in the tree");
            }
        } else {
            if (this.hasRight()) {
                this.getRight().removeNode(value);
            } else {
                System.out.println("The value does not exist in the tree");
            }
        }
    }

    public int getValue() {
        return value;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public BinaryTree getRight() {
        return right;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setLeft(BinaryTree left) {
        this.left = left;
    }

    public void setRight(BinaryTree right) {
        this.right = right;
    }

    public boolean hasLeft() {
        return left != null;
    }

    public boolean hasRight() {
        return right != null;
    }

    public String toString(){
        int h = height(this);
        int i;
        StringBuilder result = new StringBuilder();
        for (i=1; i<=h; i++) {
            result.append(printGivenLevel(this, i));
        }
        return result.toString();
    }

    public int size(){
        return size(this);
    }

    public static int size(BinaryTree tree){
        if(tree == null) return 0;
        return 1 + size(tree.getLeft()) + size(tree.getRight());
    }

    public int height(){
        return height(this);
    }

    public static int height(BinaryTree tree){
        if(tree == null) return 0;
        int left = height(tree.getLeft());
        int right = height(tree.getRight());
        return Math.max(left, right) + 1;
    }

    public String printGivenLevel (BinaryTree root ,int level) {
        if (root == null) return "";
        String result = "";
        if (level == 1) {
            result += root.getValue() + " ";
            return result;
        }else if (level > 1) {
            String left = printGivenLevel(root.left, level-1);
            String right = printGivenLevel(root.right, level-1);
            return left + right;
        }else{
            return "";
        }
    }

    public int getValueBfs(int index){
        Queue<BinaryTree> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        queue.add(this);
        list.add(this.getValue());

        while(index != 0){
            if (queue.peek() != null) {
                BinaryTree peek = queue.poll();

                if (peek.hasLeft()) {
                    queue.add(peek.getLeft());
                    list.add(peek.getLeft().getValue());
                    --index;
                }

                if (index == 0) break;

                if (peek.hasRight()) {
                    queue.add(peek.getRight());
                    list.add(peek.getRight().getValue());
                    --index;
                }
            }
        }

        return list.get(list.size() - 1);
    }

    public int getValueDfs(int index){
        Stack<BinaryTree> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        int size = this.size();

        stack.add(this);

        while(size != 1){
            if (stack.peek() != null) {
                BinaryTree peek = stack.pop();
                list.add(peek.getValue());

                --size;

                if (peek.hasRight()) {
                    stack.add(peek.getRight());
                }

                if (peek.hasLeft()) {
                    stack.add(peek.getLeft());
                }
            }
        }

        BinaryTree peek = stack.pop();
        list.add(peek.getValue());

        return list.get(index);
    }
}