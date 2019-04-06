package com.dr.kotlinapplication.demo08_RxJava

import android.annotation.SuppressLint
import com.dr.kotlinapplication.demo08_RxJava.DemoRxCreate.Companion.createExample2
import io.reactivex.Observable


/**
 * 项目名称：KotlinApplication
 * 类描述：
 * 创建人：yuliyan
 * 创建时间：2019/4/5 11:06 PM
 * 修改人：yuliyan
 * 修改时间：2019/4/5 11:06 PM
 * 修改备注：
 * @version
 */
class DemoRxLifeCycle {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("-------example1-------------")
            createExample()
            println("-------example2-------------")
            createExample2()

        }

        @SuppressLint("CheckResult")
        fun createExample() {
            Observable.just("this is lifeCycleExample")
                .doOnSubscribe {
                    println("lifeCycleExample:doOnSubscribe")
                }.doOnEach {
                    println(
                        "lifeCycleExample:doOnEach--:${when {
                            it.isOnNext -> "onNext"
                            it.isOnError -> "onError"
                            it.isOnComplete -> "onComplete"
                            else -> "nothing"
                        }
                        }"
                    )
                }
                .doOnNext{
                     //在onNext前调用
                    println("lifeCycleExample:doOnNext$it")
                }
                .doAfterNext{
                    //在onNext后调用
                    println("lifeCycleExample:doAfterNext$it")
                }
                .doOnError {
                    //在onError前调用
                    println("lifeCycleExample:doOnError${it.message?:"unknown Error"}")
                }
                .doOnComplete {
                    //正常调用onComplete时被调用
                    println("lifeCycleExample:doOnComplete")
                }
                .doFinally{

                    //终止后调用不管是正常执行或者异常终止,优先于doAfterTerminate执行
                    println("lifeCycleExample:doFinally")
                }
                .doAfterTerminate {

                    //当onComplete或者onError执行后被触发
                    println("lifeCycleExample:doAfterTerminate")
                }
                .subscribe(
                    { println("lifeCycleExample: msg:$it") },
                    { println("lifeCycleExample:error:${it.message ?: "unknown Error"}") },
                    { println("lifeCycleExample:onComplete") },
                    { println("lifeCycleExample:subscribe") }
                )
        }

        fun createExample2() {

        }

    }
}
