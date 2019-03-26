package com.dr.kotlinapplication.demo06

/**
 * 项目名称：KotlinApplication
 * 类描述：
 * 创建人：yuliyan
 * 创建时间：2019/3/26 5:55 PM
 * 修改人：yuliyan
 * 修改时间：2019/3/26 5:55 PM
 * 修改备注：
 * @version
 */
class DemoForRecycle {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            for04()

            repeat(10) {
                println(it)

            }
        }


        /**
         * [1,10]
         */
        fun for01() {
            for (i in 1..10) {
                println("i=$i")
            }
        }

        /**
         * [10,1]
         */
        fun for02() {
            for (i in 10 downTo 1) {
                println("i=$i")
            }
        }

        /**
         *[1,10)
         */
        fun for03() {
            for (i in 1 until 10) {
                println("i=$i")
            }
        }

        /**
         * [1,10) step n
         */
        fun for04() {
            for (i in 1..10 step 3) {
                println("i=$i")
            }
        }
    }

}
