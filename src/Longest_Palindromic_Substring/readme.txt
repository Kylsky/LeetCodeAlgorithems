题目：
给定字符串，找出最长的回文字符串

我的思路：
将字符串reverse，定义指针start，current，maxLength，若匹配，则向后匹配，更新current，更新maxLength
若不匹配，则更新start，一般为current+1（使用Math.max)
ps：我失败了

运行时间：

运行内存：


其他解决思路：
1.  回文分为两类，一类是奇数、一类是偶数，