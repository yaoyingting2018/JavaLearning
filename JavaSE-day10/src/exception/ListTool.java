package exception;

public class ListTool {

	/**
	 * 本方法在运行时可能会发生两类异常：
	 * 1、Integer.parseInt(index)这句话可能会发生异常：数字格式异常NumberFormatException
	 * 2、arr[x]可能会发生数组脚标越界异常：ArrayIndexOutofBoundsException
	 * 
	 * 
	 * 既然方法内部可能出现异常，则应该在方法签名上声明可能抛出异常，以提醒调用者对异常进行恰当处理
	 * 
	 * @param arr
	 * @param index
	 * @return
	 */
	public int getIntFromArr(int[] arr,String index) throws Exception {
		
		return arr[Integer.parseInt(index)];
	}
}
