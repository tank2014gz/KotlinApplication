package com.dr.kotlinapplication.demo07

/**
 * 项目名称：KotlinApplication
 * 类描述：
 * 创建人：yuliyan
 * 创建时间：2019/3/26 6:20 PM
 * 修改人：yuliyan
 * 修改时间：2019/3/26 6:20 PM
 * 修改备注：
 * @version
 */
class DemoOperator {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            listOperator()
        }

        /**
         * 集合操作符
         */
        fun listOperator() {
            val list = arrayListOf<Char>('a', 'b', 'c', 'd')
            val a = list.map { it - 'a' }
                .filter { it > 0 }
                .findLast { it > 1 }
//                .find { it > 1 }
            println(a)
        }

    }
}
