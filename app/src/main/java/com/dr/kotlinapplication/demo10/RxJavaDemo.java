package com.dr.kotlinapplication.demo10;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/**
 * 项目名称：KotlinApplication
 * 类描述：
 * 创建人：yuliyan
 * 创建时间：2019/4/6 4:13 PM
 * 修改人：yuliyan
 * 修改时间：2019/4/6 4:13 PM
 * 修改备注：
 */
public class RxJavaDemo {


    public static void main(String... args) {
        final String[] chars = {"4", "0", "7", "i", "f", "w", "0", "9"};
        final Integer[] index = {5, 3, 9, 4, 8, 3, 1, 9, 2, 1, 7};
        Observable.just(index)
                .flatMap(new Function<Integer[], ObservableSource<Integer>>() {
                             @Override
                             public ObservableSource<Integer> apply(Integer[] ints) throws Exception {
                                 return Observable.fromArray(ints);
                             }
                         }
                ).filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer < chars.length;
            }
        }).map(new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) throws Exception {
                return chars[integer];
            }
        }).reduce(new BiFunction<String, String, String>() {

                      @Override
                      public String apply(String s, String s2) throws Exception {
                          return s + s2;
                      }
                  }

        ).subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {
                System.out.println("密码是：" + s);
            }
        });

    }


}
