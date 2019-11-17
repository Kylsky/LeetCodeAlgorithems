题目：
给定字符串，找出不带重复的最长子字符串

我的思路：
双重循环，从数组第一个元素开始计算当前最大长度，随后计算后续每一个元素打头的最大长度，比较后得出最大长度

运行时间：
125，6%

运行内存：
37.1-39.5M不等

其他解决思路：
1. 设置三个指针，start——起始位置，current——当前位置，maxLength——最大长度，定义一个Map，键为Character类型，值为Integer类型，
    若map中存在s字符串中current位置所在的字符，则需要更新start指针，一般为current+1
    当map中不存在s字符串中current位置所在的字符，则往map中put，键为该字符，值为current指针
    更新maxLength，maxLength计算方法为current-start+1

    优点：使用了String的charAt API，而不是使其转换为字符数组，并通过指针优化了循环套用，使用对象少