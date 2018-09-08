package com.test.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//@FunctionalInterface
public interface FunctionalInterfaceTest {

	abstract void test();
	
	abstract boolean equals(Object obj);
	
	abstract String toString();
	
	//abstract void finalize();
	
	public static void main(String[] args) {
		
		List<Integer> listm = Arrays.asList(10,15,40,50);
		List<String> listn = new ArrayList(listm); // that's why we use diamond operator here
		
		Consumer<Integer> consumer = (num) -> {System.out.println("consumed "+num);};
		Supplier<Integer> supplier = () -> { Random ran = new Random();
		return ran.nextInt(100);
		};
		
		final int[] arr = new int[10];
		System.out.println(arr.length);
		List<Integer> list = 
		        Stream.generate(()-> supplier.get()).limit(10).collect(Collectors.toList());
		list.forEach((num)-> System.out.println(num));
		list.forEach(consumer);
		List<Integer> list1 = list.stream().filter((num) -> {
			if(num %5 == 0) {
				System.out.println("num while filtering " + num);
				return true;
			}else {
				return false;
			}
		}).limit(1).collect(Collectors.toList());
		System.out.println("&&&&&&&&&&&&&$$$$$$$$$$$$$$$");
		list1.forEach((num)-> System.out.println(num));
		
		System.out.println("###############################");
		List<String> collect2 = list1.stream().map((num)-> "hi"+num).collect(Collectors.toList());
		collect2.forEach(System.out::println);
		
		
	}
}
/**
 
 public class Object {

    private static native void registerNatives();
    static {
        registerNatives();
    }

    public final native Class<?> getClass();

    public native int hashCode();

    public boolean equals(Object obj) {
        return (this == obj);
    }

    protected native Object clone() throws CloneNotSupportedException;

    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    public final native void notify();

    public final native void notifyAll();

    public final native void wait(long timeout) throws InterruptedException;

    public final void wait(long timeout, int nanos) throws InterruptedException {
        if (timeout < 0) {
            throw new IllegalArgumentException("timeout value is negative");
        }

        if (nanos < 0 || nanos > 999999) {
            throw new IllegalArgumentException(
                                "nanosecond timeout value out of range");
        }

        if (nanos > 0) {
            timeout++;
        }

        wait(timeout);
    }

    public final void wait() throws InterruptedException {
        wait(0);
    }
    protected void finalize() throws Throwable { }
}

 
 */
