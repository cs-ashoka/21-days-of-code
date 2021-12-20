class Solution:
    def generate(self, numRows: int) -> list:
        def next(row):
            nextRow = [1]
            for i in range(1,len(row)) :
                nextRow.append(row[i] + row[i-1])
            nextRow.append(1)
            return nextRow
        
        
        rows = [[1]]
        while len(rows)<=numRows : 
            rows.append(next(rows[-1]))
        return rows