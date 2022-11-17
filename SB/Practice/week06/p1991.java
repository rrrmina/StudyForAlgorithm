package SB.Practice.week06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1991 {
  static int N;
  static class Node {
    char self;
    Node left, right;
    public Node(char self)
    {
      this.self = self;
    }

    public String toString(){
      return self + "";
    }
  }
  // 트리 순회
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    N = Integer.parseInt(br.readLine());

    Node[] orgNode = new Node[N];
    char al = 'A';
    for (int i = 0; i < N; i++)
      orgNode[i] = new Node(al++);

    for (int i = 0; i < N; i++) {
      char[] line = br.readLine().toCharArray();
      orgNode[line[0] - 65].left = line[2]=='.'? null : orgNode[line[2] - 65];
      orgNode[line[0] - 65].right = line[4]=='.'? null : orgNode[line[4] - 65];
    }

    //전위
    System.out.println(preorder(orgNode[0]));
    //중위
    System.out.println(inorder(orgNode[0]));
    //후위
    System.out.println(postorder(orgNode[0]));
  }

  // 본인 - 좌측 - 우측
  static String preorder(Node node)
  {
    String result = "";
    result += node.self;
    if (node.left != null)
      result += preorder(node.left);
    if (node.right != null)
      result += preorder(node.right);
    return result;
  }
  // 좌측 - 본 - 우측
  static String inorder(Node node)
  {
    String result = "";

    if (node.left != null)
      result += inorder(node.left);
    result += node.self;
    if (node.right != null)
      result += inorder(node.right);
    return result;
  }
  // 좌측 - 우측 - 본인
  static String postorder(Node node)
  {
    String result = "";
    if (node.left != null)
      result += postorder(node.left);
    if (node.right != null)
      result += postorder(node.right);
    result += node.self;
    return result;
  }

}
