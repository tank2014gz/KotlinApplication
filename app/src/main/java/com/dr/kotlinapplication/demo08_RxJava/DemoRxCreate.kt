package com.dr.kotlinapplication.demo08_RxJava

import io.reactivex.Observable

/**
 * 项目名称：KotlinApplication
 * 类描述：
 * 创建人：yuliyan
 * 创建时间：2019/4/5 10:46 PM
 * 修改人：yuliyan
 * 修改时间：2019/4/5 10:46 PM
 * 修改备注：
 * @version
 */
class DemoRxCreate {


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("-------example1-------------")
            createExample()
            println("-------example2-------------")
            createExample2()

        }

        fun createExample() {
            Observable.just("this is create demo")
                .subscribe(
                    { println("create Example: msg:$it") },
                    { println("createExample,error:${it.message ?: "unknown Error"}") },
                    { println("createExample,onComplete") })
        }

        fun createExample2() {
            Observable.just("this is create demo")
                .subscribe(
                    { println("createExample2: msg:$it") },
                    { println("createExample2,error:${it.message ?: "unknown Error"}") },
                    { println("createExample2,onComplete") },
                    { println("createExample2,subscribe") }
                )
        }

    }
}
