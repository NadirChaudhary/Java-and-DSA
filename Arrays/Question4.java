public class Question4{
    public static void method(int[] height){
        int waterTraped = 0;
        int left = 0;
        int right = height.length-1;
        int leftMax = height[left];
        int rightMax = height[right];
        while(left < right){
            if(leftMax < rightMax){
                left++;
                leftMax = Math.max(leftMax,height[left]);
                waterTraped += leftMax - height[left];
            } else{
                right--;
                rightMax = Math.max(rightMax,height[right]);
                waterTraped += rightMax - height[right];
            }
        }
        System.out.println("Water trapped after raining : "+ waterTraped);
    }
    public static void main(String[] args){
        int[] height = {4,2,0,6,3,2,5};
        method(height);
    }
}