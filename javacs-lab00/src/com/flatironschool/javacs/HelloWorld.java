package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
	String myProperty = "java.specification.version";
	return System.getProperty(myProperty);
    }

    public static void main(String[] args) {
	Double javaVersion = getVersion();
	System.out.println(javaVersion);
    }
}
