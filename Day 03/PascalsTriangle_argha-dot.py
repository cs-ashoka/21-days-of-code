class Solution:
    def generate(self, numRows: int) -> list[list[int]]:
        def create_sandbox(n: int) -> list[list[int]]:
            arr = []
            arr.append([1])
            for i in range(1, n):
                arr.append([1, *[0 for _ in range(i - 2 + 1)], 1])
                pass

            return arr


        def print_pascal(arr: list[list[int]]):
            for i in arr:
                print(" ".join(list(map(str, i))).center(2 * len(arr) - 1))
        

        sand = create_sandbox(numRows)
        for i in range(2, numRows):
            for j in range(1, len(sand[i]) - 1):
                sand[i][j] = sand[i - 1][j - 1] + sand[i - 1][j]

        # print_pascal(sand)
        return sand