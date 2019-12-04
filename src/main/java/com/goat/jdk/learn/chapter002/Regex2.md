# 注意事项： 使用前 需将 IDEA 搜索栏中的   Regex  和  Match Case 两个复选框打钩！！！

# 2.1 点运算符 .
    .是元字符中最简单的例子。 .匹配任意单个字符，但不匹配换行符。 例如，表达式.ar匹配一个任意字符后面跟着是a和r的字符串。
    ".ar" =>
     The car parked in the garage.
    
    
# 2.2 字符集
    字符集也叫做字符类。 方括号用来指定一个字符集。 在方括号中使用连字符来指定字符集的范围。 在方括号中的字符集不关心顺序。 例如，表达式[Tt]he 匹配 the 和 The。
    "[Tt]he" => 
    The car parked in the garage.
    
    方括号的句号就表示句号。 表达式 ar[.] 匹配 ar.字符串
    "ar[.]" =>
     A garage is a good place to park a car.
    
    
# 2.2.1 否定字符集
    一般来说 ^ 表示一个字符串的开头，但它用在一个方括号的开头的时候，它表示这个字符集是否定的。 例如，表达式[^c]ar 匹配一个后面跟着ar的除了c的任意字符。
    "[^c]ar" => 
    The car parked in the garage.
    
    
# 2.3 重复次数
    后面跟着元字符 +  *  ?  这三种符号的，用来指定匹配子模式的次数。 这些元字符在不同的情况下有着不同的意思。
    
#2.3.1 * 号
    *号匹配 在*之前的字符出现大于等于0次。 例如，表达式 a* 匹配0或更多个以a开头的字符。表达式[a-z]* 匹配一个行中所有以小写字母开头的字符串。
    "[a-z]*" => 
    The car parked in the garage #21.
    
    *字符和.字符搭配可以匹配所有的字符.*。 *和表示匹配空格的符号\s连起来用，如表达式\s*cat\s*匹配0或更多个空格开头和0或更多个空格结尾的cat字符串。
    "\s*cat\s*" => 
    The fat cat sat on the concatenation.
    
# 2.3.2 + 号
    +号匹配  +号之前的字符出现 >=1 次。 
    例如表达式c.+t 匹配以首字母c开头以t结尾，中间跟着至少一个字符的字符串。
    "c.+t" 
     => The fat cat sat on the mat.
     
# 2.3.3 ? 号
     在正则表达式中元字符 ? 标记在符号前面的字符为可选，即出现 0 或 1 次。 例如，表达式 [T]?he 匹配字符串 he 和 The。
     "[T]he" =>
      The car is parked in the garage.
     
     "[T]?he" => 
     The car is parked in the garage.
     
     
# 2.4 {} 号
     在正则表达式中 {} 是一个量词，常用来一个或一组字符可以重复出现的次数。 例如， 表达式 [0-9]{2,3} 匹配最少 2 位最多 3 位 0~9 的数字。
     "[0-9]{2,3}" => The number was 9.9997 but we rounded it off to 10.0.
     
     我们可以省略第二个参数。 例如，[0-9]{2,} 匹配至少两位 0~9 的数字。
     "[0-9]{2,}" => The number was 9.9997 but we rounded it off to 10.0.
     
     如果逗号也省略掉则表示重复固定的次数。 例如，[0-9]{3} 匹配3位数字
     "[0-9]{3}" => The number was 9.9997 but we rounded it off to 10.0.
     
     
# 2.5 (...) 特征标群
     特征标群是一组写在 (...) 中的子模式。例如之前说的 {} 是用来表示前面一个字符出现指定次数。但如果在 {} 前加入特征标群则表示整个标群内的字符重复 N 次。例如，表达式 (ab)* 匹配连续出现 0 或更多个 ab。
     我们还可以在 () 中用或字符 | 表示或。例如，(c|g|p)ar 匹配 car 或 gar 或 par.
     "(c|g|p)ar" => The car is parked in the garage.
     
# 2.6 | 或运算符
     或运算符就表示或，用作判断条件。
     例如 (T|t)he|car 匹配 (T|t)he 或 car。
     "(T|t)he|car" => The car is parked in the garage.
     
     
# 2.7 转码特殊字符
     反斜线 \ 在表达式中用于转码紧跟其后的字符。用于指定 { } [ ] / \ + * . $ ^ | ? 这些特殊字符。如果想要匹配这些特殊字符则要在其前面加上反斜线 \。
     例如 . 是用来匹配除换行符外的所有字符的。如果想要匹配句子中的 . 则要写成 \. 以下这个例子 \.?是选择性匹配.
     "(f|c|m)at\.?" => The fat cat sat on the mat.
     
     
     
     
#2.8 锚点
     在正则表达式中，想要匹配指定开头或结尾的字符串就要使用到锚点。^ 指定开头，$ 指定结尾。
     
#2.8.1 ^ 号
     ^ 用来检查匹配的字符串是否在所匹配字符串的开头。
     例如，在 abc 中使用表达式 ^a 会得到结果 a。但如果使用 ^b 将匹配不到任何结果。因为在字符串 abc 中并不是以 b 开头。
     例如，^(T|t)he 匹配以 The 或 the 开头的字符串。
     "(T|t)he" => The car is parked in the garage.
     
     "^(T|t)he" => The car is parked in the garage.
     
# 2.8.2 $ 号
     同理于 ^ 号，$ 号用来匹配字符是否是最后一个。
     例如，(at\.)$ 匹配以 at. 结尾的字符串。
     "(at\.)" => The fat cat. sat. on the mat.
     
     "(at\.)$" => The fat cat. sat. on the mat.