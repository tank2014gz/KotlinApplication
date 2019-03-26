package com.dr.kotlinapplication.demo04

/**
 * 项目名称：KotlinApplication
 * 类描述：
 * 创建人：yuliyan
 * 创建时间：2019/3/26 5:08 PM
 * 修改人：yuliyan
 * 修改时间：2019/3/26 5:08 PM
 * 修改备注：
 * @version
 */
class Test {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            exec(SupperCommand.B)
        }

        fun exec(supperCommand: SupperCommand) = when (supperCommand) {
            SupperCommand.A -> {
                println("中国")
            }
            SupperCommand.B -> {
                println("美国")
            }
            SupperCommand.C -> {
                println("俄罗斯")
            }
            SupperCommand.D -> {
                println("印度")
            }
        }

    }


}
