package com.dr.kotlinapplication.demo05

/**
 * 项目名称：KotlinApplication
 * 类描述：对象结构---(,)括号中的对象同时赋值的情况被称为结构
 * 创建人：yuliyan
 * 创建时间：2019/3/26 5:38 PM
 * 修改人：yuliyan
 * 修改时间：2019/3/26 5:38 PM
 * 修改备注：
 * @version
 */

class TestComponent {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val user = User(19, "dongran")
            val (age, name, newName) = user
            println(age)
            println(name)
            println(newName)
            val map = mapOf("小明" to "中国", "lisa" to "美国")
            for ((name, country) in map) {
                println("name:$name,country:$country")
            }

        }
    }
}
