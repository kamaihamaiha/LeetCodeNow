package cn.leetcode.kotlin.melo


object LeetCodeLetApplyWith {
    @JvmStatic
    fun main(args: Array<String>) {
        val i = testLet()
        val i2 = testApply()
        val i3 = testWith()
        reapt()
    }

    fun testApply() {
        ArrayList<String>().apply {
            add("apply1")
            add("apply2")
            add("apply3")
        }.let { print(it) }
    }

    fun testLet(): Int {
        "testLet".let {
            println(it)
            println(it)
            println(it)
            return 1
        }
    }

    fun testWith() {
        val arr = with(ArrayList<String>()) {
            add("testWith")
            add("testWith")
            add("testWith")
            this
        }.let { println(it) }
    }

    fun reapt() {
        repeat(20) {
            println("Hello world")

        }

    }
}

