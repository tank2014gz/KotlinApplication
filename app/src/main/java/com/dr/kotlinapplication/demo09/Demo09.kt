package com.dr.kotlinapplication.demo09

/**
 * 项目名称：KotlinApplication
 * 类描述：类的解构
 *      Kotlin中允许代码中对象拆解，分别赋值
 *      operator：将一个函数标记为重载一个操作符或者实现一个约定
 * 创建人：yuliyan
 * 创建时间：2019/4/6 3:44 PM
 * 修改人：yuliyan
 * 修改时间：2019/4/6 3:44 PM
 * 修改备注：
 * @version
 */
class Demo09 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val user=User(12,"张三")
            val (age,name)=user
            println("age:$age,name:$name")

        }


    }


    class User(var age: Int, var name: String) {
        operator fun component1() = age
        operator fun component2() = name
    }
}
