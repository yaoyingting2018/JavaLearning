package sortutil2;

import java.util.ArrayList;

/**
 * SortUtil<T>里面的T是声明了一个代表“类型”的参数符号
 * 然后在SortUtil类中，就可以用T这个符号来代替具体的类型名
 * 
 * 这就是泛型
 * @author ThinkPad
 *
 * @param <T>
 */
public class SortUtil<T> {

	public void sort(ArrayList<T> list, BijiaoQi<T> bijiaoqi) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - 1 - i; j++) {
				boolean da = bijiaoqi.bijiao(list.get(j), list.get(j + 1));
				if (da) {
					T tmp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, tmp);
				}

			}

		}

	}

}

