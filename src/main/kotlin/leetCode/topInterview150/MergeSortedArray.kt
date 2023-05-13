package leetCode.topInterview150

class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        val merged = (nums1.copyOfRange(0, m) + nums2.copyOfRange(0, n)).sorted().toIntArray()
        for (i in merged.indices) {
            nums1[i] = merged[i]
        }
    }
}

fun main() {
    val solution = Solution()
    println(solution.merge(intArrayOf(1,2,3,0,0,0) , 3 , intArrayOf(2,5,6) , 3))
}