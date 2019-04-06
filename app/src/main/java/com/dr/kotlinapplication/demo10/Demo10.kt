package com.dr.kotlinapplication.demo10

/**
 * 项目名称：KotlinApplication
 * 类描述：
 * 创建人：yuliyan
 * 创建时间：2019/4/6 4:12 PM
 * 修改人：yuliyan
 * 修改时间：2019/4/6 4:12 PM
 * 修改备注：
 * @version
 */
class Demo10 {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            val a= arrayOf<String>("4", "0", "7", "i", "f", "w", "0", "9");
            val index = arrayOf(5, 3, 9, 4, 8, 3, 1, 9, 2, 1, 7)
            index.filter {
                it<a.size
            }.map {
                a[it]
            }.reduce { acc, s ->
                "$acc$s"
            }.also {
                print(" 密码是:$it")
            }
        }





    }


}
