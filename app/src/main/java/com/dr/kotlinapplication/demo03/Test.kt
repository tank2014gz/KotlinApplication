package com.dr.kotlinapplication.demo03

/**
 * 项目名称：KotlinApplication
 * 类描述：动态代理-客户端
 * 创建人：yuliyan
 * 创建时间：2019/3/26 4:50 PM
 * 修改人：yuliyan
 * 修改时间：2019/3/26 4:50 PM
 * 修改备注：
 * @version
 */
class Test {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            Zoo(Cat()).bark()
        }
    }
}
