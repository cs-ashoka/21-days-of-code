class Solution:
    def longestCommonPrefix(self, strings: list[str]) -> str:
        def _longest(str_o: str, str_t: str) -> str:
            string = ""
            for i in range(min(len(str_o), len(str_t))):
                if str_o[i] == str_t[i]:
                    string += str_o[i]
                else:
                    break

            return string

        if len(strings) > 1:
            lcp = _longest(strings[0], strings[1])
            for i in range(2, len(strings)):
                lcp = _longest(lcp, strings[i])

            return lcp
        else:
            return strings[0]