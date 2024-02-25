class Solution:

    def wordPattern(self, pattern: str, s: str) -> bool:
        hashMap: dict = {}
        s = s.split(' ')

        if(len(pattern) != len(s)):
            return False

        for i, (pat, word) in enumerate(zip(pattern, s)):
            if pat not in hashMap:
                if word in hashMap.values():
                    return False
                hashMap[pat] = word
                continue
            elif hashMap[pat] != word:
                return False
        
        return True;
