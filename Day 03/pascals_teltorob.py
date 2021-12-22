class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
    # Without Memoization 
        res = [[1]]
        for i in range(1, numRows):
            next_row = []
            next_row.append(1)

            if(i >= 2):
                for j in range(0, i - 1 ):
                    next_row.append(res[i - 1][j] + res[i - 1][j + 1])

            next_row.append(1)
            res.append(next_row)

        return res 
