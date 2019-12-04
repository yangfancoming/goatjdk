# 注意事项： 使用前 需将 IDEA 搜索栏中的   Regex  和  Match Case 两个复选框打钩！！！


# 6. 贪婪匹配与惰性匹配（Greedy vs lazy matching）
    正则表达式默认采用贪婪匹配模式，在该模式下意味着会匹配尽可能长的子串。我们可以使用 ? 将贪婪匹配模式转化为惰性匹配模式。
    
    "/(.*at)/" => The fat cat sat on the mat. 
    
    "/(.*?at)/" => The fat cat sat on the mat. 