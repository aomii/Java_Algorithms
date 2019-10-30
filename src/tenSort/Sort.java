package tenSort;



/**
 * @ClassName Sort
 * @Description: 十大排序
 * @Author Thinkpad
 * @Date 2019/10/30
 * @Version V1.0
 **/
public class Sort {
    public static void main(String[] args) {
        //1冒泡
        int[] arr={4,6,1,3,2,5,9,8,7,0};
        bubble(arr);

        //2选择
        select(arr);
    }
    /*
     * @MethodName: select
     * @Description: TODO
     * @Param: [arr]
     * @Return: void
     * @Author: Thinkpad
     * @Date: 2019/10/30
     **/
    private static void select(int[] arr) {

    }


    /*
     * @MethodName: Bubble
     * @Description: 1冒泡
     * @Param: [arr]
     * @Return: void
     * @Author: Thinkpad
     * @Date: 2019/10/30
     **/
    private static void bubble(int[] arr) {
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-i-1 ; j++) {
                if (arr[j]>arr[j+1]){
                    //下标为j和j+1交换位置
                    arr[j]=arr[j]^arr[j+1];
                    arr[j+1]=arr[j]^arr[j+1];
                    arr[j]=arr[j]^arr[j+1];
                }
            }
        }
        //打印
        println(arr);
    }


    /*
     * @MethodName: println
     * @Description: TODO
     * @Param: [arr]
     * @Return: void
     * @Author: Thinkpad
     * @Date: 2019/10/30
     **/
    private static void println(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i:arr
             ) {
            sb.append(arr[i]+",");
        }
        sb.deleteCharAt(sb.length()-1).append("]");
        System.out.println(sb.toString());

    }

}
