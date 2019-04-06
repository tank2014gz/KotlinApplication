package com.dr.kotlinapplication.demo08_RxJava

import android.annotation.SuppressLint
import android.util.Log
import io.reactivex.Observable
import io.reactivex.ObservableOnSubscribe
import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.TimeUnit

/**
 * 项目名称：KotlinApplication
 * 类描述：
 * 创建人：yuliyan
 * 创建时间：2019/4/5 11:25 PM
 * 修改人：yuliyan
 * 修改时间：2019/4/5 11:25 PM
 * 修改备注：
 * @version
 */
class DemoColdAndHot {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            coldObservable()
        }


        fun coldObservable() {

            val observable = Observable.create(
                ObservableOnSubscribe<Long> { emitter ->
                    Observable.interval(10L, TimeUnit.MILLISECONDS, Schedulers.computation())
                        .take(Long.MAX_VALUE)
                        .subscribe {
                            if (it <= 10) emitter.onNext(it)
                            else emitter.onComplete()
                        }
                }
            ).observeOn(Schedulers.newThread()).publish()
            observable.connect()
//            observable.subscribe { println("coldObservable,subscribe-1value:$it") }
            observable.subscribe { println("coldObservable,subscribe-2value:$it") }
        }
    }
}
