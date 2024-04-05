package sampleJava8;

import java.util.Optional;

public class OptionalProgram {
	public static void main(String[] args) {
		String name=null;
		Optional<String>a=Optional.of(name);
		Optional<String>b=Optional.ofNullable(name);
		System.out.println(a);
		System.out.println(b);
		System.out.println(b.isPresent());
		System.out.println(b.isEmpty());
		System.out.println(b.orElse("String is null"));
		if(b.isPresent()) {
			System.out.println(name.toUpperCase());
		}
		else {
			System.out.println("It is empty");
		}
	}
}
