package top.bs.proxy_lib;

import libXray.DialerController;
import libXray.LibXray;
import libXray.RunXrayRequest;
import libXray.TestXrayRequest;

/**
 * @author: Xht
 * @Time: 2025/4/14
 * 作用：
 */
public class Test {
        public static void main(String[] args) {


            String s = LibXray.xrayVersion();
            System.out.println(s);
        }
}
