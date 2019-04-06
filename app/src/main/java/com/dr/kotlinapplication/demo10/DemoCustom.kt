package com.dr.kotlinapplication.demo10

/**
 * 项目名称：KotlinApplication
 * 类描述：
 * 创建人：yuliyan
 * 创建时间：2019/4/6 5:10 PM
 * 修改人：yuliyan
 * 修改时间：2019/4/6 5:10 PM
 * 修改备注：
 * @version
 */

fun main() {
    myOption()
}


fun myOption() {
    val list: List<Int> = listOf(1, 2, 4, 6, 9)
    list.convert {
        it + 1
    }.forEach {
        print("$it, ")
    }
}

inline fun <T, E> Iterable<T>.convert(action: (T) -> E): MutableList<E> {
    val list = mutableListOf<E>()
    for (item in this) list.add(action(item))
    return list
}
