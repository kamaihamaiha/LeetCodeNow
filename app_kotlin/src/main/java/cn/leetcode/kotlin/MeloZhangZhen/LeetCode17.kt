package cn.leetcode.kotlin.MeloZhangZhen

/**
17. 电话号码的字母组合

 回溯法:回溯法（探索与回溯法）是一种选优搜索法，又称为试探法，按选优条件向前搜索，
以达到目标。但当探索到某一步时，发现原先选择并不优或达不到目标，
就退回一步重新选择，这种走不通就退回再走的技术为回溯法，
而满足回溯条件的某个状态的点称为“回溯点”。

在回溯法中，每次扩大当前部分解时，都面临一个可选的状态集合，新的部分解就通过在该集合中选择构造而成。这样的状态集合，其结构是一棵多叉树，每个树结点代表一个可能的部分解，它的儿子是在它的基础上生成的其他部分解。树根为初始状态，这样的状态集合称为状态空间树。
回溯法对任一解的生成，一般都采用逐步扩大解的方式。每前进一步，都试图在当前部分解的基础上扩大该部分解。它在问题的状态空间树中，从开始结点（根结点）出发，以深度优先搜索整个状态空间。这个开始结点成为活结点，同时也成为当前的扩展结点。在当前扩展结点处，搜索向纵深方向移至一个新结点。这个新结点成为新的活结点，并成为当前扩展结点。如果在当前扩展结点处不能再向纵深方向移动，则当前扩展结点就成为死结点。此时，应往回移动（回溯）至最近的活结点处，并使这个活结点成为当前扩展结点。回溯法以这种工作方式递归地在状态空间中搜索，直到找到所要求的解或解空间中已无活结点时为止。
回溯法与穷举法有某些联系，它们都是基于试探的。穷举法要将一个解的各个部分全部生成后，才检查是否满足条件，若不满足，则直接放弃该完整解，然后再尝试另一个可能的完整解，它并没有沿着一个可能的完整解的各个部分逐步回退生成解的过程。而对于回溯法，一个解的各个部分是逐步生成的，当发现当前生成的某部分不满足约束条件时，就放弃该步所做的工作，退到上一步进行新的尝试，而不是放弃整个解重来。
 */

object LeetCode17 {
    val mConstant= arrayListOf<String>("","",
            "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz")
    val backArray= arrayListOf<String>()

    @JvmStatic
    fun main(args: Array<String>) {


        letterCombinations("222")
    }

    fun letterCombinations(digits: String): List<String> {
        //优先判空
        if (digits.isEmpty()){
            return arrayListOf()
        }
        addString(digits,0, StringBuffer())
        return backArray
    }

    /**
     * 树枝一样的形状台阶  回溯 有点像 爬楼梯的那道题
     */
    fun addString(digits:String,index :Int,sb:StringBuffer) {
        //加到一样的长度了就要搞进去
        if (index==digits.length){
            backArray.add(sb.toString())
            return
        }
        //获取该数字 并转成 abc  2->abc
        val nIn=digits.toCharArray()
        val nIns=nIn[index].toString().toInt()

      val mStringChar=  mConstant[nIns].toCharArray()
        //加三个
        mStringChar.forEach {
                //这里面在递归
                addString(digits,index+1,sb.append(it))
                //回溯!
                sb.deleteCharAt(sb.length-1 )
        }

    }
}
