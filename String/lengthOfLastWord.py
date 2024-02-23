class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        for word in s.split(' ')[:: -1]:
            if len(word) != 0:
                return len(word)
