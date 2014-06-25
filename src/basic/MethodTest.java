package basic;
/**
 * 
 */

import java.lang.reflect.InvocationTargetException;
/**
 * @author jes2ica
 *
 */
import java.lang.reflect.Method;

/**
 * @author Administrator
 *
 */
public class MethodTest {

    static void staticMethod()
    {
        System.out.println("执行staticMethod()方法");
    }
    public int publicMethod(int i)
    {
        System.out.println("执行publicMethod()方法");
        return i*20;
    }
    protected int protectedMethod(String s,int  i) throws NumberFormatException{
        System.out.println("执行protectedMethod()方法");
        return Integer.valueOf(s)+i;
    }
    private String privateMethod(String[] strings){
        System.out.println("执行privateMethod()方法");
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=0;i<strings.length;i++)
        {
            stringBuffer.append(strings[i]);
        }
        return stringBuffer.toString();
    }
    /**
     * @param args
     * @throws InvocationTargetException 
     * @throws IllegalAccessException 
     * @throws IllegalArgumentException 
     */
    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        // TODO Auto-generated method stub
        //实例化一个对象：
        MethodTest methodTest = new MethodTest();
        
        Method[] declaredMethods = MethodTest.class.getDeclaredMethods();  //获得所有的方法
        Method method = declaredMethods[2];
        System.out.println("名称："+method.getName());   //方法名称
        System.out.println("是否允许带有可变参数变量:"+method.isVarArgs());//
        System.out.println("入口参数类型依次为：");
        Class[] parameterTypes = method.getParameterTypes();//获得方法所有的参数类型
        for(int j = 0;j<parameterTypes.length;j++)
        {
        	System.out.println("parameterTypes[" + j + "]" + parameterTypes[j]);
        }
        System.out.println("返回值类型："+method.getReturnType()); //获得方法返回值类型
        System.out.println("可能抛出异常类型有：");
        Class[] exceptionTypes = method.getExceptionTypes();  //获得可能抛出的所有异常类型
        for(int j=0;j<exceptionTypes.length;j++){
        	System.out.println("exceptionTypes[" + j + "]" + exceptionTypes[j]);
        }
        System.out.println("返回值：" + method.invoke(methodTest,168));
    }

}
