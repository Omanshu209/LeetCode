class Solution:
    def reverseWords(self, s: str) -> str:
        newStr = ''
        for word in s.split(' ')[::-1]:
            if word != '':
                newStr += word + ' '
        return newStr[:-1]
