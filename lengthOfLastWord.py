class Solution:
    
    def lengthOfLastWord(self, s: str) -> int:
        words = s.split(' ')

        for word in words[:: -1]:
            if ' ' not in word and len(word) != 0:
                return len(word)
