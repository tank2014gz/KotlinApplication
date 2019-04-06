package com.dr.kotlinapplication.demo10

/**
 * 项目名称：KotlinApplication
 * 类描述：
 * 创建人：yuliyan
 * 创建时间：2019/4/6 5:21 PM
 * 修改人：yuliyan
 * 修改时间：2019/4/6 5:21 PM
 * 修改备注：
 * @version
 */


fun main() {

}

fun <T, E> Iterable<T>.covert1(action: (T) -> E): MutableList<E> {
    val list: MutableList<E> = mutableListOf()
    for (item in this) list.add(action(item))
    return list
}


fun <T, E> Iterable<T>.convert2(action: (T) -> E): MutableList<E> {
    val list = mutableListOf<E>()
    this.forEach {
        list.add(action(it))
    }
    return list

}
