always use StringBuilder/StringBuffer for string concatenation
pure concat will create more overhead of garbage objects.
Because of the string and other types are immutable