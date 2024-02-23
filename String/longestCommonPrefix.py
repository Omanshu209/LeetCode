class Solution:

    def longestCommonPrefix(self, strs: List[str]) -> str:
        longest = ""

        for i in range(len(min(strs))):
            equal = True
            char = strs[0][i]

            for str in strs:
                if str[i] != char:
                    equal = False
                    break
            
            if equal:
                longest += char
            else:
                break
        
        return longest
