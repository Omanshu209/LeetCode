# Solution 1 - Slower

class Solution:
    def reverseWords(self, s: str) -> str:
        newStr = ''
        for word in s.split(' ')[::-1]:
            if word != '':
                newStr += word + ' '
        return newStr[:-1]

# Solution 2 - Faster

class Solution:
    def reverseWords(self, s: str) -> str:
        newStr = ''
        words = s.split(' ')[::-1]
        for word in words:
            if word != '':
                newStr += word + ' '
        return newStr[:-1]
