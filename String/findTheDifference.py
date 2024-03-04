class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        chars: dict = {}

        for char in s:
            if char not in chars:
                chars[char] = 1
                continue
            chars[char] += 1
        
        for char in t:
            if char not in chars or chars[char] == 0:
                return char
            chars[char] -= 1
