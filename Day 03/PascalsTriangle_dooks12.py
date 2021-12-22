class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        row_list = [1]
        _output = [[1]]
        
        if numRows !=1:
            for i in range(2,numRows+1):
                if len(row_list) != i:
                    row_list.insert(0,0)
                row_list = [sum(sub) for sub in zip(row_list, row_list[1:] + [row_list[0]])]
                _output.append(row_list[:])
                
        else:
            pass
        
        return _output
            
        