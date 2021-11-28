package Assignment(23-nov-2021);

public class RightSight {
  
        static int levelSoFar = 0;
        
        public static void main(String[] args) {
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.right.left = new Node(5);
            root.right.left.right= new Node(6);
            root.right.left.right.left= new Node(7);
            
            printLeRightElements(root, 0);
        }
        private static void printLeRightElements(Node root, int currentLevel) {
            if(root == null) return;
            
            if(currentLevel>=levelSoFar) {
                System.out.println(root.key);
                levelSoFar++;
            }
            
            printLeRightElements(root.right, currentLevel+1);
            printLeRightElements(root.left, currentLevel+1);
            
        }
    
}
