# No-duplicate-longest-substring
给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。来自：力扣

# Main 本人所写，利用了HashSet不能有重复元素特性，在添加重复元素的时候会返回false并且不能添加成功，依次功能设计算法。
# 此算法在用时和占用内存上都存在很大的提升空间。

# Main 大神缩写，看懂后直呼WOC，用res保存历史最长的无重复字符区间长的，start 保存的是出现了重复字符后的上一个重复字符的后一个元素的位置。
# 这样就可以直接用i-start+1表示当前字符之前共有多少个不同的字符，并于res做对比保存下来。堪称神迹！！
