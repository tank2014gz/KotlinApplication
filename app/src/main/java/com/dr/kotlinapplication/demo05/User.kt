package com.dr.kotlinapplication.demo05

/**
 * 项目名称：KotlinApplication
 * 类描述：
 * 创建人：yuliyan
 * 创建时间：2019/3/26 5:36 PM
 * 修改人：yuliyan
 * 修改时间：2019/3/26 5:36 PM
 * 修改备注：
 * @version
 */
internal class User(var age: Int, var name: String) {
    operator fun component1() = age
    operator fun component2() = name
    operator fun component3() = name + age
}
