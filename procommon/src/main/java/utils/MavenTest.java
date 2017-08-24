package utils;

import test.TestAbc;
import test.TestDef;

/**
 * Created by mesen on 2017/8/1.
 */
public class MavenTest {
    public static void main(String[] arg){
        System.out.println(DateUtil.dateS());
        System.out.println(TestAbc.getA());
        System.out.println(TestAbc.getB());
        System.out.println(TestDef.getC());
    }
}
