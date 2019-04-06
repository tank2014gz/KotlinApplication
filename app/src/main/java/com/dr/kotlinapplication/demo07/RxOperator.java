package com.dr.kotlinapplication.demo07;


import android.nfc.Tag;
import android.util.Log;
import io.reactivex.*;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import org.reactivestreams.Subscriber;

import java.util.*;

/**
 * 项目名称：KotlinApplication
 * 类描述：
 * 创建人：yuliyan
 * 创建时间：2019/3/26 6:48 PM
 * 修改人：yuliyan
 * 修改时间：2019/3/26 6:48 PM
 * 修改备注：
 */
public class RxOperator {
    public static final String TAG = "RxOperator";

    public static void main(String... args) {
//        operation();
        justOption();
    }

    public static void operation() {
        final List<String> set = new ArrayList<>();
        for (int i = 100; i < 10000; i++) {
            set.add(i + "");
        }
        Observable observable = Observable.create(new ObservableOnSubscribe<Object>() {
            @Override
            public void subscribe(ObservableEmitter emitter) throws Exception {
                for (int i = 0; i < 10; i++) {
                    emitter.onNext(Integer.valueOf(set.get(i)));
                }
//                emitter.onError(new Throwable("已经结束了"));
//                emitter.onNext("我不是Int类型");
                emitter.onComplete();
                emitter.onComplete();
                emitter.onError(new Throwable("已经结束了"));


            }
        });
//                .map(new Function() {
//            @Override
//            public Integer apply(Object o) throws Exception {
//                return Integer.parseInt((String) o);
//            }
//        }).filter(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer o) throws Exception {
//                return o <= 200;
//            }
//        }).mergeWith(Observable.create(new ObservableOnSubscribe() {
//            @Override
//            public void subscribe(ObservableEmitter emitter) throws Exception {
//
//            }
//        }))
//                .subscribeOn(Schedulers.io());
//                .observeOn(AndroidSchedulers.mainThread());

        Observer observer = new Observer<Integer>() {

            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Integer s) {
                System.out.println(s);
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("error:" + e.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("事件结束");
            }
        };
        observable.subscribe(observer);
//        observable.safeSubscribe(observer);

    }


    public static void justOption() {
        Observable.just(1).reduce(

                new String("姓名："), new BiFunction<String, Integer, String>() {
                    @Override
                    public String apply(String s, Integer integer) throws Exception {
                        System.out.println(String.format("s=%s,integer=%d", s, integer));
                        return s + integer;
                    }
                }).subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {
                System.out.println(String.format("s=%s", s));
            }
        });

        Observable.just(1).reduce(Observable.just("89897:9999").blockingFirst(), new BiFunction<String, Integer, String>() {
            @Override
            public String apply(String s, Integer integer) throws Exception {
                return s + "LL" + integer;
            }
        }).subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {
                System.out.println(s);
            }
        });
    }

}
