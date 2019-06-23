/**
  1、 泛型参数的应用是属于java中的高级语法，用于开发框架，平常开发几乎用不上
**/
泛型就是用来代表一个类型名的参数，使用方法如下：

```java
public class SortUtil<T>{
public void sort(ArrayList<T> list){
	
	// 具体逻辑
	
}
}

```

上面这就是一个带泛型的类，在使用时，就需要传递泛型参数值（具体类型名）

```java
main{
	ArrayList<User> uList = new ArrayList<User>();
	SortUtil<User> sortUtil = new SortUtile<>();
	


sortUtil.sort(uList)


}

```

/**

```
2、利用接口封装排序框架

```

**/

```java
public class SortUtil {
	

public static void sort(ArrayList<User> uList,BijiaoQi bijiaoQi) {
	for(int i=0;i<uList.size()-1;i++) {
		for(int j=0;j<uList.size()-1-i;j++) {
			// 利用用户将来传入的比较器进行两个数据的比较
			boolean bijiao = bijiaoQi.bijiao(uList.get(j), uList.get(j+1));
			
			if(bijiao) {
				User tmp = uList.get(j);
				uList.set(j, uList.get(j+1));
				uList.set(j+1, tmp);
			}
		}
		
	}
	
}

}

```

其中，BijiaoQi是一个接口，用户在使用框架的时候，必须传入这个接口的一个实现类对象

```java
public interface BijiaoQi {
	

public boolean bijiao(User u1,User u2);

}

```

然后，用户在使用框架时，代码示例如下：

```java
public class Test {
	public static void main(String[] args) {
		

​	ArrayList<User> uList = new ArrayList<>();
​	User u1 = new User("1", "a", 18,2000);
​	User u2 = new User("2", "b", 19,3000);
​	User u3 = new User("3", "c", 28,1800);
​	User u4 = new User("4", "d", 20,2300);
​	uList.add(u1);
​	uList.add(u2);
​	uList.add(u3);
​	uList.add(u4);
​	
​	// 专门新建一个比较器实现类，然后new出来传进去
​	SortUtil.sort(uList, new AgeBijiaoqi());
​	
​	// 或者使用匿名内部类来传递具体的比较器对象
​	SortUtil.sort(uList, new BijiaoQi() {
​		
​		@Override
​		public boolean bijiao(User u1, User u2) {
​			if(u1.getSalary() > u2.getSalary()) {
​				return true;
​			}
​			return false;
​		}
​	});
​	
}

}
```

/**
3、 Collections工具的排序使用
**/

// 使用方式1： 将需要排序的List<User> 和 list中的数据类型User的比较器 传给框架来排序

```java
Collections.sort(uList,new Comparator<User>(){
	

public int compare(User o1,User o2){
	if(o1.getSalary > o2.getSalary){
		return 1;
	}
	
	if(o1.getSalary == o2.getSalary){
		return 0;
	}else{
		return -1;	
	}
}

​	
});
```

// 使用方式2：将需要排序的List<User>传递给框架即可， 不需要传比较器（前提是，数据类User本身要带一个compareTo方法）

```java
public class User implements Comparable<User>{
	// 属性.....
	
	

public int compareTo(User o2){
	if(this.getSalary > o2.getSalary){
		return 1;
	}
	
	if(this.getSalary == o2.getSalary){
		return 0;
	}else{
		return -1;	
	}
	
}

}


```

今天的作业：
1、自己扎扎实实写一个排序工具（可以不使用泛型，比如写死为排 List<User>）

2、造一点User的list数据，造一点Product的list数据，然后用Collections工具的两种方式对这些数据排序

3、扩充题：  利用泛型来写一个自己的通用排序工具！！！

