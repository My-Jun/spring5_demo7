package com.example.demo.reactor8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class TextReactor {

	public static void main(String[] args) {
		// just方法可以直接声明
		// 可多个
		Flux.just("1", "2").subscribe(System.out::print);
		// 一个或没有
		Mono.just("1");

		// 其他方式
		String[] arr = { "1", "2" };
		// 数组
		Flux.fromArray(arr);
		List<String> list = Arrays.asList(arr);
		// 集合
		Flux.fromIterable(list);
		Stream<String> stream = list.stream();
		// 数据流
		Flux.fromStream(stream);
	}

}
