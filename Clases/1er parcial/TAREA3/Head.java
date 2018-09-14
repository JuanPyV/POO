public class Head {

  private Eye left, right;

  public Eye getLeft() { return left; }
  public Eye getRight() { return right; }

  public Head(Eye left, Eye right){
    this.right = right;
    this.left = left;
  }
}
