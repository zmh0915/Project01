package test;

import com.atguigu.bean.Customer;

import java.util.ArrayList;

/**
 * @author mhzhang
 * @date 2020/1/5-10:03
 */
public class TemplatesTest {
    //模板六：prsf
    private static final Customer customer = new Customer();
    //变形：psf
    public static final int NUM = 1;
    //变形：psfi
    public static final int NUM2 = 2;
    //变形：psfs
    public static final String CONDITION = "China";

    //psvm
    public static void main(String[] args) {
        //sout
        System.out.println("Hello");
        //变形：soutp/ soutm/soutv/xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        
        int num1 = 10;
        System.out.println("num1 = " + num1);
        int num2 = 20;
        System.out.println("num2 = " + num2);
        System.out.println(num1);
        //for循环 fori
        String[] strs = new String[]{"zhangsan","nihao","lalaalla"};
        for (int i = 0; i < strs.length; i++) {

        }
        //变形：iter
        for (String str : strs) {
            
        }
//        变形：itar
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            
        }
        //list.for
        ArrayList lists = new ArrayList();
        lists.add(1);
        lists.add(2);
        lists.add(3);
        lists.add(4);
        for (Object list : lists) {
            
        }
        //变形：list.fori
        for (int i = 0; i < lists.size(); i++) {

        }
        //变形：lists.forr:倒序遍历
        for (int i = lists.size() - 1; i >= 0; i--) {

        }
    }
    public void method(){
        System.out.println("TemplatesTest.method");
        //ifn
        ArrayList lists = new ArrayList();
        lists.add(1);
        lists.add(2);
        lists.add(3);
        lists.add(4);
        if (lists == null) {

        }
        //变形：inn
        if (lists != null) {
            
        }
        //变形：xxx.nn/xxx.null
        if (lists != null) {

        }
        if (lists == null) {

        }
    }
}
